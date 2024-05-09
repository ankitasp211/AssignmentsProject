package pageobject;

import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import reusable.BaseCode;

public class SelectSliders extends BaseCode {
    public static void sliderOperation() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='Widgets']")).click();
        Thread.sleep(3000);
   driver.findElement(By.xpath("//li[@id='item-3']//span[text()='Slider']")).click();
        WebElement e1= driver.findElement(By.xpath("//input[@type='range']"));
        Actions a = new Actions(driver);
        a.dragAndDropBy(e1,80,0).build().perform();
        Thread.sleep(3000);


    }
}
