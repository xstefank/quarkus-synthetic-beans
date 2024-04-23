package org.acme.bce;

import org.acme.beans.MyCustomBean;

class MyCustomBeanImpl implements MyCustomBean {
    private String property1;
    private int property2;
    private double property3;

    public MyCustomBeanImpl(String property1, int property2, double property3) {
        this.property1 = property1;
        this.property2 = property2;
        this.property3 = property3;
    }

    @Override
    public String hello() {
        return "%s %d %.2f".formatted(property1, property2, property3);
    }
}
