package org.acme.beans.extension.deployment;

import io.quarkus.runtime.annotations.ConfigItem;
import io.quarkus.runtime.annotations.ConfigRoot;

@ConfigRoot(name = "custom-extensions")
public final class ExtensionsConfig {

    /**
     * property1
     */
    @ConfigItem(defaultValue = "default property 1")
    String property1;

    /**
     * property2
     */
    @ConfigItem(defaultValue = "999")
    int property2;

    /**
     * property3
     */
    @ConfigItem(defaultValue = "999.00")
    double property3;

}
