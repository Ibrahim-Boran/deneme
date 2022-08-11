package pages;

import org.openqa.selenium.By;

import java.util.Hashtable;

public class LoginPage extends BasePage {

    public Hashtable<String, By> loginElements;

    public LoginPage() {
        super();
        this.loginElements = new Hashtable<>();
        loginElements.put("email address bar", By.id("txtUserName"));
        loginElements.put("password bar", By.id("txtPassword"));
        loginElements.put("submit login button", By.cssSelector("#btnLogin"));
        this.pageElements = loginElements;
    }
}
