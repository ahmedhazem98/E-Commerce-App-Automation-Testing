package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.search;

public class SearchStepDefinition {
    search searchItem = new search();
    @When("user clicks on search field")
    public void user_clicks_on_search_field()
    {
        // locate search field and click on it
        searchItem.clickSearch().click();
    }

    @And("user search with name of product")
    public void user_search_with_name_of_product()
    {
        searchItem.Name().sendKeys("book");
        searchItem.SearchBox().click();

    }

    @Then("user could find relative results")
    public void user_could_find_relative_results()
    {
        int count = Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).size();  // 0
        System.out.println(count);
        Assert.assertTrue(count > 0);

        for (int x = 0; x < count ; x++) {
            System.out.println(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).get(x).getText());
            Assert.assertTrue(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).get(x).getText().toLowerCase().contains("book"));
        }
    }
}
