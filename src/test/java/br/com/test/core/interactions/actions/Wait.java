package br.com.test.core.interactions.actions;

import br.com.test.core.interactions.factory.WaitFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

/**
 * Utility class for implementing various wait strategies in Selenium WebDriver.
 */
public final class Wait {

    /**
     * Delays execution for the specified amount of time.
     *
     * @param milliseconds the duration to delay execution in milliseconds.
     */
    public void time(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (Exception ignored) {
        }
    }

    /**
     * Waits for the web element found by the given locator to become visible within the specified time limit.
     *
     * @param by the locator strategy to find the web element.
     * @param timeLimitInSeconds the maximum time to wait for the element to become visible, in seconds.
     */
    public void waitElementToBeVisible(By by, int timeLimitInSeconds) {
        waitElementToBeVisible(by, Duration.ofSeconds(timeLimitInSeconds));
    }

    /**
     * Waits for the web element found by the given locator to become visible within the specified duration limit.
     *
     * @param by the locator strategy to find the web element.
     * @param durationLimit the maximum duration to wait for the element to become visible.
     */
    public void waitElementToBeVisible(By by, Duration durationLimit) {
        WaitFactory.getWait(durationLimit).until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    /**
     * Waits for the web element found by the given locator to become interactable within the specified time limit.
     *
     * @param by the locator strategy to find the web element.
     * @param timeLimitInSeconds the maximum time to wait for the element to become interactable, in seconds.
     */
    public void waitElementToBeInteractable(By by, int timeLimitInSeconds) {
        waitElementToBeInteractable(by, Duration.ofSeconds(timeLimitInSeconds));
    }

    /**
     * Waits for the web element found by the given locator to become interactable within the specified duration limit.
     *
     * @param by the locator strategy to find the web element.
     * @param durationLimit the maximum duration to wait for the element to become interactable.
     */
    public void waitElementToBeInteractable(By by, Duration durationLimit) {
        WaitFactory.getWait(durationLimit).until(ExpectedConditions.elementToBeClickable(by));
    }
}
