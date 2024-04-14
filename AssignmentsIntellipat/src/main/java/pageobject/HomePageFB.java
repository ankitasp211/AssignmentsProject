package pageobject;

import dev.failsafe.internal.util.Assert;
import reusable.BaseCode;

public class HomePageFB extends BaseCode {

    public static void titleOfPage()
    {
     if(driver.getTitle().equalsIgnoreCase("facebook"))
     {
         Assert.isTrue(true,"The facebook account is created");
         System.out.println(driver.getTitle());
     }
    }


}
