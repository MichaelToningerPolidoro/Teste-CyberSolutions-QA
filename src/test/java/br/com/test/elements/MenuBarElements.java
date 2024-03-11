package br.com.test.elements;

import lombok.Getter;
import org.openqa.selenium.By;

/**
 * TODO javadocs
 * */
@Getter
public final class MenuBarElements {

    public By getMenuDropdown(String menu) {
        return By.xpath("//a[contains(text(), '" + menu + "')]");
    }

    public By getDropdownOption(String option) {
        return By.xpath("//a[contains(text(), '" + option + "')]");
    }

}
