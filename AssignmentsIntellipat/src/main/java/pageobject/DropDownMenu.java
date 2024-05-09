package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import reusable.BaseCode;

public class DropDownMenu extends BaseCode {

    public static void dropDownMenu() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='Widgets']")).click();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        js.executeScript("window.scrollBy(0,1000)");
        driver.findElement(By.xpath("//span[text()='Select Menu']")).click();
        Thread.sleep(3000);
        WebElement wb = driver.findElement(By.id("oldSelectMenu"));
        Select s = new Select(wb);
        s.selectByValue("7");
        Thread.sleep(3000);
        WebElement wb1 = driver.findElement(By.id("cars"));
        Select s1= new Select(wb1);
        s1.selectByVisibleText("Audi");
        Thread.sleep(3000);

    }
}
