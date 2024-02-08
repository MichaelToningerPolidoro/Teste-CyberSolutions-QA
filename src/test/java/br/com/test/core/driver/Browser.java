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
            return new ChromeDriver();
        }

        @Override
        public ChromeOptions getCapabilities(boolean headless) {
            // chrome options
            // capabilities
            // chrome options merge with capabilities
            return null;
        }
    },

    EDGE {
        @Override
        public WebDriver startDriver(Capabilities capabilities) {
            return new EdgeDriver();
        }

        @Override
        public EdgeOptions getCapabilities(boolean headless) {
            // edge options
            // capabilities
            // edge options merge with capabilities
            return null;
        }
    };

    public abstract WebDriver startDriver(Capabilities capabilities);
    public abstract Capabilities getCapabilities(boolean headless);
}
