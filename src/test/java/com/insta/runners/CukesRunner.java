package com.insta.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			plugin= {
					"pretty",
					"html:target/default-cucumber-reports", // generates every time we run the cukes runner
					"json:target/cucumber.json"
			},
			
			tags = "",
			features = { "src/test/resources/com/insta/features"},
			glue = {"com/insta/step_definitions"},
			dryRun = true
		
			)
	

	public class CukesRunner {}
