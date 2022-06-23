package com.example;

import com.example.helpers.CookieAccept;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {
//All java ran in the tests will start from this class as the foundation

    public static WebDriver driver;
    //This method sets a driver for us to use when calling selenium keywords
    public static void setDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
//This method opens the main webpage and maximizes our view
    public static void navigateToHome() throws InterruptedException {
        driver.get("https://www.nuffieldhealth.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        CookieAccept.acceptCookiesId("ccc-notify-accept");

        }


        //We of course need a method for closing the driver when we finish testing, this is located in the StepDef files
    public static void closeDriver() {
        driver.quit();
    }


}