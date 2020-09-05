Feature: 

	
	@TES-2
	Scenario Outline: User should not be able to login in forum by using invalid username and valid password
		Given I am on forum login page
		And I enter invalid '<username>' 
		And I enter '<password>'
		When I click on login button
		Then I should not be logged on successfully
		Examples:
		|username|password|
		|myuser  |mypass  |