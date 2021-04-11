Feature: Partners has logo, name, some text on given website

  @partners
  Scenario: All partners should have logo, name, text
    Given User is on the website page
    When User clicks to hamburger menu
    And User clicks to Partners
    Then User should see all Partners logo, name and some text with description



