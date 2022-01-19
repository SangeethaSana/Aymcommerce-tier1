Feature: Mybaby
  User views,edit,remove baby info
  
Scenario Outline: Mybaby-User view add baby name option
Given User open the application for mybaby
#Then User login to the application email "<email>" and password "<password>"
And User navigate to mybaby screen
Then user view add baby name option

Examples:
|email|password|
|m.anandhi16@gmail.com|Pampers123|


Scenario Outline: Mybaby-User add a baby leaving DOB empty
Given User open the application for mybaby in loginstate
And User navigate to mybaby screen
Then User taps add baby option
And User leaves DOB empty and try to add baby info
Then User views error message

Examples:
|email|password|
|test_aym_ukautotest169146@yopmail.com|Letmeinbuddy123|


Scenario Outline: Mybaby-User add a baby without entering baby name
Given User open the application for mybaby in loginstate
And User navigate to mybaby screen
Then User taps add baby option
And User adds baby DOB and save info
Then User view baby info

Examples:
|email|password|
|test_aym_ukautotest169146@yopmail.com|Letmeinbuddy123|


Scenario Outline: Mybaby-User add a baby with entering baby name
Given User open the application for mybaby in loginstate
And User navigate to mybaby screen
Then User taps add baby option
And User adds baby DOB name save info
Then User view baby info and name

Examples:
|email|password|
|test_aym_ukautotest169146@yopmail.com|Letmeinbuddy123|


Scenario Outline: Mybaby-User try to add a baby with future dob
Given User open the application for mybaby in loginstate
And User navigate to mybaby screen
Then User taps add baby option
And User adds baby future DOB
Then User view baby info

Examples:
|email|password|
|test_aym_ukautotest169146@yopmail.com|Letmeinbuddy123|


Scenario Outline: Mybaby-User add a baby with name gender DOB
Given User open the application for mybaby in loginstate
And User navigate to mybaby screen
Then User taps add baby option
And User adds name gender DOB
Then User view baby info

Examples:
|email|password|
|test_aym_ukautotest169146@yopmail.com|Letmeinbuddy123|


Scenario Outline: Mybaby-User remove a baby info
Given User open the application for mybaby in loginstate
And User navigate to mybaby screen
Then User taps a baby info
And User removes the baby info
Then User views only default baby


Examples:
|email|password|
|test_aym_ukautotest169146@yopmail.com|Letmeinbuddy123|


Scenario Outline: Mybaby-User taps to remove a baby
Given User open the application for mybaby in loginstate
And User navigate to mybaby screen
Then User taps a baby info
And User taps keep baby info


Examples:
|email|password|
|test_aym_ukautotest169146@yopmail.com|Letmeinbuddy123|


Scenario Outline: Mybaby-User edits babys name
Given User open the application for mybaby in loginstate
And User navigate to mybaby screen
Then User taps a baby info
And User edits babys name
Then User view updated name


Examples:
|email|password|
|test_aym_ukautotest169146@yopmail.com|Letmeinbuddy123|


Scenario Outline: Mybaby-User Adds A Past Due Date Of The Baby
Given User open the application for mybaby in loginstate
And User navigate to mybaby screen
Then user taps add due date baby
And User add the past due date of a baby
Then User view baby date as one day


Examples:
|email|password|
|test_aym_ukautotest169146@yopmail.com|Letmeinbuddy123|


Scenario Outline: Mybaby-User Adds A future Due Date Of The Baby
Given User open the application for mybaby in loginstate
And User navigate to mybaby screen
Then user taps add due date baby
And User add the future due date of a baby
Then User view baby info

Examples:
|email|password|
|test_aym_ukautotest169146@yopmail.com|Letmeinbuddy123|


Scenario Outline: Mybaby-User Adds A Baby from Parenting Screen
Given User open the application for mybaby in loginstate
And User navigate to parenting screen
Then User add a baby

Examples:
|email|password|
|test_aym_ukautotest169146@yopmail.com|Letmeinbuddy123|


Scenario Outline: Mybaby-Mybaby flow cleanup
Given User open the application for mybaby in loginstate
And User navigate to mybaby screen
Then User deletes all baby


Examples:
|email|password|
|test_aym_ukautotest169146@yopmail.com|Letmeinbuddy123|