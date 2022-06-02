package base;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import static io.appium.java_client.remote.MobileCapabilityType.AUTOMATION_NAME;
import static io.appium.java_client.remote.MobileCapabilityType.PLATFORM_VERSION;
import static org.openqa.selenium.remote.CapabilityType.PLATFORM_NAME;
import static utils.MainCoreDataManager.getAndroidDeviceConfig;

public class Settings {

    protected DesiredCapabilities getCapabilities() {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("chromeOptions", ImmutableMap.of("w3c", false));
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, getAndroidDeviceConfig().deviceName());
        dc.setCapability(AUTOMATION_NAME, getAndroidDeviceConfig().automationName());
        dc.setCapability(PLATFORM_NAME, getAndroidDeviceConfig().platformName());
        dc.setCapability(PLATFORM_VERSION, getAndroidDeviceConfig().platformVersion());
        dc.setCapability(AndroidMobileCapabilityType.AVD, getAndroidDeviceConfig().avdAndroid());
        dc.setCapability("enableMultiWindows", true);
        dc.setCapability("autoGrantPermissions", true);
        dc.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
        dc.setCapability(CapabilityType.BROWSER_VERSION, "96.0.4664.104");

        return dc;
    }
}