package nl.xebia.pages;

import nl.xebia.util.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

public class BasePage extends LoadableComponent<BasePage> {

    private String relativePath;
    WebDriver driver;

    public BasePage(final String relativePath, WebDriver driver) {
        this.relativePath = relativePath;
    }

    @Override
    protected void load() {
        driver.get("http://www.bol.com");
    }

    @Override
    protected void isLoaded() throws Error {
        Assert.assertEquals(driver.getTitle(), "Tweakers", "Errormessage");
    }

}
