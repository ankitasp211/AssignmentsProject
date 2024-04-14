package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import reusable.BaseCode;
import reusable.ReadExcelData;

import java.io.IOException;
import java.time.Duration;

public class SignUpPageFB extends BaseCode {
    public static void clickOnCreateNewAccount() throws InterruptedException {

        driver.findElement(By.partialLinkText("Create")).click();
        Thread.sleep(3000);
    }

    public static void enterValidCredentials() throws IOException, InterruptedException {
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(ReadExcelData.excelData("Sheet1", 0, 0));
        Thread.sleep(3000);
        driver.findElement(By.name("lastname")).sendKeys(ReadExcelData.excelData("Sheet1", 1, 0));
        Thread.sleep(3000);
        driver.findElement(By.name("reg_email__")).sendKeys(ReadExcelData.excelData("Sheet1", 2, 0));
        Thread.sleep(3000);
        driver.findElement(By.id("password_step_input")).sendKeys(ReadExcelData.excelData("Sheet1", 3, 0));
        Thread.sleep(3000);
    }

    public static void selectDOB() throws IOException {
        WebElement wb = driver.findElement(By.name("birthday_day"));
        Select dt = new Select(wb);
        dt.selectByVisibleText(ReadExcelData.excelData("Sheet1", 4, 0));
        WebElement wb1 = driver.findElement(By.name("birthday_month"));
        Select dy = new Select(wb1);
        dy.selectByVisibleText(ReadExcelData.excelData("Sheet1", 5, 0));
        WebElement wb2 = driver.findElement(By.name("birthday_year"));
        Select yr = new Select(wb2);
        yr.selectByVisibleText(ReadExcelData.excelData("Sheet1", 6, 0));
    }

    public static void selectGender() throws IOException {
        if (ReadExcelData.excelData("Sheet1", 7, 0).equals("Female")) {
            driver.findElement(By.xpath("//input[@value='1']")).click();
        } else if (ReadExcelData.excelData("Sheet1", 7, 0).equals("Male")) {
            driver.findElement(By.xpath("//input[@value='2']")).click();
        } else if (ReadExcelData.excelData("Sheet1", 7, 0).equals("Custom")) {
            driver.findElement(By.xpath("//input[@value='3']")).click();
        } else {
            throw new InvalidArgumentException("Enter valid gender");
        }
    }

    public static void clickSignUp() {
        driver.findElement(By.name("websubmit")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public static void enterCredentialsAbsoluteXpath() throws IOException, InterruptedException {
        driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/div[1]/input")).sendKeys(ReadExcelData.excelData("Sheet1", 0, 0));
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input")).sendKeys(ReadExcelData.excelData("Sheet1", 1, 0));
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input")).sendKeys(ReadExcelData.excelData("Sheet1", 2, 0));
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[4]/div/div[1]/input")).sendKeys(ReadExcelData.excelData("Sheet1", 3, 0));
        Thread.sleep(3000);
        WebElement webe = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]"));
        Select slct = new Select(webe);
        slct.selectByVisibleText(ReadExcelData.excelData("Sheet1", 4, 0));
        WebElement webe2 = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[2]"));
        Select slct2 = new Select(webe2);
        slct2.selectByVisibleText(ReadExcelData.excelData("Sheet1", 5, 0));

        WebElement webe3 = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[3]"));
        Select slct3 = new Select(webe3);
        slct3.selectByVisibleText(ReadExcelData.excelData("Sheet1", 6, 0));
        if (ReadExcelData.excelData("Sheet1", 7, 0).equals("Female")) {
            driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/input")).click();
        } else if (ReadExcelData.excelData("Sheet1", 7, 0).equals("Male")) {
            driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input")).click();
        } else if (ReadExcelData.excelData("Sheet1", 7, 0).equals("Custom")) {
            driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[3]/input")).click();
        } else {
            throw new InvalidArgumentException("Enter valid gender");
        }
    }


    public static void getValueIntoConsole(String frst) throws InterruptedException, IOException {
        driver.findElement(By.xpath("//input[@name='"+frst+"']")).sendKeys(ReadExcelData.excelData("Sheet1", 0, 0));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='firstname']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='"+frst+"']")).sendKeys(ReadExcelData.excelData("Sheet1", 0, 0));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='firstname']")).click();
        WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
        String text = fname.getAttribute("value");
        Thread.sleep(2000);
        System.out.println(text);
    }

}

