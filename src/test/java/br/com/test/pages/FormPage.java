package br.com.test.pages;

import br.com.test.core.interactions.Interactions;
import br.com.test.core.interactions.InteractionsManager;
import br.com.test.elements.FormElements;

/**
 * TODO: Javadocs
 * */
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
    public String getFirstName() {
        return interactions.getAttribute().getText(formElements.getFirstNameInput());
    }

    /**
     * TODO: javadocs
     * */
    public String getLastName() {
        return interactions.getAttribute().getText(formElements.getLastNameInput());
    }

}
