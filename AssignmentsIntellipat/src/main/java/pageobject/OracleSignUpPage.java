package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import reusable.BaseCode;
import reusable.ReadExcelData;

import java.io.IOException;

public class OracleSignUpPage extends BaseCode {
    public static void addDetails() throws IOException, InterruptedException {
    driver.findElement(By.id("sView1:r1:0:email::content")).sendKeys(ReadExcelData.excelData("Sheet1", 0,1));
    Thread.sleep(2000);
    driver.findElement(By.id("sView1:r1:0:password::content")).sendKeys(ReadExcelData.excelData("Sheet1", 1,1));
        Thread.sleep(2000);
    driver.findElement(By.id("sView1:r1:0:retypePassword::content")).sendKeys(ReadExcelData.excelData("Sheet1", 2,1));
        Thread.sleep(2000);
    WebElement wb = driver.findElement(By.id("sView1:r1:0:country::content"));
    Select s = new Select(wb);
    s.selectByVisibleText(ReadExcelData.excelData("Sheet1", 3,1));
        Thread.sleep(2000);
    driver.findElement(By.id("sView1:r1:0:firstName::content")).sendKeys(ReadExcelData.excelData("Sheet1", 4,1));
        Thread.sleep(2000);
        driver.findElement(By.id("sView1:r1:0:lastName::content")).sendKeys(ReadExcelData.excelData("Sheet1", 5,1));
        Thread.sleep(2000);
        driver.findElement(By.id("sView1:r1:0:jobTitle::content")).sendKeys(ReadExcelData.excelData("Sheet1", 6,1));
        Thread.sleep(2000);
        driver.findElement(By.id("sView1:r1:0:workPhone::content")).sendKeys(ReadExcelData.excelData("Sheet1", 7,1));
        Thread.sleep(2000);
        driver.findElement(By.id("sView1:r1:0:companyName::content")).sendKeys(ReadExcelData.excelData("Sheet1", 8,1));
        Thread.sleep(2000);
        driver.findElement(By.id("sView1:r1:0:address1::content")).sendKeys(ReadExcelData.excelData("Sheet1", 9,1));
        Thread.sleep(2000);
        driver.findElement(By.id("sView1:r1:0:city::content")).sendKeys(ReadExcelData.excelData("Sheet1", 10,1));
        Thread.sleep(2000);
        WebElement wb2 = driver.findElement(By.id("sView1:r1:0:state::content"));
        Select s1= new Select(wb2);
        s1.selectByValue(ReadExcelData.excelData("Sheet1", 11,1));
        Thread.sleep(2000);
        driver.findElement(By.id("sView1:r1:0:postalCode::content")).sendKeys(ReadExcelData.excelData("Sheet1", 12,1));
        Thread.sleep(2000);    }
    public static void clickCreateAccountForOracle() throws InterruptedException {
        driver.findElement(By.className("xfx")).click();
        Thread.sleep(2000);
    }
}
