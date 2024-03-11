package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import reusable.BaseCode;

import java.time.Duration;

public class AmazonApplicationCode extends BaseCode {

//    @Given("user navigates to amazon application")
//    public void navigateToAmazon()
//    {
//
//    }

    @And("user hover over on Hello, sign in Accounts & Lists on the title bar")
    public void hoverOverOnHelloSignInAccountsLists() {

    }

    @When("user clicks on Sign in button")
    public void clicksOnSignInButton() {
    }

    @And("user enters the email address {string}")
    public void entersTheEmailAddress(String arg0) {
    }

    @And("user clicks on Continue")
    public void clicksOnContinue() {
    }

    @And("user enters the password {string}")
    public void entersThePassword(String arg0) {
    }

    @Then("user navigates to the homepage of the amazon application")
    public void navigatesToTheHomepageOfTheAmazonApplication() {
    }

    @When("user enters the search keyword {string} in the search bar")
    public void entersTheSearchKeyword(String arg0) {
    }

    @And("user clicks on search icon")
    public void clicksOnSearchIcon() {
    }

    @And("user selects {string} from the dropdown")
    public void selectsFromTheDropdown(String arg0) {
    }

    @And("user navigates to {string} from the results")
    public void navigatesToFromTheResults(String arg0) {
    }

    @And("user clicks on Add to cart")
    public void clicksOnAddToCart() {
    }

    @And("user clicks on the cart")
    public void clicksOnTheCart() {
    }

    @And("user clicks on the proceed to pay")
    public void clicksOnTheProceedToPay() {
    }

    @Then("user validates that paylater option is available on the payment page")
    public void validatesPaylaterOptionOnPaymentPage() {
    }

    @Given("User validates the hover over action")
    public void hoverOverAction(){

        WebElement hoverAction = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
        Actions action = new Actions(driver);
        action.clickAndHold(hoverAction).build().perform();
        hoverAction.findElement(By.xpath("//span[text()='Baby Wishlist']")).click();



    }

    @Given("User validates drag and drop action")
    public void DragAndDropAction() {

        WebElement frameElement = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frameElement);

        Actions dragAction = new Actions(driver);
        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));
        dragAction .dragAndDrop(drag,drop).build().perform();




    }

    @Given("User clicks on the button after {int}seconds")
    public void implicitWait(int arg0) {

    driver.findElement(By.className("button")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Then("verify that Displayed button is displayed")
    public void displayedButtonIsDisplayed() {
        driver.findElement(By.id("hidden")).click();
        String expectedResult = "Displayed";
        String actualResult = driver.findElement(By.id("hidden")).getText();
        if (expectedResult.equals(actualResult))
        {
            System.out.println("The Displayed button is displayed");
        }
    }

    @Given("User clicks on the button after {int} seconds")
    public void userClicksOnTheButtonAfterSeconds(int arg0) {
        driver.manage().window().maximize();

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,350)");

//        driver.findElement(By.id("quote")).click();
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
//
//        String expectedText = "Hello, Learn More Aspirants";
//        String actualText = driver.findElement(By.className("target-text")).getText();
//        if(expectedText.equals(actualText))
//        {
//            System.out.println("The text is correct");
//        }
//        else
//        {
//            System.out.println("the text doesnt match");
//        }
        driver.findElement(By.xpath("//button[@id='enable_btn']")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.findElement(By.className("button")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));

        wait.pollingEvery(Duration.ofSeconds(5));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("disable")));
        String actualVal= driver.findElement(By.id("disable")).getText();
        System.out.println(actualVal);
        String expectedVal ="Enabled";
        if (actualVal.equals(expectedVal))
        {
            System.out.println("Execution is successful");

        }
        else
        {
            System.out.println("Execution failed");
        }
    }


}

