Feature: Test FreeCrm LogIn 
Scenario: Test FreeCrm LogIn with valid credentials
Given user is on FreeCrm login page
When user loggedin to FreeCrm
Then user should be on homepage
Then user closes the browser

