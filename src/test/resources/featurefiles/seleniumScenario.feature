Feature: Place order

  Scenario: user login to site place order and print order number
    Given user is on login page
    And user enter 'username' and 'password' and click on login button
    When user click on shop menu
    And user select wine
    And user selects Bottle of Beyerskloof
    Then user add Beyerskloof to cart and place order
    Then user fetch order id
