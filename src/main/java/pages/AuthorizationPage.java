package pages;

import edu.emory.mathcs.backport.java.util.LinkedList;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.stream.Collectors;

public class AuthorizationPage extends BasePage {

    @FindBy(id = "logomini")
    private WebElement logoMini;
    @FindBy(xpath = "//*[contains(text(),'AQA internship Login')]")
    private WebElement tittle;
    @FindBy(name = "username")
    private WebElement loginField;
    @FindBy(name = "password")
    private WebElement passwordField;
    @FindBy(xpath = "//*[contains(@class, 'btn btn-success')]")
    private WebElement loginButton;
    @FindBy(xpath = "//div[@class = 'form-group has-error']/child::span[@class='help-block']")
    private List<WebElement> errorMessageList;


    public AuthorizationPage() {
        super();
    }

    @Step("Fill the login button")
    public AuthorizationPage fillLoginButton(String login) {
        wait.until(ExpectedConditions.visibilityOf(loginField))
                .sendKeys(login);
        return this;
    }

    @Step("Fill the password button")
    public AuthorizationPage fillPasswordButton(String password) {
        wait.until(ExpectedConditions.visibilityOf(passwordField))
                .sendKeys(password);
        return this;
    }

    @Step("Click the login button")
    public AuthorizationPage clickLoginButton() {
        wait.until(ExpectedConditions.visibilityOf(loginButton))
                .click();
        return this;
    }

    @Step("Get error message text")
    public String getMessageText() {
        if (errorMessageList.size() == 1) {
            return errorMessageList.get(0).getText();
        } else {
            String result = errorMessageList.stream().map(elem -> elem.getText())
                    .collect(Collectors.joining("| "));
            return result;
        }
    }

    @Step("Check all elements to be displayed")
    public boolean verifyAllElementToBeDisplayed() {
        List<Boolean> listOfTheElements = new LinkedList();
        listOfTheElements.add(logoMini.isDisplayed());
        listOfTheElements.add(tittle.isDisplayed());
        listOfTheElements.add(loginField.isDisplayed());
        listOfTheElements.add(passwordField.isDisplayed());
        listOfTheElements.add(loginButton.isDisplayed());
        return !listOfTheElements.contains(false);
    }
}
