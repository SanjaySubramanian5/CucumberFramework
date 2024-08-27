@Facebook
Feature: Facebook Application - Create a new Account
Background: User launches and click Create Account
Given User launches the facebook application "https://www.facebook.com/"
And User validates the Url "https://www.facebook.com/"
And User clicks Create a new account

@newaccount @fb
Scenario: Create a new account in facebook
When User enters the first name with one dim list
|San|Sanjay|Jay|
And User enters the sur name with one dim map
|lastname1|Subramanian|
|lastname2|Vicky|
|lastname3|mani|
And User enters the mobile number "8754843316"
And User enters the password 
And User enters the date of birth with one dim map
|Day  |5|
|Month|Jan|
|Year |2012|
And User select the gender
And User take screenshot
Then User clicks Signup

#Scenario Outline: Create a new account in facebook 
#When User enters the details "<firstname>" "<lastname>" "<mobileno>" "<password>" "<Day>" "<Month>" "<Year>"
#And User select the gender
#And User takes Screenshot
#Then User clicks Signup
#
#Examples:
#|firstname|lastname   |mobileno  |password|Day|Month|Year|
#|San      |Subramanian|8754843316|San123  |5  |Jan  |2012|
#|Sanjay   |Ajith      |9442545506|Vick123 |7  |Feb  |2010|
#|Jay      |Sundeep    |7010507363|sun12   |10 |Mar  |2008|

#Scenario Outline: Create a new account in facebook application
#When User enters the details "<datas>" 
#And User select the gender
#And User takes Screenshot
#Then User clicks Signup
#
#Examples:
#|datas|sheetname|
#|excel|Sheet1|



