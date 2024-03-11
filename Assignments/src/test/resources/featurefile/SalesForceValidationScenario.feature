Feature: Homepage validation of salesforce application


  #before
  @SC01
  Scenario:Error message validation with invalid credentials

    #beforestep
    Given user enters the username "abc" and enters password "123"
    #afterstep

    #beforestep
    When user clicks on the login button
    #afterstep

    Then user validates the error message
#after

  @SC02
    Scenario: Login validation with valid credentials
      Given user is on the salesforce application
      When user enters the username "ankita" and enters password "123"
      And user clicks on the login button
      Then verify that user navigates to the homepage
