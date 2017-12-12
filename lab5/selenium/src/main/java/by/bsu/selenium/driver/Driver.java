package by.bsu.selenium.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by cplus on 09.12.2017.
 */
public class Driver {
    private static WebDriver webDriver;

    private Driver() {

    }

    public static WebDriver getWebDriver() {
        if (webDriver == null) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

            webDriver = new ChromeDriver();
            webDriver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
            webDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        }

        return webDriver;
    }

    public static void closeDriver() {
        webDriver.quit();
        webDriver = null;
    }
}
