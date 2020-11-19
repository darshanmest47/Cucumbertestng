$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/first.feature");
formatter.feature({
  "name": "Tutorials Ninja Page Check",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To Verify Ninja page is displayed",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User is already on the Ninja Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefs.user_is_already_on_the_ninja_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User must be able to see the correct page title",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefs.user_must_be_able_to_see_the_correct_page_title()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To Register user",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is already on the Ninja Page",
  "keyword": "Given "
});
formatter.step({
  "name": "User hovers over the Account and clicks on it",
  "keyword": "When "
});
formatter.step({
  "name": "User must be able to able to click on Register button",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on Register button user must be on Registration page",
  "keyword": "When "
});
formatter.step({
  "name": "User Enters the values \"\u003cfname\u003e\" and \"\u003clname\u003e\" and \"\u003cemail\u003e\" and \"\u003cphone\u003e\" and \"\u003cpassword\u003e\" and \"\u003ccnfpass\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "User accepts the terms",
  "keyword": "And "
});
formatter.step({
  "name": "Clicks on Continue Button",
  "keyword": "And "
});
formatter.step({
  "name": "User is on the Account confirmation page",
  "keyword": "Then "
});
formatter.step({
  "name": "User verifies the title of the page",
  "keyword": "Then "
});
formatter.step({
  "name": "User verifies success text",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on continue button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "fname",
        "lname",
        "email",
        "phone",
        "password",
        "cnfpass"
      ]
    },
    {
      "cells": [
        "Dboss47",
        "Great",
        "Dbossgreat47@xyz.com",
        "8408718271",
        "DarshanKA47",
        "DarshanKA47"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To Register user",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is already on the Ninja Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefs.user_is_already_on_the_ninja_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User hovers over the Account and clicks on it",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefs.user_hovers_over_the_account_and_clicks_on_it()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User must be able to able to click on Register button",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefs.user_must_be_able_to_able_to_click_on_register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Register button user must be on Registration page",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefs.user_clicks_on_register_button_user_must_be_on_registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enters the values \"Dboss47\" and \"Great\" and \"Dbossgreat47@xyz.com\" and \"8408718271\" and \"DarshanKA47\" and \"DarshanKA47\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefs.user_enters_the_values_something_and_something_and_something_and_something_and_something_and_something(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User accepts the terms",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefs.user_accepts_the_terms()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks on Continue Button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefs.clicks_on_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is on the Account confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefs.user_is_on_the_account_confirmation_page()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected [Your Account Has Been Created!] but found [Register Account]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:137)\r\n\tat org.testng.Assert.assertEquals(Assert.java:118)\r\n\tat org.testng.Assert.assertEquals(Assert.java:453)\r\n\tat org.testng.Assert.assertEquals(Assert.java:463)\r\n\tat Step_defs.Stepdefs.user_is_on_the_account_confirmation_page(Stepdefs.java:67)\r\n\tat ✽.User is on the Account confirmation page(./Features/first.feature:16)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User verifies the title of the page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefs.user_verifies_the_title_of_the_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User verifies success text",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefs.user_verifies_success_text()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefs.user_clicks_on_continue_button()"
});
formatter.result({
  "status": "skipped"
});
});