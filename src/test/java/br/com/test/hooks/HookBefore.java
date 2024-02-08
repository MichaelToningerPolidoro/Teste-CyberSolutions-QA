package br.com.test.hooks;

import br.com.test.core.driver.DriverManager;
import io.cucumber.java.Before;

public final class HookBefore {

    @Before
    public void before() {
        DriverManager.initializeWebDriver();
    }
}
