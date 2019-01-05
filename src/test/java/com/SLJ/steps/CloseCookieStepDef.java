
package com.SLJ.steps;

import com.SLJ.steps.LJ.CountrySelectorSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * @author Rajesh Thakur
 *
 */
public class CloseCookieStepDef {
	@Steps(shared=true)
	CountrySelectorSteps CS_steps;

	@Given("^user on LarsonJuhl Popup Page$")
	public void user_on_LarsonJuhl_Popup_Page() throws Throwable {		
		CS_steps.openHomePage();
	}

	@When("^user clicks on close cookie button$")
	public void user_Clicks_on_Close_Cookie_Button() throws Throwable  {
		CS_steps.closeCookie();
	}
	
	@Then("^user should see Model Popup$")
	public void user_should_see_Model_Popup() throws Throwable {		
	    Thread.sleep(5000);		
	}

}
