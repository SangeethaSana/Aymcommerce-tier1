Feature: Profile
Update Profile and view Profile Menu
  
Scenario Outline: Profile-User view profile details
Given User open the application for profile
#Then User login to the application email "<email>" and password "<password>" for profile
And User navigate to profile screen
And User view first name and last name
Then User view item points history
Then user view settings CTA

Examples:
|email|password|
|test_aym_usautotest20222021@gmail.com|Letmeinbuddy123|


Scenario Outline: Profile-User view history
Given User open the application for profile
#Then User login to the application email "<email>" and password "<password>" for profile
And User navigate to profile screen
And User view history screen


Examples:
|email|password|
|test_aym_ukautotest169146@gmail.com|Letmeinbuddy123|

Scenario Outline: Profile-User about pampers cash
Given User open the application for profile
#Then User login to the application email "<email>" and password "<password>" for profile
And User navigate to profile screen
Then User view About Pampers cash


Examples:
|email|password|
|test_aym_ukautotest169146@gmail.com|Letmeinbuddy123|


Scenario Outline: Profile-User view updated points in profile
Given User open the application for profile
#Then User login to the application email "<email>" and password "<password>" for profile
And User navigate to profile screen
Then User view updated profile points


Examples:
|email|password|
|test_aym_ukautotest169146@gmail.com|Letmeinbuddy123|

@failed
Scenario Outline: Profile-Edit profile option is available
Given Profile setting option is available in Menu
When Redirects to Profile screen
Then Edit profile option is available

Examples:
|email|password|
|test_aym_ukautotest169146@gmail.com|Letmeinbuddy123|

@failed
Scenario Outline: Profile-User can update profile details
Given User can redirect to Edit profile screen
When User can change details
Then Updated details are available in Profile screen

Examples:
|email|password|
|test_aym_ukautotest169146@gmail.com|Letmeinbuddy123|

Scenario Outline: Profile-Contact Us option is available
Given Contact Us option is available in Menu
Then Redirects to Contact Us Screen

Examples:
|email|password|
|test_aym_ukautotest169146@gmail.com|Letmeinbuddy123|

Scenario Outline: Profile-Procter and Gamble option is available
Given Procter and Gamble option is available in Menu
Then Redirects to Procter and Gamble Screen

Examples:
|email|password|
|test_aym_ukautotest169146@gmail.com|Letmeinbuddy123|

Scenario Outline: Profile-Club and Cashback T&C option is available
Given Club and Cashback T&C option is available in Menu
Then Redirects to Club and Cashback T&C Screen

Examples:
|email|password|
|test_aym_ukautotest169146@gmail.com|Letmeinbuddy123|

Scenario Outline: Profile-Rewards T&C option is available
Given Rewards T&C option is available in Menu
Then Redirects to Rewards Screen

Examples:
|email|password|
|test_aym_ukautotest169146@gmail.com|Letmeinbuddy123|

Scenario Outline: Profile-Rewards FAQ option is available
Given Rewards FAQ option is available in Menu
Then Redirects to Rewards FAQ

Examples:
|email|password|
|test_aym_ukautotest169146@gmail.com|Letmeinbuddy123|

Scenario Outline: Profile-Privacy & Cookie Policy option is available
Given Privacy & Cookie Policy option is available in Menu
Then Redirects to Privacy & Cookie Policy

Examples:
|email|password|
|test_aym_ukautotest169146@gmail.com|Letmeinbuddy123|

@donot
Scenario Outline: Profile-Do not sell information option is available
Given Do not sell information option is available in Menu
Then Redirects to Do not sell information option

Examples:
|email|password|
|test_aym_ukautotest169146@gmail.com|Letmeinbuddy123|

@failed
Scenario Outline: Profile-Build no is available
Given  Build no is available in Menu
Then user verify Build no

Examples:
|email|password|
|test_aym_ukautotest169146@gmail.com|Letmeinbuddy123|