package pages;

import utilities.Constants;

public class HomePage extends BasePage implements Constants{

    public void clickLocationArea() {
        click(locationArea);
    }
    public void clickCityArea() {
        click(selectCity);
    }
    public void clickAdana() {
        click(selectAdana);
    }
    public void clickTownArea() {
        click(selectTown);
    }
    public void clickAladag() {
        click(selectAladag);
    }
    public void clickStreetArea() {
        click(selectStreet);
    }
    public void clickAkoren() {
        click(selectAkoren);
    }
    public void clickSaveButton() { click(saveButton);}
    public void verifyPopupLocation() { isElementExist(popupLocation);}
    public void clickFansOfTechnology() { click(fansOfTech);}
    public void clickMobilePhone() { click(mobilePhone);}
    public void checkInfoLocation() { click(infoOfLocation);}

    }

