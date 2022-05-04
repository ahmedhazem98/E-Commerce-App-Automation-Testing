package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.search;
import pages.HomePage;

public class ChangeCurrencyStepDefinition {

    HomePage hpage = new HomePage();
    search searchC = new search();
    @When("user selects currency drop list and chooses Euro")
    public void SwitchCurrency(){
        hpage.currency_panel().click();
        hpage.Euro_option().click();
    }

    @Then("the price of the product appears in Euro")
    public void user_see_products_in_euro()  {
        searchC.Name().sendKeys("Apple MacBook Pro 13-inch");
        searchC.SearchBox().click();
        Assert.assertTrue(hpage.price_Euro_msg().getText().contains("€"));
    }
}
