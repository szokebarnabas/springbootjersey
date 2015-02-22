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

Endpoints
---------

The ProductResource endpoint returns the JSON representation of the ProductDto:

<pre><code>http://localhost:8080/api/product</code></pre>

Response:
<pre><code>{"productName":"Test product","price":15.0}</code></pre>

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
