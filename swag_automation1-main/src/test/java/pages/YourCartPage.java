package pages;

import org.asynchttpclient.util.Assertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.Driver;

public class YourCartPage {
    public YourCartPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "remove-sauce-labs-bolt-t-shirt")
    public WebElement removeSauceBoltshirt;


    @FindBy(id = "continue-shopping")
    public WebElement continueShopping;

    @FindBy(id = "checkout")
    public WebElement checkout;

    public void removeSaucebolt(){
        removeSauceBoltshirt.click();
    }

    public void continueShoppingbutton(){
        continueShopping.click();
    }
    public void checkoutButton(){
        checkout.click();
    }
}
