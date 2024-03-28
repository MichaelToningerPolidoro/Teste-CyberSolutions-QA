package br.com.test.pages;

import br.com.test.core.interactions.Interactions;
import br.com.test.core.interactions.InteractionsManager;
import br.com.test.elements.MenuBarElements;

public final class MenuBarPage {

    private final Interactions interactions = InteractionsManager.getInteraction();
    private final MenuBarElements menuBarElements = new MenuBarElements();

    public void clickOptionInMenuBar(String menu, String option) {
        interactions.getClick().singleClick(menuBarElements.getMenuDropdown(menu));
        interactions.getClick().singleClick(menuBarElements.getDropdownOption(option));
    }
}
