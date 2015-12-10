package nl.xebia.pages.actions;

import org.openqa.selenium.WebDriver;

public class DragDropPage {
    WebDriver driver;

    public DragDropPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
    }

}
