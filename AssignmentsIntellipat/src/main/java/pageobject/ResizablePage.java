package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import reusable.BaseCode;

public class ResizablePage extends BaseCode {

    public static  void resizeWindow() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
         Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[text()='Interactions']")).click();
//        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Resizable']")).click();
       // js.executeScript("window.scrollBy(0,100)");
        Actions a = new Actions(driver);
        WebElement wb1 = driver.findElement(By.xpath("//*[@class='react-resizable-handle react-resizable-handle-se']"));
        Thread.sleep(3000);
        a.clickAndHold(wb1).moveByOffset(190,190).build().perform();
        //a.dragAndDropBy(wb1,200,200).build().perform();
        Thread.sleep(3000);
    }
}
