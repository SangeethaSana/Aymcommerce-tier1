Feature: A-Registration
  New user register into the applicaiton


Scenario: Registration-User register a new account
Given User open the application for registration
When Lands on the registration page for registration
Then User enter email and password for registration

Scenario: Registration-User register a new account
Given User clicks accept button for registration
When User enter details for registration

#@fbcheck
#Scenario: Registration-User register a new account using valid facebook credential
#Given User open the application for registration
#When Lands on the registration page for registration
#Then User redirects to for facebook registration
#And User enter email and password for valid facebook credential
#And User click login for facebook credentials




