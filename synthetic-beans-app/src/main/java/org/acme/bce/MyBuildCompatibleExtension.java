package org.acme.bce;

import jakarta.enterprise.inject.build.compatible.spi.BuildCompatibleExtension;
import jakarta.enterprise.inject.build.compatible.spi.Synthesis;
import jakarta.enterprise.inject.build.compatible.spi.SyntheticComponents;
import org.acme.beans.MyCustomBean;

public class MyBuildCompatibleExtension implements BuildCompatibleExtension {

    @Synthesis
    void synthesis(SyntheticComponents syntheticComponents) {
        syntheticComponents.addBean(MyCustomBeanImpl.class)
            .type(MyCustomBean.class)
            .createWith(MyCustomBeanCreator.class);
    }

}
