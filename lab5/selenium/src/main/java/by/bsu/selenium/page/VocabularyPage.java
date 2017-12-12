package by.bsu.selenium.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by cplus on 12.12.2017.
 */
public class VocabularyPage extends AbstractPage {
    private static final Logger Logger = LogManager.getRootLogger();
    private static final String URL = "http://klavogonki.ru/vocs/top";

    @FindBy(xpath = "//input[@name='searchtext']")
    private WebElement inputVocabulary;

    @FindBy(className = "styled")
    private WebElement submitButton;

    @FindBy(linkText = "Соточка")
    private WebElement linkVocabulary;

    @FindBy(className = "title")
    private WebElement result;

    public VocabularyPage(WebDriver driver) {
        super(driver);
        Logger.info("Vocabulary window opened");
    }

    public WebElement getResult() {
        return result;
    }

    @Override
    public void open() {
        driver.navigate().to(URL);
        Logger.info("Vocabulary page opened");
    }

    public void find(String vocabularyName) {
        inputVocabulary.sendKeys(vocabularyName);
        submitButton.click();
        linkVocabulary.click();
        Logger.info("Vocabulary find performed");

    }
}
