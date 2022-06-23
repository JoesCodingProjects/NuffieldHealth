package com.example;


//We are extending the BaseClass so we can potentially work from its methods if needed and for expansion of future tests
public class GymPage extends BaseClass{

    public static void navigateToGymPage(){
        driver.navigate().to("https://www.nuffieldhealth.com/gyms");
    }

}