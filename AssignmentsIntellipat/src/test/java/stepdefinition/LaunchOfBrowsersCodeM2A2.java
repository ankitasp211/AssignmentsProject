package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.collections4.functors.IfClosure;
import org.junit.Assert;
import reusable.BaseCode;

import java.io.IOException;
import java.time.Duration;

public class LaunchOfBrowsersCodeM2A2 extends BaseCode {



//        @Given("User launch chrome browser and opens test URL")
//            public void launchBrowser() throws IOException {
//            BaseCode.browserInvocation();
//
//        }


    @When("User waits for specific time of {int} sec")
    public void waitTime(int arg0)
    {
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(arg0));
    }

    @Then("User validates the title of the google page and closes the browser")
    public void validateTheTitleAndClosesTheBrowser() throws Exception {
            String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Google",title);
        System.out.println("The titles are equal");
         driver.close();



    }
}
