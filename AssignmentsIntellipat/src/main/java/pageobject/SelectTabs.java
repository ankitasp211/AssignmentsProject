package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import reusable.BaseCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SelectTabs extends BaseCode {
    public static void selectTab() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='Widgets']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[text()='Tabs']")).click();
        String currentHandle = driver.getWindowHandle();
        driver.findElement(By.xpath("//div[@id='bannerB']/descendant::*[3]")).click();
        Set<String> l1 = driver.getWindowHandles();
        for (String s : l1) {
            if (!currentHandle.equals(s)) {
                driver.switchTo().window(s);
            }
            System.out.println(driver.getTitle());
        }


    }
}