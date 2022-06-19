package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;
import models.PlumbingAndRepairMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class PlumbingAndRepairPage extends BasePage {

    @AndroidFindBy(className = "android.widget.ImageButton")
    private MobileElement goBackButton;

    public PlumbingAndRepairPage() {
        super();
    }

    List<MobileElement> elements;

    @Step("Click on bath button")
    public ProductListPage clickBathButton() {
        isPageLoad();
        elements = driver.findElements(By.id("ua.com.rozetka.shop:id/portal_group_big_item_iv_group_icon_big"));
        wait.until(ExpectedConditions.visibilityOf(elements.get(PlumbingAndRepairMenu.BATH.getId())))
                .click();
        return new ProductListPage();
    }

    public boolean isPageLoad() {
        return wait.until(ExpectedConditions.visibilityOf(goBackButton))
                .isDisplayed();
    }
}
