package br.com.test.core.interactions.actions;

import br.com.test.core.interactions.finder.ElementFinder;
import org.openqa.selenium.By;

/**
 * TODO: javadocs
 * */
public final class Click {

    /**
     * TODO: javadocs
     * */
    public void singleClick(By by) {
        ElementFinder.findElement(by).click();
    }
}
