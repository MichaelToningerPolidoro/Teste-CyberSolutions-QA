@regression @scenario1 @registry
Feature: Fill registry page

  Scenario: Fill registry page
    Given access automation testing
    When form page was loaded
    Then fill first name "Michael"
    Then the first name field should be filled with "Michael"
    And fill last name "Toninger Polidoro"
    And fill address "Some location for test"
    And fill email address "testing@test.com"
    And fill phone "(99)999999999"
    And select gender "Male"
    And select hobby "Cricket"
    And select hobby "Movies"
    And select language "Portuguese"
    And select skill "Java"
    And select country "Australia"
    And select day of birth "8"
    And select month of birth "June"
    And select year of birth "2000"
    And fill password as "test123"
    And fill password confirmation as "test123"

    Then the first name field should be filled with "Michael"
    And the last name field should be filled with "Toninger Polidoro"
    And the address field should be filled with "Some location for test"
    And the email address field should be filled with "testing@test.com"
    And the phone field should be filled with "(99)999999999"
    And the selected gender should be "Male"
    And the hobby "Cricket" should be selected
    And the hobby "Movies" should be selected
    And language field should contain "Portuguese"
    And the selected skill should be "Java"
    And the selected country should be "Australia"
    And the selected day of birth should be "8"
    And the selected month of birth should be "June"
    And the selected year of birth should be "2000"
    And the password field length should be 7
    And the password confirmation field length should be 7

    When click submit
    # nothing happens after ¯\_(ツ)_/¯
