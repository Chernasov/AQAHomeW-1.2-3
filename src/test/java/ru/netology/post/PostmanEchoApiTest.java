package ru.netology.post;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoApiTest {
    @Test
    void shouldReturnPost() {
    given()
            .baseUri("https://postman-echo.com")
            .body("some data")
       .when()
            .post("/post")
       .then()
            .statusCode(200)
            .body("data", equalTo("\"some data\""))
       ;
    }
}
