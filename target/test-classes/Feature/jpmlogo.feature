@testgooglescenario
Feature: Validate JP Morgan logo in google search

  Scenario Outline: Validate JP Morgan logo for searched results in google search results
    Given user launches browser
    Then user opens google homepage
    When user searches given data"<data_SearchWords>"
    Then user clicks on the first record 
    And verify the logo"<verify_title>"

    Examples: 
      |data_SearchWords|verify_title|
      |J.P.Morgan Chase|Home \| JPMorgan Chase & Co.|