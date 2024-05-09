package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobject.MouseHoverActions;

public class AdvanceUserInteractionsM6 {

    @Given("User moves mouse pointer towards Women and click Shoes")

    public static void mouseActions() throws InterruptedException {
        MouseHoverActions.mouseHoverActions();


    }
    @Given("Double click on Double-Click Me to see Alert Button to generate Alert and accept it")
    public static void doubleClick() throws InterruptedException {
        MouseHoverActions.doubleClickAction();

    }

    @Given("Right click on Double-Click Me to See Alert Button")
    public static void rightClick() throws InterruptedException {
        MouseHoverActions.rightClickAction();
    }

    @Given("Drag the slider up to 50% and drop the slider")
     public static void dragAndDrop() throws InterruptedException {
        MouseHoverActions.dragAndDropAction();
    }


}
