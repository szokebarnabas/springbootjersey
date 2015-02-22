package com.bs.rest.config;

import com.bs.rest.endpoint.ProductResource;
import org.glassfish.jersey.filter.LoggingFilter;
import org.springframework.stereotype.Component;
import org.glassfish.jersey.server.ResourceConfig;

@Component
public class JerseyConfig extends ResourceConfig {

    public static final String ENDPOINT_PACKAGE = "com.bs.rest.endpoint";

    public JerseyConfig() {
        packages(ENDPOINT_PACKAGE);
        register(ProductResource.class);
        register(LoggingFilter.class);
    }

}