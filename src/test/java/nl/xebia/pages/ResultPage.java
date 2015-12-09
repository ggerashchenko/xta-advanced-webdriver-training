package nl.xebia.pages;


import nl.xebia.util.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultPage {

    WebDriver driver;

    public ResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchFor(String searchTerm) {
        driver.findElement(By.id("searchFor")).sendKeys(searchTerm);
    }

}
