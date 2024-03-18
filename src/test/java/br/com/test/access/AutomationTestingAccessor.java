package br.com.test.access;

import br.com.test.core.driver.DriverManager;

/**
 * TODO Javadocs
 * */
public final class AutomationTestingAccessor {

    /**
     * TODO Javadocs
     * */
    public void access(String page) {
        DriverManager.getWebDriver().get(AutomationTestingLinks.valueOf(page.toUpperCase()).getLink());
    }
}
