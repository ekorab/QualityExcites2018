package ch.em.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("/")
public class GooglePage extends PageObject {

    @FindBy(id = "lst-ib")
    private WebElementFacade searchInput;

    @FindBy(className = "lsb")
    private WebElementFacade searchButton;

    public void enterSearchPhrase(final String phrase) {
        searchInput.type(phrase);
    }

    public void clickSearch() {
        searchButton.click();
    }
}