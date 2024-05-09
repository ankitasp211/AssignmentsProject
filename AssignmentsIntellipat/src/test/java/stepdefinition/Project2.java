package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.CheckOutPageFlipkart;
import pageobject.ShippingPageFlipkart;
import pageobject.HomePageFlipKart;
import pageobject.LoginPageFlipkart;
import reusable.BaseCode;
import reusable.WriteExcelData;

import java.awt.*;
import java.io.IOException;
import java.util.List;

public class Project2 extends BaseCode  {

    @Given("User search 'Mobile Phone' on the homepage")
    public static void searchData() throws InterruptedException, AWTException {
        HomePageFlipKart.searchMobilePhone();
    }

        @When("User fetches all the mobile phones and prices listed on the page and output them to an excel file")
         public static void fetchList() throws IOException {
            HomePageFlipKart.fetchListOfPhones();
           List<String> l3 = HomePageFlipKart.fetchRateOfPhones();
           WriteExcelData.writeDateToExcel("Sheet1" , 1,5, l3);
        }

        @Given("User login to the homepage and validate if Login is successful")
     public static void loginToFLipkart() throws InterruptedException {
            LoginPageFlipkart.loginFlipkart();
        }

    @Given("User search for Iphone 12 and select a 64GB phone")
    public static void SearchIphone() throws InterruptedException, AWTException {
     HomePageFlipKart.searchIphone();

    }
    @When("User adds the product to the cart and validate that the product is available in the cart")
    public static void addProductToCart() throws InterruptedException, AWTException {
        HomePageFlipKart.switchToTabs();
        HomePageFlipKart.scrollDownThePage();
        HomePageFlipKart.addTocart();
       // HomePageFlipKart.switchToTabs();

    }
    @And("User adds a new address for shipping")
     public static void addAddress() throws InterruptedException {
        ShippingPageFlipkart.addNewAddress();
    }


    @Then(" User proceeds to the checkout page and validate it")
    public void userProceedsToTheCheckoutPageAndValidateIt() throws InterruptedException {
        CheckOutPageFlipkart.userValidatesOrder();


    }
}


