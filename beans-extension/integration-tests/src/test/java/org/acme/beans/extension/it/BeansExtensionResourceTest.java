package org.acme.beans.extension.it;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class BeansExtensionResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/beans-extension")
                .then()
                .statusCode(200)
                .body(is("Hello beans-extension"));
    }
}
