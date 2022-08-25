package com.qa.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public final class LoginPageStepDefinitions {

//    @BeforeAll
//    public static void beforeAllSetup() {
//        System.out.println("I should execute before each scenario");
//    }
//
//    @AfterAll
//    public static void afterAllSetup() {
//        System.out.println("I should execute after each scenario");
//    }

    @Given("user is in the login page")
    public void userIsInTheLoginPage() {
        System.out.println("I am on login page");
    }

    @When("user fill up login details")
    public void userFillUpLoginDetails(DataTable dataTable) {
        List<Map<String, String>> loginDetails = dataTable.entries();
        System.out.println("username: " + loginDetails.get(0).get("username"));
        System.out.println("Password: " + loginDetails.get(0).get("password"));
    }

    @When("user clicks login button")
    public void userClicksLoginButton() {
        System.out.println("I click the login button");
    }

    @Then("user should login successfully")
    public void userShouldLoginSuccessfully() {
        System.out.println("I login successfully");
    }
}
