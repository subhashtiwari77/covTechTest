package com.covea.techtest.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/java/com/covea/techtest/feature"},
        glue = {"com/covea/techtest/stepDefs"},
        tags = {"@techTest"},
        plugin = {"pretty",
                "json:target/cucumber-json-report.json",
                "html:target/cucumber-report-html"},
        strict = true
)

public class CucumberRunner {

}
