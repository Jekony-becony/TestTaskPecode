package base;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

import static io.appium.java_client.remote.MobileCapabilityType.AUTOMATION_NAME;
import static io.appium.java_client.remote.MobileCapabilityType.PLATFORM_VERSION;
import static org.openqa.selenium.remote.CapabilityType.PLATFORM_NAME;
import static utils.MainCoreDataManager.getAndroidDeviceConfig;

public class Settings {

    protected DesiredCapabilities getCapabilities() {
        DesiredCapabilities dc = new DesiredCapabilities();
        String APP = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" +
                File.separator + "java" + File.separator + "resources" + File.separator + getAndroidDeviceConfig().apkPath();
        dc.setCapability(MobileCapabilityType.APP, APP);
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, getAndroidDeviceConfig().deviceName());
        dc.setCapability(AUTOMATION_NAME, getAndroidDeviceConfig().automationName());
        dc.setCapability(PLATFORM_NAME, getAndroidDeviceConfig().platformName());
        dc.setCapability(PLATFORM_VERSION, getAndroidDeviceConfig().platformVersion());
        dc.setCapability(AndroidMobileCapabilityType.AVD, getAndroidDeviceConfig().avdAndroid());
        dc.setCapability("enableMultiWindows", true);
        dc.setCapability("autoGrantPermissions", true);
        dc.setCapability("appPackage", "ua.com.rozetka.shop");
        dc.setCapability("appActivity", "ua.com.rozetka.shop.screen.MainActivity");

        return dc;
    }
}