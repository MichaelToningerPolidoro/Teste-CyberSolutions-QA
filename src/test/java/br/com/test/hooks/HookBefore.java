package br.com.test.hooks;

import br.com.test.core.driver.DriverManager;
import br.com.test.core.interactions.InteractionsManager;
import io.cucumber.java.Before;

/**
 * TODO: Javadocs
 * */
public final class HookBefore {

    @Before
    public void before() throws InterruptedException {
        DriverManager.initializeWebDriver();
        InteractionsManager.initializeInteractions();
    }
}
