package com.solvd.saucedemocarina;

import com.solvd.saucedemocarina.pages.LoginPage;
import com.solvd.saucedemocarina.pages.ProductsPage;
import com.solvd.saucedemocarina.pages.ShoppingCartPage;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SaucedemoTest implements IAbstractTest {

    @Test
    public void checkAddProductToCartTest() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();
        Assert.assertTrue(loginPage.isPageOpened());

        ProductsPage productsPage = loginPage.login();
        String actualProductTitle = productsPage.getProductBlocks().get(2).getProductTitle();
        productsPage.addProductToShoppingCart(2);

        ShoppingCartPage shoppingCartPage = productsPage.goToShoppingCart();
        String expectedProductTitle = shoppingCartPage.getProductTitle();

        Assert.assertEquals(actualProductTitle, expectedProductTitle, "Product title is incorrect");
    }
}
