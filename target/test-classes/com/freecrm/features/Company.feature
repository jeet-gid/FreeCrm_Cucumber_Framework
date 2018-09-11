Feature: Test FreeCrm  Company Add Search Feature
Scenario: Create a New Company for a loggedin user
Given user is on FreeCrm login page
When user loggedin to FreeCrm
Then user should be on homepage
Then User Create a New Company
Then user closes the browser