package br.com.test.pages;

import br.com.test.core.interactions.Interactions;
import br.com.test.core.interactions.InteractionsManager;
import br.com.test.elements.FormElements;

public final class FormPage {

    private final Interactions interactions = InteractionsManager.getInteraction();

    private final FormElements formElements = new FormElements();

    public void waitFormPageBeLoaded() {
        interactions.getWait().waitElementToBeVisible(formElements.getRegisterPageTitle(), 15);
    }

    public void writeFirstName(String name) {
        interactions.getText().write(formElements.getFirstNameInput(), name);
    }

    public void writeLastName(String lastName) {
        interactions.getText().write(formElements.getLastNameInput(), lastName);
    }

    public void writeAddress(String address) {
        interactions.getText().write(formElements.getAddressTextArea(), address);
    }

    public void writeEmailAddress(String emailAddress) {
        interactions.getText().write(formElements.getEmailAddressInput(), emailAddress);
    }

    public void writePhone(String phone) {
        interactions.getText().write(formElements.getPhoneInput(), phone);
    }

    public void selectGender(String gender) {
        interactions.getClick().singleClick(formElements.getGenderRadioOption(gender));
    }

    public void selectHobby(String hobby) {
        interactions.getClick().singleClick(formElements.getHobbiesCheckboxOption(hobby));
    }

    public void clickLanguageLabel() {
        interactions.getClick().singleClick(formElements.getLanguagesLabel());
    }

    public void selectLanguage(String language) {
        interactions.getCombo().select(
                formElements.getLanguagesCombo(), formElements.getLanguageComboOption(language)
        );
    }

    public void selectCountry(String country) {
        interactions.getCombo().select(
                formElements.getCountrySelectCombo(), formElements.getSelectCountryComboOption(country)
        );
    }

    public void clickSkillLabel() {
        interactions.getClick().singleClick(formElements.getSkillsLabel());
    }

    public void selectSkill(String skill) {
        interactions.getCombo().select(
                formElements.getSkillsCombo(), formElements.getSkillComboOption(skill)
        );
    }

    public void selectDayOfBirth(String day) {
        interactions.getCombo().select(
                formElements.getDayOfBirthCombo(), formElements.getDayOfBirthOption(day)
        );
    }

    public void selectMonthOfBirth(String month) {
        interactions.getCombo().select(
                formElements.getMonthOfBirthCombo(), formElements.getMonthOfBirthOption(month)
        );
    }

    public void selectYearOfBirth(String year) {
        interactions.getCombo().select(
                formElements.getYearOfBirthCombo(), formElements.getYearOfBirth(year)
        );
    }

    public void writePassword(String password) {
        interactions.getText().write(formElements.getPasswordInput(), password);
    }

    public void writePasswordConfirmation(String password) {
        interactions.getText().write(formElements.getConfirmPasswordInput(), password);
    }

    public void clickSubmit() {
        interactions.getClick().singleClick(formElements.getSubmitButton());
    }

    /* ==== VALIDATIONS ==== */

    public String getFirstName() {
        return interactions.getAttribute().getText(formElements.getFirstNameInput());
    }

    public String getLastName() {
        return interactions.getAttribute().getText(formElements.getLastNameInput());
    }

    public String getAddress() {
        return interactions.getAttribute().getText(formElements.getAddressTextArea());
    }

    public String getEmailAddress() {
        return interactions.getAttribute().getText(formElements.getEmailAddressInput());
    }

    public String getPhoneNumber() {
        return interactions.getAttribute().getText(formElements.getPhoneInput());
    }

    public boolean isGenderSelected(String gender) {
        return interactions.getState().isSelected(formElements.getGenderRadioOption(gender));
    }

    public boolean isHobbySelected(String hobby) {
        return interactions.getState().isSelected(formElements.getHobbiesCheckboxOption(hobby));
    }

    public String getLanguage() {
        return interactions.getAttribute().getInnerText(formElements.getLanguagesCombo());
    }

    public String getSkill() {
        return interactions.getAttribute().getText(formElements.getSkillsCombo());
    }

    public String getCountrySelectCombo() {
        return interactions.getAttribute().getInnerText(formElements.getCountrySelectCombo());
    }

    public String getDayOfBirth() {
        return interactions.getAttribute().getText(formElements.getDayOfBirthCombo());
    }

    public String getMonthOfBirth() {
        return interactions.getAttribute().getText(formElements.getMonthOfBirthCombo());
    }

    public String getYearOfBirth() {
        return interactions.getAttribute().getText(formElements.getYearOfBirthCombo());
    }

    public String getPassword() {
        return interactions.getAttribute().getText(formElements.getPasswordInput());
    }

    public String getPasswordConfirmation() {
        return interactions.getAttribute().getText(formElements.getConfirmPasswordInput());
    }

}
