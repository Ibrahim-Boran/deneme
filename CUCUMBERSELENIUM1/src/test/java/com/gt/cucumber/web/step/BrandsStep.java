package com.gt.cucumber.web.step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BrandsStep {

    static ChromeDriver driver = new ChromeDriver();

    @When("Write all the links at the footer to the text file")
    public void writeAllTheLinksAtTheFooterToTheTextFile() throws Throwable {
        String str = "Footer";
        BufferedWriter writer = new BufferedWriter(new FileWriter("footer.txt"));
        writer.write(str);
    }

    @And("User click Brands Link")
    public void userClickBrandsLink() throws Throwable{
        Thread.sleep(3000);
        WebElement brands = driver.findElementByPartialLinkText("Markalar");
        brands.click();
        
    }

    @Then("User should see Brands link inside the text file")
    public void userShouldSeeBrandsLinkInsideTheTextFile() {
    }
}
