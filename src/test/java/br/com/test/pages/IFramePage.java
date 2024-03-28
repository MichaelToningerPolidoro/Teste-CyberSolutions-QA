package br.com.test.pages;

import br.com.test.core.interactions.Interactions;
import br.com.test.core.interactions.InteractionsManager;
import br.com.test.elements.IFrameElements;

public final class IFramePage {

    private final Interactions interactions = InteractionsManager.getInteraction();
    private final IFrameElements iFrameElements = new IFrameElements();

    public void getInsideSingleIFrame() {
        interactions.getIFrame().swithTo(iFrameElements.getSingleIFrame());
    }

    public void writeInSingleIFrameInput(String text) {
        interactions.getText().write(iFrameElements.getInsideSingleIFrameInput(), text);
    }

    public String getSingleIFrameInputText() {
        return interactions.getAttribute().getText(iFrameElements.getInsideSingleIFrameInput());
    }
}
