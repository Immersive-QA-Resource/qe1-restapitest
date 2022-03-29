package starter;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
//        features = "classpath:features"
        features = "src/test/resources/features/Login/f1.feature"
)
public class CucumberTestSuite {}
