package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinition.Hooks;

public class ForgotPassword {

    public WebElement FogotPasswordBtn(){
        return Hooks.driver.findElement(By.className("forgot-password"));
    }

    public WebElement FogotPasswordEmail(){
        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement RecoverBtn(){
        return Hooks.driver.findElement(By.xpath("//button[@name=\"send-email\"]"));
    }

    public WebElement ResultMsg(){
        return Hooks.driver.findElement(By.xpath("//p[@class=\"content\"]"));
    }

}
