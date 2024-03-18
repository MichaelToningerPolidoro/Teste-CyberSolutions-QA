package br.com.test.steps;

import br.com.test.pages.DatePickerPage;
import io.cucumber.java.en.And;

/**
 * TODO: javadocs
 * */
public final class DatePickerSteps {

    private final DatePickerPage datePickerPage = new DatePickerPage();

    @And("click in disabled datepicker")
    public void clickDisabledDatePicker() {
        datePickerPage.clickDisabledDatePicker();
    }
}
