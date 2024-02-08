package br.com.test.steps;

import io.cucumber.java.en.Given;

public class TempSteps {

    @Given("some temp test step")
    public void someTestStep() {
        System.out.println("Nice!");
    }
}
