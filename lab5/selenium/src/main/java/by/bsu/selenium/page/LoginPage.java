package by.bsu.selenium.page;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by cplus on 10.12.2017.
 */
public class LoginPage extends AbstractPage {
    private final static Logger Logger = LogManager.getRootLogger();
    private final static String URL = "http://klavogonki.ru";

    @FindBy(id = "login-link")
    private WebElement goToLoginButton;

    @FindBy(id = "username")
    private WebElement inputLogin;

    @FindBy(id = "password")
    private WebElement inputPassword;

    @FindBy(xpath = "//input[@name='submit_login']")
    private WebElement submitButton;

    @FindBy(xpath = "//div[@class='name']//span")
    private WebElement enteredUserLogin;

    public LoginPage(WebDriver driver) {
        super(driver);
        Logger.info("Login window opened");
    }

    public WebElement getEnteredUserLogin() {
        return enteredUserLogin;
    }

    @Override
    public void open() {
        driver.navigate().to(URL);
        Logger.info("Login page opened");
    }

    public void login(String login, String password) {
        goToLoginButton.click();
        inputLogin.sendKeys(login);
        inputPassword.sendKeys(password);
        submitButton.click();
        Logger.info("Login performed");
    }
}
