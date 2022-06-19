package ui;

import base.Driver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.AuthorizationPage;

import static utils.MainCoreDataManager.getDataConfig;


@Slf4j
public abstract class UiBaseTest {
    WebDriver driver;

    protected AuthorizationPage authorizationPage;

    protected String username;
    protected String password;


    @BeforeTest
    public void setUpUi() {
        driver = Driver.getInstance().setWebDriver().getWebDriver();
        authorizationPage = new AuthorizationPage();
        username = getDataConfig().username();
        password = getDataConfig().password();

    }

    @AfterTest
    public void tearDown() {
        Driver.getInstance().deleteWebDriver();
    }


}