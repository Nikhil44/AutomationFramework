@Regression12  
Feature: Login Action
@RegressionTest @SmokeTest
Scenario Outline: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters <username> and <password>
	Then Message displayed Login Successfully
Examples:

| username  | password  |

| testuser_1 | Test@153 |

| testuser_2 | Test@153 |
Scenario: Successful LogOut
	When User LogOut from the Application
	Then Message displayed LogOut Successfully
	
Feature: this is testing feature

Scenario: testing scenario	