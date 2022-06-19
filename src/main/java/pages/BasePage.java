package pages;

import base.Driver;
import base.SwipeScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected AppiumDriver driver;
    protected WebDriverWait wait;
    protected SwipeScreen swipeScreen;

    BasePage() {
        this.driver = Driver.getInstance().getWebDriver();
        this.wait = new WebDriverWait(driver, 25);
        swipeScreen = new SwipeScreen();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
