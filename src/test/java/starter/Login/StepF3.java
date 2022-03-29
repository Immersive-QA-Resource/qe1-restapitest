package starter.Login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import org.junit.Assert;

public class StepF3 {

    @Given("some other start condition oke")
    public void some_other_start_condition_oke() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        String sCall = Serenity.sessionVariableCalled("sVar");
        System.out.println("This is Session Variable = " + sCall);
        System.out.println("f3 a");
    }

    @When("something is else done oke")
    public void something_is_else_done_oke() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(5000);
        System.out.println("f3 b");
    }

    @Then("something else should happen oke")
    public void something_else_should_happen_oke() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(5000);
        System.out.println("f3 c");
    }

}
