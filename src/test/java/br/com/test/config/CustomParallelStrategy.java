package br.com.test.config;

import br.com.test.core.settings.EnvVarsProvider;
import org.junit.platform.engine.ConfigurationParameters;
import org.junit.platform.engine.support.hierarchical.ParallelExecutionConfiguration;
import org.junit.platform.engine.support.hierarchical.ParallelExecutionConfigurationStrategy;

public class CustomParallelStrategy implements ParallelExecutionConfiguration, ParallelExecutionConfigurationStrategy {

    private static final int parallelScenariosCount = Integer.parseInt(EnvVarsProvider.getParallelScenariosCount());

    @Override
    public int getParallelism() {
        return parallelScenariosCount;
    }

    @Override
    public int getMinimumRunnable() {
        return 0;
    }

    @Override
    public int getMaxPoolSize() {
        return parallelScenariosCount;
    }

    @Override
    public int getCorePoolSize() {
        return parallelScenariosCount;
    }

    @Override
    public int getKeepAliveSeconds() {
        return 30;
    }

    @Override
    public ParallelExecutionConfiguration createConfiguration(ConfigurationParameters configurationParameters) {
        return this;
    }
}
