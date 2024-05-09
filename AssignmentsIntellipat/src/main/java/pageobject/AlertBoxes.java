package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import reusable.BaseCode;

import java.time.Duration;

public class AlertBoxes extends BaseCode {
    public static void automateAlerts () throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='Alerts, Frame & Windows']")).click();
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,500)");
//        driver.findElement(By.xpath("//*[text()='Alerts, Frame & Windows']")).click();
//        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='Alerts']")).click();
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(3000);
        driver.switchTo().alert();
        String text1= driver.switchTo().alert().getText();
        System.out.println(text1);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        driver.findElement(By.id("timerAlertButton")).click();
      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        Thread.sleep(6000);
        driver.switchTo().alert();
        String text2= driver.switchTo().alert().getText();
        System.out.println(text2);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(3000);
        driver.switchTo().alert();
        driver.switchTo().alert().dismiss();
        Thread.sleep(3000);
        driver.findElement(By.id("promtButton")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("ankita");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);


    }
}
