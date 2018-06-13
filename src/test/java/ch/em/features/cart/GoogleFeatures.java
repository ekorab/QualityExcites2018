package ch.em.features.cart;

import ch.em.pages.GooglePage;
import ch.em.steps.login.GoogleSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GoogleFeatures {

    private GooglePage googlePage;

    @Steps
    private GoogleSteps googleSteps;

    @Given("^user is on google$")
    public void userIsOnGoogle() {
        googlePage.open();
    }

    @When("^he searches for a interesting phrase$")
    public void heSearchesForAInterestingPhrase() {
        googleSteps.searchInGoogle("quality excites 2018");
    }
}
