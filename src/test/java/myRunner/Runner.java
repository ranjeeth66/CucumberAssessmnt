package myRunner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import supportLibraries.BaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature",
		glue={"stepDefinitions"},
		monochrome = true, 
		dryRun = false, 
		tags = {"@testgooglescenario"})
public class Runner extends BaseClass{

	@BeforeClass
	public static void  setup() {
		// TODO Auto-generated method stubs
	}
	@AfterClass
	public static void teardown(){
		driver.quit();
	}
}