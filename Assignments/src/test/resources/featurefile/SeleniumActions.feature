Feature: To verify different user actions on amazon homepage

  @AMZ01
  Scenario: To verify Hover Over action
    #before
  Given User validates the hover over action


    @DragAndDrop
    Scenario: To verify drag and drop action
      #before
  Given User validates drag and drop action

      @CheckBox
      Scenario: To check the checkbox
        #before
        #beforestep
        Given User clicks on checkbox
        #afterstep
        #after
   @ExplicitWait
   Scenario: To verify Explicit wait
     #before
  #beforestep
