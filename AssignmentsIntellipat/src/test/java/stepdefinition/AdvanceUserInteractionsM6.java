package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobject.MouseHoverActions;

public class AdvanceUserInteractionsM6 {

    @Given("User moves mouse pointer towards Women and click Shoes")

    public static void mouseActions() throws InterruptedException {
        MouseHoverActions.mouseHoverActions();


    }




}
