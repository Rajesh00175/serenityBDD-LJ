/**
 * 
 */
package com.SLJ.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

/**
 * @author Rajesh Thakur
 *
 */
@DefaultUrl("https://uat.larsonjuhl.com/")
public class CloseCookiePage extends PageObject {
	@FindBy(xpath="/html/body/form/div[7]/footer/div[3]/div/div/div/div/div/div[2]/span")
	public WebElementFacade CloseCookie;	
}
