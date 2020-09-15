$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("jpmlogo.feature");
formatter.feature({
  "line": 2,
  "name": "JP Morgan logo in google search",
  "description": "",
  "id": "jp-morgan-logo-in-google-search",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@testForGoogleScenario"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Validate JP Morgan logo for searched results in google search results",
  "description": "",
  "id": "jp-morgan-logo-in-google-search;validate-jp-morgan-logo-for-searched-results-in-google-search-results",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user launches browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user opens google homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user searches JP Morgan \"\u003cdata_SearchWords\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "click first JP Morgan url to verify logo",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "jp-morgan-logo-in-google-search;validate-jp-morgan-logo-for-searched-results-in-google-search-results;",
  "rows": [
    {
      "cells": [
        "data_SearchWords"
      ],
      "line": 11,
      "id": "jp-morgan-logo-in-google-search;validate-jp-morgan-logo-for-searched-results-in-google-search-results;;1"
    },
    {
      "cells": [
        "J.P.Morgan Chase"
      ],
      "line": 12,
      "id": "jp-morgan-logo-in-google-search;validate-jp-morgan-logo-for-searched-results-in-google-search-results;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Validate JP Morgan logo for searched results in google search results",
  "description": "",
  "id": "jp-morgan-logo-in-google-search;validate-jp-morgan-logo-for-searched-results-in-google-search-results;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@testForGoogleScenario"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user launches browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user opens google homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user searches JP Morgan \"J.P.Morgan Chase\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "click first JP Morgan url to verify logo",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});