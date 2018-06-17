package pl.maclor.qualityexcites2018.steps.login;

import pl.maclor.qualityexcites2018.pages.SearchPage;

public class GoogleSteps {
    private SearchPage googlePage;

    public void searchInGoogle(final String phrase) {
        googlePage.enterSearchPhrase(phrase);
        googlePage.clickSearch();
    }

}
