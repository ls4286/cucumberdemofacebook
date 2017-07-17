 @regression 
Feature: Login feature 

@regression-1 
Scenario: Verify Invalid Login 
	Given I open the default browser 
	And I am on home page 
	When I enter mohammad@technosoftacademy.io into username text fields on home screen 
	And I enter test1234 into password text fields on home screen 
	And I click on login button on home screen 
	Then I verify that i am an invalid login page 
	And I close the default browser 
	
@regression-2 
Scenario: Verify Invalid Login two 
	Given I open the default browser 
	And I am on home page 
	When I enter mohammad@technosoftacademy.io into username text fields on home screen 
	And I enter test1234 into password text fields on home screen 
	And I click on login button on home screen 
	Then I verify that i am an invalid login page 
	And I close the default browser 
  
  
  @regression-3
  Scenario: Verify Signup
  Given I open the default browser
  And  I am on  home page
  And  I go down to the  bottom of the home page
  And I click on the Sign Up link
  When I enter  John into  firstname text fields on sign up page
  And  I enter Doeyy  into lastname text fields on sign up page
  And I enter doe36135@gmail.com into  email text fields on sign up page
  And I enter technofake into  password text fields on sign up page
  And I select Jun on  month dropdown  on sign up page
  And I select 6 on day dropdown  on sign up page
  And I select 1990 on  year dropdown  on sign up page
  And I click on  Male radio button on sign up page
  And I click on create account button on sign up page
  Then I verify account created
  And I close the default browser
  