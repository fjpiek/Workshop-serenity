package com.infosupport.serenity.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SearchScenarioSteps {

    @Steps
    EndUserSteps customer;

    @Given("^I am on the petsplace homepage$")
    public void I_am_on_the_petsplace_homepage() {
        customer.customer_opens_home_page();
    }

    @When("^I search for '(.*)'")
    public void customerSearchByKeyword(String keyword) {
        customer.customer_searches_by_keyword(keyword);
    }

}
