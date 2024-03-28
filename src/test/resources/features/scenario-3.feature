@regression @scenario3 @datepicker
Feature: Datepicker

  Background:
    Given access automation testing datepicker

    # Change scenario name
  @disabledDatePicker
  Scenario: Scenario with disabled datepicker
    Given click in disabled datepicker
    And select disabled datepicker year "2023"
    And select disabled datepicker month "June"
    And select disabled datepicker day "18"
    Then validate disabled datepicker date "06/18/2023"


    # Change scenario name
  @enabledDatePicker
  Scenario: Scenario with enabled datepicker
    Given click in enabled datepicker
    And select enabled datepicker year "2023"
    And select enabled datepicker month "June"
    And select enabled datepicker day "18"
    Then validate enabled datepicker date "06/18/2023"