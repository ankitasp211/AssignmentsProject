package alpha;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.Scenario;
import org.openqa.selenium.chrome.ChromeDriver;

public class testClass {

    private static WebDriver driver;

    public static void main(String[] args) {
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        // Execute steps
        maximiseWindow();
        // Add more steps here if needed
        tearDown();
    }

    public static void maximiseWindow() {
        driver.manage().window().maximize();

    }

    public static void screenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                // Take screenshot if scenario fails
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "screenshot");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void tearDown() {
        // Quit WebDriver
        if (driver != null) {
            driver.quit();
        }
    }
}
