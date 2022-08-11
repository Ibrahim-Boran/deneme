$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/deneme.feature");
formatter.feature({
  "name": "deneme",
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
  "name": "homepage is open",
  "keyword": "Given "
});
formatter.match({
  "location": "bootcamp.step_def.kata4_1.homepageIsOpen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I close the pop up",
  "keyword": "And "
});
formatter.match({
  "location": "bootcamp.step_def.kata4_1.iCloseThePopUp()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Logo verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "Logo should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "bootcamp.step_def.kata4_1.logoShouldBeDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});