package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.HomePage;

public class SelectTagsStepDefinition {

    HomePage page = new HomePage();
    @Then("user navigates to awesome tag")
    public void navigate_to_tag()  {
       page.awesome_tag().click();
    }

    @And("user could find all products under the awesome tag")
    public void products_with_awesome_tag() {
        Assert.assertTrue(page.select_tag_msg().getText().contains("Products tagged with 'awesome"));

    }

}
