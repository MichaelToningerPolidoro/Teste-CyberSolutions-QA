package br.com.test.hooks;

import br.com.test.core.driver.DriverManager;
import br.com.test.core.interactions.InteractionsManager;
import io.cucumber.java.After;

/**
 * TODO: Javadocs
 * */
public final class HookAfter {

    @After
    public void after() {
        DriverManager.killWebDriver();
        InteractionsManager.killInteractions();
    }
}
