Feature: Searching different elements using Xpath


  @Module4Assignment1
  Scenario: To automate facebook registration page
  #before
    #beforestep
    Given User enters valid credentials
    When User clicks on Sign Up button
    Then User validates that the account is created
    #afterstep
  #after

@Module4Assignment2
Scenario: To automate Oracle registration page
    #before
  #beforestep
  Given User enters registration details for oracle page

  @Module4Assignment3
  Scenario: To automate facebook registration page using Absolute xpath
  #before
    #beforestep
    Given User enters valid credentials using absolute xpath
    When User clicks on Sign Up button
    Then User validates that the account is created
    #afterstep
  #after

  @Module4Assignment4
  Scenario: To get number of links available on facebook page
    Given User gets the number of the links available on facebook page
    Then User verifies the text for each link

  @Module4Assignment5
  Scenario: Perform various actions on Facebook Registration Page
    Given User gets the entered input from FirstName into console









