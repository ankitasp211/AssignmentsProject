package pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import reusable.BaseCode;
import reusable.WriteExcelData;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.*;
import java.util.List;

import static java.awt.SystemColor.window;


public class HomePageFlipKart extends BaseCode {

    public static void searchMobilePhone() throws InterruptedException, AWTException {
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobile Phone");
        Thread.sleep(2000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);


    }

    public static void fetchListOfPhones() throws IOException {
        List<WebElement> l1 = driver.findElements(By.xpath("//div[@id='container']//div[@class='DOjaWF gdgoEp']//div[@class='cPHDOP col-12-12']//a[2]"));

        List<String> l3 = new ArrayList<String>();
        System.out.println(l1.size());
        for (int i = 0; i < l1.size(); i++) {
            l3.add(l1.get(i).getText());
        }
        System.out.println(l3);
        WriteExcelData.writeDateToExcel("Sheet1" , 0,4, l3);
    }

    public static List<String> fetchRateOfPhones() {
        List<WebElement> l2 = driver.findElements(By.xpath("//div[@id='container']//div[@class='DOjaWF gdgoEp']//div[@class='cPHDOP col-12-12']//div[@class='Nx9bqj']"));
        List<String> l3 = new ArrayList<String>();
        System.out.println(l2.size());
        for (int i = 0; i < l2.size(); i++) {
            l3.add(l2.get(i).getText());
        }
        System.out.println(l3);
        return l3;

    }
 public static void searchIphone() throws AWTException, InterruptedException {
     driver.findElement(By.xpath("//input[@type='text']")).sendKeys("IPhone 12");
     Robot r = new Robot();
     r.keyPress(KeyEvent.VK_ENTER);
     r.keyRelease(KeyEvent.VK_ENTER);
     Thread.sleep(2000);
     driver.findElement(By.xpath("//*[contains(text(),'Apple iPhone 12 (White, 64 GB)')]")).click();
     Thread.sleep(2000);
 }
 public static void addTocart() throws InterruptedException {
     driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
    Thread.sleep(2000);
    String expectedTitle= "https://www.flipkart.com/viewcart?exploreMode=true&preference=FLIPKART";
    String actualTitle="https://www.flipkart.com/viewcart?exploreMode=true&preference=FLIPKART";
     Assert.assertEquals(expectedTitle,actualTitle);
     System.out.println("The titles are equal");
 }
 public static void scrollDownThePage() throws AWTException, InterruptedException {

     JavascriptExecutor js = (JavascriptExecutor)driver;
     js.executeScript("window.scrollBy(0,5000)");

 }
 public static void switchToTabs() throws InterruptedException {
        String parentHandle = driver.getWindowHandle();
        List<String> l1 = new ArrayList<String>(driver.getWindowHandles());
       for(String s:l1) {
           if(!s.equals(parentHandle)) {
               driver.switchTo().window(s);
               Thread.sleep(3000);
               break;
           }


       }

 }


 }






