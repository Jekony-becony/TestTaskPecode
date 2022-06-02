package ui;

import base.Driver;
import io.appium.java_client.AppiumDriver;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.*;

@Slf4j
public abstract class UiBaseTest {
    AppiumDriver driver;
    protected ProductPage productPage;

    protected MainPage mainPage;
    protected CatalogPage catalogPage;
    protected PlumbingAndRepairPage plumbingAndRepairPage;
    protected ProductListPage productListPage;

    @BeforeTest
    public void setUpUi() {
        driver = Driver.getInstance().setWebDriver().getWebDriver();
        mainPage = new MainPage();
        productPage = new ProductPage();
        catalogPage = new CatalogPage();
        plumbingAndRepairPage = new PlumbingAndRepairPage();
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