package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import pages.Order;
import pages.HomePage;


public class OrderItemSuccStepDefinition {

    Order page = new Order();
    HomePage hPage = new HomePage();
    @Given("user add apple macbook to shopping cart")
    public void add_to_cart(){
        hPage.macbook_product().click();
        hPage.add_to_cart_btn().click();
    }

    @When("user go to shopping cart")
    public void go_to_cart(){ page.go_to_cart().click(); }

    @And("update the shopping cart")
    public void update_cart(){ page.update_cart().click();}

    @And("should continue with order")
    public void accept_and_continue(){
        page.terms_of_service().click();
        page.checkout_btn().click();
        page.continue_btn().click();
    }

    @And("enters the shipping address and payment")
    public void complete_data(){
        page.firstNameLbl().sendKeys("firstName");
        page.lastNameLbl().sendKeys("lastName");
        page.emailLbl().sendKeys("test1@example.com");
        page.countryPanel().sendKeys("Egypt");
        page.countryPanel().sendKeys(Keys.ENTER);
        page.cityLbl().sendKeys("Cairo");
        page.addressLbl().sendKeys("73 El Tayran St");
        page.postalLbl().sendKeys("733253");
        page.phoneNumberLbl().sendKeys("0123733253");
        page.billing_Btn().click();
        page.Shipping_method_Btn().click();
        page.payment_method_Btn().click();
        page.payment_info().click();
        page.confirm_Btn().click();
    }


    @Then("user could order his product successfully")
    public void Order_Success(){
        Assert.assertTrue(page.status_msg().getText().contains("Your order has been successfully processed!"));
    }

}
