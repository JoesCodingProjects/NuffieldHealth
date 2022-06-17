package com.example.StepDefinitions;

import com.example.BaseClass;
import com.example.GymPage;
import com.example.LocationPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

import java.awt.*;


public class StartupStepDefs extends BaseClass {

    @Before
    public void setup() {
        setDriver();
    }

    @After
    public void teardown() {
        closeDriver();
    }

    @Given("Launch Homepage")
    public void launchHomepage() {
        navigateToHome();


    }

    @Given("User opens Gym page")
    public void userOpensGymPage() {
        GymPage.navigateToGymPage();

    }

    @Given("User clicks location element")
    public void UserClicksLocationElement() throws InterruptedException, AWTException {
        LocationPage.navigateToLocationPage();
    }


    @Given("Testing has passed load cheer button")
    public void testingHasPassedLoadCheerButton() throws InterruptedException {
        BaseClass.cheering();

    }
}


