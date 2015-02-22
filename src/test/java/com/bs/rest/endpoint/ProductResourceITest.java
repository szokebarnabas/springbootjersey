package com.bs.rest.endpoint;

import com.bs.rest.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static com.jayway.restassured.RestAssured.expect;
import static org.hamcrest.CoreMatchers.equalTo;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest("server.port=8080")
public class ProductResourceITest {

    @Test
    public void testGetProductFetchesSuccess() {
        expect().
                statusCode(200).
                body("productName", equalTo("Test product")).
                body("price", equalTo(15.0f)).
        when().
                get("/api/product");
    }
}