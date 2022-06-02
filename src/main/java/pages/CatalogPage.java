package pages;

import io.qameta.allure.Step;
import models.CatalogMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class CatalogPage extends BasePage {
    List<WebElement> elements = (List<WebElement>) driver.findElements(By.xpath("//*[contains(@class,'menu-main__link button--medium button--link ng-star-inserted')]"));

    public CatalogPage() {
        super();
    }

    @Step("Click on plumbing & repair button")
    public PlumbingAndRepairPage clickPlumbingRepairButton() {
        wait.until(ExpectedConditions.visibilityOf(elements.get(CatalogMenu.PLUMBING_AND_REPAIR.getId())))
                .click();
        return new PlumbingAndRepairPage();
    }
}
