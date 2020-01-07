package starter.Login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import org.junit.Assert;

public class StepF1 {

    @Given("some start condition")
    public void some_start_condition() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(5000);
        String sCall = Serenity.sessionVariableCalled("sVar");
        System.out.println("This is Session Variable = " + sCall);
        Assert.assertTrue(sCall.equals("test"));
        System.out.println("f1 a");
    }

    @When("something is done")
    public void something_is_done() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(5000);
        System.out.println("f1 b");
    }

    @Then("something should happen")
    public void something_should_happen() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(5000);
        System.out.println("f1 c");
    }

}
