package br.com.test.core.driver;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

/**
 * TODO: Javadocs
 * */
public enum Browser {

    CHROME {
        @Override
        public WebDriver startDriver(Capabilities capabilities) {
            return new ChromeDriver((ChromeOptions) capabilities);
        }

        @Override
        public ChromeOptions getCapabilities(boolean isHeadless) {
            final ChromeOptions chromeOptions = new ChromeOptions();

            chromeOptions.addArguments(DriverArguments.STANDARD_CHROMIUM_ARGUMENTS);

            if (isHeadless) {
                chromeOptions.addArguments(DriverArguments.STANDARD_CHROMIUM_HEADLESS_ARGUMENTS);
            }

            chromeOptions.setPageLoadStrategy(DriverArguments.STANDARD_PAGE_LOAD_STRATEGY);

            return chromeOptions;
        }
    },

    EDGE {
        @Override
        public WebDriver startDriver(Capabilities capabilities) {
            return new EdgeDriver((EdgeOptions) capabilities);
        }

        @Override
        public EdgeOptions getCapabilities(boolean isHeadless) {
            final EdgeOptions edgeOptions = new EdgeOptions();

            edgeOptions.addArguments(DriverArguments.STANDARD_CHROMIUM_ARGUMENTS);

            if (isHeadless) {
                edgeOptions.addArguments(DriverArguments.STANDARD_CHROMIUM_HEADLESS_ARGUMENTS);
            }

            edgeOptions.setPageLoadStrategy(DriverArguments.STANDARD_PAGE_LOAD_STRATEGY);

            return edgeOptions;
        }
    };

    public abstract WebDriver startDriver(Capabilities capabilities);
    public abstract Capabilities getCapabilities(boolean isHeadless);

}
