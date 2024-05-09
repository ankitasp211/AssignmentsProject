package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import reusable.BaseCode;

public class LogOutPageSauceDemo extends BaseCode {

    public static void logOutSauceDemo() throws InterruptedException {
//        WebElement e= driver.findElement(By.xpath("//button[contains(text(),'Open Menu')]"));
//        Actions a = new Actions(driver);
//        a.moveToElement(e).build().perform();
        driver.findElement(By.xpath("//button[contains(text(),'Open Menu')]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
    }
}
