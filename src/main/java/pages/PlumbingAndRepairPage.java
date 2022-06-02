package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PlumbingAndRepairPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),' Ванны ')]")
    private WebElement bath;

    public PlumbingAndRepairPage() {
        super();
    }

    @Step("Click on bath button")
    public ProductListPage clickBathButton() {
        wait.until(ExpectedConditions.visibilityOf(bath))
                .click();
        return new ProductListPage();
    }
}
