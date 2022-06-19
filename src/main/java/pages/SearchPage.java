package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchPage extends BasePage {

    @AndroidFindBy(id = "ua.com.rozetka.shop:id/search_et_query")
    private MobileElement searchField;
    @AndroidFindBy(id = "ua.com.rozetka.shop:id/item_search_ll_background")
    private MobileElement searchBackgroundField;
    @AndroidFindBy(id = "ua.com.rozetka.shop:id/search_iv_scan")
    private MobileElement qrCodeButton;

    public SearchPage() {
        super();
    }

    @Step("Write our text in the search field")
    public SearchPage fillSearchField(String text) {
        skipQRCodeScanner().clickGoBackButton().clickSearchField();
        wait.until(ExpectedConditions.visibilityOf(searchField))
                .sendKeys(text);
        return this;
    }

    @Step("Click start search")
    public ProductListPage startSearch() {
        wait.until(ExpectedConditions.visibilityOf(searchBackgroundField))
                .click();
        return new ProductListPage();
    }

    public QRScannerPage skipQRCodeScanner() {
        wait.until(ExpectedConditions.visibilityOf(searchField))
                .click();
        return new QRScannerPage();
    }


}
