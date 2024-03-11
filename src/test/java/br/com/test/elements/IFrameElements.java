package br.com.test.elements;

import lombok.Getter;
import org.openqa.selenium.By;

/**
 * TODO: javadocs
 * */
@Getter
public final class IFrameElements {

    private final By singleIFrame = By.xpath("//iframe[@id='singleframe']");
    private final By insideSingleIFrameInput = By.xpath("(//input)[1]");
}
