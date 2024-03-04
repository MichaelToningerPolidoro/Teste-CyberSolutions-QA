package br.com.test.core.interactions.actions;

import br.com.test.core.interactions.finder.ElementFinder;
import org.openqa.selenium.By;

/**
 * TODO: javadocs
 * */
public final class State {

    /**
     * TODO: javadocs
     * */
    public boolean isSelected(By by) {
        return ElementFinder.findElement(by).isSelected();
    }
}
