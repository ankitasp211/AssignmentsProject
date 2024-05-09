package pageobject;

import io.cucumber.java.eo.Se;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import reusable.BaseCode;

public class SelectablePage extends BaseCode {
    public static void selectableFunction() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='Interactions']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Selectable']")).click();
        js.executeScript("window.scrollBy(0,50)");
        Thread.sleep(3000);
        WebElement e2= driver.findElement(By.xpath("//*[@id='verticalListContainer']"));
//        Select s = new Select(e2);
//        s.selectByVisibleText("Cras justo odio");
        e2.findElement(By.xpath("//*[text()='Cras justo odio']")).click();
        Thread.sleep(2000);
    }
}
