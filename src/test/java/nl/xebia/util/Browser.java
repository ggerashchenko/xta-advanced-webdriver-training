package nl.xebia.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Browser {
    private EventFiringWebDriver instance;

    private static final Logger logger = LogManager.getLogger("Browser");

    public Browser() {
        instance = initEventFiring(new FirefoxDriver());
    }

    public WebDriver getInstance() {
        return instance;
    }

    public void closeBrowser() {
        instance.quit();
    }

    private EventFiringWebDriver initEventFiring(WebDriver driver) {
        logger.trace("Registering eventfiring webdriver.");
        EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
        eventFiringWebDriver.register(new LoggingWebdriverEventListener());
        return eventFiringWebDriver;
    }


}
