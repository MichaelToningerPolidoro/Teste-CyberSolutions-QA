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


    # Change scenario name
  Scenario: Scenario with enabled datepicker
    #Change steps below
    Given access automation testing datepicker
    And click "Widgets" menu and choose option "Datepicker"