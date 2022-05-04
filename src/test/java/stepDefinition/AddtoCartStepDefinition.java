package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;

public class AddtoCartStepDefinition {
    HomePage hmPage = new HomePage();
    @Given("user add mobile to cart then clicks on the product apple macbook")
    public void click_on_product()  {
        hmPage.product_to_cart().click();
        hmPage.macbook_product().click();
    }

    @When("user add it to the shopping cart")
    public void add_to_cart()  {
        hmPage.add_to_cart_btn().click();
    }

    @Then("item is added to the shopping cart and a confirmation message will be shown")
    public void add_successfully(){
        Assert.assertTrue(hmPage.cart_add_message().getText().contains("The product has been added to your "));
    }

}
