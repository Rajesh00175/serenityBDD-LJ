package com.SLJ.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/prelogin/",
        glue = "com.SLJ.steps",
        dryRun = false
)
public class RunnerClass {

}
