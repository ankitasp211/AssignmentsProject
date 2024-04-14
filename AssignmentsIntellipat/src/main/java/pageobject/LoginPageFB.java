package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import reusable.BaseCode;

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
}
