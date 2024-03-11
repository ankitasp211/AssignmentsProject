package stepdefination;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import reusable.BaseCode;

import java.io.IOException;

public class SeleniumActionsCode extends BaseCode {



    @Given("User clicks on checkbox")
    public void checkboxInteraction() throws IOException {
       WebElement checkbox = driver.findElement(By.xpath("(//span[@class='checkmark'])[2]"));
       checkbox.click();
        System.out.println("Checkbox is checked");

    }
}
