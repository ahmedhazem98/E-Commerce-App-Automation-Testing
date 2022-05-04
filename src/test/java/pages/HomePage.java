package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinition.Hooks;

public class HomePage {

    public WebElement product_to_cart(){
        return Hooks.driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[3]"));
    }

    public WebElement macbook_product() {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/h2/a"));
    }

    public WebElement add_to_cart_btn(){
        return Hooks.driver.findElement(By.id("add-to-cart-button-4"));
    }

    public WebElement cart_add_message(){
        return Hooks.driver.findElement(By.className("content"));
    }

    public WebElement add_to_compare_btn(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[10]/div[2]/button"));
    }

    public WebElement compare_msg(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[5]/div/p"));
    }

    public WebElement hover_msg(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[1]/h1"));
    }

    public WebElement computer_category(){
        return Hooks.driver.findElement(By.xpath("//a[@href=\"/computers\"]"));
    }

    public WebElement notebook_category(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[2]/div/h2/a"));
    }

    public WebElement awesome_tag(){
        return  Hooks.driver.findElement(By.linkText("awesome"));
    }

    public WebElement select_tag_msg(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[1]/h1"));
    }

    public WebElement currency_panel(){
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }

    public WebElement Euro_option(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"customerCurrency\"]/option[2]"));
    }

    public WebElement price_Euro_msg(){
        return Hooks.driver.findElement(By.xpath("//span[@class=\"price actual-price\"]"));
    }

    public WebElement apparel_page(){
        return Hooks.driver.findElement(By.linkText("Apparel"));
    }

    public WebElement shoes_category(){
        return Hooks.driver.findElement(By.xpath("//a[@title=\"Show products in category Shoes\"]"));
    }

    public WebElement red_filter(){
        return Hooks.driver.findElement(By.id("attribute-option-15"));
    }
}
