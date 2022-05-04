package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinition.Hooks;

public class Order {

    public WebElement go_to_cart(){
        return Hooks.driver.findElement(By.className("cart-label"));
    }
    public WebElement update_cart(){return Hooks.driver.findElement(By.id("updatecart")); }
    public WebElement terms_of_service(){return Hooks.driver.findElement(By.id("termsofservice")); }
    public WebElement continue_btn(){return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")); }
    public WebElement checkout_btn(){return Hooks.driver.findElement(By.id("checkout")); }
    public WebElement firstNameLbl () {return Hooks.driver.findElement(By.id("BillingNewAddress_FirstName"));}
    public WebElement lastNameLbl() {return Hooks.driver.findElement(By.id("BillingNewAddress_LastName"));}
    public WebElement emailLbl() {return Hooks.driver.findElement(By.id("BillingNewAddress_Email"));}
    public WebElement countryPanel() {return Hooks.driver.findElement(By.id("BillingNewAddress_CountryId"));}
    public WebElement cityLbl() {return Hooks.driver.findElement(By.id("BillingNewAddress_City"));}
    public WebElement addressLbl() {return Hooks.driver.findElement(By.id("BillingNewAddress_Address1"));}
    public WebElement postalLbl() {return Hooks.driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));}
    public WebElement phoneNumberLbl() {return Hooks.driver.findElement(By.id("BillingNewAddress_PhoneNumber"));}
    public WebElement billing_Btn() {return Hooks.driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]"));}
    public WebElement Shipping_method_Btn() {return Hooks.driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button"));}
    public WebElement payment_method_Btn() {return Hooks.driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/button"));}
    public WebElement payment_info() {return Hooks.driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/button"));}
    public WebElement confirm_Btn() {return Hooks.driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/button"));}
    public WebElement status_msg() {return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong"));}
}
