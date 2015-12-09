package nl.xebia.pages.calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculatorPage {

    WebDriver driver;

    public CalculatorPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get("https://juliemr.github.io/protractor-demo/");
        WebElement ele = driver.findElement(By.id(""));
        Actions builder = new Actions(driver);
            builder.keyDown(Keys.ALT)
                    .click(ele);

        Action myaction = builder.build();

        myaction.perform();
    }

    public void add(String firstInput, String secondInput) {
        operateCalculator(firstInput, secondInput, "+");
    }

    private void operateCalculator(String firstInput, String secondInput, String operator) {
        driver.findElement(By.cssSelector("input[ng-model='firstt']")).sendKeys(firstInput);
        selectOperator(operator);
        driver.findElement(By.cssSelector("input[ng-model='second']")).sendKeys(secondInput);
        driver.findElement(By.id("gobutton")).click();
        waitForResult();
    }

    private void selectOperator(String operator) {
        WebElement selOperator = driver.findElement(By.cssSelector("[ng-model='operator']"));
        Select select = new Select(selOperator);
        select.selectByVisibleText(operator);
    }

    private void waitForResult() {
        WebElement resultTable = driver.findElement(By.cssSelector("h2"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("h2"), ".")));
    }

}

