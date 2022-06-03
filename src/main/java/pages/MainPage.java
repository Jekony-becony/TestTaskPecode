package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {
    @AndroidFindBy(id = "ua.com.rozetka.shop:id/view_search_tv")

    private MobileElement searchField;
    @AndroidFindBy(id = "ua.com.rozetka.shop:id/graph_fatMenu")
    private MobileElement catalogButton;
    @AndroidFindBy(id = "ua.com.rozetka.shop:id/banner_iv_close")
    private MobileElement closeBannerButton;

    @AndroidFindBy(id = "ua.com.rozetka.shop:id/bottom_badge_tv_count")
    private MobileElement cartButtonCount;


    public MainPage() {
        super();
    }

    @Step("Click catalog button")
    public CatalogPage clickCatalogButton() {
        wait.until(ExpectedConditions.visibilityOf(catalogButton))
                .click();
        return new CatalogPage();
    }

    @Step("Click search field")
    public SearchPage clickSearchField() {
        wait.until(ExpectedConditions.visibilityOf(searchField))
                .click();
        return new SearchPage();
    }

    @Step("Click close banner")
    public MainPage closeBanner() {
        wait.until(ExpectedConditions.visibilityOf(closeBannerButton))
                .click();
        return this;
    }

    @Step("Get info from cart icon")
    public String getCartIconInfo() {
        return wait.until(ExpectedConditions.visibilityOf(cartButtonCount))
                .getText();
    }

}
