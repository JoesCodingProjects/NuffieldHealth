package com.example;


import com.example.helpers.CookieAccept;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static com.example.BaseClass.driver;

public class Cheering {
    public static void cheering() throws InterruptedException {
//Loading up a site with a cheer sfx
        driver.get("https://www.myinstants.com/en/instant/crowd-cheering/");
        driver.manage().window().maximize();

        Thread.sleep(1000);
        // Dealing with the cookies banner
        CookieAccept.acceptCookiesClassName("fc-button-label");
        Thread.sleep(3000);


// Finding the actual button to play the sound and hitting it
       WebElement greenButton = driver.findElement(By.xpath("//*[@id='instant-page-button']/button"));
        // An Iframe gets in the way of this button. Quick way to work around An iFrame is to just scroll
        // the page away from it,so it does not cover the element needed

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", greenButton);
        Thread.sleep(1000);
        greenButton.click();
        Thread.sleep(3500);

        System.out.println("Hooray, the tests have passed :) ");
    }
}
