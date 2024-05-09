package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pageobject.LoginPageFB;
import pageobject.SignUpPageFBXPathAxis;
import pageobject.WebAlerts;
import reusable.BaseCode;
import reusable.ReadExcelData;

import java.io.IOException;

public class WebAlertsXPathAxisM5 extends BaseCode {
    @Given("User enters valid credentials using Relative xpath")
    public static void enterCredentialRelativeXpath() throws InterruptedException, IOException {
        SignUpPageFBXPathAxis.clickOnCreateNewAccount();
        SignUpPageFBXPathAxis.enterValidCredentials();
        SignUpPageFBXPathAxis.selectDOB();
        SignUpPageFBXPathAxis.selectGender();
        SignUpPageFBXPathAxis.clickSignUp();
    }

    @Given("User enters valid login credentials using Relative xpath")
     public static void enterLoginCredentials() throws IOException {
        LoginPageFB.enterLoginCredentials();
        LoginPageFB.clickLogin();

    }
    @Given("User performs web alert functions")
    public static void showWebAlert() throws InterruptedException {
        WebAlerts.showWebAlert();
    }

    @Given("User switches into the frame and perform web alert functions")
    public static void webAlertFunctions() throws InterruptedException {
        WebAlerts.webAlertFunctions();
    }

    }


