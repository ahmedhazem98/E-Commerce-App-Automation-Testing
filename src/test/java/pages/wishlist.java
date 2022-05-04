package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinition.Hooks;

import java.util.List;

public class wishlist {
    public WebElement label(){
        return Hooks.driver.findElement(By.className("wishlist-label"));
    }
    public List<WebElement> qty(){
        return Hooks.driver.findElements(By.cssSelector("input[class=\"qty-input\"]"));
    }
}
