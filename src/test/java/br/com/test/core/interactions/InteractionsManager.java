package br.com.test.core.interactions;

/**
 * TODO: javadocs
 * */
public final class InteractionsManager {

    private static final ThreadLocal<Interactions> interactionsPool = new ThreadLocal<>();

    /**
     * TODO: javadocs
     * */
    public static void initializeInteractions() {
        interactionsPool.set(new Interactions());
    }

    /**
     * TODO: javadocs
     * */
    public static Interactions getInteraction() {
        return interactionsPool.get();
    }

    /**
     * TODO: javadocs
     * */
    public static void killInteractions() {
        interactionsPool.remove();
    }
}
