package org.acme.beans.extension.runtime;

import io.quarkus.runtime.RuntimeValue;
import io.quarkus.runtime.annotations.Recorder;

@Recorder
public class ExtensionBeanRecorder {



    public RuntimeValue<ExtensionBean> createExtensionBean(String property1, int property2, double property3) {
        return new RuntimeValue<>(new ExtensionBean() {

            @Override
            public String hello() {
                return "%s %d %.2f".formatted(property1, property2, property3);
            }
        });
    }
}

