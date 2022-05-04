package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.HomePage;

public class FilterStepDefinition {

    HomePage homPage = new HomePage();
    @Given("user navigates to Apparel & shoes")
    public void navigate_to_apparel_and_shoes()  {
        homPage.apparel_page().click();
        homPage.shoes_category().click();
    }

    @When("selects the red shoes")
    public void filter_red()  {
        homPage.red_filter().click();
    }

    @Then("user could see the price of the red shoes")
    public void successfully_filter() {
        Assert.assertTrue(Hooks.driver.findElement(By.className("price")).getText().contains("$27"));
    }
}
