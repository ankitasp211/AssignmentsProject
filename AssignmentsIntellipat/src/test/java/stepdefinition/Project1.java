package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobject.*;
import reusable.BaseCode;

public class Project1 extends BaseCode {

    @Given("The user logins to the website")
    public static void LoginToSite() throws InterruptedException {
        LoginPageSauceDemo.LoginSauceDemo(prob.getProperty("Username"),prob.getProperty("Password"));
        LoginPageSauceDemo.clickLoginButtonSauceDemo();
    }

    @Given("User selects a date from the date pickers")
    public static void selectDatePickers() throws InterruptedException {
        SelectDatePickers.datePicker(prob.getProperty("Date"));

    }
    @When("User changes the tabs")
    public static void switchToTab() throws InterruptedException {
        SelectTabs.selectTab();
    }
    @And("User operates the sliders")
    public static void selectSliders() throws InterruptedException {
        SelectSliders.sliderOperation();
    }
    @When("User performs resizable operation")
    public static void resizableFuntion() throws InterruptedException {
        ResizablePage.resizeWindow();
    }
    @Given("User performs draggable operation")
    public static void draggableOperation() throws InterruptedException {
     DraggablePage.draggableFunction();
    }
    @And("User performs selectable operation")
    public static void selectableOperation() throws InterruptedException {
SelectablePage.selectableFunction();
    }

    @Given("User tests frames")
    public void userTestsFrames() throws InterruptedException {
        FramesAndWindows.testFrames();
        
    }

    @When("User tests windows")
    public void userTestsWindows() throws InterruptedException {
        FramesAndWindows.testWindows();
    }

    @Given("User automates drop down menus")
    public static void dropDownMenus() throws InterruptedException {
     DropDownMenu.dropDownMenu();
    }

    @Given("User automates alert boxes")
    public void automatesAlertBoxes() throws InterruptedException {
        AlertBoxes.automateAlerts();
    }
}

