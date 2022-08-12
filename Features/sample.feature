Feature: all sample scenarios

  Scenario: to test the functionality of login button for valid inputs
    Given I am on login page
    When I enter username and password
    And I click on login button
    Then I should be redirected to the home page


  Scenario: to test the functionality of login button for invalid inputs
    Given I am on login page
    When I enter incorrect username and incorrect password
    And I click on login button
    Then I should get error