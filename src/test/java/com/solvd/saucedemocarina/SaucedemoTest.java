package com.solvd.saucedemocarina;

import com.solvd.saucedemocarina.pages.LoginPage;
import com.solvd.saucedemocarina.pages.ProductsPage;
import com.solvd.saucedemocarina.pages.ShoppingCartPage;
import com.solvd.saucedemocarina.utils.CapabilityFactory;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class SaucedemoTest implements IAbstractTest {

    @Test
    @Parameters({"browserName"})
    public void checkAddProductToCartTest(String browserName) {
        LoginPage loginPage = new LoginPage(getDriver(browserName, CapabilityFactory.createCapabilities(browserName)));
        loginPage.open();
        Assert.assertTrue(loginPage.isPageOpened());

        ProductsPage productsPage = loginPage.login();
        String actualProductTitle = productsPage.getProductBlocks().get(2).getProductTitle();
        productsPage.addProductToShoppingCart(2);

        ShoppingCartPage shoppingCartPage = productsPage.goToShoppingCart();
        String expectedProductTitle = shoppingCartPage.getProductTitle();

        Assert.assertEquals(actualProductTitle, expectedProductTitle,
                "Product title is incorrect");
    }
}
