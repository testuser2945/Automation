package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



	@RunWith(Cucumber.class)
	@CucumberOptions(features = "E:\\Chathrapathi\\Eclipse_Workspace\\AutomationWithSelenium\\src\\main\\java\\feature", glue = "viod.stepdefnation", plugin = {
			"pretty", "html:target/cucumber-reports"}, tags="@usernamefilter")
	
	public class Testrunner {

	}

	
	

