package pageobject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import reusable.BaseCode;

import java.awt.*;

public class WebAlerts extends BaseCode {

    public static void showWebAlert() throws InterruptedException {


        driver.findElement(By.xpath("//button[contains(text(),'Click here to show confirm alert')]")).click();
        Thread.sleep(3000);
        String text1 = driver.switchTo().alert().getText();
        Thread.sleep(3000);
        System.out.println(text1);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        String text2= driver.switchTo().alert().getText();
        Thread.sleep(3000);
        System.out.println(text2);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);

        //

    }
    public static void webAlertFunctions() throws InterruptedException {
        driver.switchTo().frame("iframeResult");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
        Thread.sleep(3000);
        driver.switchTo().alert();
        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("ankita");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
       String text3= driver.findElement(By.id("demo")).getText();
        System.out.println(text3);


            }
    }






