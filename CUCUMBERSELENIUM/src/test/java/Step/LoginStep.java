package Step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStep {
    @Given("I navigate to the login page")
    public void ıNavigateToTheLoginPage() throws Throwable {

            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://www.hepsiburada.com/");
            driver.manage().window().maximize();  //ekranı büyütmek için.
    }

    @And("I enter the username as {string} and password as {string}")
    public void ıEnterTheUsernameAsAndPasswordAs(String username, String password) throws Throwable {
        System.out.println("UserNAme is " + username + " and password is " + password);
    }

    @And("I click login button")
    public void ıClickLoginButton() throws Throwable {
        System.out.println("1");
    }

    @Then("I should see the new page")
    public void ıShouldSeeTheNewPage() throws Throwable {
        System.out.println("1");
    }

}
