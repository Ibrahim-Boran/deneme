package step_def;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class Login {
    LoginPage loginPage = new LoginPage();
    @Given("User enter the username as {string} and password as {string}")
    public void userEnterTheUsernameAsAndPasswordAs(String username, String pass) {
        utils.Helper.waitFor(1);
        loginPage.loginUsername(username);
        loginPage.loginPass(pass);
    }
    @When("User click login button")
    public void userClickLoginButton() {
        utils.Helper.waitFor(1); loginPage.loginButton();
    }



    @Then("Empty username error message should be see")
    public void emptyUsernameErrorMessageShouldBeSee() {
        loginPage.verifyEmptyusernameTitle();
    }

    @Then("Empty password error message should be see")
    public void emptyPasswordErrorMessageShouldBeSee() {
        loginPage.verifyEmptypasswordTitle();
    }

    @Then("Wrong user error message should be see")
    public void wrongUserErrorMessageShouldBeSee() {
        loginPage.verifyWrongtitle();
    }

    @Then("Error message should be see for locked user")
    public void errorMessageShouldBeSeeForLockedUser() {
        loginPage.verifyLockedtitle();
    }
}
