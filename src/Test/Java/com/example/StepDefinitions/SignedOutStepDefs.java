package com.example.StepDefinitions;

import com.example.BaseClass;
import com.example.GymPage;
import com.example.LocationPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.awt.*;


public class SignedOutStepDefs extends BaseClass {

    @Before
    public void setup() {
        setDriver();
    }

    @After
    public void teardown() {
        closeDriver();
    }

    @Given("Homepage Is Launched")
    public void launchHomepage() throws InterruptedException {
        BaseClass.navigateToHome();

    }

    @And("User opens Gym page")
    public void userOpensGymPage() {
        GymPage.navigateToGymPage();

    }

    @And("User enters Location {string}")
    public static void UserClicksLocationElement(String Location) throws InterruptedException, AWTException {
        LocationPage.navigateToLocationPage();

    }

    @Then("Location for online gym displays")
    public void locationForOnlineGymDisplays() {
        LocationPage.displayLocationDefaultResult();
    }

}









