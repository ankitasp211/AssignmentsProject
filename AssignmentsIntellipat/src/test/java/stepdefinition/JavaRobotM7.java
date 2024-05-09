package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.jfr.Timespan;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.WindownsAlertM7;
import reusable.BaseCode;

import java.awt.*;
import java.time.Duration;

public class JavaRobotM7 extends BaseCode {

    @Given("Click on Choose file Button")
     public static void clickFileButton()
    {
        WindownsAlertM7.clickButton();
    }

    @When("User Automate Window Alert by uploading file")
    public static void windowsAlertHandling() throws InterruptedException, AWTException {
      WindownsAlertM7.uploadFiles();
    }
    @Then("User clicks on Download Button")
    public void userClicksOnDownloadButton() throws InterruptedException {
        WindownsAlertM7.clickDownloadButton();

    }

    @Given("User automate the plain text")
    public void userAutomatePlainText() throws InterruptedException {
//       WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//       wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//a[text()='4.19.1 (March 29, 2024)']"))));
      String text1 = driver.findElement(By.xpath("//p[text()='C#']")).getText();
        System.out.println(text1);
        String text2 = driver.findElement(By.xpath("//p[text()='Java']")).getText();
        System.out.println(text2);
        String text3 = driver.findElement(By.xpath("//p[text()='Ruby']")).getText();
        System.out.println(text3);

    }

    @Given("User navigates to Window Alert and Select Save")
    public static void navigateWindowALert() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//a[contains(text(),'sikulixide-2.0.5.jar')]"))));
        driver.findElement(By.xpath("//a[contains(text(),'sikulixide-2.0.5.jar')]")).click();
       Thread.sleep(3000);
    }



}




