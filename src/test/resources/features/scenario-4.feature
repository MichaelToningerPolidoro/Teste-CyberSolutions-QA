@regression @scenario4 @slider
Feature: Slider

  Scenario: Drag slide until X%
    Given access automation testing slider
    When drag slider to 50%
    Then validate that slider value is 50%