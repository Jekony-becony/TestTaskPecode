package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductPage extends BasePage {
    @FindBy(xpath = "//*[contains(@class, 'buy-button button button--with-icon button--green button--medium ng-star-inserted')]")
    private WebElement cartButton;

    @FindBy(xpath = "//*[contains(@class, 'header-actions__item header-actions__item--cart')]//button")
    private WebElement cartIcon;

    public ProductPage() {
        super();
    }

    @Step("Click add to cart button")
    public ProductPage clickCartButton() {
        wait.until(ExpectedConditions.visibilityOf(cartButton))
                .click();
        return this;
    }

    @Step("Get info from cart icon")
    public String getCartIconInfo() {
        return wait.until(ExpectedConditions.visibilityOf(cartIcon))
                .getText();
    }

}
