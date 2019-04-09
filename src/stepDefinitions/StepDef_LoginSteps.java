package stepDefinitions;

import java.awt.AWTException;

import common.Page_BasePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import seliniumPages.Page_LoginPage;

public class StepDef_LoginSteps {
	
	Page_LoginPage obj = new Page_LoginPage();
	
	@Given("^I navigate the application \"([^\"]*)\" on \"([^\"]*)\" browser$")
	public void i_navigate_the_application_on_browser(String app, String browser) throws InterruptedException, AWTException {
		obj.launchPreferredBrowser(browser);
		obj.accessApp(app);
		Page_BasePage.disMissMoreInfoMessage();
		
	}

	@When("^I enter credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_credentials_and(String username, String passwrd) {
		obj.enter_credentials(username, passwrd);
	}

	@When("^press \"([^\"]*)\" button$")
	public void press_button(String buttonName) {
		obj.submitAction(buttonName);
	}

	@Then("^I should be able to access the Home Page$")
	public void i_should_be_able_to_access_the_Home_Page() {
		System.out.println("HOme");
	}

	
	
	

}
