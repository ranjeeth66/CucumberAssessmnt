$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("jpmlogo.feature");
formatter.feature({
  "line": 2,
  "name": "Validate JP Morgan logo in google search",
  "description": "",
  "id": "validate-jp-morgan-logo-in-google-search",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@testgooglescenario"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Validate JP Morgan logo for searched results in google search results",
  "description": "",
  "id": "validate-jp-morgan-logo-in-google-search;validate-jp-morgan-logo-for-searched-results-in-google-search-results",
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
  "name": "user searches given data\"\u003cdata_SearchWords\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user clicks on the first record",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "verify the logo\"\u003cverify_title\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "validate-jp-morgan-logo-in-google-search;validate-jp-morgan-logo-for-searched-results-in-google-search-results;",
  "rows": [
    {
      "cells": [
        "data_SearchWords",
        "verify_title"
      ],
      "line": 12,
      "id": "validate-jp-morgan-logo-in-google-search;validate-jp-morgan-logo-for-searched-results-in-google-search-results;;1"
    },
    {
      "cells": [
        "J.P.Morgan Chase",
        "Home | JPMorgan Chase \u0026 Co."
      ],
      "line": 13,
      "id": "validate-jp-morgan-logo-in-google-search;validate-jp-morgan-logo-for-searched-results-in-google-search-results;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Validate JP Morgan logo for searched results in google search results",
  "description": "",
  "id": "validate-jp-morgan-logo-in-google-search;validate-jp-morgan-logo-for-searched-results-in-google-search-results;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@testgooglescenario"
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
  "name": "user searches given data\"J.P.Morgan Chase\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user clicks on the first record",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "verify the logo\"Home | JPMorgan Chase \u0026 Co.\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_launches_browser()"
});
formatter.result({
  "duration": 27774600500,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_opens_google_homepage()"
});
formatter.result({
  "duration": 122438100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "J.P.Morgan Chase",
      "offset": 25
    }
  ],
  "location": "Steps.user_searches_given_data(String)"
});
formatter.result({
  "duration": 11675814400,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_clicks_on_the_first_record()"
});
formatter.result({
  "duration": 18149454900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Home | JPMorgan Chase \u0026 Co.",
      "offset": 16
    }
  ],
  "location": "Steps.verify_the_logo(String)"
});
formatter.result({
  "duration": 69434900,
  "status": "passed"
});
});