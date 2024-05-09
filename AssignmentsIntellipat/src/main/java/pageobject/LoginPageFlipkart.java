package pageobject;


import junit.framework.Assert;
import org.openqa.selenium.By;
import reusable.BaseCode;

public class LoginPageFlipkart extends BaseCode {
    public static void loginFlipkart() throws InterruptedException {
        driver.findElement(By.xpath("//*[text()='Login']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9762977462");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
        Thread.sleep(8000);
//        String actualTitle= driver.getTitle();
//        String expectedTitle = "https://www.flipkart.com/";
//       Assert.assertEquals(actualTitle,expectedTitle);

    }
}