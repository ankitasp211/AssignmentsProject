package stepdefination;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ser.Serializers;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import reusable.BaseCode;

import java.io.IOException;

public class Hooks extends BaseCode {

    @Before
    public void setUp() throws IOException {
        System.out.println("Execution Started");
        BaseCode.launchBrowser();
    }

    @BeforeStep
    public void stepbefore() {
        System.out.println("BeforeStep is executed");
    }

    @After
    public void tearDown()
    {
        System.out.println("Execution is ended");
        driver.close();

    }

    @AfterStep
    public void takescreenshot(Scenario sc)
    {
//after each scenario we have to take screenshot in real time for that
// we have a class called as Takescreenshot. As TakeScreenshot is an interface
// we have to cast it to the webdriver and getScreenshotAs is a method used to
// take screenshot.we have to provide output type for screenshot outputtype is
// bytes and we are storing it in an array of bytes. As we have to attach this to
        // to every scenario or at all scenario level we are passing scenario as an argument to the method
        // and attaching it to the scenario using attach method.

        System.out.println("The screenshot is taken");
        byte[] byteImage =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        sc.attach(byteImage, "image/png","test");

        }


    }


