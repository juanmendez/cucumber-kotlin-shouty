Feature: Calculator

  Scenario: Adding two numbers
    Given I have a calculator
    When I add the following:
      | 1 | 2 |
      | 2 | 3 |
      | 4 | 5 |
    Then I should see this expected result:
      | 3 |
      | 5 |
      | 9 |
