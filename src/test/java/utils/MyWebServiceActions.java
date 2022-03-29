package utils;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;

public class MyWebServiceActions {

    private EnvironmentVariables environmentVariables;

    @Step
    public void invoke_my_webservice() {
        String webserviceEndpoint = EnvironmentSpecificConfiguration.from(environmentVariables)
                .getProperty("restapi.baseurl");

        System.out.println("Base URL Screenplay = "+webserviceEndpoint);

    }
}
