package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class ProductListPage extends BasePage {

    @AndroidFindBy(id = "ua.com.rozetka.shop:id/menu_item_search")
    private MobileElement magnifyingGlass;

    public ProductListPage() {
        super();
    }

    public List<MobileElement> elements;


    public ProductPage clickElementByIndex(int index) {
        isPageLoad();
        elements = driver.findElements(By.id("ua.com.rozetka.shop:id/section_offer_cl_layout"));
        wait.until(ExpectedConditions.visibilityOf(elements.get(index)))
                .click();
        return new ProductPage();
    }

    public boolean isPageLoad() {
        return wait.until(ExpectedConditions.visibilityOf(magnifyingGlass))
                .isDisplayed();
    }

    public boolean checkElementsCount(int count, String word) {
        List<MobileElement> elements = driver.findElements(By.id("ua.com.rozetka.shop:id/section_offer_tv_title"));
        List<MobileElement> uniqueElements = new ArrayList<>();
        uniqueElements.addAll(elements);
        try {
            while (uniqueElements.size() <= count) {
                swipeScreen.swipeScreenSmall();
                elements.clear();
                elements = driver.findElements(By.id("ua.com.rozetka.shop:id/section_offer_tv_title"));
                uniqueElements.addAll(elements);
                uniqueElements = uniqueElements.stream().distinct().collect(Collectors.toList());
                if (uniqueElements.size() >= count) {
                    for (int i = 0; i < uniqueElements.size(); i++) {
                        if (uniqueElements.get(i).getText().contains(word)) {

                        } else
                            uniqueElements.remove(i);
                    }
                    break;
                }
            }
        } catch (StaleElementReferenceException e) {
            swipeScreen.swipeScreenSmall();
        }

        return uniqueElements.size() >= count;
    }
}
