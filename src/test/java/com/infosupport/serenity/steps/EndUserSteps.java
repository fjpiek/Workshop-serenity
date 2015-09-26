package com.infosupport.serenity.steps;

import com.google.common.base.Optional;
import com.infosupport.serenity.pages.PetsPlaceHomePage;
import com.infosupport.serenity.pages.PetsPlaceProductPage;
import com.infosupport.serenity.pages.PetsPlaceSearchResultsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class EndUserSteps extends ScenarioSteps {

    PetsPlaceHomePage petsPlaceHomePage;
    PetsPlaceSearchResultsPage petsPlaceSearchResultsPage;
    PetsPlaceProductPage petsPlaceProductPage;


    @Step
    public void customer_opens_home_page() {
        petsPlaceHomePage.open();
    }

    @Step
    public void customer_searches_by_keyword(String keyword) {
        petsPlaceHomePage.enterSearchTerms(keyword);
    }

    @Step
    public void customer_should_see_results_summary_containing(String keyword) {
        Optional<String> resultSummary = petsPlaceSearchResultsPage.getSearchpageResultNote();
        assertThat(resultSummary.isPresent(), is(true));
        assertThat(resultSummary.get(), containsString(keyword));
    }

    public void customer_should_see_catagory_option(String catagory) {
        Optional<String> resultSummary = petsPlaceSearchResultsPage.getCatagories();
        assertThat(resultSummary.isPresent(), is(true));
        assertThat(resultSummary.get(), containsString(catagory));
    }

    public void customer_select_item(int item) {
        petsPlaceSearchResultsPage.selectItem1();
    }

    public void customer_should_see_product_description() {
        Optional<String> productDescription = petsPlaceProductPage.getProductDescription();
        assertThat(productDescription.isPresent(), is(true));
    }

    public void customer_should_see_price() {
        Optional<String> productPrice = petsPlaceProductPage.getPrices();
        assertThat(productPrice.isPresent(), is(true));
    }


}
