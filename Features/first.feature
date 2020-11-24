Feature: Tutorials Ninja Page Check

@smoke
Scenario: To Verify Ninja page is displayed
    Given User is already on the Ninja Page
    Then User must be able to see the correct page title
   
@multiple 
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
	| DBoss | Great123 | Dbossgreat47123@xyz.com |8408718271| DarshanKA47 | DarshanKA47 |

@login
Scenario: To Verify the Login Functionality
    Given User is already on Ninja page
    When User clicks on My account user is able to see Login button
    And User clicks on the Login Button
    And User lands on the Login page
    Then User enters the email address
    And User enters the password
    And User clicks on the login button
    Then User must be on the account page
    Then User clicks on account button
    And User clicks on the Logout button
    Then User must be on the Logout page



  
	
	
	
