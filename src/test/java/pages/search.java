package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.search;
import stepDefinition.Hooks;

public class search {

    public WebElement clickSearch(){
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

    public WebElement Name(){
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

    public WebElement SearchBox(){
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }
}
