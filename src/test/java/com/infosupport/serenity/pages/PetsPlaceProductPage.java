package com.infosupport.serenity.pages;

import com.google.common.base.Optional;
import lombok.AllArgsConstructor;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.apache.commons.lang3.StringUtils;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import static ch.lambdaj.Lambda.selectUnique;


public class PetsPlaceProductPage extends PageObject {

    @FindBy(className = "price-box")
    WebElementFacade priceBox;

    @FindBy(id = "moreInformation")
    WebElementFacade productInformation;


    public Optional<String> getPrices() {
        if (priceBox.isPresent() && priceBox.isVisible()) {
            return Optional.of(priceBox.getText());
        } else {
            return Optional.absent();
        }
    }

    public Optional<String> getProductDescription() {
        if (productInformation.isPresent() && productInformation.isVisible()) {
            return Optional.of(productInformation.getText());
        } else {
            return Optional.absent();
        }
    }
}
