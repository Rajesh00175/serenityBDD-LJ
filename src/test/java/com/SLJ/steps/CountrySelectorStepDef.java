/**
 * 
 */
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
public class CountrySelectorStepDef {
	
	@Steps(shared=true)
	CountrySelectorSteps CS_steps;

	@Given("^user is on Country Selector page$")
	public void user_is_on_Country_Selector_page() throws Throwable {
		CS_steps.openHomePage();
	}

	@When("^user selects country from page$")
	public void user_selects_country_from_page() throws Throwable  {
		CS_steps.selectCountry();
	}
	
	@Then("^user should see Popup Page$")
	public void user_should_see_Popup_Page() throws Throwable {
	    Thread.sleep(5000);
	}
}
