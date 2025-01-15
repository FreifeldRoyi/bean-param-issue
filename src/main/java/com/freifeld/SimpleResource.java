package com.freifeld;

import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.validation.Valid;
import jakarta.ws.rs.BeanParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("simple")
@RunOnVirtualThread
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
public class SimpleResource {
    @GET
    public String helloWorld() {
        return "Hello, World!";
    }

    @GET
    @Path("{min}/{max}")
    public String helloWorld2(
            @BeanParam
            @Valid
            SimpleBeanParam param
    ) {
        return String.format("Hello params! %s %s", param.max(), param.min());
    }
}
