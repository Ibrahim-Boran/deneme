package pages;


import org.asynchttpclient.util.Assertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.Driver;
import utils.Helper;

import javax.swing.*;
import java.util.Set;

public class ProductsPage {
    public ProductsPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(className = "shopping_cart_link")
    public WebElement logo;

    @FindBy(className = "product_sort_container")
    public Select filterLogo;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement sauceBackpack;

    @FindBy(id = "item_1_title_link")
    public WebElement clickSauceBoltshirt;

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    public WebElement sauceBoltshirt;

    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    public WebElement sauceOnesie;

    @FindBy(id = "react-burger-menu-btn")
    public WebElement openMenu;

    @FindBy(id = "logout_sidebar_link")
    public WebElement Logout;

    @FindBy(id = "about_sidebar_link")
    public WebElement About;

    @FindBy(id = "item_4_title_link")
    public WebElement checkSauceBackpack;

//    @FindBy(xpath = "//a[text()='Sauce Labs Bolt T-Shirt']")
//    public WebElement checkSauceBoltshirt;

    @FindBy(className = "inventory_details_name large_size")
    public WebElement checkSauceOnesie;

    public void verifyLogo() {
        Helper.waitFor(2);
        Assert.assertTrue(sauceOnesie.isDisplayed());
    }

    public void selectFiltering(String subMenu) {
        Select filterlogo = new Select(Driver.get().findElement(By.className("product_sort_container")));
        filterlogo.selectByVisibleText(subMenu);
    }

    public void addSauceBackpack(){
        Helper.waitFor(2);
        sauceBackpack.click();
    }
    public void clickSaucebolt(){
        clickSauceBoltshirt.click();
    }
    public void addSaucebolt(){
        sauceBoltshirt.click();
    }
    public void addSauceOnesie(){
        sauceOnesie.click();
    }
    public void clickCartlogo(){
        logo.click();
    }
    public void clickOpenmenu(){
        openMenu.click();
    }
    public void clickLogout(){
        Logout.click();
    }
    public void clickAbout(){
        About.click();
    }
    public void checkWrongfilter(){
        Assert.assertEquals("Sauce Labs Backpack", checkSauceBackpack.getText());
    }
    public void productNamematch(){
        Assert.assertNotEquals(clickSauceBoltshirt.getText(), checkSauceOnesie.getText());
    }
}