Feature: Tutorials Ninja Login check

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