package com.solvd.saucedemocarina.pages;


import com.zebrunner.carina.utils.R;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    @FindBy(id = "user-name")
    private ExtendedWebElement userNameField;

    @FindBy(id = "password")
    private ExtendedWebElement passwordField;

    @FindBy(id = "login-button")
    private ExtendedWebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        setPageURL("");
    }

    public ProductsPage login() {
        userNameField.type(R.TESTDATA.get("userName"));
        passwordField.type(R.TESTDATA.get("password"));
        loginButton.click();
        return new ProductsPage(driver);
    }
}
