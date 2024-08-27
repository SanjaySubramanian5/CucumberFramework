package org.testrunner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Franky\\CucumberFramework\\src\\test\\resources\\Feature",
                  glue = {"org.stepdefinition", "org.hooks" },
                  dryRun = false,
                  monochrome = true,
                  plugin = {"html:target/html/html" , "json:target/report.json"} ,
                  tags = "@fb"
                  )

public class TestRunner {
	
	
	
}
