package master.Login;

import MyUtils.Endpoint;
import MyUtils.Request;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.jbehave.core.steps.Steps;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class LoginSteps extends Steps {

    @Step
    public Map reqBody(){
        Map<String, Object> jsonMap = new HashMap<>();
        jsonMap.put("email", "eve.holt@reqres.in");
        jsonMap.put("password", "cityslicka");
        return jsonMap;
    }

    @Step
    public void loginReqres(){
        Request.Post(reqBody(), Endpoint.LOGIN, 200);
    }

    @Step
    public void validation(){
        SerenityRest
                .then()
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath("JSONSchema/Login.json"));
    }
}
