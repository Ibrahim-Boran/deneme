package utilities;

import io.appium.java_client.android.AndroidDriver;

public class DriverFactory {

    public static AndroidDriver driver = null;

    static {
        try {
            driver = new DriverCapabilities().getDriver();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


