package test.java;

import org.testng.annotations.Test;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;

public class RPNStepFiles extends TestCase{
	int num1, num2;
	String operator;
	int result;
	
	@Given("^user enter (\\d+), (\\d+), \"([^\"]*)\"$")
	public void user_enter_(int arg1, int arg2, String arg3) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	   // throw new PendingException();
		num1 = arg1;
		num2 = arg2;
		operator = arg3;
	}

	@When("^calculate$")
	public void calculate() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	//    throw new PendingException();
		switch(operator){
		case "+": result = num1+num2;
		break;
		
		}
	}
	@Test
	@Then("^result should be (\\d+)$")
	public void result_should_be(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    assertEquals(arg1, result);
	}

	
}
