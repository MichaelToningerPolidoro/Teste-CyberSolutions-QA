@regression @scenario2 @iframe
Feature: Write inside a iframe

  Scenario: Write inside a iframe
    Given access automation testing frames
    And click "SwitchTo" menu and choose option "Frames"
    When get inside single iframe
    And write "inside iframe!" in single iframe input
    Then validate single iframe input is filled with "inside iframe!"