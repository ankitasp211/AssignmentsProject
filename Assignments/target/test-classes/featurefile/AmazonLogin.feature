Feature: Homepage validation of the amazon application


  @SC04
    Scenario: Login validation of the amazon application
    #before
      Given user hover over on Hello, sign in Accounts & Lists on the title bar
      When user clicks on Sign in button
      And user enters the email address "ankitapurandare@gmail.com"
      And user clicks on Continue
      And user enters the password "abc"
      Then user navigates to the homepage of the amazon application


    Scenario: Validation of pay later option on the payment page of amazon application
      Given user navigates to amazon application
      When user enters the search keyword "iphone 15" in the search bar
      And user clicks on search icon
      And user selects "iphone 15" from the dropdown
      And user navigates to "iphone 15 blue" from the results
      And user clicks on Add to cart
      And user clicks on the cart
      And user clicks on the proceed to pay
      Then user validates that paylater option is available on the payment page
