package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import reusable.BaseCode;
import reusable.ReadExcelData;

import java.io.IOException;
import java.time.Duration;

public class SignUpPageFBXPathAxis extends BaseCode {
    public static void clickOnCreateNewAccount() throws InterruptedException {

        driver.findElement(By.partialLinkText("Create")).click();
        Thread.sleep(3000);
    }

    public static void enterValidCredentials() throws IOException, InterruptedException {
        driver.findElement(By.xpath("//*[@id='reg_form_box']/descendant::*[5]")).sendKeys(ReadExcelData.excelData("Sheet1", 0, 0));
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='reg_form_box']/descendant::*[3]/following-sibling::*/descendant::*[4]")).sendKeys(ReadExcelData.excelData("Sheet1", 1, 0));
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='reg_form_box']/child::*[2]/descendant::*[4]")).sendKeys(ReadExcelData.excelData("Sheet1", 2, 0));
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='password_field']/descendant::*[4]")).sendKeys(ReadExcelData.excelData("Sheet1", 3, 0));
        Thread.sleep(3000);
    }


    public static void selectDOB() throws IOException {
        WebElement wb = driver.findElement(By.xpath("//div[@id='birthday_wrapper']/descendant::*[7]"));
        Select dt = new Select(wb);
        dt.selectByVisibleText(ReadExcelData.excelData("Sheet1", 4, 0));
        WebElement wb1 = driver.findElement(By.xpath("//div[@id='birthday_wrapper']/descendant::*[7]/following-sibling::*[1]"));
        Select dy = new Select(wb1);
        dy.selectByVisibleText(ReadExcelData.excelData("Sheet1", 5, 0));
        WebElement wb2 = driver.findElement(By.xpath("//div[@id='birthday_wrapper']/descendant::*[7]/following-sibling::*[2]"));
        Select yr = new Select(wb2);
        yr.selectByVisibleText(ReadExcelData.excelData("Sheet1", 6, 0));
    }

    public static void selectGender() throws IOException {
        if (ReadExcelData.excelData("Sheet1", 7, 0).equals("Female")) {
            driver.findElement(By.xpath("//div[@id='reg_form_box']/child::*[7]/child::*[2]/descendant::*[3]")).click();
        } else if (ReadExcelData.excelData("Sheet1", 7, 0).equals("Male")) {
            driver.findElement(By.xpath("//div[@id='reg_form_box']/child::*[7]/child::*[2]/child::*[2]/descendant::*[2]")).click();
        } else if (ReadExcelData.excelData("Sheet1", 7, 0).equals("Custom")) {
            driver.findElement(By.xpath("//div[@id='reg_form_box']/child::*[7]/child::*[2]/child::*[3]/descendant::*[2]")).click();
        } else {
            throw new InvalidArgumentException("Enter valid gender");
        }
    }

    public static void clickSignUp() {
        driver.findElement(By.name("websubmit")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }


    }



