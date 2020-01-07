package utils;


import net.serenitybdd.rest.SerenityRest;
import org.junit.Assert;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class Validation {

    //validasi status code
    public static void statuscode (int code) {
        SerenityRest.then().statusCode(code);
    }
    
    // validasi status message
    public static void ValidationMessage (String message,String title){
        String message_body = SerenityRest
                .then()
                .extract()
                .path("message.body");

        String title_body = SerenityRest
                .then()
                .extract()
                .path("message.title");
        Assert.assertTrue(message_body.equals(message));
        Assert.assertTrue(title_body.equals(title));
    }

    // validasi status message with array
    public static void ValidationMessageArray (String message,String title){
        String message_body = SerenityRest
                .then()
                .extract()
                .path("message.body[0]");

        String title_body = SerenityRest
                .then()
                .extract()
                .path("message.title");
        Assert.assertTrue(message_body.equals(message));
        Assert.assertTrue(title_body.equals(title));
    }

    //validasi json schema
    public static void ValidationJSONSchema (String source) {
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath(source));
    }

    // validasi status warning message
    public static void ValidationWarningMessage (String message,String title){
        String message_body = SerenityRest
                .then()
                .extract()
                .path("message.body[0]");
      
        String title_body = SerenityRest
                .then()
                .extract()
                .path("message.title");
        Assert.assertTrue(message_body.equals(message));
        Assert.assertTrue(title_body.equals(title));
    }

    //validasi rescode
    public static void ValidationRescode(String expected_rc) {
        String rescode= SerenityRest
                .then()
                .extract()
                .path("rescode");

        Assert.assertEquals(expected_rc,rescode);
    }
        
}
