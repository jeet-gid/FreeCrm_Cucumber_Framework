$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Company.feature");
formatter.feature({
  "line": 1,
  "name": "Test FreeCrm  Company Add Search Feature",
  "description": "",
  "id": "test-freecrm--company-add-search-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Create a New Company for a loggedin user",
  "description": "",
  "id": "test-freecrm--company-add-search-feature;create-a-new-company-for-a-loggedin-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user is on FreeCrm login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user loggedin to FreeCrm",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user should be on homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "User Create a New Company",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user closes the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LogInStepDefintion.user_is_on_FreeCrm_login_page()"
});
formatter.result({
  "duration": 20035188022,
  "status": "passed"
});
formatter.match({
  "location": "LogInStepDefintion.user_loggedin_to_FreeCrm()"
});
formatter.result({
  "duration": 11090226410,
  "status": "passed"
});
formatter.match({
  "location": "LogInStepDefintion.user_should_be_on_homepage()"
});
formatter.result({
  "duration": 24582083,
  "status": "passed"
});
formatter.match({
  "location": "CompanyStepDefinition.user_Create_a_New_Company()"
});
formatter.result({
  "duration": 2564446428,
  "status": "passed"
});
formatter.match({
  "location": "LogInStepDefintion.user_closes_the_browser()"
});
formatter.result({
  "duration": 3938625852,
  "status": "passed"
});
formatter.uri("logIn.feature");
formatter.feature({
  "line": 1,
  "name": "Test FreeCrm LogIn",
  "description": "",
  "id": "test-freecrm-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Test FreeCrm LogIn with valid credentials",
  "description": "",
  "id": "test-freecrm-login;test-freecrm-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user is on FreeCrm login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user loggedin to FreeCrm",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user should be on homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user closes the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LogInStepDefintion.user_is_on_FreeCrm_login_page()"
});
formatter.result({
  "duration": 18967985419,
  "status": "passed"
});
formatter.match({
  "location": "LogInStepDefintion.user_loggedin_to_FreeCrm()"
});
formatter.result({
  "duration": 7163140265,
  "status": "passed"
});
formatter.match({
  "location": "LogInStepDefintion.user_should_be_on_homepage()"
});
formatter.result({
  "duration": 21428318,
  "status": "passed"
});
formatter.match({
  "location": "LogInStepDefintion.user_closes_the_browser()"
});
formatter.result({
  "duration": 241332067,
  "status": "passed"
});
});