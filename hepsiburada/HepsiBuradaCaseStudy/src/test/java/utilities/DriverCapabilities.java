package utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class DriverCapabilities {
    public DriverCapabilities() {

    }

    public AndroidDriver getDriver() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 4 XL API 29");
        capabilities.setCapability(MobileCapabilityType.VERSION, "10.0");
        capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        capabilities.setCapability(MobileCapabilityType.APP, "https://bit.ly/ 3719CDE");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.pozitron.hepsiburada");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.hepsiburada.ui.startup.SplashActivity");
        capabilities.setCapability(AndroidMobileCapabilityType.SKIP_UNLOCK, true);
        capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
        return new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
    }
}
