package br.com.test.elements;

import org.openqa.selenium.By;

/**
 * TODO javadocs
 * */
public final class EnabledDatePickerElements {

    private final By enabledDatePicker = By.xpath("//input[@id='datepicker2']");
    private final By monthSelect = By.xpath("//select[@class='datepick-month-year' and @title='Change the month']");
    private final By yearSelect = By.xpath("//select[@class='datepick-month-year' and @title='Change the year']");

    /**
     * TODO: javadocs
     * */
    public By getMonthOption(String month) {
        return By.xpath("//option[contains(text(), '" + month + "')]");
    }

    /**
     * TODO: javadocs
     * */
    public By getYearOption(String year) {
        return By.xpath("//option[contains(text(), '" + year + "')]");
    }

    /**
     * TODO: javadocs
     * */
    public By getDay(String day) {
        return By.xpath("//div[@class='datepick-popup']//a[contains(text(), '" + day + "')]");
    }
}
