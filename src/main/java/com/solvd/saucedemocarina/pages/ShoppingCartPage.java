package com.solvd.saucedemocarina.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends AbstractPage {

    @FindBy(xpath = "//*[@class='inventory_item_name']")
    private ExtendedWebElement productTitle;

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public String getProductTitle() {
        return productTitle.getText();
    }
}
