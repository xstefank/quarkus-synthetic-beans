package org.acme.beans.extension.deployment;

import io.quarkus.arc.deployment.SyntheticBeanBuildItem;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.annotations.ExecutionTime;
import io.quarkus.deployment.annotations.Record;
import io.quarkus.deployment.builditem.FeatureBuildItem;
import org.acme.beans.extension.runtime.ExtensionBean;
import org.acme.beans.extension.runtime.ExtensionBeanRecorder;

class BeansExtensionProcessor {

    private static final String FEATURE = "beans-extension";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }

    @BuildStep
    @Record(ExecutionTime.STATIC_INIT)
    SyntheticBeanBuildItem syntheticBeans(ExtensionBeanRecorder recorder, ExtensionsConfig extensionsConfig) {
        return SyntheticBeanBuildItem.configure(ExtensionBean.class)
            .runtimeValue(recorder.createExtensionBean(extensionsConfig.property1,
                extensionsConfig.property2, extensionsConfig.property3))
            .done();
    }
}
