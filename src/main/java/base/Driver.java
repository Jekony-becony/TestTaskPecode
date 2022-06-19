package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import lombok.extern.slf4j.Slf4j;

import static utils.MainCoreDataManager.getDeviceCommonConfig;

@Slf4j
public class Driver {
    private AppiumDriver driver;
    private static Driver instance;

    private Driver() {
    }

    public static Driver getInstance() {
        if (instance == null)
            instance = new Driver();
        return instance;
    }

    public Driver setWebDriver() {
        Settings settings = new Settings();
        driver = new AndroidDriver<>(getDeviceCommonConfig().url(), settings.getCapabilities());
        log.info("base.Driver initialized successfully");
        return this;
    }

    public AppiumDriver getWebDriver() {
        return driver;
    }

    public void deleteWebDriver() {
        if (driver != null) {
            driver.closeApp();
            log.info("base.Driver deleted successfully");
        } else {
            log.info("base.Driver is already deleted");
        }
        driver = null;
    }
}