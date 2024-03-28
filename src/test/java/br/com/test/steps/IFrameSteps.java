package br.com.test.steps;

import br.com.test.pages.IFramePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

public final class IFrameSteps {

    private final IFramePage iFramePage = new IFramePage();

    @When("get inside single iframe")
    public void getInsideSingleIFrame() {
        iFramePage.getInsideSingleIFrame();
    }

    @And("write {string} in single iframe input")
    public void writeSingleIFrameInput(String text) {
        iFramePage.writeInSingleIFrameInput(text);
    }

    @Then("validate single iframe input is filled with {string}")
    public void validateSingleIFrameText(String expectedText) {
        Assertions.assertThat(iFramePage.getSingleIFrameInputText()).isEqualTo(expectedText);
    }
}
