/**
 * 
 */
package com.SLJ.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

/**
 * @author Rajesh Thakur
 *
 */
@DefaultUrl("https://uat.larsonjuhl.com/")
public class UATPopupPage extends PageObject {
	@FindBy(id = "cUserName")
	public WebElementFacade UserName;
	@FindBy(id = "cUserPass")
	public WebElementFacade UserPassword;
	@FindBy(id = "CheckForValidUser")
	public WebElementFacade ClickContinue;
	
	public void loginPopup(String userName, String password) throws InterruptedException{
		System.out.println("Login Popup Method");
		System.out.println("User:  "+userName+"  Password:  "+password);
		UserName.type(userName);
		UserPassword.type(password);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void ClickContinue() throws InterruptedException{
		ClickContinue.click();
		Thread.sleep(5000);
	}
}
