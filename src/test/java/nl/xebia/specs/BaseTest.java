package nl.xebia.specs;

import nl.xebia.util.Browser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    Browser browser;
    WebDriver driver;

    @BeforeClass
    public void setup() {
        browser = new Browser();
        driver = browser.getInstance();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        browser.closeBrowser();
    }

}
