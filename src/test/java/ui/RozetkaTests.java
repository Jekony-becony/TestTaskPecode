package ui;

import org.testng.annotations.Test;

import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

public class RozetkaTests extends UiBaseTest {

    @Test(description = "Find the product in the search, add to the cart")
    public void addingProductToTheCart() {
        mainPage.closeBanner()
                .clickSearchField()
                .fillSearchField("Подушка обнимашка дакимакура")
                .startSearch()
                .clickElementByIndex(0)
                .clickCartButton()
                .clickGoBackButton();
        assertNotEquals(mainPage.getCartIconInfo(), "0");
    }

    @Test(description = "check are there 10 bath in the bath list")
    public void checkBath() {
        mainPage.clickCatalogButton()
                .clickPlumbingRepairButton()
                .clickBathButton();

        assertTrue(productListPage.checkElementsCount(10, "Ванна"));
    }


}
