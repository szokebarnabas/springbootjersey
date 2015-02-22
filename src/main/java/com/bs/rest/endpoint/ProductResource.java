package com.bs.rest.endpoint;

import com.bs.rest.dto.ProductDto;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Component
@Path("/product")
@Produces(MediaType.APPLICATION_JSON)
public class ProductResource {

    private ProductDto productDto;

    @PostConstruct
    private void init() {
        productDto = new ProductDto("Test product", 15D);
    }

    @GET
    public ProductDto getProduct() {
        return productDto;
    }

}