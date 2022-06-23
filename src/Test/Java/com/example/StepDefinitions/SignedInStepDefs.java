package com.example.StepDefinitions;

import com.example.BaseClass;
import com.example.Cheering;
import com.example.ConfirmLogin;
import com.example.LocationPageLoggedIn;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.example.LogIn.newLogIn;

public class SignedInStepDefs extends BaseClass {

    @Before
    public void setup() {
        setDriver();
    }

    @After
    public void teardown() {
        closeDriver();
    }

    @When("A user logs in")
    public void aUserLogsIn() throws InterruptedException {
        navigateToHome();
        newLogIn();
    }

    @Then("Confirm Logged In")
    public void confirmLoggedIn() {
        ConfirmLogin.confirmUserLogin();
    }


    @And("Search for first gym via exact location")
    public void searchForFirstGymViaExactLocation() throws Exception {

        LocationPageLoggedIn.SearchViaMyLocation();
    }

    @Then("Logged in user has passed so load cheer button")
    public void LoggedInUserHasPassedLoadCheerButton() throws InterruptedException {
        Cheering.cheering();

    }
}


