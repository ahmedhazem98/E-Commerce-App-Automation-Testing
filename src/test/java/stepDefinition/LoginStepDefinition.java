package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.login;


public class LoginStepDefinition {
    login log = new login();
    WebDriver driver = null;
    @Given("user go to login page")
    public void user_login()  {
        log.loginBtn().click();
    }

    @When("user enter valid username and password")
    public void enter_email_password(){
        log.email().sendKeys("test@example.com");
        log.password().sendKeys("Passw0rd!");
        log.submit().click();

    }

    @Then("user could login successfully")
    public void success_login()  {

        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"));

    }

}
