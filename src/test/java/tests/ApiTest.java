package tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ApiTest {

    static{
        RestAssured.baseURI="https://jsonplaceholder.typicode.com";
    }

    @Test
    void testGetPostBy(){
        given().when()
                .get("/posts/1").
                then().statusCode(200).
                body("id",equalTo(1)).
                body("title",not(emptyString()));
    }
    @Test
    void testCreatePost() {
        String requestBody = """
            {
              "title": "SDET Portfolio",
              "body": "Rest Assured project",
              "userId": 101
            }
            """;

        given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("/posts")
                .then()
                .statusCode(201)
                .body("title", equalTo("SDET Portfolio"))
                .body("userId", equalTo(101));
    }
}
