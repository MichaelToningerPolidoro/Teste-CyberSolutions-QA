package br.com.test.core.driver;

import org.openqa.selenium.PageLoadStrategy;

/**
 * Utility class for storing and accessing driver arguments.
 */
public final class DriverArguments {

    private DriverArguments() {}

    public static final PageLoadStrategy STANDARD_PAGE_LOAD_STRATEGY = PageLoadStrategy.NORMAL;

    public static final String[] STANDARD_CHROMIUM_ARGUMENTS = {
            "--start-maximized",
            "--disable-infobars",
            "--disable-translate",
            "--disable-notifications",
            "--disable-extensions"
    };

    public static final String[] STANDARD_CHROMIUM_HEADLESS_ARGUMENTS = {
            "--headless",
            "--disable-gpu",
            "window-size=1920,1080"
    };
}
