package nl.xebia.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
    private WebDriver instance;

    private static final Logger logger = LogManager.getLogger("Browser");

    public Browser() {
        instance = new FirefoxDriver();
    }

    public WebDriver getInstance() {
        return instance;
    }

    public void closeBrowser() {
        instance.quit();
    }

}
