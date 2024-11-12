Feature: Explore the Map

Scenario: Validate user is able to explore the maps

Given Browser should be launched and url should be navigated and Pop up handled
When User should be able to click on Homestays and villas link
And User should be navigated to Homestays and villas page
When User should be able to click on city lable option
And User should be able to enter city name and select the city name
And User should be able to click on the check-in and select the date
And User should be able to click on the check-out and select the date
And User should be able to click on the Guests and select no of guests 
And User should be able to click on Apply button
And User is able to click on the search button
And User should be navigate to the Banglore properties
Then Click on the explore maps Option
And Click on the "+" button to zoom the Location
And Close the Map
