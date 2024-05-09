Feature: To test the websites using Selenium webDriver

  @Requirement1
  Scenario: Test the login screen with username and password
    #before
  #beforestep
  Given The user logins to the website
  #afterstep
  #after

  @Requirement2
  Scenario: Test online widgets like date pickers, tabs, sliders
    #before
  #beforestep
    Given User selects a date from the date pickers
    When User changes the tabs
    And User operates the sliders
  #afterstep
  #after

  @Requirement3
  Scenario: Test interactive actions like draggable, resizable, selectable etc
    #before
  #beforestep
   Given User performs draggable operation
   When User performs resizable operation
    And User performs selectable operation
  #afterstep
  #after

  @Requirement4
  Scenario: Test the filling up of registration form and submission
 #before
    #beforestep
    Given User enters valid credentials
    When User clicks on Sign Up button
    Then User validates that the account is created
    #afterstep
  #after


  @Requirement5
  Scenario: Test frames and windows
 #before
    #beforestep
    #Given User tests frames
    When User tests windows
    #afterstep
  #after

  @Requirement6
  Scenario: Drop down menus
 #before
    #beforestep
    Given User automates drop down menus
    #afterstep
  #after

  @Requirement7
  Scenario: Alert boxes
 #before
    #beforestep
    Given User automates alert boxes
    #afterstep
  #after




