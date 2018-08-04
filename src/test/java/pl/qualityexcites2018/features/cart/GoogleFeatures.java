package pl.qualityexcites2018.features.cart;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.assertj.core.api.SoftAssertions;
import pl.qualityexcites2018.pages.ResultsPage;
import pl.qualityexcites2018.pages.SearchPage;
import pl.qualityexcites2018.steps.login.GoogleSteps;

public class GoogleFeatures {

    private SearchPage googlePage;
    private ResultsPage resultsPage;

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

    @Then("^search results list is shown$")
    public void searchResultsListIsShown() {
        final SoftAssertions assertions = new SoftAssertions();

        assertions.assertThat(resultsPage.getSearchResultsHeaders())
                .contains("Quality Excites - Konferencja dotycząca jakości oprogramowania");
        assertions.assertThat(resultsPage.getSearchResultsUrls())
                .contains("https://qualityexcites.pl/");

        assertions.assertAll();
    }
}
