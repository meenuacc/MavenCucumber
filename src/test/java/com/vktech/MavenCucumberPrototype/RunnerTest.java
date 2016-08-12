package com.vktech.MavenCucumberPrototype;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith (Cucumber.class)
@CucumberOptions(
		format = {"pretty"},
		glue = {"Steps"},
		plugin = {"html:target/cucmber-html-report"},
		features = "src/test/resource"
		
		)
public class RunnerTest {

}
