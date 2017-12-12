package by.bsu.selenium.action;

import by.bsu.selenium.page.VocabularyPage;

/**
 * Created by cplus on 12.12.2017.
 */
public class VocabularyAction extends AbstractAction {
    public boolean isFined(String vocabularyName){
        VocabularyPage vocabularyPage = new VocabularyPage(webDriver);
        vocabularyPage.open();
        vocabularyPage.find(vocabularyName);
        return vocabularyPage.getResult().isDisplayed();
    }
}
