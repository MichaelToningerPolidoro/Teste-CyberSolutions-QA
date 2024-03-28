package br.com.test.core.settings;

import java.util.NoSuchElementException;

/**
 * TODO: Javadocs
 * */
public final class EnvVarsProvider {

    /**
     * TODO: Javadocs
     * */
    public static String getBrowser() {
        return getEnv("browser");
    }

    /**
     * TODO: Javadocs
     * */
    public static String getHeadless() {
        return getEnv("headless");
    }

    /**
     * TODO: Javadocs
     * */
    public static String getParallelScenariosCount() {
        return getEnv("parallel_scenarios_count");
    }

    /**
     * TODO: Javadocs
     * */
    private static String getEnv(String var) {
        final String value = System.getenv(var);

        if (value == null) {
            throw new NoSuchElementException("Unable to find the environment variable -> " + var);
        }

        return value;
    }
}
