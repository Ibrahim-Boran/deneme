package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.Helper;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id = "user-name")
    public WebElement userName;


    @FindBy(id = "password")
    public WebElement password;


    @FindBy(id = "login-button")
    public WebElement loginbutton;


    @FindBy(tagName = "h3")
    public WebElement errorMes;


    public void loginUsername(String username) {
        userName.sendKeys(username);
    }
    public void loginPass(String pass) {

        password.sendKeys(pass);
    }
    public void loginButton() {
        loginbutton.click();
        Helper.waitFor(2);
    }

    public void verifyEmptyusernameTitle() {
        Assert.assertEquals("Epic sadface: Username is required", errorMes.getText());
    }
    public void verifyEmptypasswordTitle() {
        Assert.assertEquals("Epic sadface: Password is required", errorMes.getText());
    }
    public void verifyWrongtitle() {
        Assert.assertEquals("Epic sadface: Username and password do not match any user in this service", errorMes.getText());
    }
    public void verifyLockedtitle(){
        Assert.assertEquals("Epic sadface: Sorry, this user has been locked out.", errorMes.getText());
    }
}

