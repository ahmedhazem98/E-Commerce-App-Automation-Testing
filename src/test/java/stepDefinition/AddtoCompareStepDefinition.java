package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;

public class AddtoCompareStepDefinition {

    HomePage hPage = new HomePage();
    @Given("user clicks on the product apple macbook")
    public void click_on_product()  {
        hPage.macbook_product().click();
    }

    @When("user added it to compare list")
    public void add_to_compare()  {
        hPage.add_to_compare_btn().click();
    }

    @Then("user can add this item to the compare list and a confirmation message will be shown")
    public void added_to_compareList_successfully(){
        Assert.assertTrue(hPage.compare_msg().getText().contains("The product has been added to your "));
    }


}
