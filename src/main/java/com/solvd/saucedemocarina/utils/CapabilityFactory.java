package com.solvd.saucedemocarina.utils;

import com.zebrunner.carina.webdriver.core.capability.impl.desktop.ChromeCapabilities;
import com.zebrunner.carina.webdriver.core.capability.impl.desktop.FirefoxCapabilities;
import com.zebrunner.carina.webdriver.core.capability.impl.desktop.SafariCapabilities;
import org.openqa.selenium.MutableCapabilities;

public class CapabilityFactory {

    public static MutableCapabilities createCapabilities(String browser) {
        MutableCapabilities mutableCapabilities = null;

        switch (browser) {
            case "chrome":
                mutableCapabilities = new ChromeCapabilities().getCapability("chrome-test");
                break;
            case "firefox":
                mutableCapabilities = new FirefoxCapabilities().getCapability("firefox-test");
                break;
            default:
                mutableCapabilities = new SafariCapabilities().getCapability("safari-test");
                break;
        }
        return mutableCapabilities;
    }
}
