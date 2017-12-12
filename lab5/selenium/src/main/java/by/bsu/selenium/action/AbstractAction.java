package by.bsu.selenium.action;

import by.bsu.selenium.driver.Driver;
import org.openqa.selenium.WebDriver;

/**
 * Created by cplus on 09.12.2017.
 */
public abstract class AbstractAction {
    protected WebDriver webDriver;

    public void initDriver() {
        webDriver = Driver.getWebDriver();
    }

    public void closeDriver() {
        Driver.closeDriver();
    }

}
