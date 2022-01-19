
Feature: B_Login
	Login into the applicaiton

#@changepassword
#Scenario Outline: Login-Verify that the Change Password feature is working properly via Login screen
#Given User clicks on Login option
#When Lands on the Login page
#Then User clicks forgot password link
#And User enters mail "<email>" and click send
#And User click forgot password link in mail and change password
#And User login with email "<email>" and new password "<newpassword>"
#And User clicks Login button

#Examples:
#|email|newpassword|
#|testaym007@gmail.com|Letmeinbuddy1234|	

#@changepassword
#Scenario Outline: Profile-Verify that the Change Password feature is working properly via Profile screen
#Given User lands on Home Screen 
#Then User lands on profile screen and click change password 
#And User clicks signout button profile
#Then User click forgot password link in mail and change password for profile
#And User login with email "<email>" and new password "<newpassword>"
#And User clicks Login button
#And User click Signout

#Examples:
#|email|newpassword|
#|testaym007@gmail.com|Testingbuddy123|	

Scenario Outline: Login-Login to the application with valid credentials
Given User clicks on Login option
When Lands on the Login page
Then User enter login email "<email>" and valid password "<password>"
And User clicks Login button

Examples:
|email|password|
|m.anandhi16@gmail.com|Pampers123|
