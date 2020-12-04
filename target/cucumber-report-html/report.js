$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/covea/techtest/feature/AutoTechTest.feature");
formatter.feature({
  "name": "Automation tech test scenarios",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "A invalid email address is entered",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@techTest"
    }
  ]
});
formatter.step({
  "name": "the user is on the quote page",
  "keyword": "Given "
});
formatter.step({
  "name": "an invalid email address is entered : \"\u003cInvalid Email\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "an error is displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Invalid Email"
      ]
    },
    {
      "cells": [
        "abc^2"
      ]
    }
  ]
});
formatter.scenario({
  "name": "A invalid email address is entered",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@techTest"
    }
  ]
});
formatter.step({
  "name": "the user is on the quote page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.covea.techtest.stepDefs.AutoTechTestSteps.theUserIsOnTheQuotePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an invalid email address is entered : \"abc^2\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.covea.techtest.stepDefs.AutoTechTestSteps.anInvalidEmailAddressIsEntered(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an error is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.covea.techtest.stepDefs.AutoTechTestSteps.anErrorIsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "A valid email address is entered",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@techTest"
    }
  ]
});
formatter.step({
  "name": "the user is on the quote page",
  "keyword": "Given "
});
formatter.step({
  "name": "an valid email address is entered : \"\u003cValid Email\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "no error is displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Valid Email"
      ]
    },
    {
      "cells": [
        "a@b.c"
      ]
    }
  ]
});
formatter.scenario({
  "name": "A valid email address is entered",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@techTest"
    }
  ]
});
formatter.step({
  "name": "the user is on the quote page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.covea.techtest.stepDefs.AutoTechTestSteps.theUserIsOnTheQuotePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an valid email address is entered : \"a@b.c\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.covea.techtest.stepDefs.AutoTechTestSteps.anValidEmailAddressIsEntered(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "no error is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.covea.techtest.stepDefs.AutoTechTestSteps.noErrorIsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Email address and confirm email address do not match",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@techTest"
    }
  ]
});
formatter.step({
  "name": "the user is on the quote page",
  "keyword": "Given "
});
formatter.step({
  "name": "an valid email address is entered : \"\u003cValid Email\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "a different valid confirm email address is entered : \"\u003cnot matching email\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "an error is displayed for email not matching",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Valid Email",
        "not matching email"
      ]
    },
    {
      "cells": [
        "a@b.c",
        "x@y.z"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Email address and confirm email address do not match",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@techTest"
    }
  ]
});
formatter.step({
  "name": "the user is on the quote page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.covea.techtest.stepDefs.AutoTechTestSteps.theUserIsOnTheQuotePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an valid email address is entered : \"a@b.c\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.covea.techtest.stepDefs.AutoTechTestSteps.anValidEmailAddressIsEntered(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a different valid confirm email address is entered : \"x@y.z\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.covea.techtest.stepDefs.AutoTechTestSteps.aDifferentValidConfirmEmailAddressIsEntered(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an error is displayed for email not matching",
  "keyword": "Then "
});
formatter.match({
  "location": "com.covea.techtest.stepDefs.AutoTechTestSteps.anErrorIsDisplayedForEmailNotMatching()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Email address and confirm email address match",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@techTest"
    }
  ]
});
formatter.step({
  "name": "the user is on the quote page",
  "keyword": "Given "
});
formatter.step({
  "name": "an valid email address is entered : \"\u003cValid Email\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "a different valid confirm email address is entered : \"\u003cValid Email\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "no error is displayed for email not matching",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Valid Email"
      ]
    },
    {
      "cells": [
        "a@b.c"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Email address and confirm email address match",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@techTest"
    }
  ]
});
formatter.step({
  "name": "the user is on the quote page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.covea.techtest.stepDefs.AutoTechTestSteps.theUserIsOnTheQuotePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an valid email address is entered : \"a@b.c\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.covea.techtest.stepDefs.AutoTechTestSteps.anValidEmailAddressIsEntered(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a different valid confirm email address is entered : \"a@b.c\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.covea.techtest.stepDefs.AutoTechTestSteps.aDifferentValidConfirmEmailAddressIsEntered(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "no error is displayed for email not matching",
  "keyword": "Then "
});
formatter.match({
  "location": "com.covea.techtest.stepDefs.AutoTechTestSteps.noErrorIsDisplayedForEmailNotMatching()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "A invalid date of birth is entered",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@techTest"
    }
  ]
});
formatter.step({
  "name": "the user is on the quote page",
  "keyword": "Given "
});
formatter.step({
  "name": "an date of birth is entered : \"\u003cinvalid day\u003e\", \"\u003cinvalid month\u003e\", \"\u003cinvalid year\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "an error is displayed for invalid date of birth",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "invalid day",
        "invalid month",
        "invalid year"
      ]
    },
    {
      "cells": [
        "58",
        "35",
        "2050"
      ]
    }
  ]
});
formatter.scenario({
  "name": "A invalid date of birth is entered",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@techTest"
    }
  ]
});
formatter.step({
  "name": "the user is on the quote page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.covea.techtest.stepDefs.AutoTechTestSteps.theUserIsOnTheQuotePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an date of birth is entered : \"58\", \"35\", \"2050\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.covea.techtest.stepDefs.AutoTechTestSteps.anDateOfBirthIsEntered(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an error is displayed for invalid date of birth",
  "keyword": "Then "
});
formatter.match({
  "location": "com.covea.techtest.stepDefs.AutoTechTestSteps.anErrorIsDisplayedForInvalidDateOfBirth()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});