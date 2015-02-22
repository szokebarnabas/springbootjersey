package com.bs.rest.dto;

import java.io.Serializable;

public class ProductDto implements Serializable{

    private final String productName;
    private final Double price;

    public ProductDto(String productName, Double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public Double getPrice() {
        return price;
    }
}
