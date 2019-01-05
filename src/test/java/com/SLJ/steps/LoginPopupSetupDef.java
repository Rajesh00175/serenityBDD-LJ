/**
 * 
 */
package com.SLJ.steps;
import com.SLJ.custommethods.GenericMethods;
import com.SLJ.pages.UATPopupPage;
import com.SLJ.steps.LJ.CountrySelectorSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
/**
 * @author Rajesh Thakur
 *
 */
public class LoginPopupSetupDef {
	GenericMethods GM =new GenericMethods();
	CountrySelectorSteps CS_steps;
	UATPopupPage POPUPLOGIN;
	
	@Given("^user enters \"([^\\\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_username_and_password(String userName, String password) throws Throwable {	
		System.out.println("Login Popup Setup Def");
		System.out.println("User:  "+userName+"  Password:  "+password);
		POPUPLOGIN.loginPopup(userName, password);
		//CS_steps.loginToSite(userName, password);
	}

	@When("^user clicks continue button$")
	public void user_clicks_continue_button() throws Throwable {		 
		POPUPLOGIN.ClickContinue();
	}
	
	@Then("^user should see website home page$")
	public void user_should_see_website_home_page() throws Throwable {
	    Thread.sleep(5000);
	}
}
