$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/login.feature");
formatter.feature({
  "name": "Tutorials Ninja Login check",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To Verify the Login Functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is already on Ninja page",
  "keyword": "Given "
});
formatter.match({
  "location": "Logindefs.user_is_already_on_Ninja_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on My account user is able to see Login button",
  "keyword": "When "
});
formatter.match({
  "location": "Logindefs.user_clicks_on_My_account_user_is_able_to_see_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "Logindefs.user_clicks_on_the_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User lands on the Login page",
  "keyword": "And "
});
formatter.match({
  "location": "Logindefs.user_lands_on_the_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the email address",
  "keyword": "Then "
});
formatter.match({
  "location": "Logindefs.user_enters_the_email_address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the password",
  "keyword": "And "
});
formatter.match({
  "location": "Logindefs.user_enters_the_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Logindefs.user_clicks_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User must be on the account page",
  "keyword": "Then "
});
formatter.match({
  "location": "Logindefs.user_must_be_on_the_account_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on account button",
  "keyword": "Then "
});
formatter.match({
  "location": "Logindefs.user_clicks_on_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the Logout button",
  "keyword": "And "
});
formatter.match({
  "location": "Logindefs.user_clicks_on_the_Logout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User must be on the Logout page",
  "keyword": "Then "
});
formatter.match({
  "location": "Logindefs.user_must_be_on_the_Logout_page()"
});
formatter.result({
  "status": "passed"
});
});