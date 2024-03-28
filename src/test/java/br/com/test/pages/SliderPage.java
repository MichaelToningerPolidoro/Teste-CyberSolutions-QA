package br.com.test.pages;

import br.com.test.core.interactions.Interactions;
import br.com.test.core.interactions.InteractionsManager;
import br.com.test.elements.SliderElements;
import br.com.test.util.ExtractorUtils;

public final class SliderPage {

    private final SliderElements sliderElements = new SliderElements();
    private final Interactions interactions = InteractionsManager.getInteraction();

    public void setSliderPercentageValue(int value) {
        final String formattedValue = "'" + value + "%'";
        interactions.getJs().setAttribute(sliderElements.getSliderButton(), "style.left", formattedValue);
    }

    public int getSliderPercentageValue() {
        final String attributeValue = interactions.getAttribute().get(sliderElements.getSliderButton(), "style");
        return ExtractorUtils.extractNumbersFromText(attributeValue).get(0);
    }
}
