package stepDefinitions;

import java.awt.AWTException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import seliniumPages.Page_VerifyOfferTestCall;

public class StepDef_VerifyOfferTestCall {
	
	Page_VerifyOfferTestCall obj_offerPg = new Page_VerifyOfferTestCall();
	
	
	@Given("^I access the offer \"([^\"]*)\"$")
	public void i_access_the_offer(String offer) throws Exception {
		obj_offerPg.launchOffer(offer);		
	}
	
	@When("^I initate Test Call$")
	public void i_initate_Test_Call() throws Exception, AWTException {
		obj_offerPg.intiateTestCall();	
		obj_offerPg.welcomeScreen();
	}

	@Then("^I enter values \"([^\"]*)\" and \"([^\"]*)\" in Welcome screen$")
	public void i_enter_values_and_in_Welcome_screen(String arg1, String arg2) {
		System.out.println("tbd1");
	}

	@Then("^I click on \"([^\"]*)\"$")
	public void i_click_on(String arg1) {
		System.out.println("tbd2");
	}

	@Then("^I enter values in \"([^\"]*)\" screen$")
	public void i_enter_values_in_screen(String arg1) {
		System.out.println("tbd3");
	}

}
