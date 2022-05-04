package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.wishlist;

public class WishlistStepDefinition {
    wishlist list = new wishlist();
    @Given("user add product to wishlist")
    public void wishlist_element() throws InterruptedException {
        Hooks.driver.findElement(By.xpath("(//button[@class=\"button-2 add-to-wishlist-button\"])[3]")).click();
        Thread.sleep(5000);
        Hooks.driver.findElement(By.xpath("(//button[@class=\"button-2 add-to-wishlist-button\"])[2]")).click();
        Thread.sleep(3000);
        Hooks.driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-4\"]")).click();
    }
    @When("user go to wishlist")
    public void go_to_wishlist_page()  {
        list.label().click();
    }

    @And("count number of quanataties")
    public void quantaties(){
        String FirstRow = list.qty().get(0).getAttribute("value");
        String SecondRow = list.qty().get(1).getAttribute("value");
        int total = Integer.parseInt(FirstRow) + Integer.parseInt(SecondRow);
        System.out.println(total);

    }
}
