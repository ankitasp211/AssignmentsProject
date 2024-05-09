
Feature:Validation of Amazon application

  #before
  @AM01
Scenario: Validation of different categories
Given User selects the category on the homepage

    #before
    @INFY01
    Scenario: Table traversing for Infosys wikipedia Homepage
      Given Get all the columns and rows

      #before
  @INFY02
  Scenario: Acquisition Table traversing for Infosys wikipedia
    Given Get second column and its values

    @CRICBUZZ01
    Scenario: Scorecard traversing for CricBuzz
      Given   Get the Match Details column in the console

