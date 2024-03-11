package br.com.test.steps;

import br.com.test.pages.MenuBarPage;
import io.cucumber.java.en.And;

/**
 * TODO: JAVADOCS
 * */
public final class MenuBarSteps {

    private final MenuBarPage menuBarPage = new MenuBarPage();

    @And("click {string} menu and choose option {string}")
    public void clickOptionSwitchTo(String menu, String option) throws InterruptedException {
        menuBarPage.clickOptionInMenuBar(menu, option);
        Thread.sleep(2000); // TODO: remover aqui e a exceção
    }
}
