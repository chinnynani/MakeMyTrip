Feature: Sort By

Scenario Outline: Validate user able to click on the sort by option

Given Browser should be launched and url should be navigated and Pop up handled
When User should be able to click on Homestays and villas link
And User should be navigated to Homestays and villas page
And User should be able to click on city lable option
And User should be able to enter city name and select the city name
And User should be able to click on the check-in and select the date
And User should be able to click on the check-out and select the date
And User should be able to click on the Guests and select no of guests 
And User should be able to click on Apply button
Then User is able to click on the search button
Then selecting <SortOption> should be displayed

Examples:
    | SortOption |
    | 1	|
    | 2	|
    | 3	|
    |	4	|
	
	
	