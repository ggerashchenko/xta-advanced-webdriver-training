package nl.xebia.pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragDropPage {
    WebDriver driver;

    public DragDropPage(WebDriver driver) {
        this.driver = driver;
    }

    public void get() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        Actions builder = new Actions(driver);
        builder.dragAndDrop(draggable, droppable);

        Action dragAndDrop = builder.build();

        dragAndDrop.perform();
    }

    public String droppableText() {
        return driver.findElement(By.id("droppable")).getText();
    }

}
