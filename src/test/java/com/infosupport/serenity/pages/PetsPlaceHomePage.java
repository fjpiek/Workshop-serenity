package com.infosupport.serenity.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.petsplace.nl/")
public class PetsPlaceHomePage extends PageObject {

    @FindBy(id = "searchbarcomponenttextinput")
    WebElementFacade searchBar;

    public void enterSearchTerms (String keyword){
        searchBar.typeAndEnter(keyword);
    }

}
