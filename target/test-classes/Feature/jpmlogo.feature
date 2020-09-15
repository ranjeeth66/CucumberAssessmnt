@testgooglescenario
Feature: Validate JP Morgan logo in google search

  Scenario Outline: Validate JP Morgan logo for searched results in google search results
    Given user launches browser
    Then user opens google homepage
    When user searches given data"<data_SearchWords>"
    Then clicks on the first record and verifys the logo 

    Examples: 
      |data_SearchWords|
      |J.P.Morgan Chase|