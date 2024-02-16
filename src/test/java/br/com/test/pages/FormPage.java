package br.com.test.pages;

import br.com.test.core.interactions.Interactions;
import br.com.test.elements.FormElements;
import org.openqa.selenium.By;

/**
 * TODO: Javadocs
 * */
public final class FormPage {

    private final Interactions interactions = new Interactions();

    private final FormElements formElements = new FormElements();

    /**
     * TODO: Javadocs
     * */
    public void waitFormPageBeLoaded() {
        interactions.getWait().waitElementToBeVisible(formElements.getRegisterPageTitle(), 15);
    }

}
