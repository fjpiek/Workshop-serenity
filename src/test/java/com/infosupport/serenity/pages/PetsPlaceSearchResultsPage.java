package com.infosupport.serenity.pages;


import com.google.common.base.Optional;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class PetsPlaceSearchResultsPage extends PageObject{

    @FindBy(className = "rezult-note")
    WebElementFacade resultNote;

    @FindBy(css = ".nav.search-nav.all")
    WebElementFacade catagorySelections;

    public Optional<String> getSearchpageResultNote() {
        if (resultNote.isPresent() && resultNote.isVisible()) {
            return Optional.of(resultNote.getText());
        } else {
            return Optional.absent();
        }
    }

    public Optional<String> getCatagories() {
        if (catagorySelections.isPresent() && catagorySelections.isVisible()) {
            return Optional.of(catagorySelections.getText());
        } else {
            return Optional.absent();
        }
    }

}
