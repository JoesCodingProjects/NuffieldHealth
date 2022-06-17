package com.example;

import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.java.*;

@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        },
        features = {"src/Test/resources/features"},
        glue = {"com.example.StepDefinitions"},
        tags = "@regression"
)

public class TestRunner {

}