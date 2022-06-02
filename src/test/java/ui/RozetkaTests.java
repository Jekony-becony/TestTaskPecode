package ui;

import org.testng.annotations.Test;

import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

public class RozetkaTests extends UiBaseTest {

    @Test(description = "Find the product in the search, add to the cart")
    public void addingProductToTheCart() {
        driver.get("https://rozetka.com.ua/332810257/p332810257/");
        assertNotEquals(productPage.clickCartButton().getCartIconInfo(), "0");
    }

    @Test(description = "check are there 10 bath in the bath list")
    public void checkBath() {
        driver.get("https://rozetka.com.ua/");
        mainPage.clickCatalogButton()
                .clickPlumbingRepairButton()
                .clickBathButton();
        assertTrue(productListPage.checkElementsCount(10));
    }
}
