package com.example;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ConfirmLogin extends LogIn {

    public static void confirmUserLogin() {

        WebElement booking = driver.findElement(By.linkText("Your bookings"));

        String ExpectedText = "Your bookings";
        Assert.assertEquals(ExpectedText, booking.getText());
        String bookingText = booking.getText();
        System.out.println("The expected text to assert logged in is " + bookingText + "--- Assert Passed");
    }

    }
