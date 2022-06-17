package com.example.StepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefs {
    @Given("^The Webpage has been opened$")
    public void theWebpageHasBeenOpened() {

        System.setProperty("webdriver.chrome.driver.","src/Main/resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
        driver.get("www.nuffieldhealth.com");
        driver.manage().window().maximize();
        Assert.assertTrue(driver.getTitle().equals("How you feel tomorrow starts today | Nuffield Health"));
        driver.close();
    }
}
