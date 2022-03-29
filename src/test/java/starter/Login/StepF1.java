package starter.Login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import utils.Endpoint;
import utils.MyWebServiceActions;
import utils.Request;
import utils.Validation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class StepF1 {

    @Steps
    MyWebServiceActions myWebServiceActions;

    @Given("some start condition")
    public void some_start_condition() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Map<String, Object> jsonAsMap = new HashMap<>();
        jsonAsMap.put("email", "eve.holt@reqres.in");
        jsonAsMap.put("password", "cityslicka");


        Map<String, Object> json = new HashMap<>();
        json.put("userId","nilainya");
        json.put("collectionOfIsbns",new ArrayList<Object>() {
            {
                add(new HashMap<String,Object>(){
                    {
                        put("isbn","nilainya");
                    }
                });
            }
        });



        Request.Post(jsonAsMap, Endpoint.LOGIN, 200);

        String token = SerenityRest.then().extract().path("token");
        System.out.println("token = "+token);

//        SerenityRest.then().body(matchesJsonSchemaInClasspath("JSONSchema/login.json"));

        myWebServiceActions.invoke_my_webservice();

//        Validation.ValidationJSONSchema("src/test/resources/JSONSchema/login.json");

//        Thread.sleep(5000);
//        String sCall = Serenity.sessionVariableCalled("sVar");
//        System.out.println("This is Session Variable = " + sCall);
//        Assert.assertTrue(sCall.equals("test"));
    }

    @When("something is done")
    public void something_is_done() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(1000);
        System.out.println("f1 b");
    }

    @Then("something should happen")
    public void something_should_happen() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(1000);
        System.out.println("f1 c");
    }

}
