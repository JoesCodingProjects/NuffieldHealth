package com.example.helpers;

import com.example.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CookieAccept extends BaseClass {
//This is a method which finds the cookie element on the webpage and accepts the cookies if required. The String can
//be changed to deal with different webpages (although this is dependent on how the cookies popup is configured on a given page

    public static void acceptCookiesId(String cookieElement) throws InterruptedException {
        // Accept cookies
        Thread.sleep(3000);
        WebElement AcceptCookiesId = driver.findElement(By.id(cookieElement));
        AcceptCookiesId.click();
    }

    public static void acceptCookiesClassName(String cookieElement) throws InterruptedException {
        // Accept cookies
        Thread.sleep(3000);
        WebElement AcceptCookiesClassName = driver.findElement(By.className(cookieElement));
        AcceptCookiesClassName.click();
    }
}
