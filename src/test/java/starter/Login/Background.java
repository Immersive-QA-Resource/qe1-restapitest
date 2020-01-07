package starter.Login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;

public class Background {

    @Given("some other start condition background")
    public void some_other_start_condition_background() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Serenity.setSessionVariable("sVar").to("test");
        System.out.println("Background");
    }

    @When("something is else done background")
    public void something_is_else_done_background() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Background");
    }

    @Then("something else should happen background")
    public void something_else_should_happen_background() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Background");
    }

}
