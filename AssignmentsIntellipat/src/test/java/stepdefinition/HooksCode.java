package stepdefinition;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ser.Serializers;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import reusable.BaseCode;



import java.io.IOException;

public class HooksCode extends BaseCode {

    @Before
    public void browserLaunch() throws IOException {
        BaseCode.browserInvocation();
        System.out.println("Browser is launched");
    }
    @BeforeStep
    public void beforeStep() {
        System.out.println("Before Step is executed");
    }
    @After
    public void tearDown() {
        System.out.println("the browser is closed");
        driver.quit();
    }
    @AfterStep
    public void screenshot(Scenario sc) {
        byte[] byteImage = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        sc.attach(byteImage,"image/png","test");
        System.out.println("the screenshot is taken");
    }

}
