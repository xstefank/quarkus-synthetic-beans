package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.acme.beans.MyCustomBean;
import org.acme.beans.extension.runtime.beans.ExtensionBean;

@Path("/hello")
public class GreetingResource {

    @Inject
    MyCustomBean myCustomBean;

    @Inject
    ExtensionBean extensionBean;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        System.out.println("Hello from " + myCustomBean.hello());
        System.out.println("Hello from " + extensionBean.hello());

        return "hello";
    }
}
