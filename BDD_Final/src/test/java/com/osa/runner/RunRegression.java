package com.osa.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(
		features = {"src/test/java/com/osa/features"},
        glue= {"com.osa.steps"},
		tags= {"@nwow"},
		plugin = {"json:target/cucumber.json"}
		)
public class RunRegression extends AbstractTestNGCucumberTests{

}
