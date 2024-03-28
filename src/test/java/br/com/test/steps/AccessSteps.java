package br.com.test.steps;

import br.com.test.access.AutomationTestingAccessor;
import io.cucumber.java.en.Given;

public final class AccessSteps {

    @Given("access automation testing {word}")
    public void accessAutomationTesting(String page) {
        new AutomationTestingAccessor().access(page);
    }

}
