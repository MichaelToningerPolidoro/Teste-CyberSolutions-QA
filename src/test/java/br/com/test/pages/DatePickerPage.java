package br.com.test.pages;

import br.com.test.core.interactions.Interactions;
import br.com.test.core.interactions.InteractionsManager;
import br.com.test.elements.DisabledDatePickerElements;

/**
 * TODO: JAVADOCS
 * */
public final class DatePickerPage {

    private final Interactions interactions = InteractionsManager.getInteraction();
    private final DisabledDatePickerElements disabledDatePickerElements = new DisabledDatePickerElements();

    /**
     * TODO: JAVADOCS
     * */
    public void clickDisabledDatePicker() {
        interactions.getClick().singleClick(disabledDatePickerElements.getDisabledDatePicker());
    }
}
