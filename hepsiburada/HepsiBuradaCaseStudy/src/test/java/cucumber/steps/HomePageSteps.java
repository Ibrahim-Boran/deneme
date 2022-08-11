package cucumber.steps;

import io.cucumber.java.en.And;
import pages.HomePage;

public class HomePageSteps {


    public HomePage homePage;

    public HomePageSteps() {
        homePage = new HomePage();
    }

    @And("User clicks location")
    public void locationArea() {
        homePage.clickLocationArea();
    }

    @And("User clicks city")
    public void cityArea() {
        homePage.clickCityArea();
    }

    @And("User clicks Adana")
    public void adana() {
        homePage.clickAdana();
    }

    @And("User clicks town")
    public void townArea() {homePage.clickTownArea();}

    @And("User clicks Aladag")
    public void aladag() {homePage.clickAladag();}

    @And("User clicks street")
    public void streetArea() {homePage.clickStreetArea();}

    @And("User clicks Akoren")
    public void Akoren() {homePage.clickAkoren();}

    @And("User clicks save button")
    public void saveButton() {homePage.clickSaveButton();}

    @And("User verify pop-up of location")
    public void verifyPopup() {homePage.verifyPopupLocation();}

    @And("User clicks Fans of Technology")
    public void fansOfTechnology() {homePage.clickFansOfTechnology();}

    @And("User clicks mobile phone")
    public void mobilePhone() {homePage.clickMobilePhone();}

    @And("User check to the info of location")
    public void infoOfLocation() {homePage.checkInfoLocation();}

    @And("Sleep {int}")
    public void sleep(int time) throws InterruptedException {
        Thread.sleep( time * 1000);
    }

    }




