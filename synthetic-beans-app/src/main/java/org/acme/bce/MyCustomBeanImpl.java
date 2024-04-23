package org.acme.bce;

import org.acme.beans.MyCustomBean;

class MyCustomBeanImpl implements MyCustomBean {
    private String hello;

    public MyCustomBeanImpl(String hello) {
        this.hello = hello;
    }

    @Override
    public String hello() {
        return hello;
    }
}
