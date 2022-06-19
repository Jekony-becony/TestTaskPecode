package ui;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.TestAllureListener;

import static org.testng.Assert.*;
import static pages.ErrorMessage.*;

@Listeners(TestAllureListener.class)
public class AuthorizationTests extends UiBaseTest {

    private final String url = "https://www.pecodesoftware.com/qa-portal/registerlogin/registerlogin.php";

    @Test(description = "Login to the website using invalid data")
    public void loginWithInvalidData() {
        driver.get(url);
        authorizationPage.fillLoginButton(username)
                .fillPasswordButton(password)
                .clickLoginButton();

        assertEquals(authorizationPage.getMessageText(), NO_ACCOUNT_FOUND);
    }


    @Test(description = "Login to the website using empty password")
    public void loginWithEmptyPassword() {
        driver.get(url);
        authorizationPage.fillLoginButton(username)
                .clickLoginButton();

        assertEquals(authorizationPage.getMessageText(), PLEASE_ENTER_YOUR_PASSWORD);
    }

    @Test(description = "Login to the website using empty data")
    public void loginWithEmptyData() {
        driver.get(url);
        authorizationPage.clickLoginButton();

        assertEquals(authorizationPage.getMessageText(), PLEASE_ENTER_USERNAME + "| " + PLEASE_ENTER_YOUR_PASSWORD);
    }

    @Test(description = "Verify all elements to be displayed")
    public void verifyAllElements() {
        driver.get(url);
        assertTrue(authorizationPage.verifyAllElementToBeDisplayed());
    }

    @Test(description = "Failed login to the website using invalid data")
    public void loginWithInvalidDataFailed() {
        driver.get(url);
        authorizationPage.fillLoginButton(username)
                .fillPasswordButton(password)
                .clickLoginButton();

        assertNotEquals(authorizationPage.getMessageText(), NO_ACCOUNT_FOUND);
    }


}
