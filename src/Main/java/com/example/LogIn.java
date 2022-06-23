package com.example;

import com.example.helpers.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

//Importing the constants used for the login
//
//Here we are logging in to the website as a user. With a Pre-production stack and access to a DB we could
//populate this DB with Dummy test data within our TestSetup as NuffieldHealths signup requires email verification etc.
//I have decided to use an existing user (feel free to run this using my email which I have added as the username,
// as I am not a Nuffield Health user and no sensitive info is on the account


public class LogIn extends BaseClass{

    public static void newLogIn() throws InterruptedException {
        //Pressing the Login button on the Homepage


       driver.findElement(By.xpath("//*[@id='nav']/div[1]/div/div/div/div/a")).click();


       //Getting Rid of the Cookies acceptance banner
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("cookie-banner-close")));
        driver.findElement(By.id("cookie-banner-close")).click();
        String titlePage = driver.getTitle();

       //Trying an incorrect username and password in order to verify invalid logins won't work
        WebElement username = driver.findElement(By.id("email"));
        username.sendKeys(Constants.invalidUsername);

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys(Constants.password);

        //Pressing the button to attempt to Log in with the incorrect username & password
        WebElement loginButton =driver.findElement(By.id("next"));
        loginButton.click();

        //asserting login did not work
       String currentTitlePage = driver.getTitle();
     Assert.assertEquals(titlePage, currentTitlePage);
     System.out.println(" Assert login did not work ---passed");
        Thread.sleep(2000);
       //Clearing the incorrect input and adding the correct username and password
        username.clear();
        username.sendKeys(Constants.username);

        password.clear();
        password.sendKeys(Constants.password);

       //Pressing the button to Log in with the correctly inputted username & password
        loginButton.click();


    }
}