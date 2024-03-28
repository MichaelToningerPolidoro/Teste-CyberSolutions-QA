package br.com.test.steps;

import br.com.test.pages.DatePickerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

/**
 * TODO: javadocs
 * */
public final class DatePickerSteps {

    private final DatePickerPage datePickerPage = new DatePickerPage();

    @And("click in disabled datepicker")
    public void clickDisabledDatePicker() {
        datePickerPage.clickDisabledDatePicker();
    }

    @And("select disabled datepicker year {string}")
    public void selectDisabledDatePickerYear(String year) {
        datePickerPage.selectDisabledDatePickerYear(year);
    }

    @And("select disabled datepicker month {string}")
    public void selectDisabledDatePickerMonth(String month) {
        datePickerPage.selectDisabledDatePickerMonth(month);
    }

    @And("select disabled datepicker day {string}")
    public void selectDisabledDatePickerDay(String day) {
        datePickerPage.selectDisabledDatePickerDay(day);
    }

    @Then("validate disabled datepicker date {string}")
    public void validateDisabledDatePickerDate(String expectedDate) {
        datePickerPage.validateDisabledDatePickerDate(expectedDate);
    }

    @And("click in enabled datepicker")
    public void clickEnabledDatePicker() {
        datePickerPage.clickEnabledDatePicker();
    }

    @And("select enabled datepicker year {string}")
    public void selectEnabledDatePickerYear(String year) {
        datePickerPage.selectEnabledDatePickerYear(year);
    }

    @And("select enabled datepicker month {string}")
    public void selectEnabledDatePickerMonth(String month) {
        datePickerPage.selectEnabledDatePickerMonth(month);
    }

    @And("select enabled datepicker day {string}")
    public void selectEnabledDatePickerDay(String day) {
        datePickerPage.selectEnabledDatePickerDay(day);
    }

    @Then("validate enabled datepicker date {string}")
    public void validateEnabledDatePickerDate(String expectedDate) {
        datePickerPage.validateEnabledDatePickerDate(expectedDate);
    }
}
