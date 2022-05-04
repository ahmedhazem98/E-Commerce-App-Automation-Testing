package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.login;
import pages.ForgotPassword;

public class ForgotPasswordStepDefinition {
    login login = new login();
    ForgotPassword forgetPassword = new ForgotPassword();

    @Given("user click on forgot password")
    public void clickForgotPassword(){
        login.loginBtn().click();
        forgetPassword.FogotPasswordBtn().click();
    }

    @When("enter his or her email")
    public void enterEmail(){
        forgetPassword.FogotPasswordEmail().sendKeys("test@example.com");
        forgetPassword.RecoverBtn().click();
    }

    @Then("user receives a link and recover password")
    public void recoverPasswordSuccessfully(){
        String recoverResult = forgetPassword.ResultMsg().getText();
        Assert.assertTrue(recoverResult.
                contains("Email with instructions has been sent to you"));
    }

}
