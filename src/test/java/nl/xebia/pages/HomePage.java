package nl.xebia.pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super("http://www.bol.com/nl/index.html", driver);
    }

    @Override
    protected void isLoaded() {
        Assert.assertEquals(driver.getTitle(), "bol.com | de winkel van ons allemaal | Welkom");
    }
}
