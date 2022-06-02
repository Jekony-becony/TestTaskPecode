package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

public class ProductListPage extends BasePage {
    @FindBy(xpath = "//*[contains(@class,'footer-bottom')]")
    private WebElement footer;

    public ProductListPage() {
        super();
    }


    public boolean checkElementsCount(int count) {
        Set<WebElement> uniqueElements = swipeScreen.swipeUntilElementOrCount(footer, count,
                "//span[contains(@class,'goods-tile__title')]");

        return uniqueElements.size() >= count;
    }
}
