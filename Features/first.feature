Feature: Tutorials Ninja Page Check

@smoke
Scenario: To Verify Ninja page is displayed
    Given User is already on the Ninja Page
    Then User must be able to see the correct page title
    
Scenario Outline: To Register user 
	Given User is already on the Ninja Page
	When User hovers over the Account and clicks on it
	Then User must be able to able to click on Register button
	When User clicks on Register button user must be on Registration page
	Then User Enters the values "<fname>" and "<lname>" and "<email>" and "<phone>" and "<password>" and "<cnfpass>"
	And User accepts the terms
	And Clicks on Continue Button
	Then User is on the Account confirmation page
    Then User verifies the title of the page
    And User verifies success text
    Then User clicks on continue button
	
	
	Examples:
	| fname | lname | email | phone | password | cnfpass |
	| Dboss47 | Great | Dbossgreat47@xyz.com |8408718271| DarshanKA47 | DarshanKA47 |
	



  
	
	
	
