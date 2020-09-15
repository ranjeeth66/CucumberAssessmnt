package stepDefinitions;
import org.junit.Assert;

import objectRepositories.googlePage_Objects;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	googlePage_Objects googlePage = new googlePage_Objects();
	
	@Given("^user launches browser$")
	public void user_launches_browser() throws Throwable {
	   googlePage.openBrowser();
	}
	@Then("^user opens google homepage$")
	public void user_opens_google_homepage() throws Throwable {	   
	   boolean strResult = googlePage.googlePageValidation();
	   Assert.assertTrue(strResult);
	}
	@When("^user searches given data\"([^\"]*)\"$")
	public void user_searches_given_data(String value) throws Throwable {
		googlePage.searchKeyword(value);
	}

	@Then("^clicks on the first record and verifys the logo$")
	public void clicks_on_the_first_record_and_verifys_the_logo() throws Throwable {
		boolean strLogoResult = googlePage.validateJPMCLogo(); 
		Assert.assertTrue(strLogoResult);
	}
}
