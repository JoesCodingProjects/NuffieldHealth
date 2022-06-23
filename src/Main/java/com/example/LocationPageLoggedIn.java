package com.example;

import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.awt.*;
import java.awt.event.InputEvent;


public class LocationPageLoggedIn extends ConfirmLogin {

    public static void SearchViaMyLocation() throws Exception {
        //Goes back to homepage but now the user is logged in
        driver.findElement(By.className("nav__logo")).click();
        Thread.sleep(2000);


        //Scrolls down to find the use current location element and clicks it
        WebElement currentLocation = driver.findElement(By.linkText("use my current location"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", currentLocation);

        Thread.sleep(2000);
        currentLocation.click();
        //Now we need to allow location permissions in the browser

        ChromeOptions options = new ChromeOptions();

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("profile.default_content_settings.geolocation", 2);

        options.setExperimentalOption("prefs", jsonObject);
        WebDriver driver = new ChromeDriver(options);

        // Finally we find the first result that is unique to the user and print the result
        // These coordinates are screen coordinates
        int x= 600;
        int y = 4445;

        // Move the cursor
        Robot robot = new Robot();
        robot.mouseMove(x, y);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(1000);
        //Moving the mouse to click the result, so it can be used for any location
        //Then we get the title of the first results link page
        driver.get("https://www.nuffieldhealth.com/gyms/glasgow-giffnock");
        driver.manage().window().maximize();
        String title = driver.getCurrentUrl();
        System.out.println("Page loaded is--- " + title);
        }

    }


