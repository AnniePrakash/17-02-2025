package org.testRunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\USER\\eclipse-worknew\\Morning530AAMMavenBatch\\Feature\\cucumber.feature",
glue="org.stepDefinition",dryRun = true,monochrome = true,tags="@sanity")
public class TestRunner {

}
