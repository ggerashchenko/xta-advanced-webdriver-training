package nl.xebia.specs;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DebugTest extends BaseTest {

    @Test(description = "Add items to todolist")
    public void debugTest() {

        driver.get("http://todomvc.com/examples/angularjs/#/");
        driver.findElement(By.id("new-todo")).sendKeys("Training");
        Assert.assertTrue(driver.findElement(By.cssSelector("#todo-list label")).getText().equals("training"));
        driver.findElement(By.cssSelector(".destroy")).click();
    }


}
