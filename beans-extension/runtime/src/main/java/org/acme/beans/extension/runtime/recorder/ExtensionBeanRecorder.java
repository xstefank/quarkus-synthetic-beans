package org.acme.beans.extension.runtime.recorder;

import io.quarkus.runtime.RuntimeValue;
import io.quarkus.runtime.annotations.Recorder;
import org.acme.beans.extension.runtime.beans.ExtensionBean;

@Recorder
public class ExtensionBeanRecorder {

    public RuntimeValue<ExtensionBean> createExtensionBean() {
        return new RuntimeValue<>(() -> "synthetic extension bean");
    }
}

