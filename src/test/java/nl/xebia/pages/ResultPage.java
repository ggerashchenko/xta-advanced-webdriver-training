package nl.xebia.pages;


import nl.xebia.util.SharedDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultPage {

    WebDriver driver;

    public ResultPage() {
       driver = SharedDriver.getInstance();
    }

    public void searchFor(String searchTerm) {
        driver.findElement(By.id("searchFor")).sendKeys(searchTerm);
    }

}
