package com.infosupport.serenity.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class ProductDetailsSteps {

    @Steps
    EndUserSteps customer;

    @Given("^I have searched for '(.*)'$")
    public void i_have_searched_for(String keyword)  {
        customer.customer_opens_home_page();
        customer.customer_searches_by_keyword(keyword);
    }

    @When("^I select item (\\d+)$")
    public void I_select_item(int item)  {
        customer.customer_select_item(item);

    }

    @Then("^I should see product description on the details page$")
    public void I_should_see_product_description_on_the_details_page() {
        customer.customer_should_see_product_description();
    }

    @And("^I should see product price on the details page$")
    public void I_should_see_product_price_on_the_details_page() {
        customer.customer_should_see_price();
    }
}

