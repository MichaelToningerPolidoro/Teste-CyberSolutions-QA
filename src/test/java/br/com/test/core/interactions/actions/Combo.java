package br.com.test.core.interactions.actions;

import org.openqa.selenium.By;

/**
 * TODO: javadocs
 * */
public final class Combo {

    /**
     * TODO: javadocs
     * */
    public void select(By selectBy, By optionBy) {
        final Click click = new Click();
        click.singleClick(selectBy);
        click.singleClick(optionBy);
    }
}
