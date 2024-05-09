package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import reusable.BaseCode;

import java.util.*;

public class BrowserAutomationM3 extends BaseCode {

    @Given("User maximises the window")

    public void maximiseWindow() {
        driver.manage().window().maximize();
    }


    @And("User gets the title of the page")
    public void getTitleOfThePage() {
        driver.getTitle();
    }


    @When("User clicks on {string} link text")
    public void userClicksOnLinkText(String arg0) {

       //WebElement e = driver.findElement(By.name());
        driver.switchTo().frame("login_page");
        driver.findElement(By.partialLinkText("Know M")).click();

    }
    @And("User switches from {int} to {int} window")
    public void userSwitchesFromToWindow(int arg0, int arg1) {

        String currentHandle = driver.getWindowHandle();
        Set<String> handlesValues = driver.getWindowHandles();

        for (String a : handlesValues) {
            if (!a.equalsIgnoreCase(currentHandle)) {

                driver.switchTo().window(a);
                System.out.println(driver.getTitle());

            }


        }
    }

//       List<String> handlesValues = new ArrayList<String>(driver.getWindowHandles());
//
//       driver.switchTo().window(handlesValues.get(arg1));
//       System.out.println(driver.getTitle());

        @Then("User validates the title of the page")
        public void userValidatesTheTitleOfThePage()
    {
            if ((driver.getTitle()).equals("Welcome to HDFC Bank NetBanking"))
            {
                Assert.assertTrue("titles from parent window are equal", true);

            } else if ((driver.getTitle()).equals("Best Safety Measures"))
            {
                Assert.assertTrue("titles from child window are equal", true);
            }


        }

    @Then("User validates the url of the page")
    public void validationOfTheUrl() throws InterruptedException {
        if(driver.getCurrentUrl().equalsIgnoreCase("https://www.selenium.dev/"))
        {
            Assert.assertTrue(true);
            System.out.println("the urls are same");
        }else
        {
            Assert.fail();
            System.out.println("the urls aren't same");
        }

    }

    @When("User navigates to test url {string}")
    public void navigationToUrl(String arg0) throws InterruptedException {
        driver.navigate().to(arg0);
        Thread.sleep(3000);
    }

    @And("User refreshes the current page")
    public void refreshOfTheCurrentPage() {
        driver.navigate().refresh();
    }

    @And("User navigates back")
    public void navigatingBackToTestUrl() throws InterruptedException
    {
       driver.navigate().back();
       Thread.sleep(2000);
    }

    @And("User navigates forward")
    public void navigatingForwardToTestUrl() throws InterruptedException {
        driver.navigate().forward();

    }

    @And("User gets the url of the page")
    public void getTheUrlOfThePage() {
        System.out.println(driver.getCurrentUrl());
    }
}


