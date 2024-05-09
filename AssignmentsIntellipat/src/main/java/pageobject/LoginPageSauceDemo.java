package pageobject;

import org.openqa.selenium.By;
import reusable.BaseCode;

public class LoginPageSauceDemo extends BaseCode {


    public static void LoginSauceDemo(String username, String password) throws InterruptedException {
        driver.findElement(By.id("user-name")).sendKeys(username);
        Waits.javaWaits();
        driver.findElement(By.name("password")).sendKeys(password);
        Waits.javaWaits();
    }

    public static void clickLoginButtonSauceDemo() throws InterruptedException {
        driver.findElement(By.id("login-button")).click();
    }
}
