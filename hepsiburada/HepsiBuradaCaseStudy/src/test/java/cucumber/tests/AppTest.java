package cucumber.tests;

import utilities.DriverFactory;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        tags = ""
)
public class AppTest
{
    private AndroidDriver mobileDriver;
    public AppTest() {
        this.mobileDriver = DriverFactory.driver;

    }
    @After
    public void tearDown(){
        mobileDriver.quit();
    }


}
