package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import reusable.BaseCode;

public class ShippingPageFlipkart extends BaseCode {

    public static void addNewAddress() throws InterruptedException {
        //HomePageFlipKart.switchToTabs();
        driver.findElement(By.xpath("//span[text()='Place Order']")).click();
     //   HomePageFlipKart.switchToTabs();
        driver.findElement(By.xpath("//div[text()='Add a new address']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys(prob.getProperty("name"));
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys(prob.getProperty("number"));
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='pincode']")).sendKeys(prob.getProperty("pincode"));
        Thread.sleep(3000);
        driver.findElement(By.xpath("//label[text()='Locality']")).sendKeys(prob.getProperty("Locality"));
        Thread.sleep(3000);
        driver.findElement(By.xpath("//label[text()='Address (Area and Street)']")).sendKeys(prob.getProperty("Address"));
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys(prob.getProperty("City"));
        Thread.sleep(3000);
        WebElement e1 = driver.findElement(By.xpath("//select[@name='state']"));
        Select s= new Select(e1);
        s.selectByValue(prob.getProperty("State"));
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Save and Deliver Here']")).click();
        Thread.sleep(3000);
    }

}
