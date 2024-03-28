package br.com.test.elements;

import lombok.Getter;
import org.openqa.selenium.By;

@Getter
public final class FormElements {

    private final By registerPageTitle = By.xpath("//section[@id='section']//h2[contains(text(), 'Register')]");
    private final By firstNameInput = By.xpath("//input[@ng-model='FirstName']");
    private final By lastNameInput = By.xpath("//input[@ng-model='LastName']");
    private final By addressTextArea = By.xpath("//textarea[@ng-model='Adress']");
    private final By emailAddressInput = By.xpath("//input[@ng-model='EmailAdress']");
    private final By phoneInput = By.xpath("//input[@ng-model='Phone']");
    private final By languagesLabel = By.xpath("//label[contains(text(), 'Languages')]");
    private final By languagesCombo = By.xpath("//div[@id='msdd']");
    private final By skillsLabel = By.xpath("//label[contains(text(), 'Skills')]");
    private final By skillsCombo = By.xpath("//select[@id='Skills']");
    private final By countryCombo = By.xpath("//select[@id='countries']");
    private final By countrySelectCombo = By.xpath("//select[@id='country']//following-sibling::span");
    private final By dayOfBirthCombo = By.xpath("//select[@id='daybox']");
    private final By monthOfBirthCombo = By.xpath("//select[@type='text' and @placeholder='Month']");
    private final By yearOfBirthCombo = By.xpath("//select[@id='yearbox']");
    private final By passwordInput = By.xpath("//input[@id='firstpassword']");
    private final By confirmPasswordInput = By.xpath("//input[@id='secondpassword']");
    private final By submitButton = By.xpath("//button[@id='submitbtn']");

    public By getGenderRadioOption(String gender) {
        if (gender.equalsIgnoreCase("male")) {
            gender = "Male";
        } else if (gender.equalsIgnoreCase("female")) {
            gender = "FeMale";
        }

        return By.xpath("//input[@type='radio' and @value='" + gender + "']");
    }

    public By getHobbiesCheckboxOption(String hobbie) {
        return By.xpath("//input[@type='checkbox' and @value='" + hobbie + "']");
    }

    public By getLanguageComboOption(String language) {
        return By.xpath("//a[contains(text(), '" + language + "')]");
    }

    public By getSkillComboOption(String skill) {
        return By.xpath("//option[@value='" + skill + "']");
    }

    public By getSelectCountryComboOption(String country) {
        return By.xpath("//ul[@id='select2-country-results']//li[contains(text(), '" + country + "')]");
    }

    public By getDayOfBirthOption(String day) {
        return By.xpath("//option[@value='" + day + "']");
    }

    public By getMonthOfBirthOption(String month) {
        return By.xpath("//option[@value='" + month + "']");
    }

    public By getYearOfBirth(String year) {
        return By.xpath("//option[@value='" + year + "']");
    }

}
