@test
Feature: Login Action

  Scenario: Display list of flights
    Given User is on southhallHome Page
    When User enter details
    And click on search flights
    Then list of flights will available

