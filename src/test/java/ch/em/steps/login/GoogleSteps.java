package ch.em.steps.login;

import ch.em.pages.GooglePage;

public class GoogleSteps {
    private GooglePage googlePage;

    public void searchInGoogle(final String phrase) {
        googlePage.enterSearchPhrase(phrase);
        googlePage.clickSearch();
    }

}
