package by.bsu.selenium.action;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by cplus on 11.12.2017.
 */
public class LoginActionTest {

    private static final String LOGIN = "qqq1";
    private static final String PASSWORD = "1q2w3e4r5t6y7u8i9o0p";

    private LoginAction loginAction;

    @BeforeMethod
    public void init() {
        loginAction = new LoginAction();
        loginAction.initDriver();
    }

    @AfterMethod
    public void destroy() {
        loginAction.closeDriver();
    }

    @Test
    public void testIsLogined() throws Exception {
        loginAction.login(LOGIN, PASSWORD);
        Assert.assertTrue(loginAction.isLoggined(LOGIN));
    }

}