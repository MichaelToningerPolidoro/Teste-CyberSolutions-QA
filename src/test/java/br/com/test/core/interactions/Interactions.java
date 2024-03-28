package br.com.test.core.interactions;

import br.com.test.core.interactions.actions.*;
import lombok.Getter;

/**
 * Utility class for performing various interactions with web elements using Selenium WebDriver.
 */
@Getter
public final class Interactions {

    private final Attribute attribute = new Attribute();
    private final Click click = new Click();
    private final Combo combo = new Combo();
    private final JS js = new JS();
    private final IFrame iFrame = new IFrame();
    private final State state = new State();
    private final Text text = new Text();
    private final Wait wait = new Wait();

}
