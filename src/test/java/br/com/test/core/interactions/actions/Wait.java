package br.com.test.core.interactions.actions;

import br.com.test.core.interactions.factory.WaitFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

/**
 * TODO: Javadocs
 * */
public final class Wait {

    /**
     * TODO: javadocs
     * */
    public void time(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (Exception ignored) {
        }
    }

    /**
     * TODO: Javadocs
     * */
    public void waitElementToBeVisible(By by, int timeLimitInSeconds) {
        waitElementToBeVisible(by, Duration.ofSeconds(timeLimitInSeconds));
    }

    /**
     * TODO: Javadocs
     * */
    public void waitElementToBeVisible(By by, Duration durationLimit) {
        WaitFactory.getWait(durationLimit).until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}
