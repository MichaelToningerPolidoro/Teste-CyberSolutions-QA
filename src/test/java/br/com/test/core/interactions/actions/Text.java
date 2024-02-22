package br.com.test.core.interactions.actions;

import br.com.test.core.interactions.finder.ElementFinder;
import org.openqa.selenium.By;

/**
 * TODO: javadocs
 * */
public final class Text {

    /**
     * TODO: javadocs
     * */
    public void write(By by, String text) {
        ElementFinder.findElement(by).sendKeys(text);
    }


}
