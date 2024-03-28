package br.com.test.steps;

import br.com.test.pages.SliderPage;
import io.cucumber.java.en.And;

import static org.assertj.core.api.Assertions.assertThat;

public final class SliderSteps {

    private final SliderPage sliderPage = new SliderPage();

    @And("drag slider to {int}%")
    public void setSliderValue(int value) {
        sliderPage.setSliderPercentageValue(value);
    }

    @And("validate that slider value is {int}%")
    public void validateSliderValue(int expectedValue) {
        assertThat(sliderPage.getSliderPercentageValue()).isEqualTo(expectedValue);
    }

}
