package by.bsu.selenium.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by cplus on 12.12.2017.
 */
public class CreationGamePage extends AbstractPage {
    private static final Logger Logger = LogManager.getRootLogger();
    private static final String URL = "http://klavogonki.ru/create";

    @FindBy(id = "level_from")
    private WebElement skillFrom;

    @FindBy(id = "level_to")
    private WebElement skillTo;

    @FindBy(id = "timeout")
    private WebElement timeoutGame;

    @FindBy(className = "styled")
    private WebElement submitButton;

    @FindBy(id = "status")
    private WebElement gameTableStatus;

    public CreationGamePage(WebDriver driver) {
        super(driver);
        Logger.info("Creation game window opened");
    }

    public WebElement getGameTableStatus() {
        return gameTableStatus;
    }

    @Override
    public void open() {
        driver.navigate().to(URL);
        Logger.info("Creation game page opened");
    }

    public void createGame(String skillFromValue, String skillToValue, String timeoutValue){
        skillFrom.sendKeys(skillFromValue);
        skillTo.sendKeys(skillToValue);
        timeoutGame.sendKeys(timeoutValue);
        submitButton.click();
        Logger.info("Creation of the game perfomed");
    }
}
