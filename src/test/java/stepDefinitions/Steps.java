package stepDefinitions;
import org.junit.Assert;

import objectRepositories.GooglePage_Objects;
import supportLibraries.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps extends BaseClass{
	
	GooglePage_Objects googlePage = new GooglePage_Objects();
	
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
	@Then("^user clicks on the first record$")
	public void user_clicks_on_the_first_record() throws Throwable {
		googlePage.clickOnLink(); 
	}
	@Then("^verify the logo\"([^\"]*)\"$")
	public void verify_the_logo(String value) throws Throwable {
	    String strTitle = googlePage.validateJPMCPage();
	    Assert.assertEquals(strTitle, value);
	}
}		