package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.ja.且つ;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import reusable.BaseCode;

import java.awt.desktop.SystemEventListener;

public class SpicejetDynamicDropdown extends BaseCode {

    @Given("User handles the Dynamic Dropdown")
    public void dynamicDropdown() throws InterruptedException {

        driver.findElement(By.xpath("//input[@name='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']")).click();

//OR we can you relative-relative xpath for the same scenario
        driver.findElement(By.xpath("//div[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTNR']//a[@value='AMD']")).click();

//OR we can you WebElement for the same scenari
driver.findElement(By.xpath("//div[@id='ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR']//a[@value='JAI']")).click();
   //   selectDropdown.findElement(By.xpath("//a[@value='BLR']")).click();

//        //Or we can use Xpath Axis for the same scenario as well
//        WebElement elementc = driver.findElement(By.xpath("//select[@name='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1']"));
//                Select city = new Select(elementc);
//                city.selectByValue("BKK");

      // driver.findElement(By.xpath("//select[@name='ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT']")).click();
        driver.findElement(By.xpath("//input[@id='custom_date_picker_id_1']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[@data-date='28']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='custom_date_picker_id_2']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//a[@data-date='30']")).click();
        Thread.sleep(3000);


    }

    @And("User handles static dropdown")
    public void handlestaticDropdown() throws InterruptedException {

        driver.findElement(By.xpath("//div[@class='paxinfo']")).click();
        Thread.sleep(3000);
        WebElement passengers = driver.findElement(By.xpath("//select[@class='wMed1s required guests']"));
        Thread.sleep(3000);

        Select staticdropdown = new Select(passengers);
        Thread.sleep(3000);
        staticdropdown.selectByVisibleText("3");
        Thread.sleep(3000);
    }

    @Given("Get all the columns and rows")
    public void getAllTheColumnsAndRows() {


        WebElement noOfRows = driver.findElement(By.xpath("//table[@class='infobox vcard']/tbody"));

        int countOfRows = noOfRows.findElements(By.tagName("tr")).size();
        System.out.println(countOfRows);
        int countofFirstColumn = noOfRows.findElements(By.tagName("th")).size();
        System.out.println(countofFirstColumn);
        int countofSecondColumn = noOfRows.findElements(By.tagName("td")).size();
        System.out.println(countofSecondColumn);

        for (int i = 0; i < countofFirstColumn; i++) {
            String Value = noOfRows.findElements(By.tagName("th")).get(i).getText();
            System.out.println(Value);

        }
        for (int j = 2; j < countOfRows; j++) {

            String Value1 = noOfRows.findElements(By.tagName("td")).get(j).getText();
            System.out.println(Value1);
        }


    }

    @Given("Get second column and its values")
    public void getSecondColumnAndItsValues() {

        WebElement header = driver.findElement(By.xpath("//table[@class='wikitable']"));
        int sizeOfHeaders = header.findElements(By.xpath("tbody/tr/td[2]")).size();
        System.out.println(sizeOfHeaders);

        for (int k = 0; k < sizeOfHeaders; k++)
        {
        String val= header.findElements(By.xpath("tbody/tr/td[2]")).get(k).getText();
            System.out.println(val);
        }
    }

    @Given("Get the runs column in the console")
    public void getTheRunsColumnInTheConsole() {

    }

    @Given("Get the Match Details column in the console")
    public void getTheMatchDetailsColumnInTheConsole() {
         WebElement secondColumn = driver.findElement(By.xpath("//div[@class='cb-col-75 cb-col']"));
         int countOfColmn= secondColumn.findElements(By.xpath("//div[@class='cb-col-60 cb-col cb-srs-mtchs-tm']")).size();
        System.out.println(countOfColmn);

        for(int z=0; z< countOfColmn; z++)
        {
            String str = secondColumn.findElements(By.xpath("//div[@class='cb-col-60 cb-col cb-srs-mtchs-tm']")).get(z).getText();
            System.out.println(str);
        }
    }


}
