package com.gt.cucumber.web.step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class LoginStep {

    static ChromeDriver driver = new ChromeDriver();
    private String loginMail = null;

    @Given("User navigate to the login page")
    public void userNavigateToTheLoginPage() throws Throwable {

            driver.get("https://www.n11.com/");

    }


    @And("User click login button")
    public void userClickLoginButton() throws Throwable {
        WebElement loginBtn = driver.findElement(By.className("btnSignIn"));

        Assertions.assertNotNull(loginBtn);

        loginBtn.click();
    }

    @And("User click login with Facebook button")
    public void userClickLoginWithFacebookButton() {
        WebElement element = driver.findElement(By.className("facebook_large"));

        Assertions.assertNotNull(element);

        element.click();
    }

    @When("User enter the email as {string} and password as {string}")
    public void userEnterTheEmailAsAndPasswordAs(String email, String pass) throws InterruptedException {
        loginMail = email;
        Thread.sleep(3000);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        WebElement emailInput = driver.findElement(By.id("email"));
        WebElement passInput = driver.findElement(By.id("pass"));
        WebElement loginBtn = driver.findElement(By.name("login"));

        Assertions.assertNotNull(emailInput);
        Assertions.assertNotNull(passInput);
        Assertions.assertNotNull(loginBtn);

        emailInput.sendKeys(email);
        passInput.sendKeys(pass);

        loginBtn.click();
        Thread.sleep(3000);
        try {
            WebElement contBtn = driver.findElement(By.className("n00je7tq"));

            Assertions.assertNotNull(contBtn);

            contBtn.click();
        } catch (Exception ex) {
            System.out.println("Facebook already allowed...");
        }
    }

    @Then("User should see login mail")
    public void userShouldSeeLoginMail() throws Throwable {
        Thread.sleep(3000);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        Thread.sleep(5000);

        WebElement loginUserLink = driver.findElementByPartialLinkText(loginMail);

        Assertions.assertEquals(loginMail, loginUserLink.getText());

        driver.close();
    }


}
