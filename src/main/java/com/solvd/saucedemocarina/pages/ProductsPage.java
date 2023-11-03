package com.solvd.saucedemocarina.pages;

import com.solvd.saucedemocarina.components.ProductBlock;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsPage extends AbstractPage {

    @FindBy(xpath = "//div[@class='inventory_item']")
    private List<ProductBlock> productBlocks;

    @FindBy(className = "shopping_cart_link")
    private ExtendedWebElement shoppingCartButton;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void addProductToShoppingCart(int index) {
        ProductBlock productBlock = productBlocks.get(index);
        productBlock.getAddToCartButton().click();
    }

    public ShoppingCartPage goToShoppingCart() {
        shoppingCartButton.click();
        return new ShoppingCartPage(driver);
    }

    public List<ProductBlock> getProductBlocks() {
        return productBlocks;
    }
}
