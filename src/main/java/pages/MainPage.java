package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {

    @FindBy(xpath = "//*[contains(@class,'button button--green button--medium main-categories__toggle ng-star-inserted')]")
    private WebElement catalogButton;

    public MainPage() {
        super();
    }

    @Step("Click catalog button")
    public CatalogPage clickCatalogButton() {
        wait.until(ExpectedConditions.visibilityOf(catalogButton))
                .click();
        return new CatalogPage();
    }

}
