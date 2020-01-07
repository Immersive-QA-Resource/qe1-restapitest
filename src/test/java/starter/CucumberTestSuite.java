package starter;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "classpath:features"
//        features = "/Users/sepulsa/Workspace-Private/ParallelSerenity/src/test/resources/features/Parallel/background.feature"
)
public class CucumberTestSuite {}
