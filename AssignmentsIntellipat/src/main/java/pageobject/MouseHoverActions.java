package pageobject;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import reusable.BaseCode;

public class MouseHoverActions extends BaseCode {

   public static Actions a;


    public static void mouseHoverActions() throws InterruptedException {
       WebElement e=  driver.findElement(By.xpath(("//div[@aria-label='Fashion']")));
       a = new Actions(driver);
       a.moveToElement(e).build().perform();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//a[text()='Women Footwear']")).click();
        Thread.sleep(3000);
        WebElement e2=  driver.findElement(By.xpath(("//span[text()='Women']")));
        a.moveToElement(e2).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Sports Shoes']")).click();
        Thread.sleep(3000);


    }
    public static void doubleClickAction() throws InterruptedException {
        WebElement e =driver.findElement(By.xpath("//button[contains(text(), 'Double-Click')]"));
        a = new Actions(driver);
        a.doubleClick(e).build().perform();
        String text1 = driver.switchTo().alert().getText();
        System.out.println(text1);
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
    }
    public static void rightClickAction() throws InterruptedException {

        WebElement e =driver.findElement(By.xpath("//button[contains(text(), 'Double-Click')]"));
        a = new Actions(driver);
        a.contextClick(e).build().perform();
        Thread.sleep(3000);
    }

    public static void dragAndDropAction() throws InterruptedException {
        a = new Actions(driver);
        WebElement e = driver.findElement(By.xpath("//div[@id='slider']"));
       a.dragAndDropBy(e,50,0).build().perform();
        Thread.sleep(3000);

    }
}
