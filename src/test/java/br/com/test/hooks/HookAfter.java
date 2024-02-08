package br.com.test.hooks;

import br.com.test.core.driver.DriverManager;
import io.cucumber.java.After;

public final class HookAfter {

    @After
    public void after() {
        DriverManager.killWebDriver();
    }
}
