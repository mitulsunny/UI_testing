
Feature: Title of your feature I want to use this template for my feature file
   #@nwow
  #Scenario Outline: Title of your scenario
    #Given I want to navigate to My OSA home Page
    #Given I want to click on "Forum login button"
             #|xpath|//a[text()="Forum Login"]|
    #Then I verify the "Forum Login Page Title"
             #|Forum Login Page|         
    #And I enter the "username for forum login"
             #|id|username|<username>|
    #And I enter the "password for forum login"
             #|id|password|<password>|
    #Given I want to click on "Login button"
             #|xpath|//button[@id="login_button"]|
    #And I want close the browser
    #Examples:
          #|username|password|
          #|user1   |pass1|
       
   @nwow
  Scenario: Title of your scenario
    Given I want to navigate to My OSA home Page
    Given I want to click on "Caculate my rate"
             |xpath|//button[@class='td-button td-button-block td-button td-button-secondary']|
    
   