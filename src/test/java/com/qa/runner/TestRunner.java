package com.qa.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        glue = {"com.qa.stepdefinitions"},
        features = {"src/test/resources/features/LoginPage.feature"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        publish = true
)
public class TestRunner {
}
