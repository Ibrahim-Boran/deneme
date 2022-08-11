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

public class YourInformationPage {
    public YourInformationPage() {
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(id = "first-name")
    public WebElement Firstname;

    @FindBy(id = "last-name")
    public WebElement Lastname;

    @FindBy(id = "postal-code")
    public WebElement Postalcode;


    @FindBy(tagName = "h3")
    public WebElement errorMess;

    @FindBy(id = "cancel")
    public WebElement Cancel;

    @FindBy(id = "continue")
    public WebElement Continue;


    public void firstName(String firstname) {
        Firstname.clear();
        Helper.waitFor(1);
        Firstname.sendKeys(firstname);}
    public void lastName(String lastname) {
        Lastname.clear();
        Helper.waitFor(1);
        Lastname.sendKeys(lastname);
    }
    public void postalCode(String postalcode) {
        Postalcode.clear();
        Postalcode.clear();
        Helper.waitFor(1);
        Postalcode.sendKeys(postalcode);
    }

    public void firstErrormes() {
        Assert.assertEquals("Error: First Name is required", errorMess.getText());
    }
    public void lastErrorMes() {
        Assert.assertEquals("Error: Last Name is required", errorMess.getText());
    }
    public void postalcodeErrorMes() {
        Assert.assertEquals("Error: Postal Code is required", errorMess.getText());
    }
    public void clickCancel(){
        Cancel.click();
    }
    public void clickContinue(){
        Helper.waitFor(1);
        Continue.click();
    }
}
