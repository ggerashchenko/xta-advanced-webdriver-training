package nl.xebia.specs;

import nl.xebia.pages.actions.DragDropPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BolTest extends BaseTest {

    @Test(description = "This is my first test!")
    public void bolSearchItemTest() throws InterruptedException {

//        CalculatorPage page = new CalculatorPage(driver);
//        page.openPage();
//        page.add("10", "5");
        DragDropPage page = new DragDropPage(driver);
        page.get();
        Assert.assertEquals(page.droppableText(), "Dropped!");

    }


}
