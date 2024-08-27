$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/Facebook.feature");
formatter.feature({
  "name": "Facebook Application - Create a new Account",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Facebook"
    }
  ]
});
formatter.background({
  "name": "User launches and click Create Account",
  "description": "",
  "keyword": "Background"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches the facebook application \"https://www.facebook.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "org.stepdefinition.Facebook.user_launches_the_facebook_application(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User validates the Url \"https://www.facebook.com/\"",
  "keyword": "And "
});
formatter.match({
  "location": "org.stepdefinition.Facebook.user_validates_the_url(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Create a new account",
  "keyword": "And "
});
formatter.match({
  "location": "org.stepdefinition.Facebook.user_clicks_create_a_new_account()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create a new account in facebook",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Facebook"
    },
    {
      "name": "@newaccount"
    },
    {
      "name": "@fb"
    }
  ]
});
formatter.step({
  "name": "User enters the first name with one dim list",
  "rows": [
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "org.stepdefinition.Facebook.user_enters_the_first_name_with_one_dim_list(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the sur name with one dim map",
  "rows": [
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "org.stepdefinition.Facebook.user_enters_the_sur_name_with_one_dim_map(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the mobile number \"8754843316\"",
  "keyword": "And "
});
formatter.match({
  "location": "org.stepdefinition.Facebook.user_enters_the_mobile_number(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the password",
  "keyword": "And "
});
formatter.match({
  "location": "org.stepdefinition.Facebook.user_enters_the_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the date of birth with one dim map",
  "rows": [
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "org.stepdefinition.Facebook.user_enters_the_date_of_birth_with_one_dim_map(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select the gender",
  "keyword": "And "
});
formatter.match({
  "location": "org.stepdefinition.Facebook.user_select_the_gender()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User take screenshot",
  "keyword": "And "
});
formatter.match({
  "location": "org.stepdefinition.Facebook.user_take_screenshot()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Signup",
  "keyword": "Then "
});
formatter.match({
  "location": "org.stepdefinition.Facebook.user_clicks_signup()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
});