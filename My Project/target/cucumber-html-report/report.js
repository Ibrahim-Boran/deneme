$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/VfOdev.feature");
formatter.feature({
  "name": "Youtube",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I initialize chrome driver",
  "keyword": "Given "
});
formatter.match({
  "location": "MySteps.initializeChromeDriver(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to \"https://www.youtube.com/\" url",
  "keyword": "When "
});
formatter.match({
  "location": "MySteps.gotoURL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see home page",
  "keyword": "Then "
});
formatter.match({
  "location": "MySteps.seePage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "YouTubeTest",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Deneme"
    }
  ]
});
formatter.step({
  "name": "I focus Search element",
  "keyword": "When "
});
formatter.match({
  "location": "MySteps.mouseHover(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"Tarkan\" text to Search text area",
  "keyword": "When "
});
formatter.match({
  "location": "MySteps.enterText(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click \"ENTER\" keyboard button",
  "keyword": "Then "
});
formatter.match({
  "location": "MySteps.clickKeyboard(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click element: Music index: 1",
  "keyword": "Then "
});
formatter.match({
  "location": "MySteps.clickElement(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click element: Explore index: 1",
  "keyword": "Then "
});
formatter.match({
  "location": "MySteps.clickElement(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click element: Home index: 1",
  "keyword": "Then "
});
formatter.match({
  "location": "MySteps.clickElement(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I focus Search element",
  "keyword": "When "
});
formatter.match({
  "location": "MySteps.mouseHover(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \" Kış Güneşi\" text to Search text area",
  "keyword": "When "
});
formatter.match({
  "location": "MySteps.enterText(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I wait for 5 seconds",
  "keyword": "And "
});
formatter.match({
  "location": "MySteps.waitForNSeconds(int)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});