Feature: Login to Application

Scenario: Validate user is able to login to the application

Given Browser should be launched and url should be navigated
When User should able to give Mobile number
And User is able to click on continue button
And User should click on login via password
Then  User should enter valid password
And User is able to click on Login button
And Verify user should be logged in to Application