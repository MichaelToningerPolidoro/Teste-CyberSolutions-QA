package br.com.test.steps;

import br.com.test.core.driver.DriverManager;
import io.cucumber.java.en.Given;

/**
 * TODO: Javadocs
 * */
public final class AccessSteps {

    /*
    * TODO: Some explanation
    * */
    @Given("access automation testing")
    public void accessAutomationTesting() {
        DriverManager.getWebDriver().get("http://demo.automationtesting.in/Register.html");
    }

}