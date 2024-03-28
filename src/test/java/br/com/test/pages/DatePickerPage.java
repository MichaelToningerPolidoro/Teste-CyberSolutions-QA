package br.com.test.pages;

import br.com.test.core.interactions.Interactions;
import br.com.test.core.interactions.InteractionsManager;
import br.com.test.elements.DisabledDatePickerElements;
import br.com.test.elements.EnabledDatePickerElements;

import java.util.function.Predicate;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * TODO: JAVADOCS
 * */
public final class DatePickerPage {

    private final Interactions interactions = InteractionsManager.getInteraction();
    private final DisabledDatePickerElements disabledDatePickerElements = new DisabledDatePickerElements();
    private final EnabledDatePickerElements enabledDatePickerElements = new EnabledDatePickerElements();

    /**
     * TODO: JAVADOCS
     * */
    public void clickDisabledDatePicker() {
        interactions.getClick().singleClick(disabledDatePickerElements.getDisabledDatePicker());
    }

    /**
     * TODO: JAVADOCS
     * */
    public void selectDisabledDatePickerYear(String year) {
        Predicate<String> reachedExpectedYear = (expectedYear) -> interactions.getAttribute().getInnerText(disabledDatePickerElements.getYearLabel()).equals(expectedYear);
        interactions.getWait().waitElementToBeVisible(disabledDatePickerElements.getYearLabel(), 3);

        while(!reachedExpectedYear.test(year)) {
            interactions.getClick().singleClick(disabledDatePickerElements.getPreviousButton());
        }
    }

    /**
     * TODO: JAVADOCS
     * */
    public void selectDisabledDatePickerMonth(String month) {
        Predicate<String> reachedExpectedMonth = (expectedMonth) -> interactions.getAttribute().getInnerText(disabledDatePickerElements.getMonthLabel()).equals(expectedMonth);
        interactions.getWait().waitElementToBeVisible(disabledDatePickerElements.getYearLabel(), 3);

        while(!reachedExpectedMonth.test(month)) {
            interactions.getClick().singleClick(disabledDatePickerElements.getPreviousButton());
        }
    }

    /**
     * TODO: JAVADOCS
     * */
    public void selectDisabledDatePickerDay(String day) {
        interactions.getClick().singleClick(disabledDatePickerElements.getDay(day));
    }

    /**
     * TODO: JAVADOCS
     * */
    public void validateDisabledDatePickerDate(String expectedDate) {
        assertThat(interactions.getAttribute().getText(disabledDatePickerElements.getDisabledDatePicker())).isEqualTo(expectedDate);
    }

    /*
    * ////////////////////
    * enabled date picker
    * ////////////////////
    *
    * */

    /**
     * TODO: JAVADOCS
     * */
    public void clickEnabledDatePicker() {
        interactions.getClick().singleClick(enabledDatePickerElements.getEnabledDatePicker());
    }

    /**
     * TODO: JAVADOCS
     * */
    public void selectEnabledDatePickerYear(String year) {
        interactions.getWait().waitElementToBeVisible(enabledDatePickerElements.getYearSelect(), 3);
        interactions.getCombo().select(enabledDatePickerElements.getYearSelect(), enabledDatePickerElements.getYearOption(year));
    }

    /**
     * TODO: JAVADOCS
     * */
    public void selectEnabledDatePickerMonth(String month) {
        interactions.getWait().waitElementToBeVisible(enabledDatePickerElements.getMonthSelect(), 3);
        interactions.getCombo().select(enabledDatePickerElements.getMonthSelect(), enabledDatePickerElements.getMonthOption(month));
    }

    /**
     * TODO: JAVADOCS
     * */
    public void selectEnabledDatePickerDay(String day) {
        interactions.getWait().waitElementToBeVisible(enabledDatePickerElements.getDay(day), 3);
        interactions.getClick().singleClick(enabledDatePickerElements.getDay(day));
    }

    /**
     * TODO: JAVADOCS
     * */
    public void validateEnabledDatePickerDate(String expectedDate) {
        assertThat(interactions.getAttribute().getText(enabledDatePickerElements.getEnabledDatePicker())).isEqualTo(expectedDate);
    }
}
