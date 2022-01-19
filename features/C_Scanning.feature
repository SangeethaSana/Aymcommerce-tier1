@C_Scanning
Feature: C_Scanning
  Scanning the reward code

Scenario Outline: scanning-User will get three options to scan the code
Given Scan with QR code option is available
When Redirects to scan with PIN Code from the Camera
Then Type in the scan code option is available

Scenario Outline: scanning-Redirects to Diapers and tubs screen
Given User clicks on Scanning option in home page
When Select Diapers and tubs - Lands on the Scanning camera page
Then Type scan code option is available
And Redirects to Type in the diapers code Screen

Scenario Outline: scanning-Redirects to Other Wipes Pack screen
Given User clicks on Scanning option in home screen
When Select Wipes and packs - Lands on the Scanning camera page 
Then Type scan code option is available in Camera screen
And Redirects to Type in the Other Wipes Pack Screen

Scenario Outline: scanning-Error message displays for invalid diapers code
Given User enters invalid diapers code
When User submits invalid diaper code 
Then Error Message displayed for invalid diaper code
And Respective error message is displayed for invalid diaper code

Scenario Outline: scanning-Error message displays for invalid wipes code
Given User enters invalid wipes code
When User submits invalid wipes code 
Then Error Message displayed for invalid wipes code
And Respective error message is displayed for invalid wipes code

Scenario Outline: scanning-Error message displays for used diapers code
Given User enters used diapers code
When User submits used diaper code 
Then Error Message displayed for used diaper code
And Respective error message is displayed for used diaper code

Scenario Outline: scanning-Error message displays for used wipes code
Given User enters used wipes code
When User submits used wipes code 
Then Error Message displayed for used wipes code
And Respective error message is displayed for used wipes code

@failed
Scenario Outline: scanning-User can get reward points with valid diaper code
Given User enters valid diaper code
When User submits valid diaper code 
Then Success message displayed for valid diapercode
And User gets reward cash for valid diapercode

@failed
Scenario Outline: scanning-User can get reward points with valid wipes code
Given User enters valid wipes code
When User submits valid wipes code 
Then Success message displayed for valid wipescode
And User gets reward cash for valid wipescode


Scenario Outline: scanning-User can view code inside the pack by tapping on “Where’s the code” option on the Diapers and Wipes Tubs screen.
Given User redirects to Diapers and wipers tub screen
When User views “Where’s the code” option on the Diapers and Wipes Tubs screen  
Then Redirected to “Where’s the code” screen from Diapers and Wipes Tubs screen
And User can view the guidance to find the code for Diapers and Wipes Tubs

Scenario Outline: scanning-User can view code inside the pack by tapping on “Where’s the code” option on the Other Wipes Packs screen.
Given User redirects to Other Wipes Packs screen
When User views “Where’s the code” option on the Other Wipes Packs screen  
Then Redirected to “Where’s the code” screen from Other Wipes Packs screen
And User can view the guidance to find the code for Other Wipes Packs