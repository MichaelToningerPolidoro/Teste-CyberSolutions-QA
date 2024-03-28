package br.com.test.pages;

import br.com.test.core.interactions.Interactions;
import br.com.test.core.interactions.InteractionsManager;
import br.com.test.elements.SliderElements;
import br.com.test.util.ExtractorUtils;

/**
 * Class to handle Slider page actions.
 */
public final class SliderPage {

    private final SliderElements sliderElements = new SliderElements();
    private final Interactions interactions = InteractionsManager.getInteraction();

    /**
     * Method that Set slider value.
     * @param value value to set slider (%)
     */
    public void setSliderPercentageValue(int value) {
        final String formattedValue = "'" + value + "%'";
        interactions.getJs().setAttribute(sliderElements.getSliderButton(), "style.left", formattedValue);
    }

    /**
     * Get slider's actual value
     * @return slider's actual value (%)
     */
    public int getSliderPercentageValue() {
        final String attributeValue = interactions.getAttribute().get(sliderElements.getSliderButton(), "style");
        return ExtractorUtils.extractNumbersFromText(attributeValue).get(0);
    }
}
