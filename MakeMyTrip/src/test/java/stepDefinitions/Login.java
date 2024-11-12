package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;

public class Login {

	WebDriver driver=DriverFactory.getDriver();
	
	
	@When("User should able to give Mobile number")
	public void user_should_able_to_give_mobile_number() {
	    
	}
	
	@When("User is able to click on Continue button")
	public void user_is_able_to_click_on_continue_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User should click on login via password")
	public void user_should_click_on_login_via_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should enter valid password")
	public void user_should_enter_valid_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User is able to click on Login button")
	public void user_is_able_to_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Verify user should be logged in")
	public void verify_user_should_be_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
