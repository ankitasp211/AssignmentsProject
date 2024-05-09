package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import reusable.BaseCode;

public class DraggablePage extends BaseCode {
    public static void draggableFunction() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(3000);

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,3000)");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='Interactions']")).click();
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,300)");
        driver.findElement(By.xpath("//span[text()='Dragabble']")).click();
        Actions a = new Actions(driver);
        WebElement e1= driver.findElement(By.xpath("//div[@id='dragBox']"));
       // a.dragAndDropBy(e1,50,50).build().perform();
      //  js.executeScript("window.scrollBy(0,100)");
//        Thread.sleep(3000);
        a.clickAndHold(e1).moveByOffset(50,50).build().perform();
        Thread.sleep(3000);

    }
}
