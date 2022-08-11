package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class SauceLabsPage {
    public SauceLabsPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(tagName = "h4")
    public WebElement pageInfomes;


    public void verifyPageInfo() {
        Assert.assertEquals("We're sorry. We can't find the page you are looking for.", pageInfomes.getText());
    }
}