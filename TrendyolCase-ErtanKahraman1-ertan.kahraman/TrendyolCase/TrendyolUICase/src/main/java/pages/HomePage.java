package pages;

import drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Constants;


public class HomePage {
    private WebDriver driver;

    public HomePage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);

    }

    @FindBy(css = ".modal-close")
    private WebElement closePopUp;

    @FindBy(css = ".search-box")
    private WebElement searchBox;

    @FindBy(css = ".search-icon")
    private WebElement searchButton;

    public void checkBaseURLTitle() {
        String Actual = driver.getTitle();
        if (Actual.equals(Constants.BASE_TITLE)) {
            System.out.println(Constants.BASE_URL + " is title check successful.");
        } else {
            System.out.println(Constants.BASE_URL + "  is not title check successful.");
            driver.close();
        }
    }

    public void closeHomePagePopUp() {
        WebDriverWait wait = new WebDriverWait(driver, Constants.TIMEOUT);
        wait.until(ExpectedConditions.elementToBeClickable(closePopUp));
        closePopUp.click();
    }

    public void checkHomePageSearchBarAndSearchButton() {
        WebDriverWait wait = new WebDriverWait(driver, Constants.TIMEOUT);
        wait.until(ExpectedConditions.visibilityOf(searchBox));
        wait.until(ExpectedConditions.elementToBeClickable(searchButton));
    }

}
