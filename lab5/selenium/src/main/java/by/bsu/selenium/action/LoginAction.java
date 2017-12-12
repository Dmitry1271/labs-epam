package by.bsu.selenium.action;

import by.bsu.selenium.page.LoginPage;

/**
 * Created by cplus on 11.12.2017.
 */
public class LoginAction extends AbstractAction {
    public void login(String login, String password) {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.open();
        loginPage.login(login, password);
    }

    public boolean isLoggined(String login) {
        LoginPage loginPage = new LoginPage(webDriver);
        String actualLogin = null;

        if (loginPage.getEnteredUserLogin().isEnabled()) {
            actualLogin = loginPage.getEnteredUserLogin().getText();
        }


        return actualLogin != null && login.equals(actualLogin);
    }
}
