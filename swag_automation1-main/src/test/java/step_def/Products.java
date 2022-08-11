package step_def;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;
import utils.Helper;

public class Products {

        ProductsPage productsPage = new ProductsPage();
        YourCartPage yourCartPage = new YourCartPage();
        YourInformationPage yourInformationPage = new YourInformationPage();
        OverviewPage overviewPage = new OverviewPage();
        CompletePage completePage = new CompletePage();
        SauceLabsPage sauceLabsPage = new SauceLabsPage();

    @Then("Products page should open")
    public void productsPageShouldOpen() {

        utils.Helper.waitFor(2);
        productsPage.verifyLogo();
    }

    @Given("User select {string} dropdown menuu")
    public void userSelectDropdownMenuu(String subMenu) {
        Helper.waitFor(2);
        productsPage.selectFiltering(subMenu);
    }

    @And("Sauce Labs Backpack Add to Cart")
    public void sauceLabsBackpackAddToCart() {
        productsPage.addSauceBackpack();
    }

    @And("Sauce Labs Bolt T-Shirt click for details")
    public void sauceLabsBoltTShirtClickForDetails() {
        productsPage.clickSaucebolt();
    }

    @And("Sauce Labs Bolt T-Shirt Add to Cart")
    public void sauceLabsBoltTShirtAddToCart() {
        productsPage.addSaucebolt();
    }

    @And("Sauce Labs Onesie T-Shirt Add to Cart")
    public void sauceLabsOnesieTShirtAddToCart() {
        productsPage.addSauceOnesie();
    }

    @When("User click your cart")
    public void userClickYourCart() {
        productsPage.clickCartlogo();
    }

    @And("Remove Sauce Labs Bolt T-Shirt")
    public void removeSauceLabsBoltTShirt() {
        yourCartPage.removeSaucebolt();
    }

    @And("Click Continue Shopping Button")
    public void clickContinueShoppingButton() {
        yourCartPage.continueShoppingbutton();
    }

    @And("Click Checkout Button")
    public void clickCheckoutButton() {
        yourCartPage.checkoutButton();
    }

    @And("Enter the first name as {string} , last name as {string} and postal code as {string}")
    public void enterTheFirstNameAsLastNameAsAndPostalCodeAs(String firstname, String lastname, String postalcode) {
        yourInformationPage.firstName(firstname);
        yourInformationPage.lastName(lastname);
        yourInformationPage.postalCode(postalcode);
    }

    @And("Fist name error message should be see")
    public void fistNameErrorMessageShouldBeSee() {
        yourInformationPage.firstErrormes();
    }

    @And("Last name error message should be see")
    public void lastNameErrorMessageShouldBeSee() {
        yourInformationPage.lastErrorMes();
    }

    @And("Click Cancel Button")
    public void clickCancelButton() {
        yourInformationPage.clickCancel();
    }

    @And("Postal code error message should be see")
    public void postalCodeErrorMessageShouldBeSee() {
        yourInformationPage.postalcodeErrorMes();
    }

    @And("Click Continue Button")
    public void clickContinueButton() {
        yourInformationPage.clickContinue();
    }

    @And("Click Finish Button")
    public void clickFinishButton() {
        overviewPage.clickFinish();
    }

    @Then("Thank you message should be seen")
    public void thankYouMessageShouldBeSeen() {
        completePage.verifyThankmes();
    }

    @And("Check for not correct sort")
    public void checkForNotCorrectSort() {
        productsPage.checkWrongfilter();
    }

    @And("Click Open Menu")
    public void clickOpenMenu() {
        productsPage.clickOpenmenu();
    }

    @And("Click Logout")
    public void clickLogout() {
        productsPage.clickLogout();
    }

    @And("Click About Button")
    public void clickAboutButton() {
        productsPage.clickAbout();
    }

    @Then("The page cannot be reached information")
    public void thePageCannotBeReachedInformation() {
        sauceLabsPage.verifyPageInfo();
    }

    @And("Match Product Name and Detail Page Name")
    public void matchProductNameAndDetailPageName() {
        productsPage.productNamematch();
    }

}
