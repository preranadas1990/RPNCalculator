package test.java;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RPNStepFiles {
	@Given("^Two numbers followed by '+' operator.$")
	public void Two_numbers_followed_by_operator() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^(\\d+) (\\d+) + are added$")
	public void _are_added(int arg1, int arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^result should be (\\d+)$")
	public void result_should_be(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

}
