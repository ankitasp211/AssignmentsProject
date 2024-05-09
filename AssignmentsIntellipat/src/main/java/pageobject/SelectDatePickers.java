package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import reusable.BaseCode;

public class SelectDatePickers extends BaseCode {
    public static void datePicker(String date) throws InterruptedException {
        WebElement wb1 = driver.findElement(By.xpath("//div[@data-testid='departure-date-dropdown-label-test-id']"));
        wb1.click();
        driver.findElement(By.xpath("//div[@data-testid='undefined-calendar-day-"+date+"']")).click();
        Thread.sleep(3000);
    }
}
