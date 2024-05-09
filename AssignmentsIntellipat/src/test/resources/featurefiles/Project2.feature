Feature:Actions on Flipkart Homepage

  @ProblemStatement1
  Scenario: Search operation on Flipkart Homepage
    Given User search 'Mobile Phone' on the homepage
    When User fetches all the mobile phones and prices listed on the page and output them to an excel file

  @ProblemStatement2
Scenario: Adding product to the cart and checkout action
    #Given User login to the homepage and validate if Login is successful
  Given User search for Iphone 12 and select a 64GB phone
  When User adds the product to the cart and validate that the product is available in the cart
  And User adds a new address for shipping
  Then User proceeds to the checkout page and validate it
