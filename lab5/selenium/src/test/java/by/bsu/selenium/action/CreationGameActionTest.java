package by.bsu.selenium.action;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by cplus on 12.12.2017.
 */
public class CreationGameActionTest {
    private static final String SKILL_FROM = "таксистов";
    private static final String SKILL_TO = "профи";
    private static final String TIMEOUT = "20";

    CreationGameAction creationGameAction;

    @BeforeMethod
    public void init() {
        creationGameAction = new CreationGameAction();
        creationGameAction.initDriver();
    }

    @AfterMethod
    public void destroy() {
        creationGameAction.closeDriver();
    }

    @Test
    public void testIsCreatedPage() throws Exception {
        Assert.assertTrue(creationGameAction.isCreatePage(SKILL_FROM, SKILL_TO, TIMEOUT));
    }

}