package pl.qualityexcites2018.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import java.util.List;

import static java.util.stream.Collectors.toList;


public class ResultsPage extends PageObject {

    @FindBy(xpath = "//div[@class='rc']//h3/a")
    List<WebElementFacade> searchResultsLinks;

    public List<String> getSearchResultsHeaders() {
        return searchResultsLinks.stream()
                .map(WebElementFacade::getText)
                .collect(toList());
    }

    public List<String> getSearchResultsUrls() {
        return searchResultsLinks.stream()
                .map(element -> element.getAttribute("href"))
                .collect(toList());
    }

}
