package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Step;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;

import java.time.Duration;

public class SwipeScreen {
    protected AppiumDriver driver = Driver.getInstance().getWebDriver();
    protected TouchAction action = new TouchAction((AppiumDriver) driver);

    public SwipeScreen() {
        super();
    }

    @Step("Swipe screen")
    public void swipeScreenSmall() {
        action.press(PointOption.point(115, 1300)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(115, 200)).release().perform();
    }

    public void swipingWhileElementIsDisplayed(MobileElement element) {
        try {
            while (element.isDisplayed()) {
                swipeScreenSmall();
            }
        } catch (StaleElementReferenceException | NoSuchElementException e) {
            swipeScreenSmall();
        }
    }
}