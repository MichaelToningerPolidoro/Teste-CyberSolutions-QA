package br.com.test.steps;

import br.com.test.pages.FormPage;
import io.cucumber.java.en.When;

/**
 * TODO: Javadocs
 * */
public final class FormSteps {

    private final FormPage formPage = new FormPage();

    @When("form page was loaded")
    public void formPageWasLoaded() {
        formPage.waitFormPageBeLoaded();
    }
}
