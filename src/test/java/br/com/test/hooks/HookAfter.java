package br.com.test.hooks;

import br.com.test.core.driver.DriverManager;
import br.com.test.core.interactions.InteractionsManager;
import io.cucumber.java.After;

/**
 * Utility class for defining hook methods to be executed after each scenario in a test suite.
 */
public final class HookAfter {

    @After
    public void after() {
        DriverManager.killWebDriver();
        InteractionsManager.killInteractions();
    }
}
