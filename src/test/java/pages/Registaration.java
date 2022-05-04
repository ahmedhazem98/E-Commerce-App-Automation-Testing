package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinition.Hooks;

public class Registaration {
    public WebElement registerBtn() {

        WebElement registerBtn = Hooks.driver.findElement(By.className("ico-register"));
        return registerBtn;
    }
    public WebElement firstName() {
        return Hooks.driver.findElement(By.id("FirstName"));
    }
    public WebElement lastName() {
        return Hooks.driver.findElement(By.id("LastName"));
    }
    public WebElement gender() {
        return Hooks.driver.findElement(By.id("gender-male"));
    }
    public WebElement email() { return Hooks.driver.findElement(By.id("Email"));}
    public WebElement password() {
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement confirmPassword() {
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement submit() {
        return Hooks.driver.findElement(By.id("register-button"));
    }
    public WebElement log_out() {
        return Hooks.driver.findElement(By.className("ico-logout"));
    }
    public WebElement Result() {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]"));
    }
}
