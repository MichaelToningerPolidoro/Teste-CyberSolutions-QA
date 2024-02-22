package br.com.test.steps;

import br.com.test.pages.FormPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

/**
 * TODO: Javadocs
 * */
public final class FormSteps {

    private final FormPage formPage = new FormPage();

    @When("form page was loaded")
    public void formPageWasLoaded() {
        formPage.waitFormPageBeLoaded();
    }

    @And("fill first name as {string}")
    public void writeFirstName(String name) {
        formPage.writeFirstName(name);
    }

    @And("fill last name as {string}")
    public void writeLastName(String lastName) {
        formPage.writeLastName(lastName);
    }

    @And("validate first name is filled")
    public void validateFirstName() {
        Assertions.assertThat(formPage.getFirstName()).isNotNull();
    }

    @And("validate last name is filled")
    public void validadeLastName() {
        Assertions.assertThat(formPage.getLastName()).isNotNull();
    }
}
