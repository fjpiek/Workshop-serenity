package com.infosupport.serenity.steps;

import com.infosupport.serenity.pages.PetsPlaceHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class EndUserSteps extends ScenarioSteps {

    PetsPlaceHomePage petsPlaceHomePage;


    @Step
    public void customer_opens_home_page() {
        petsPlaceHomePage.open();
    }

    @Step
    public void customer_searches_by_keyword(String keyword) {
        petsPlaceHomePage.enterSearchTerms(keyword);
    }


}
