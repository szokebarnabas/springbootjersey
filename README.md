# springbootjersey
Simple REST+JSON application using Spring Boot with JAX-RS/Jersey

Technology stack:
- Spring Boot 1.2.1
- Jersey 2.14
- rest-assured
- Maven

Running
-------
<pre><code>mvn spring-boot:run</code></pre>

Usage
-----

Test the ProductResource endpoint:
<pre><code>curl http://localhost:8080/api/product</code></pre>

You receive the following JSON response:
```json
{"productName":"Test product","price":15.0}
```

Integration test with rest-assured
----------------------------------

```java
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

```
