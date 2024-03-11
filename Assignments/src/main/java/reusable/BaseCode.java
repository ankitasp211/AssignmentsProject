package reusable;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class BaseCode {

    public static  WebDriver driver;
    public static void launchBrowser() throws IOException {
        File f= new File("src/main/resources/configuration/config.properties");
        FileInputStream fis = new FileInputStream(f);
        Properties prob = new Properties();
        prob.load(fis);

        if(prob.getProperty("browser").equalsIgnoreCase("Chrome"))
        {
            driver = new ChromeDriver();
        } else if (prob.getProperty("browser").equalsIgnoreCase("Edge"))
        {
           driver = new EdgeDriver();
        }
        else

        {
            throw new InvalidArgumentException("Please enter valid input");
        }
        driver.get(prob.getProperty("environment"));
    }
}
