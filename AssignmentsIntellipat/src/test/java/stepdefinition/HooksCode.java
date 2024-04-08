package stepdefinition;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import reusable.BaseCode;

import java.io.IOException;

public class HooksCode extends BaseCode {

  @Before
    public void beforeExecution() throws IOException
  {
        BaseCode.browserInvocation();
        System.out.println("Browser is launched");
  }

    @BeforeStep
    public void beforeStep()
    {
        System.out.println("Before Step is executed");
    }

    @After
    public void tearDown()
    {
        driver.quit();
        System.out.println();
    }
    @AfterStep
    public void takeScreenshot(Scenario sc)
    {
        byte[] image= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        sc.attach(image,"image/png", "testscreenshot");
        System.out.println("Screenshot is taken");
    }

}
