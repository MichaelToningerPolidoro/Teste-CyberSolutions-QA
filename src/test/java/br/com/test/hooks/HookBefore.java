package br.com.test.hooks;

import br.com.test.core.driver.DriverManager;
import io.cucumber.java.Before;

/**
 * TODO: Javadocs
 * */
public final class HookBefore {

    @Before
    public void before() throws InterruptedException {
        DriverManager.initializeWebDriver();
    }
}
