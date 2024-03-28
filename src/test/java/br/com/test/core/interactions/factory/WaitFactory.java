package br.com.test.core.interactions.factory;

import br.com.test.core.driver.DriverManager;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Factory class for creating WebDriverWait instances with custom duration limits.
 */
public final class WaitFactory {

    /**
     * Creates a WebDriverWait instance with the specified duration limit.
     *
     * @param durationLimit the maximum duration to wait for an element to meet the expected conditions.
     * @return a new WebDriverWait instance with the specified duration limit.
     */
    public static WebDriverWait getWait(Duration durationLimit) {
        return new WebDriverWait(DriverManager.getWebDriver(), durationLimit);
    }
}
