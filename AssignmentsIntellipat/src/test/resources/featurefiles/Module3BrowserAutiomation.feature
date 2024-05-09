Feature: Browser Automation

  @Module3Assignment1 @Regression
  Scenario:Switching between the windows
    #before
  #beforestep
  Given User maximises the window
    And User gets the title of the page
    When User clicks on "Know More" link text
    And User switches from 0 to 1 window
    And User gets the title of the page
    And User switches from 1 to 0 window
    Then User validates the title of the page
  #afterstep
  #after
  @Module3Assignment5 @Regression
  Scenario:Switching the urls
    #before
  #beforestep
    Given User maximises the window
    And User gets the url of the page
    When User navigates to test url "https://www.selenium.dev/"
    And User gets the url of the page
    And User navigates back
    And User gets the url of the page
    And User navigates forward
    And User gets the url of the page
    And User refreshes the current page
    Then User validates the url of the page
    #afterstep
  #after




