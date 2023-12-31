Feature: Title of your features
  I want to use this template for my feature files

  

  Scenario: Title of your scenarios
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

  Scenario Outline: Title of your scenario outlines
    Given I want to write a step with <name>
    When I check for the <value> in steps
    Then I verify the <status> in steps

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
