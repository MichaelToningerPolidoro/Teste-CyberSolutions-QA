package br.com.test.pages;

import br.com.test.core.interactions.Interactions;
import br.com.test.core.interactions.InteractionsManager;
import br.com.test.elements.FormElements;

public final class FormPage {

    private final Interactions interactions = InteractionsManager.getInteraction();

    private final FormElements formElements = new FormElements();

    /**
     * TODO: Javadocs
     * */
    public void waitFormPageBeLoaded() {
        interactions.getWait().waitElementToBeVisible(formElements.getRegisterPageTitle(), 15);
    }

    /**
     * TODO: javadocs
     * */
    public void writeFirstName(String name) {
        interactions.getText().write(formElements.getFirstNameInput(), name);
    }

    /**
     * TODO: javadocs
     * */
    public void writeLastName(String lastName) {
        interactions.getText().write(formElements.getLastNameInput(), lastName);
    }

    /**
     * TODO: javadocs
     * */
    public void writeAddress(String address) {
        interactions.getText().write(formElements.getAddressTextArea(), address);
    }

    /**
     * TODO: javadocs
     * */
    public void writeEmailAddress(String emailAddress) {
        interactions.getText().write(formElements.getEmailAddressInput(), emailAddress);
    }

    /**
     * TODO: javadocs
     * */
    public void writePhone(String phone) {
        interactions.getText().write(formElements.getPhoneInput(), phone);
    }

    /**
     * TODO: javadocs
     * */
    public void selectGender(String gender) {
        interactions.getClick().singleClick(formElements.getGenderRadioOption(gender));
    }

    /**
     * TODO: javadocs
     * */
    public void selectHobby(String hobby) {
        interactions.getClick().singleClick(formElements.getHobbiesCheckboxOption(hobby));
    }

    /**
     * TODO: javadocs
     * To "close" options
     * */
    public void clickLanguageLabel() {
        interactions.getClick().singleClick(formElements.getLanguagesLabel());
    }

    /**
     * TODO: javadocs
     * */
    public void selectLanguage(String language) {
        interactions.getCombo().select(
                formElements.getLanguagesCombo(), formElements.getLanguageComboOption(language)
        );
    }

    /**
     * TODO: javadocs
     * */
    public void selectCountry(String country) {
        interactions.getCombo().select(
                formElements.getCountrySelectCombo(), formElements.getSelectCountryComboOption(country)
        );
    }

    /**
     * TODO: javadocs
     * */
    public void clickSkillLabel() {
        interactions.getClick().singleClick(formElements.getSkillsLabel());
    }

    /**
     * TODO: javadocs
     * */
    public void selectSkill(String skill) {
        interactions.getCombo().select(
                formElements.getSkillsCombo(), formElements.getSkillComboOption(skill)
        );
    }

    /**
     * TODO: javadocs
     * */
    public void selectDayOfBirth(String day) {
        interactions.getCombo().select(
                formElements.getDayOfBirthCombo(), formElements.getDayOfBirthOption(day)
        );
    }

    /**
     * TODO: javadocs
     * */
    public void selectMonthOfBirth(String month) {
        interactions.getCombo().select(
                formElements.getMonthOfBirthCombo(), formElements.getMonthOfBirthOption(month)
        );
    }

    /**
     * TODO: javadocs
     * */
    public void selectYearOfBirth(String year) {
        interactions.getCombo().select(
                formElements.getYearOfBirthCombo(), formElements.getYearOfBirth(year)
        );
    }

    /**
     * TODO: javadocs
     * */
    public void writePassword(String password) {
        interactions.getText().write(formElements.getPasswordInput(), password);
    }

    /**
     * TODO: javadocs
     * */
    public void writePasswordConfirmation(String password) {
        interactions.getText().write(formElements.getConfirmPasswordInput(), password);
    }

    /**
     * TODO: javadocs
     * */
    public void clickSubmit() {
        interactions.getClick().singleClick(formElements.getSubmitButton());
    }

    /* ==== VALIDATIONS ==== */
    /**
     * TODO: javadocs
     * */
    public String getFirstName() {
        return interactions.getAttribute().getText(formElements.getFirstNameInput());
    }

    /**
     * TODO: javadocs
     * */
    public String getLastName() {
        return interactions.getAttribute().getText(formElements.getLastNameInput());
    }

    /**
     * TODO: javadocs
     * */
    public String getAddress() {
        return interactions.getAttribute().getText(formElements.getAddressTextArea());
    }

    /**
     * TODO: javadocs
     * */
    public String getEmailAddress() {
        return interactions.getAttribute().getText(formElements.getEmailAddressInput());
    }

    /**
     * TODO: javadocs
     * */
    public String getPhoneNumber() {
        return interactions.getAttribute().getText(formElements.getPhoneInput());
    }

    /**
     * TODO: javadocs
     * */
    public boolean isGenderSelected(String gender) {
        return interactions.getState().isSelected(formElements.getGenderRadioOption(gender));
    }

    /**
     * TODO: javadocs
     * */
    public boolean isHobbySelected(String hobby) {
        return interactions.getState().isSelected(formElements.getHobbiesCheckboxOption(hobby));
    }

    /**
     * TODO: javadocs
     * */
    public String getLanguage() {
        return interactions.getAttribute().getInnerText(formElements.getLanguagesCombo());
    }

    /**
     * TODO: javadocs
     * */
    public String getSkill() {
        return interactions.getAttribute().getText(formElements.getSkillsCombo());
    }

    /**
     * TODO: javadocs
     * */
    public String getCountrySelectCombo() {
        return interactions.getAttribute().getInnerText(formElements.getCountrySelectCombo());
    }

    /**
     * TODO: javadocs
     * */
    public String getDayOfBirth() {
        return interactions.getAttribute().getText(formElements.getDayOfBirthCombo());
    }

    /**
     * TODO: javadocs
     * */
    public String getMonthOfBirth() {
        return interactions.getAttribute().getText(formElements.getMonthOfBirthCombo());
    }

    /**
     * TODO: javadocs
     * */
    public String getYearOfBirth() {
        return interactions.getAttribute().getText(formElements.getYearOfBirthCombo());
    }

    /**
     * TODO: javadocs
     * */
    public String getPassword() {
        return interactions.getAttribute().getText(formElements.getPasswordInput());
    }

    /**
     * TODO: javadocs
     * */
    public String getPasswordConfirmation() {
        return interactions.getAttribute().getText(formElements.getConfirmPasswordInput());
    }

}
