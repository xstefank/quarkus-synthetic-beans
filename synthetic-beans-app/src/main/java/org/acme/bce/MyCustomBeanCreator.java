package org.acme.bce;

import jakarta.enterprise.inject.Instance;
import jakarta.enterprise.inject.build.compatible.spi.Parameters;
import jakarta.enterprise.inject.build.compatible.spi.SyntheticBeanCreator;

class MyCustomBeanCreator implements SyntheticBeanCreator<MyCustomBeanImpl> {

    @Override
    public MyCustomBeanImpl create(Instance lookup, Parameters params) {
        return new MyCustomBeanImpl("Synthetic custom bean");
    }
}
