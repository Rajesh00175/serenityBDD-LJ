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
public class CountrySelectorPage extends PageObject {
	@FindBy(xpath = "/html/body/form/main/div/div/div/div/div/div/div/div/div[1]/div[2]/div/ul/li[3]/a/span")
	public WebElementFacade CountrySelectorUS;	
}
