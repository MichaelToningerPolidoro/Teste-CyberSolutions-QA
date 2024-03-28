package br.com.test.core.settings;

import java.util.NoSuchElementException;

/**
 * Utility class for providing environment variables used in test automation.
 */
public final class EnvVarsProvider {

    /**
     * Retrieves the value of the "browser" environment variable.
     *
     * @return the value of the "browser" environment variable.
     */
    public static String getBrowser() {
        return getEnv("browser");
    }

    /**
     * Retrieves the value of the "headless" environment variable.
     *
     * @return the value of the "headless" environment variable.
     */
    public static String getHeadless() {
        return getEnv("headless");
    }

    /**
     * Retrieves the value of the "parallel_scenarios_count" environment variable.
     *
     * @return the value of the "parallel_scenarios_count" environment variable.
     */
    public static String getParallelScenariosCount() {
        return getEnv("parallel_scenarios_count");
    }

    /**
     * Retrieves the value of the specified environment variable.
     *
     * @param var the name of the environment variable.
     * @return the value of the specified environment variable.
     * @throws NoSuchElementException if the specified environment variable is not found.
     */
    private static String getEnv(String var) {
        final String value = System.getenv(var);

        if (value == null) {
            throw new NoSuchElementException("Unable to find the environment variable -> " + var);
        }

        return value;
    }
}
