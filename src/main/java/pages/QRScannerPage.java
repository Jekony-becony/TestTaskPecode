package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class QRScannerPage extends BasePage {

    @AndroidFindBy(className = "android.widget.ImageButton")
    private MobileElement goBackButton;

    QRScannerPage() {
        super();
    }

    public MainPage clickGoBackButton() {
        wait.until(ExpectedConditions.visibilityOf(goBackButton))
                .click();
        return new MainPage();
    }

}
