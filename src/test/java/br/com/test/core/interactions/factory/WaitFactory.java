package br.com.test.core.interactions.factory;

import br.com.test.core.driver.DriverManager;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * TODO: javadocs
 * */
public final class WaitFactory {

    /**
     * TODO: javadocs
     * */
    public static WebDriverWait getWait(Duration durationLimit) {
        return new WebDriverWait(DriverManager.getWebDriver(), durationLimit);
    }
}
