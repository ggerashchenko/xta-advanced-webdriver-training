package nl.xebia.pages;


import nl.xebia.util.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestPage {

    WebDriver driver;

    public TestPage(WebDriver driver) {
       this.driver = driver;
    }

    public void searchFor(String searchTerm) {
        driver.findElement(By.id("searchFor")).sendKeys(searchTerm);
    }

}
