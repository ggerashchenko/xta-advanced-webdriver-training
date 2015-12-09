package nl.xebia.util;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.events.WebDriverEventListener;

import java.io.File;
import java.io.IOException;

public class LoggingWebdriverEventListener implements WebDriverEventListener {

    private static final Logger logger = LogManager.getLogger("Browser");

    @Override
    public void beforeNavigateTo(String url, WebDriver driver) {

    }

    @Override
    public void afterNavigateTo(String url, WebDriver driver) {

    }

    @Override
    public void beforeNavigateBack(WebDriver driver) {

    }

    @Override
    public void afterNavigateBack(WebDriver driver) {

    }

    @Override
    public void beforeNavigateForward(WebDriver driver) {

    }

    @Override
    public void afterNavigateForward(WebDriver driver) {

    }

    @Override
    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
            logger.debug("Locating element using locator: "+by.toString());
    }

    @Override
    public void afterFindBy(By by, WebElement element, WebDriver driver) {

    }

    @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {

    }

    @Override
    public void afterClickOn(WebElement element, WebDriver driver) {

    }

    @Override
    public void beforeChangeValueOf(WebElement element, WebDriver driver) {

    }

    @Override
    public void afterChangeValueOf(WebElement element, WebDriver driver) {

    }

    @Override
    public void beforeScript(String script, WebDriver driver) {

    }

    @Override
    public void afterScript(String script, WebDriver driver) {

    }

    @Override
    public void onException(Throwable throwable, WebDriver driver) {
        logger.debug("Taking screenshot.");
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("c:\\temp\\screenshot.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

