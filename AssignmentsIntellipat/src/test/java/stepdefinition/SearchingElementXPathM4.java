package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pageobject.HomePageFB;
import pageobject.LoginPageFB;
import pageobject.OracleSignUpPage;
import pageobject.SignUpPageFB;
import reusable.BaseCode;
import reusable.ReadExcelData;

import java.io.IOException;

public class SearchingElementXPathM4 extends BaseCode {

    @Given("User enters valid credentials")
    public void enterCredentials() throws IOException, InterruptedException {
        SignUpPageFB.clickOnCreateNewAccount();
        SignUpPageFB.enterValidCredentials();
        SignUpPageFB.selectDOB();
        SignUpPageFB.selectGender();
    }
    @When("User clicks on Sign Up button")
    public void userClicksOnSignUpButton() {
        SignUpPageFB.clickSignUp();
    }
        @Then("User validates that the account is created")
        public static void validateAccountCreation()
        {
            HomePageFB.titleOfPage();     }
    @Given("User enters registration details for oracle page")
    public void registrationDetailsForOraclePage() throws IOException, InterruptedException {
        OracleSignUpPage.addDetails();
        OracleSignUpPage.clickCreateAccountForOracle();
    }
    @Given("User enters valid credentials using absolute xpath")
            public static void enterAbsoluteXpathCredentials() throws IOException, InterruptedException {
        SignUpPageFB.clickOnCreateNewAccount();
        SignUpPageFB.enterCredentialsAbsoluteXpath();
        SignUpPageFB.clickSignUp();
    }
   @Given("User gets the number of the links available on facebook page")
     public static void getLinks()
   {
       LoginPageFB.getTheLinks();
   }

    @Then("User verifies the text for each link")
    public static void getText()
    {
        LoginPageFB.getText();
    }

    @Given("User gets the entered input from FirstName into console")
    public static void getTextInConsole() throws IOException, InterruptedException {
        SignUpPageFB.clickOnCreateNewAccount();
        SignUpPageFB.getValueIntoConsole(prob.getProperty("Parameter"));
    }



}


