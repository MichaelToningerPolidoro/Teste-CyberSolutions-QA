package br.com.test.core.interactions.actions;

import br.com.test.core.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * TODO: Javadocs
 * */
public final class Wait {

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
        // TODO: WaitFactoryHere
        //  ElementFinder
        new WebDriverWait(DriverManager.getWebDriver(), durationLimit)
                .until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}
