package stepdefination;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import reusable.BaseCode;

public class AmazonSelectCategorySteps extends BaseCode {

    @Given("User selects the category on the homepage")
     public void categorySelection()
    {
        WebElement selectCategory = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select category = new Select(selectCategory);
        category.selectByIndex(5);
        category.selectByValue("search-alias=alexa-skills");
            category.selectByVisibleText("Amazon Fashion");

int dropdownCount= selectCategory.findElements(By.tagName("option")).size();
        System.out.println(dropdownCount);

            for(int i=0; i<dropdownCount ; i++)
            {
                String value = selectCategory.findElements(By.tagName("option")).get(i).getText();
                System.out.println(value);


            }


    }
}
