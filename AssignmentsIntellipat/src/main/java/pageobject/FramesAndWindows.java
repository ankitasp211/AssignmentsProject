package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WindowType;
import reusable.BaseCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FramesAndWindows extends BaseCode {
    public static void testFrames() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        driver.findElement(By.xpath("//*[text()='Alerts, Frame & Windows']")).click();
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,1000)");
        driver.findElement(By.xpath("//*[text()='Frames']")).click();
        Thread.sleep(3000);
        driver.switchTo().frame("frame1");
        String text1 = driver.findElement(By.xpath("//*[@id='sampleHeading']")).getText();
        System.out.println(text1);
        Thread.sleep(3000);

    }

    public static void testWindows() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        driver.findElement(By.xpath("//*[text()='Alerts, Frame & Windows']")).click();
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,1000)");
        driver.findElement(By.xpath("//*[text()='Browser Windows']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id='tabButton']")).click();
        Thread.sleep(3000);
//        System.out.println(driver.getTitle());

        String currentHandle = driver.getWindowHandle();
        Set<String> l1 = driver.getWindowHandles();
        for (String s : l1) {
            if (!currentHandle.equals(s)) {
                driver.switchTo().window(s);
            }
            System.out.println(driver.getTitle());
        }

        String s2 = driver.findElement(By.xpath("//*[text()='This is a sample page']")).getText();
        System.out.println(s2);
        String currentHandle1 = driver.getWindowHandle();
        Set<String> l2 = driver.getWindowHandles();
        for (String s : l2) {
            if (!currentHandle1.equals(s)) {
                driver.switchTo().window(s);
            }
            System.out.println(driver.getTitle());
        }

            Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,500)");
            driver.findElement(By.xpath("//button[@id='windowButton']")).click();
            Thread.sleep(3000);
            driver.switchTo().newWindow(WindowType.WINDOW);
            System.out.println(driver.getTitle());
        }

    }

