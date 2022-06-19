package base;


import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@Slf4j
public class Driver {
    private WebDriver driver;
    private static Driver instance;

    private Driver() {
    }

    public static Driver getInstance() {
        if (instance == null)
            instance = new Driver();
        return instance;
    }

    public Driver setWebDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        log.info("base.Driver initialized successfully");
        return this;
    }

    public WebDriver getWebDriver() {
        return driver;
    }

    public void deleteWebDriver() {
        if (driver != null) {
            driver.quit();
            log.info("base.Driver deleted successfully");
        } else {
            log.info("base.Driver is already deleted");
        }
        driver = null;
    }
}