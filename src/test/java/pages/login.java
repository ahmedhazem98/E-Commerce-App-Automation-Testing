package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinition.Hooks;

public class login {

    public WebElement loginBtn() {

        WebElement loginBtn = Hooks.driver.findElement(By.className("ico-login"));
        return loginBtn;
    }
    public WebElement email() {
        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement password() {
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement submit() {
        return Hooks.driver.findElement(By.className("login-button"));
    }
}