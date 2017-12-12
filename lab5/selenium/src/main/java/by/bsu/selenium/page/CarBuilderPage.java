package by.bsu.selenium.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by cplus on 12.12.2017.
 */
public class CarBuilderPage extends AbstractPage{
    private static final Logger Logger = LogManager.getRootLogger();
    private static final String URL = "http://klavogonki.ru/u/#/510299/car/tuning";

    @FindBy(xpath = "//div[@class='car-controls'][1]//button")
    private WebElement goToColor;

    @FindBy(id = "cp1_Hex")
    private WebElement colorInput;

    @FindBy(xpath = "//div[@class='modal2-footer']//button[2]")
    private WebElement applyColorButton;

    @FindBy(xpath = "//div[@class='car-controls'][2]//button[2]")
    private WebElement saveChanges;

    @FindBy(className = "view-color")
    private WebElement resultColor;

    public CarBuilderPage(WebDriver driver) {
        super(driver);
        Logger.info("Game window opened");
    }

    public WebElement getResultColor() {
        return resultColor;
    }

    @Override
    public void open() {
        driver.navigate().to(URL);
        Logger.info("Game page opened");
    }

    public void changeColor(String color){
        goToColor.click();
        colorInput.clear();
        colorInput.sendKeys(color);
        applyColorButton.click();
        saveChanges.click();
        Logger.info("Change color of the car performed");
    }

}
