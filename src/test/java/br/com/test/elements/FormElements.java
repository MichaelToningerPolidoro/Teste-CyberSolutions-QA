package br.com.test.elements;

import lombok.Getter;
import org.openqa.selenium.By;

/**
 * TODO: Javadocs
 * */
@Getter
public final class FormElements {

    private final By registerPageTitle = By.xpath("//section[@id='section']//h2[contains(text(), 'Register')]");
}
