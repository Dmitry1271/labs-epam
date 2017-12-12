package by.bsu.selenium.action;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by cplus on 12.12.2017.
 */
public class VocabularyActionTest {
    private static final String VOCABULARY_NAME = "Соточка";
    VocabularyAction vocabularyAction;

    @BeforeMethod
    public void init() {
        vocabularyAction = new VocabularyAction();
        vocabularyAction.initDriver();
    }

    @AfterMethod
    public void destroy() {
        vocabularyAction.closeDriver();
    }
    @Test
    public void testIsFined() throws Exception {
        Assert.assertTrue(vocabularyAction.isFined(VOCABULARY_NAME));
    }

}