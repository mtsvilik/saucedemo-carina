package com.solvd.saucedemocarina.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class ProductBlock extends AbstractUIObject {

    @FindBy(xpath = ".//button[@class='btn btn_primary btn_small btn_inventory ']")
    private ExtendedWebElement addToCartButton;

    @FindBy(xpath = ".//*[@class='inventory_item_name ']")
    private ExtendedWebElement productTitle;

    public ProductBlock(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public ExtendedWebElement getAddToCartButton() {
        return addToCartButton;
    }

    public String getProductTitle() {
        return productTitle.getText();
    }
}
