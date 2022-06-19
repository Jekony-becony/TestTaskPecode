package ui;

import base.Driver;
import io.appium.java_client.AppiumDriver;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.MainPage;
import pages.ProductListPage;

@Slf4j
public abstract class UiBaseTest {
    AppiumDriver driver;

    protected MainPage mainPage;
    protected ProductListPage productListPage;

    @BeforeTest
    public void setUpUi() {
        driver = Driver.getInstance().setWebDriver().getWebDriver();
        mainPage = new MainPage();
        productListPage = new ProductListPage();
    }

    @AfterTest
    public void tearDown() {
        Driver.getInstance().deleteWebDriver();
    }

    @AfterMethod
    public void resetApp() {
        Driver.getInstance().getWebDriver().resetApp();
    }
}