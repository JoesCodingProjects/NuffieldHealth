package com.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;

//This class uses the Location finder shown on the 'Gym' page of Nuffield Healths site


public class LocationPage extends GymPage {

    String locationResult= ("");

    public static void navigateToLocationPage() throws AWTException, InterruptedException {

        /* Type input into Location Finder */
        WebElement LocationFinder = driver.findElement(By.id("location-finder__input-00000160-4eeb-de17-a579-dffb7ab70000"));
        LocationFinder.click();

        /*confirming if the Location Finder element has been selected*/
        boolean status = LocationFinder.isEnabled();
        System.out.println("LocationFinder selected?" + status);

        /* Typing in an area */
        LocationFinder.sendKeys("Strabane, UK");
        System.out.println("location entered");
//Here we are searching for a specific area

        Robot robot = new Robot();  // Robot class throws AWT Exception
        Thread.sleep(2000); // Thread.sleep throws InterruptedException
        robot.keyPress(KeyEvent.VK_DOWN);  // press arrow down key
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_ENTER); // We are pressing enter on the Google dropdown of locations

        //This allows us to click the first search result which should be default for all users
        WebElement firstResult = driver.findElement(By.linkText("24/7 Virtual Gym Membership"));
        firstResult.click();


        //verifying that the 24/7 membership page loads
        Thread.sleep(2000);
        String currentURL = driver.getCurrentUrl();
        System.out.println("Here is the current URL " + currentURL);

    }

    public static void displayLocationDefaultResult() {
        //Displays the default location result for any user which will be the 24/7 membership

        driver.get("https://www.nuffieldhealth.com/gyms/247");

        String locationResult=driver.getTitle();
        System.out.println("Location is " + locationResult);
    }
}