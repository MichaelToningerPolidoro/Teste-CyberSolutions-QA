package br.com.test.core.interactions;

/**
 * Utility class for managing interactions with web elements using Selenium WebDriver.
 */
public final class InteractionsManager {

    private static final ThreadLocal<Interactions> interactionsPool = new ThreadLocal<>();

    /**
     * Initializes the interaction's manager.
     */
    public static void initializeInteractions() {
        interactionsPool.set(new Interactions());
    }

    /**
     * Retrieves the interactions manager instance.
     *
     * @return the interactions manager instance.
     */
    public static Interactions getInteraction() {
        return interactionsPool.get();
    }

    /**
     * Terminates the interaction's manager.
     */
    public static void killInteractions() {
        interactionsPool.remove();
    }
}
