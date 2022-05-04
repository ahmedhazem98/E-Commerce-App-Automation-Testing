package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Registaration;

public class RegistarationStepDefinition {
    Registaration register = new Registaration();

    @Given("user clicks on register button")
    public void clickonRegisterBtn() {
        register.registerBtn().click();
    }

    @When("enter Gender & First Name & Last Name & Email & Password")
    public void enter_Data() {

        register.gender().click();
        register.firstName().sendKeys("firstName");
        register.lastName().sendKeys("lastName");
        register.email().sendKeys("test4@example.com");
        register.password().sendKeys("Passw0rd!");
        register.confirmPassword().sendKeys("Passw0rd!");
        register.submit().click();

    }

    @Then("registration is completed and success massage appears")
    public void RegisteredSuccessfully()  {
        String message = register.Result().getText();
        System.out.println(message);
        Assert.assertTrue(message.contains("Your registration completed"));
    }
}

