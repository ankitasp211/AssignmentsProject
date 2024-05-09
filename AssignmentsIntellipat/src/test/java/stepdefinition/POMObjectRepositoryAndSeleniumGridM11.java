package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobject.LogOutPageSauceDemo;
import pageobject.LoginPageSauceDemo;
import reusable.BaseCode;

public class POMObjectRepositoryAndSeleniumGridM11 extends BaseCode {

    @Given("User automates Login")
    public static void loginSauceDemo() throws InterruptedException {
        LoginPageSauceDemo.LoginSauceDemo(prob.getProperty("Username"),prob.getProperty("Password"));
        LoginPageSauceDemo.clickLoginButtonSauceDemo();
    }

    @When("User automates Logout")
    public static void LogOutSauceDemo() throws InterruptedException {
        LogOutPageSauceDemo.logOutSauceDemo();
    }
}
