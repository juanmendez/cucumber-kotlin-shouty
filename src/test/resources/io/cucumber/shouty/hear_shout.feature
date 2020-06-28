Feature: Hear shout
  Scenario: Listener is within range
    Given Lucy is located 15 meters from Sean
    When Sean shouts "free bages at Sean's"
    Then Lucy hears Sean's message
