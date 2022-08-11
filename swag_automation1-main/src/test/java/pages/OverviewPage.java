package pages;

import org.asynchttpclient.util.Assertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.Driver;

public class OverviewPage {
    public OverviewPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "finish")
    public WebElement Finish;


    public void clickFinish() { Finish.click();}
}
