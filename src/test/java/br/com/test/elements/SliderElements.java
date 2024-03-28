package br.com.test.elements;

import lombok.Getter;
import org.openqa.selenium.By;

@Getter
public final class SliderElements {

    private final By sliderButton = By.xpath("//a[contains(@class, 'ui-slider-handle')]");
    
}
