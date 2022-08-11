package pages;


import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class CompletePage {
    public CompletePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(tagName = "h2")
    public WebElement thankMes;


    public void verifyThankmes() {
        Assert.assertEquals("THANK YOU FOR YOUR ORDER", thankMes.getText());
    }
}
