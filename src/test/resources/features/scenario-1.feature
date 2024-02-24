@tempTest
Feature: Temp test scenario

  Scenario: Test Scenario
    Given access automation testing
    When form page was loaded
    Then fill first name as "Michael"
    And fill last name as "Toninger Polidoro"
    And fill address as "Some location for test"
    And fill email address as "testing@test.com"
    And fill phone as "(11)999999999"
    And select gender as "Male"
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
    When click submit
    # Add more steps here

    And validate first name is filled
    And validate last name is filled
    # Add more validations here

