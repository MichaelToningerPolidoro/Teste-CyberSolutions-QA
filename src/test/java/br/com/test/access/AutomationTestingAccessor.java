package br.com.test.access;

import br.com.test.core.driver.DriverManager;

/**
 * Utility class for accessing pages in an automation testing environment.
 */
public final class AutomationTestingAccessor {

    /**
     * Accesses the specified page in the automation testing environment.
     *
     * @param page the name of the page to be accessed.
     */
    public void access(String page) {
        DriverManager.getWebDriver().get(AutomationTestingLinks.valueOf(page.toUpperCase()).getLink());
    }
}
