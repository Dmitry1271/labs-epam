package by.bsu.selenium.action;

import by.bsu.selenium.page.CarBuilderPage;
import by.bsu.selenium.page.LoginPage;

/**
 * Created by cplus on 12.12.2017.
 */
public class CarBuilderAction extends AbstractAction {
    private static final String LOGIN = "qqq1";
    private static final String PASSWORD = "1q2w3e4r5t6y7u8i9o0p";

    public void changeColor(String color) {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.open();
        loginPage.login(LOGIN, PASSWORD);
        CarBuilderPage carBuilderPage = new CarBuilderPage(webDriver);
        carBuilderPage.open();
        carBuilderPage.changeColor(color);
    }

    public boolean isChangedColor(String color) {
        CarBuilderPage carBuilderPage = new CarBuilderPage(webDriver);
        String actualColor = carBuilderPage.getResultColor().getCssValue("background-color");
        System.out.println(actualColor);
        return color.equals(actualColor);
    }

}
