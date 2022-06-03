package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;
import models.CatalogMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class CatalogPage extends BasePage {
    @AndroidFindBy(id = "ua.com.rozetka.shop:id/view_search_tv")
    private MobileElement searchButton;

    public CatalogPage() {
        super();
    }

    List<MobileElement> elements;

    @Step("Click on plumbing & repair button")
    public PlumbingAndRepairPage clickPlumbingRepairButton() {
        isPageLoad();
        elements = driver.findElements(By.id("ua.com.rozetka.shop:id/item_sections_tv_title"));
        wait.until(ExpectedConditions.visibilityOf(elements.get(CatalogMenu.PLUMBING_AND_REPAIR.getId())))
                .click();
        return new PlumbingAndRepairPage();
    }

    public boolean isPageLoad() {
        return wait.until(ExpectedConditions.visibilityOf(searchButton))
                .isDisplayed();
    }
}
