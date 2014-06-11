Feature: I want to be told the sum and subtraction of two numbers
 
  Scenario: Add two numbers
    Given I have entered 70 and 50 into the calculator
    When I press +
    Then result should be 120 on the screen
    
  Scenario: Subtract two numbers
    Given I have entered 70 and 50 into the calculator
    When I press -
    Then result should be 20 on the screen
