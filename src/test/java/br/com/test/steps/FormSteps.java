package br.com.test.steps;

import br.com.test.pages.FormPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * TODO: Javadocs
 * */
public final class FormSteps {

    private final FormPage formPage = new FormPage();

    @When("form page was loaded")
    public void formPageWasLoaded() {
        formPage.waitFormPageBeLoaded();
    }

    @And("fill first name {string}")
    public void writeFirstName(String name) {
        formPage.writeFirstName(name);
    }

    @And("fill last name {string}")
    public void writeLastName(String lastName) {
        formPage.writeLastName(lastName);
    }

    @And("fill address {string}")
    public void writeAddress(String address) {
        formPage.writeAddress(address);
    }

    @And("fill email address {string}")
    public void writeEmailAddress(String emailAddress) {
        formPage.writeEmailAddress(emailAddress);
    }

    @And("fill phone {string}")
    public void writePhone(String phone) {
        formPage.writePhone(phone);
    }

    @And("select hobby {string}")
    public void selectHobby(String hobby) {
        formPage.selectHobby(hobby);
    }

    @And("select gender {string}")
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

    @And("the first name field should be filled with {string}")
    public void validateFirstName(String expectedName) {
        assertThat(formPage.getFirstName()).isEqualTo(expectedName);
    }

    @And("the last name field should be filled with {string}")
    public void validateLastName(String expectedLastName) {
        assertThat(formPage.getLastName()).isEqualTo(expectedLastName);
    }

    @And("the address field should be filled with {string}")
    public void validateAddress(String expectedAddress) {
        assertThat(formPage.getAddress()).isEqualTo(expectedAddress);
    }

    @And("the email address field should be filled with {string}")
    public void validateEmailAddress(String expectedEmailAddress) {
        assertThat(formPage.getEmailAddress()).isEqualTo(expectedEmailAddress);
    }

    @And("the phone field should be filled with {string}")
    public void validatePhoneNumber(String expectedPhoneNumber) {
        assertThat(formPage.getPhoneNumber()).isEqualTo(expectedPhoneNumber);
    }

    @And("the selected gender should be {string}")
    public void validateGender(String expectedGender) {
        assertThat(formPage.isGenderSelected(expectedGender)).isTrue();
    }

    @And("the hobby {string} should be selected")
    public void validateHobbies(String expectedHobby) {
        assertThat(formPage.isHobbySelected(expectedHobby)).isTrue();
    }

    @And("language field should contain {string}")
    public void validateLanguage(String expectedLanguage) {
        assertThat(formPage.getLanguage()).isEqualTo(expectedLanguage);
    }

    @And("the selected skill should be {string}")
    public void validateSkill(String expectedSkill) {
        assertThat(formPage.getSkill()).isEqualTo(expectedSkill);
    }

    @And("the selected country should be {string}")
    public void validateCountry(String expectedCountry) {
        assertThat(formPage.getCountrySelectCombo()).isEqualTo(expectedCountry);
    }

    @And("the selected day of birth should be {string}")
    public void validateDayOfBirth(String expectedDayOfBirth) {
        assertThat(formPage.getDayOfBirth()).isEqualTo(expectedDayOfBirth);
    }

    @And("the selected month of birth should be {string}")
    public void validateMonthOfBirth(String expectedMonthOfBirth) {
        assertThat(formPage.getMonthOfBirth()).isEqualTo(expectedMonthOfBirth);
    }

    @And("the selected year of birth should be {string}")
    public void validateYearOfBirth(String expectedYearOfBirth) {
        assertThat(formPage.getYearOfBirth()).isEqualTo(expectedYearOfBirth);
    }

    @And("the password field length should be {int}")
    public void validatePasswordLength(int expectedPasswordLength) {
        assertThat(formPage.getPassword().length()).isEqualTo(expectedPasswordLength);
    }

    @And("the password confirmation field length should be {int}")
    public void validatePasswordConfirmationLength(int expectedPasswordConfirmationLength) {
        assertThat(formPage.getPasswordConfirmation()).hasSize(expectedPasswordConfirmationLength);
    }

}
