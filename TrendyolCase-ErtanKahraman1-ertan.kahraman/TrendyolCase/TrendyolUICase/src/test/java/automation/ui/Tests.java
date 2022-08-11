package automation.ui;

import drivers.DriverSingleton;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.SearchPage;
import utils.Constants;
import utils.FrameworkProperties;

import static org.junit.Assert.assertEquals;

public class Tests {

    static FrameworkProperties frameworkProperties;
    static WebDriver driver;
    static HomePage homePage;
    static SearchPage searchPage;

    @BeforeClass
    public static void initializeObjects() {
        frameworkProperties = new FrameworkProperties();
        DriverSingleton.getInstance(frameworkProperties.getProperty("browser"));
        driver = DriverSingleton.getDriver();
        homePage = new HomePage();
        searchPage = new SearchPage();
    }

    @Test
    public void goHomePage() {
        driver.get(Constants.BASE_URL);
        String CURRENT_URL = driver.getCurrentUrl();
        assertEquals(CURRENT_URL, Constants.BASE_URL);
        homePage.closeHomePagePopUp();
        homePage.checkBaseURLTitle();
        homePage.checkHomePageSearchBarAndSearchButton();
    }

    @Test
    public void searchProductSennheiser() {
        goHomePage();
        searchPage.sendKeyItemToSearchBox("sennheiser");
        searchPage.clickSearchButton();
        searchPage.checksIfProductSennheiserExists();
        assertEquals(Constants.SENNHEISER, searchPage.getSennheiserProductString());
    }

    @Test
    public void searchProductPowerbank() {
        goHomePage();
        searchPage.sendKeyItemToSearchBox("powerbank");
        searchPage.clickSearchButton();
        searchPage.checksIfProductPowerbankExists();
        assertEquals(Constants.POWERBANK, searchPage.getPowerbankProductString());
    }

    @Test
    public void searchInvalidItem() {
        goHomePage();
        searchPage.sendKeyItemToSearchBox("asdasddd");
        searchPage.clickSearchButton();
        searchPage.anInvalidProductRedirectIsChecked();
    }

    @Test
    public void searchInvalidItemAndZeroResult() {
        goHomePage();
        searchPage.sendKeyItemToSearchBox("aoıdjsaıa");
        searchPage.clickSearchButton();
        searchPage.checksIfAnInvalidProductExists();
    }

    @Test
    public void searchSpecialCharacterOnly() {
        goHomePage();
        searchPage.sendKeyItemToSearchBox("+%^%");
        searchPage.clickSearchButton();
        searchPage.productSearchWithSpecialCharacterIsControlled();
    }

    @AfterClass
    public static void closeObjects() {
        driver.close();
    }

}
