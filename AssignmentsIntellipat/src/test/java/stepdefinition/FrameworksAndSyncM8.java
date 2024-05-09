package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobject.LoginPageSauceDemo;
import pageobject.Waits;
import pageobject.WindownsAlertM7;

import java.awt.*;

import static reusable.BaseCode.prob;

public class FrameworksAndSyncM8 {
    public static void userSync() throws InterruptedException, AWTException {
        WindownsAlertM7.clickButton();
        WindownsAlertM7.uploadFiles();

    }
    @And("User specifies Java Wait to complete files conversion and Download button gets displayed")
    public static void userSpecifiesJavaWaits() throws InterruptedException {
        Waits.javaWaits();
    }

    @And("User specifies Implicit Wait to complete files conversion and Download button gets displayed")
    public static void userSpecifiesImplicitWaits() throws InterruptedException {
        Waits.userImplicitWaits();
    }


    @And("User specifies Explicit Wait to complete files conversion and Download button gets displayed")
    public void userSpecifiesExplicitWait() {
     Waits.UserexplicitWaits();
    }

    @Given("User enter Login credentials and click Login")
    public void loginSauceDemo() throws InterruptedException {
        LoginPageSauceDemo.LoginSauceDemo(prob.getProperty("Username"), prob.getProperty("Password"));
        LoginPageSauceDemo.clickLoginButtonSauceDemo();
        Waits.javaWaits();

    }
}
