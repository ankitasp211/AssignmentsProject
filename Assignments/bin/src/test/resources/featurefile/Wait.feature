Feature: To validate the wait functionality

  @regress
  Scenario: To validate implicit functionality
    #before
    #beforestep
    Given User clicks on the button after 10 seconds
    Then verify that Displayed button is displayed
    #afterstep
  #after

  @regression
  Scenario: To validate explicit wait functionality
    #before
    #beforestep
    Given User clicks on the button after 20 seconds
   # Then verify that text is displayed
    #afterstep
  #after


