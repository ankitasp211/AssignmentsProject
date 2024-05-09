package pageobject;

import org.junit.Assert;
import reusable.BaseCode;

public class CheckOutPageFlipkart extends BaseCode {
    public static void userValidatesOrder()
    {
        String actualString = driver.getTitle();
                String expectedString = "https://www.flipkart.com/checkout/init?view=FLIPKART&loginFlow=false";
        Assert.assertEquals(actualString,expectedString);
    }
}
