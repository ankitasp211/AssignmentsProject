package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import reusable.BaseCode;

import java.time.Duration;

public class Waits extends BaseCode {

    public static void javaWaits() throws InterruptedException {
        Thread.sleep(10000);
    }

    public static void userImplicitWaits() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    public static void UserexplicitWaits()
    {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Download']")));
    }
}
