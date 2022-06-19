package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductPage extends BasePage {
    @AndroidFindBy(id = "ua.com.rozetka.shop:id/bottom_bar_btn_buy")
    private MobileElement cartButton;


    public ProductPage() {
        super();
    }

    @Step("Click add to cart button")
    public ContactDataPage clickCartButton() {
        wait.until(ExpectedConditions.visibilityOf(cartButton))
                .click();
        return new ContactDataPage();
    }


    public boolean isPageLoad() {
        return wait.until(ExpectedConditions.visibilityOf(cartButton))
                .isDisplayed();
    }


}
