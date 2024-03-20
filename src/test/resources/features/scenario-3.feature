@regression @scenario3 @datepicker
Feature: Datepicker

  Background:
    Given access automation testing datepicker

    # Change scenario name
  @disabledDatePicker
  Scenario: Scenario with disabled datepicker
    #Change steps below
#    Given access automation testing datepicker
#    And click "Widgets" menu and choose option "Datepicker"
    Given click in disabled datepicker
    And select "2023" to disabled datepicker year
    And select "June" to disabled datepicker month


    # Change scenario name
  Scenario: Scenario with enabled datepicker
    #Change steps below
    Given access automation testing datepicker
    And click "Widgets" menu and choose option "Datepicker"