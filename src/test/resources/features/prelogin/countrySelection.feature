@CountrySelector
Feature: Select locale from Country Selector Page
	As a Valid user
	I want to select country locale as per my geographic location
	So that I want to see Home Page
	
	Scenario: Select Locale from country selector page
		Given user is on Country Selector page
		When  user selects country from page
		Then  user should see Popup Page
		
	Scenario: Close Cookie on popup page
		Given user on LarsonJuhl Popup Page
		When  user clicks on close cookie button
		Then  user should see Model Popup
		
	Scenario Outline: Login to the actual shoping site
		Given user enters "<userName>" and "<password>"
		When  user clicks continue button
		Then  user should see website home page	
		
	Examples: Login Popup Details
        |     userName    | password    |
        |     larson      | larson      |		 