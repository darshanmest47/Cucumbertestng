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
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: net::ERR_CONNECTION_TIMED_OUT\n  (Session info: chrome\u003d86.0.4240.198)\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027DESKTOP-QM44KM9\u0027, ip: \u0027192.168.43.96\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.198, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: C:\\Users\\Darshan\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:54128}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 9b0e083500d728f97fe5032bc3192045\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:273)\r\n\tat org.com.base.Testbase.initialize(Testbase.java:37)\r\n\tat Step_defs.Stepdefs.user_is_already_on_the_ninja_page(Stepdefs.java:51)\r\n\tat ✽.User is already on the Ninja Page(./Features/first.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User must be able to see the correct page title",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefs.user_must_be_able_to_see_the_correct_page_title()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
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
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: net::ERR_CONNECTION_TIMED_OUT\n  (Session info: chrome\u003d86.0.4240.198)\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027DESKTOP-QM44KM9\u0027, ip: \u0027192.168.43.96\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.198, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: C:\\Users\\Darshan\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:54151}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: dfb32417de4c13f1dc50eab8371b444f\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:273)\r\n\tat org.com.base.Testbase.initialize(Testbase.java:37)\r\n\tat Step_defs.Stepdefs.user_is_already_on_the_ninja_page(Stepdefs.java:51)\r\n\tat ✽.User is already on the Ninja Page(./Features/first.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User hovers over the Account and clicks on it",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefs.user_hovers_over_the_account_and_clicks_on_it()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User must be able to able to click on Register button",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefs.user_must_be_able_to_able_to_click_on_register_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on Register button user must be on Registration page",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefs.user_clicks_on_register_button_user_must_be_on_registration_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User Enters the values \"Dboss47\" and \"Great\" and \"Dbossgreat47@xyz.com\" and \"8408718271\" and \"DarshanKA47\" and \"DarshanKA47\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefs.user_enters_the_values_something_and_something_and_something_and_something_and_something_and_something(String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User accepts the terms",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefs.user_accepts_the_terms()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Clicks on Continue Button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefs.clicks_on_continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User is on the Account confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefs.user_is_on_the_account_confirmation_page()"
});
formatter.result({
  "status": "skipped"
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
formatter.after({
  "status": "passed"
});
});