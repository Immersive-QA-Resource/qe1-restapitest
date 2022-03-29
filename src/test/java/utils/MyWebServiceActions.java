package utils;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;

public class EnvironmentSpecificConfiguration {
    private EnvironmentVariables environmentVariables;

    @Step
    public void invoke_my_webservice() {
        String webserviceEndpoint = EnvironmentSpecificConfiguration.from(environmentVariables)
                .getProperty("my.webservice.endpoint");

        environmentVariables.optionalProperty("restapi.baseurl")
                .orElseThrow(IllegalArgumentException::new);
    }
}
