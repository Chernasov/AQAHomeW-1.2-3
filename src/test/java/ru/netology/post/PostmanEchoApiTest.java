package ru.netology.post;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

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
       ;
    }
}
