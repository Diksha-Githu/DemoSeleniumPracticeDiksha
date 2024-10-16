Feature: Verifying task features
  Scenario: Task features

    Given user open sdw browser and enter url
    When click on create task
    And enter mandate details
    Then task should be created