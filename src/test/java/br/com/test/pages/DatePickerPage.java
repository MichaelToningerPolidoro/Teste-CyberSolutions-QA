package br.com.test.pages;

import br.com.test.core.interactions.Interactions;
import br.com.test.core.interactions.InteractionsManager;
import br.com.test.elements.DisabledDatePickerElements;
import br.com.test.elements.EnabledDatePickerElements;

import java.util.function.Predicate;

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
}
