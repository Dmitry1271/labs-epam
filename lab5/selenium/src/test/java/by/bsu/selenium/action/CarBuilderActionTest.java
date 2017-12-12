package by.bsu.selenium.action;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by cplus on 12.12.2017.
 */
public class CarBuilderActionTest {
    private static final String COLOR_PUT = "102316";
    private static final String COLOR_GET = "rgba(16, 35, 22, 1)";

    CarBuilderAction carBuilderAction;

    @BeforeMethod
    public void init() {
        carBuilderAction = new CarBuilderAction();
        carBuilderAction.initDriver();
    }

    @AfterMethod
    public void destroy() {
        carBuilderAction.closeDriver();
    }
    @Test
    public void testIsChangedColor() throws Exception {
        carBuilderAction.changeColor(COLOR_PUT);
        Assert.assertTrue(carBuilderAction.isChangedColor(COLOR_GET));
    }

}