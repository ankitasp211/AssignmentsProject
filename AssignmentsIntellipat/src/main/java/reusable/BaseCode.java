package reusable;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseCode {
    public static WebDriver driver;
    public static Properties prob;
    public static void browserInvocation() throws IOException {
        File f= new File("src/main/resources/configuration/config.properties");
        FileInputStream fis = new FileInputStream(f);
        prob = new Properties();
        prob.load(fis);
        if (prob.getProperty("browser").equalsIgnoreCase("Chrome"))
        {
            driver = new ChromeDriver();
        }
        else if (prob.getProperty("browser").equalsIgnoreCase("Edge"))
        {
          driver = new EdgeDriver();
        }

        else
            throw new InvalidArgumentException("Please enter valid browser");

        driver.get(prob.getProperty("environment"));

    }


}
