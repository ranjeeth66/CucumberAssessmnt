package TestRunner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import supportLibraries.BaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature",
		glue={"stepDefinitions"},
		format = {"pretty", "html:target/cucumber"},
		monochrome = true, 
		dryRun = false, 
		tags = {"@testgooglescenario"})
public class Runner {

	@BeforeClass
	public static void  setup() {
		// TODO Auto-generated method stubs
	}
	@AfterClass
	public static void teardown(){
		this.driver.quit();
	}
}
