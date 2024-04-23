package org.acme.beans.extension.deployment;

import io.quarkus.arc.deployment.SyntheticBeanBuildItem;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.annotations.ExecutionTime;
import io.quarkus.deployment.annotations.Record;
import io.quarkus.deployment.builditem.FeatureBuildItem;
import org.acme.beans.extension.runtime.beans.ExtensionBean;
import org.acme.beans.extension.runtime.recorder.ExtensionBeanRecorder;

class BeansExtensionProcessor {

    private static final String FEATURE = "beans-extension";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }

    @BuildStep
    @Record(ExecutionTime.STATIC_INIT)
    SyntheticBeanBuildItem syntheticBeans(ExtensionBeanRecorder recorder) {
        return SyntheticBeanBuildItem.configure(ExtensionBean.class)
            .runtimeValue(recorder.createExtensionBean())
            .done();
    }
}
