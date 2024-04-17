package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import reusable.BaseCode;
import reusable.ReadExcelData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoginPageFB extends BaseCode {
    public static void getTheLinks()
    {

     List<WebElement> list1= new ArrayList<WebElement>(driver.findElements(By.tagName("a")));

        System.out.println(list1.size());
    }

    public static void getText()
    {   List<String> list2 = new ArrayList<String>();
        List<WebElement> list1= new ArrayList<WebElement>(driver.findElements(By.tagName("a")));
        for (WebElement wb : list1)
        {
            String text = wb.getText();
            list2.add(text);
            System.out.println(list2);
        }
        System.out.println(list2);
    }

    public static void enterLoginCredentials() throws IOException {
            driver.findElement(By.xpath("//*[@data-testid='royal_login_form']/descendant::*[5]")).sendKeys(ReadExcelData.excelData("Sheet1",0,2));
        driver.findElement(By.xpath("//*[@data-testid='royal_login_form']/descendant::*[8]")).sendKeys(ReadExcelData.excelData("Sheet1",1,2));
    }
    public static void clickLogin()
    {
        driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]/parent::*/preceding-sibling::*[1]/child::*")).click();
    }
}
