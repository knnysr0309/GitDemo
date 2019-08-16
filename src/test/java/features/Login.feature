Feature: Application Login

Scenario: Home page default login
Given user is on NetBank landing page
When user login into application with "ken" and "12345"
Then home page is populated 
And cards are displayed "true"


Scenario: Home page default login
Given user is on NetBank landing page
When user login into application with "jon" and "56789"
Then home page is populated 
And cards are displayed "false"