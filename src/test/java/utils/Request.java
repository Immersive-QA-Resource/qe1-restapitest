package utils;

import net.serenitybdd.rest.SerenityRest;

import java.util.HashMap;
import java.util.Map;

public class Request {

    public static void Get (String endpoint, String token, int statusCode){
        SerenityRest
                .given()
                .contentType("application/json")
                .header("Authorization", "Bearer "+token)
                .when()
                .get(endpoint)
                .then()
                .log()
                .ifValidationFails()
                .statusCode(statusCode);
    }

    public static void Post (Map body, String endpoint, String token, int statusCode){
        SerenityRest
                .given()
                .contentType("application/json")
                .header("Authorization", "Bearer "+token)
                .body(body)
                .when()
                .post(endpoint)
                .then()
                .log()
                .ifValidationFails()
                .statusCode(statusCode);
    }

    public static void Delete (String endpoint, String token, int statusCode) {
        SerenityRest
                .given()
                .contentType("application/json")
                .header("Authorization", "Bearer " + token)
                .when()
                .delete(endpoint)
                .then()
                .log()
                .ifValidationFails()
                .statusCode(statusCode);
    }
      
    public static void Put (Map body, String endpoint, String token, int statusCode){
        SerenityRest
                .given()
                .contentType("application/json")
                .header("Authorization", "Bearer "+token)
                .body(body)
                .when()
                .post(endpoint)
                .then()
                .log()
                .ifValidationFails()
                .statusCode(statusCode);
    }

}