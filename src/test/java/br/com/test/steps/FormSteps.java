package br.com.test.steps;

import br.com.test.pages.FormPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
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

    @And("fill address as {string}")
    public void writeAddress(String address) {
        formPage.writeAddress(address);
    }

    @And("fill email address as {string}")
    public void writeEmailAddress(String emailAddress) {
        formPage.writeEmailAddress(emailAddress);
    }

    @And("fill phone as {string}")
    public void writePhone(String phone) {
        formPage.writePhone(phone);
    }

    @And("select hobby {string}")
    public void selectHobby(String hobby) {
        formPage.selectHobby(hobby);
    }

    @And("select gender as {string}")
    public void selectGender(String gender) {
        formPage.selectGender(gender);
    }

    @And("select language {string}")
    public void selectLanguage(String language) {
        formPage.selectLanguage(language);
        formPage.clickLanguageLabel();
    }

    @And("select skill {string}")
    public void selectSkill(String skill) {
        formPage.selectSkill(skill);
        formPage.clickSkillLabel();
    }

    @And("select country {string}")
    public void selectCountry(String country) {
        formPage.selectCountry(country);
    }

    @And("select day of birth {string}")
    public void selectDayOfBirth(String day) {
        formPage.selectDayOfBirth(day);
    }

    @And("select month of birth {string}")
    public void selectMonthOfBirth(String month) {
        formPage.selectMonthOfBirth(month);
    }

    @And("select year of birth {string}")
    public void selectYearOfBirth(String year) {
        formPage.selectYearOfBirth(year);
    }

    @And("fill password as {string}")
    public void writePassword(String password) {
        formPage.writePassword(password);
    }

    @And("fill password confirmation as {string}")
    public void writePasswordConfirmation(String passwordConfirmation) {
        formPage.writePasswordConfirmation(passwordConfirmation);
    }

    @When("click submit")
    public void clickSubmit() {
        formPage.clickSubmit();
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
