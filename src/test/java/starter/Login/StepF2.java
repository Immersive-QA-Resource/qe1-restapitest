package starter.Login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepF2 {

    @Given("some other start condition")
    public void some_other_start_condition() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(5000);
        System.out.println("f2 a");
    }

    @When("something is else done")
    public void something_is_else_done() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(5000);
        System.out.println("f2 b");
    }

    @Then("something else should happen")
    public void something_else_should_happen() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(5000);
        System.out.println("f2 c");
    }

}
