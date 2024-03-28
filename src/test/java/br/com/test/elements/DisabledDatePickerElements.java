package br.com.test.elements;

import lombok.Getter;
import org.openqa.selenium.By;

/**
 * TODO: JAVADOCS
 * */
@Getter
public final class DisabledDatePickerElements {

    private final By disabledDatePicker = By.xpath("//input[@id='datepicker1']");
    private final By previousButton = By.xpath("//a[@data-handler='prev']");
    private final By monthLabel = By.xpath("//span[@class='ui-datepicker-month']");
    private final By yearLabel = By.xpath("//span[@class='ui-datepicker-year']");

    /**
     * TODO: JAVADOCS
     * */
    public By getDay(String day) {
        return By.xpath("//table[@class='ui-datepicker-calendar']//a[contains(text(), '" + day + "')]");
    }
}
