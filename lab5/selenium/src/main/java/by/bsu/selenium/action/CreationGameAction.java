package by.bsu.selenium.action;

import by.bsu.selenium.page.CreationGamePage;
import by.bsu.selenium.page.LoginPage;

/**
 * Created by cplus on 12.12.2017.
 */
public class CreationGameAction extends AbstractAction {
    private static final String LOGIN = "qqq1";
    private static final String PASSWORD = "1q2w3e4r5t6y7u8i9o0p";

    public boolean isCreatePage(String skillFromValue, String skillToValue, String timeout) {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.open();
        loginPage.login(LOGIN, PASSWORD);
        CreationGamePage creationGamePage = new CreationGamePage(webDriver);
        creationGamePage.open();
        creationGamePage.createGame(skillFromValue, skillToValue, timeout);
        return creationGamePage.getGameTableStatus().isDisplayed();
    }
}
