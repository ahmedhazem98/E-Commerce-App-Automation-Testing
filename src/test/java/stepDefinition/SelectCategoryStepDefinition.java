package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;

public class SelectCategoryStepDefinition {

    HomePage hmpg = new HomePage();
    @When("user hover at computer category and selects notebook")
    public void user_hover_to_category()  {
        hmpg.computer_category().click();
        hmpg.notebook_category().click();
    }

    @Then("user could see notebooks")
    public void hover_successfully(){
        Assert.assertTrue(hmpg.hover_msg().getText().contains("Notebook"));

    }
}
