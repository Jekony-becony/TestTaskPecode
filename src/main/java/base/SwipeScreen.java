package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Step;
import org.openqa.selenium.*;


import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SwipeScreen {
    protected WebDriver driver = Driver.getInstance().getWebDriver();
    protected TouchAction action = new TouchAction((AppiumDriver) driver);


    @Step("Swipe screen small")
    public Set<WebElement> swipeUntilElementOrCount(WebElement element, int count, String xpathLocator) {
        List<WebElement> elements = (List<WebElement>) driver.findElements(By.xpath(xpathLocator));
        Set<WebElement> uniqueElements = new HashSet<>(elements);
        int countInList = 0;
        try {
            while (element.isDisplayed() || countInList < count) {
                action.press(PointOption.point(115, 1300)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(115, 200)).release().perform();
                elements = (List<WebElement>) driver.findElements(By.xpath(xpathLocator));
                uniqueElements.addAll(elements);
                countInList = countInList + uniqueElements.size();
            }
        } catch (StaleElementReferenceException | NoSuchElementException e) {
            action.press(PointOption.point(115, 1150)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(115, 200));
        }
        return uniqueElements;
    }
}
