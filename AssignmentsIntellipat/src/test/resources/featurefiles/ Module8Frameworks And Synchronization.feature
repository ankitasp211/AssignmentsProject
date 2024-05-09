Feature: Frameworks and Synchronization

  @Module8Assignment1
  Scenario: to verify synchronization using JAVA Wait
    #before
  #beforestep
    Given Click on Choose file Button
    When User Automate Window Alert by uploading file
    And User specifies Java Wait to complete files conversion and Download button gets displayed
    Then User clicks on Download Button
    #afterstep
    #after

  @Module8Assignment2
  Scenario: to verify synchronization using Implicit Wait
    #before
  #beforestep
    Given Click on Choose file Button
    When User Automate Window Alert by uploading file
    And User specifies Implicit Wait to complete files conversion and Download button gets displayed
    Then User clicks on Download Button
    #afterstep
    #after

  @Module8Assignment3
  Scenario: to verify synchronization using Explicit Wait
    #before
  #beforestep
    Given Click on Choose file Button
    When User Automate Window Alert by uploading file
    And User specifies Explicit Wait to complete files conversion and Download button gets displayed
    Then User clicks on Download Button
    #afterstep
    #after

  @Module8Assignment4
  Scenario: to automate Login Page using Page Object Model
    #before
  #beforestep
   Given User enter Login credentials and click Login
    #afterstep
    #after