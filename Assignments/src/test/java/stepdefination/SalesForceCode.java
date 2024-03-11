package stepdefination;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ser.Serializers;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import reusable.BaseCode;


public class SalesForceCode extends BaseCode {



//    @Given("user is on the salesforce application")
//    public void navigateToURL()
//    {
//     driver = new ChromeDriver();
//     driver.get("https://login.salesforce.com/");
//
//    }

    @When("user enters the username {string} and enters password {string}")
    public void addLoginCredentials(String username, String password)
    {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
    }


    @And("user clicks on the login button")
    public void clickLoginButton() 
    {driver.findElement(By.name("Login")).click();
    }

    @Then("verify that user navigates to the homepage")
    public void verifyThatUserNavigatesToTheHomepage() {
        
    }

    @Then("user validates the error message")
    public void userValidatesTheErrorMessage() {
       String actualMessage= driver.findElement(By.id("error")).getText();
       System.out.println(actualMessage);
       String expectedMessage ="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
       if(actualMessage.equals(expectedMessage))
       {
           System.out.println("The Error message is correct");
       }
       else
       {
           System.out.println("The Error message is incorrect");
       }

    }
}
