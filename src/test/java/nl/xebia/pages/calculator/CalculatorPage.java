package nl.xebia.pages.calculator;

import org.openqa.selenium.WebDriver;

public class CalculatorPage {

    WebDriver driver;

    public CalculatorPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get("https://juliemr.github.io/protractor-demo/");
    }

}

