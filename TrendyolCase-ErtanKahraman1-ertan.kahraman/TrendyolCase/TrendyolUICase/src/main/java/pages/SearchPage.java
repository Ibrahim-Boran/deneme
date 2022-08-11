package pages;

import drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Constants;

public class SearchPage {
    private WebDriver driver;

    public SearchPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);

    }

    @FindBy(css = ".search-box")
    private WebElement searchBox;

    @FindBy(css = ".search-icon")
    private WebElement searchButton;

    @FindBy(xpath = "//h1[text()='sennheiser']")
    public WebElement sennheiserProduct;

    @FindBy(xpath = "//h1[text()='powerbank']")
    public WebElement powerbankProduct;

    @FindBy(xpath = "(//span[@class='prdct-desc-cntnr-ttl' and contains(@title,'Sennheiser')])[1]")
    public WebElement firstSennheiser;

    @FindBy(xpath = "(//span[@class='prdct-desc-cntnr-name hasRatings' and contains(@title,'Mah') or contains(@title,'mah')])[1]")
    public WebElement firstPowerbank;

    @FindBy(xpath = "//h1[text()='asdasddd']")
    public WebElement invalidItem;

    @FindBy(xpath = "//strong[text()='aoıdjsaıa']")
    public WebElement invalidWordAndProduct;

    @FindBy(css = ".no-rslt-icon")
    public WebElement noResultIcon;

    @FindBy(css = ".fltr-cntnr-show-more-button")
    public WebElement showMoreProduct;

    @FindBy(xpath = "//strong[text()='%^%']")
    public WebElement justCharacterOnly;

    public void sendKeyItemToSearchBox(String text) {
        WebDriverWait wait = new WebDriverWait(driver, Constants.TIMEOUT);
        wait.until(ExpectedConditions.visibilityOf(searchBox));
        searchBox.sendKeys(text);

    }

    public void clickSearchButton() {
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Constants.TIMEOUT);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton));
        actions.moveToElement(searchButton).build().perform();
        searchButton.click();
    }


    public void checksIfProductSennheiserExists() {
        WebDriverWait wait = new WebDriverWait(driver, Constants.TIMEOUT);
        String CURRENT_URL = driver.getCurrentUrl();
        if (CURRENT_URL.contains("sennheiser")) {
            System.out.println(sennheiserProduct.getText() + " the word was successfully added to the URL as a query parameter.");
            wait.until(ExpectedConditions.visibilityOf(sennheiserProduct));
            if (firstSennheiser.getText() == null) {
                System.out.println("No product found for the searched word.");
                driver.close();
            } else {
                wait.until(ExpectedConditions.visibilityOf(firstSennheiser));
                System.out.println("Listing results for search " + sennheiserProduct.getText());
            }
        } else {
            System.out.println(sennheiserProduct.getText() + " the URL for the word query could not be found as a parameter.");
        }

    }

    public void checksIfProductPowerbankExists() {
        WebDriverWait wait = new WebDriverWait(driver, Constants.TIMEOUT);
        String CURRENT_URL = driver.getCurrentUrl();
        if (CURRENT_URL.contains("powerbank")) {
            System.out.println(powerbankProduct.getText() + " the word was successfully added to the URL as a query parameter.");
            wait.until(ExpectedConditions.visibilityOf(powerbankProduct));
            if (firstPowerbank.getText() == null) {
                System.out.println("No product found for the searched word");
                driver.close();
            } else {
                wait.until(ExpectedConditions.visibilityOf(firstPowerbank));
                System.out.println("Listing results for search " + powerbankProduct.getText());
            }
        } else {
            System.out.println(powerbankProduct.getText() + " the URL for the word query could not be found as a parameter.");
        }
    }

    public void anInvalidProductRedirectIsChecked() {
        WebDriverWait wait = new WebDriverWait(driver, Constants.TIMEOUT);
        String CURRENT_URL = driver.getCurrentUrl();
        if (CURRENT_URL.contains("asdasddd")) {
            System.out.println(invalidItem.getText() + " the word was successfully added to the URL as a query parameter.");
            wait.until(ExpectedConditions.visibilityOf(showMoreProduct));
            System.out.println(invalidItem.getText() + " for please " + showMoreProduct.getText() + " click the button.");
        } else {
            System.out.println(invalidItem.getText() + " the URL for the word query could not be found as a parameter.");
        }
    }

    public void checksIfAnInvalidProductExists() {
        WebDriverWait wait = new WebDriverWait(driver, Constants.TIMEOUT);
        String CURRENT_URL = driver.getCurrentUrl();
        if (CURRENT_URL.contains("aoıdjsaıa")) {
            System.out.println(invalidWordAndProduct.getText() + " the word was successfully added to the URL as a query parameter.");
            wait.until(ExpectedConditions.visibilityOf(noResultIcon));
        } else {
            System.out.println(invalidWordAndProduct.getText() + " the URL for the word query could not be found as a parameter.");
        }
    }

    public void productSearchWithSpecialCharacterIsControlled() {
        WebDriverWait wait = new WebDriverWait(driver, Constants.TIMEOUT);
        String CURRENT_URL = driver.getCurrentUrl();
        if (CURRENT_URL.contains("+%^%")) {
            System.out.println(justCharacterOnly.getText() + " the word was successfully added to the URL as a query parameter.");
            wait.until(ExpectedConditions.visibilityOf(noResultIcon));
        } else {
            System.out.println(justCharacterOnly.getText() + " the URL for the word query could not be found as a parameter.");
        }
    }

    public String getSennheiserProductString() {
        return sennheiserProduct.getText();
    }

    public String getPowerbankProductString() {
        return powerbankProduct.getText();
    }
}
