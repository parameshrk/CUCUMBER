Feature:  all login scenarios

  Background: opening the browser
    Given I open the browser
    And I maximize it

  @login @valid
  Scenario: to test the functionality of login button on billing page for valid input
    Given I am on login page of billing
    When I enter "admin" and "admin123" as username and password on billing page
    And I will click login button
    Then I should be on dashboard

  @login @invalid
  Scenario: to test the functionality of login button on billing page for invalid input
    Given I am on login page of billing
    #When I enter invalid username and password on billing page
    When I enter "dsds" and "dsdsd" as username and password on billing page
    And I will click login button
    Then I should get error on login page

  @login @blank
  Scenario: to test the functionality of login button on billing page for blank input
    Given I am on login page of billing
   # When I enter blank username and password on billing page
    When I enter "" and "" as username and password on billing page
    And I will click login button
    Then I should get another error on login page

  @userRegistration
  Scenario: to test the functionality of submit button for valid input
    Given I am on user registration page
    When I enter below data
      | Priyanka | Bari | priyanka@gmail.com | 78787878 |
    And I click on submit button
    Then user should be added

  @subscription
  Scenario Outline: to test the subscription button
    Given I am on subscription page
    When I enter <name> , <email> , <contact>
    And I click on subscribe
    Then user should be added

    Examples:
      | name     | email        | contact |
      | pallavi  | p1@gmail.com | 1234567 |
      | paramesh | p2@gmail.com | 2234567 |
      | priyanka | p3@gmail.com | 3234567 |
      | purva    | p4@gmail.com | 4234567 |
      | sachin   | s1@gmail.com | 5234567 |
      | shalini  | s2@gmail.com | 6234567 |
