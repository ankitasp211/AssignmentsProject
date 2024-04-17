package pageobject;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import reusable.BaseCode;

public class MouseHoverActions extends BaseCode {

    public static void mouseHoverActions() throws InterruptedException {
       WebElement e=  driver.findElement(By.xpath(("//div[@aria-label='Fashion']")));
       Actions a = new Actions(driver);
       a.moveToElement(e).build().perform();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//a[text()='Women Footwear']")).click();
      //  a.moveToElement(e1).build().perform();
        Thread.sleep(3000);
        WebElement e2=  driver.findElement(By.xpath(("//span[text()='Women']")));
        a.moveToElement(e2).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Sports Shoes']")).click();
        Thread.sleep(3000);


    }
}
