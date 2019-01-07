package com.SLJ.steps.LJ;

import com.SLJ.pages.CloseCookiePage;
import com.SLJ.pages.CountrySelectorPage;
import com.SLJ.pages.UATPopupPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CountrySelectorSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	CountrySelectorPage CSP;
	CloseCookiePage CCP;
	UATPopupPage UATPopup;
	
	@Step
	public void openHomePage() {
		CSP.open();
        CSP.getDriver().manage().window().maximize();
	}
	
	@Step
	public void selectCountry() {
		CSP.CountrySelectorUS.click();
	}
	
	@Step
	public void closeCookie() {
		CCP.CloseCookie.click();
	}
	
	@Step
	public void loginToSite(String userName, String password) throws InterruptedException {
		System.out.println("Steps...");
		System.out.println("User:  "+userName+"  Password:  "+password);
		UATPopup.loginPopup(userName, password);
	}
	
	@Step
	public void clickContinue() throws InterruptedException {
		UATPopup.ClickContinue();
	}

}
