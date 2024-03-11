package Module2Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenURLInChrome {
    public static void main(String[]args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("learnmore");
      driver.findElement(By.id("password")).sendKeys("123");
      driver.findElement(By.name("Login")).click();
      String actualErrorMessage= driver.findElement(By.xpath("//div[@id='error']")).getText();
      String expectedErrorMessage="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";

      if(actualErrorMessage.equals(expectedErrorMessage))
      {
          System.out.println("Both are equal");
      }
      else
      {
          System.out.println("Both strings are not equal");
      }


//        driver.get("https://learnmoreplayground.blogspot.com/p/loginpage.html");
//        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("learnmore");
//        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123");
//        driver.findElement(By.xpath("//button[@onclick='login()']")).click();






    }

}
