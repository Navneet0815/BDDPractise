package com.cg.regisform.stepdefinition;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.regisform.pagebean.RegistrationPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	private WebDriver driver; // setting up the webdriver class

	private RegistrationPage pageBean;

	@Before
	public void setUpStepEnv() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe"); // setting up the webdriver class
		driver = new ChromeDriver();
	}

	@Given("^User is accessing the RegistrationPage on browser$")
	public void user_is_accessing_the_RegistrationPage_on_browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		driver.get("C:\\BDD_FinalDay\\BDD_Practice\\HtmlPages\\RegistrationForm.html"); // to get the registration form
		pageBean = PageFactory.initElements(driver, RegistrationPage.class);
	}

	@Given("^Verify the title of the page welcome to jobsworld$")
	public void verify_the_title_of_the_page_welcome_to_jobsworld() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		String actualtitle = driver.getTitle();
		String expectedtitle = "Welcome to JobsWorld";
		assertEquals(actualtitle, expectedtitle);
	}
	
	@When("^User is accessing the RegistrationPage on browser by entering invalid title$")
	public void user_is_accessing_the_RegistrationPage_on_browser_by_entering_invalid_title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("hello");
	}

	@Then("^Verify the title of the page welcome to jobsworlds$")
	public void verify_the_title_of_the_page_welcome_to_jobsworlds() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String actualtitle = driver.getTitle();
		String expectedtitle = "Welcome to JobsWorlds";
	    
	}

	@When("^user is trying to submit data without entering 'userId'$")
	public void user_is_trying_to_submit_data_without_entering_userId() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		pageBean.clickSignUp();
	}

	@Then("^User Id should not be empty / length be between (\\d+) to (\\d+) alert message should be displayed$")
	public void user_Id_should_not_be_empty_length_be_between_to_alert_message_should_be_displayed(int arg1, int arg2)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		Thread.sleep(2000);
		String expectedalertmessage = "User Id should not be empty / length be between 5 to 12";
		String actualalertmessage = driver.switchTo().alert().getText();
		System.out.println(actualalertmessage);
		assertEquals(actualalertmessage, expectedalertmessage);
	}

	@When("^user is trying to submit request without entering 'password'$")
	public void user_is_trying_to_submit_request_without_entering_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		driver.switchTo().alert().dismiss();
		pageBean.setUserId("12345");
		pageBean.clickSignUp();

	}

	@Then("^Password should not be empty / length be between (\\d+) to (\\d+) alert message should be displayed$")
	public void password_should_not_be_empty_length_be_between_to_alert_message_should_be_displayed(int arg1, int arg2)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		Thread.sleep(2000);
		String expectedalertmessage = "Password should not be empty / length be between 7 to 12";
		String actualalertmessage = driver.switchTo().alert().getText();
		System.out.println(actualalertmessage);
		assertEquals(actualalertmessage, expectedalertmessage);
	}

	@When("^user is trying to submit request without entering 'name'$")
	public void user_is_trying_to_submit_request_without_entering_name() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		driver.switchTo().alert().dismiss();
		pageBean.setPassword("password");
		pageBean.clickSignUp();

	}

	@Then("^Name should not be empty and must have alphabet characters only alert message should be displayed$")
	public void name_should_not_be_empty_and_must_have_alphabet_characters_only_alert_message_should_be_displayed()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// hrow new PendingException();
		Thread.sleep(2000);
		String expectedalertmessage = "Name should not be empty and must have alphabet characters only";
		String actualalertmessage = driver.switchTo().alert().getText();
		System.out.println(actualalertmessage);
		assertEquals(actualalertmessage, expectedalertmessage);
	}

	@When("^user is trying to submit request without entering 'address'$")
	public void user_is_trying_to_submit_request_without_entering_address() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		driver.switchTo().alert().dismiss();
		pageBean.setName("Navneet");
		pageBean.clickSignUp();
	}

	@Then("^User address must have alphanumeric characters only alert message should be displayed$")
	public void user_address_must_have_alphanumeric_characters_only_alert_message_should_be_displayed()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		Thread.sleep(2000);
		String expectedalertmessage = "User address must have alphanumeric characters only";
		String actualalertmessage = driver.switchTo().alert().getText();
		System.out.println(actualalertmessage);
		assertEquals(actualalertmessage, expectedalertmessage);
	}

	@When("^user is trying to submit request without entering 'country'$")
	public void user_is_trying_to_submit_request_without_entering_country() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// hrow new PendingException();
		driver.switchTo().alert().dismiss();
		pageBean.setAddress("Quebeccity377");
		pageBean.clickSignUp();
	}

	@Then("^Select your country from the list alert message should be displayed$")
	public void select_your_country_from_the_list_alert_message_should_be_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		Thread.sleep(2000);
		String expectedalertmessage = "Select your country from the list";
		String actualalertmessage = driver.switchTo().alert().getText();
		System.out.println(actualalertmessage);
		assertEquals(actualalertmessage, expectedalertmessage);
	}

	@When("^user is trying to submit request without entering 'zipCode'$")
	public void user_is_trying_to_submit_request_without_entering_zipCode() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		driver.switchTo().alert().dismiss();
		pageBean.setCountry("Canada");
		pageBean.clickSignUp();
	}

	@Then("^ZIP code must have numeric characters only alert message should be displayed$")
	public void zip_code_must_have_numeric_characters_only_alert_message_should_be_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		Thread.sleep(2000);
		String expectedalertmessage = "ZIP code must have numeric characters only";
		String actualalertmessage = driver.switchTo().alert().getText();
		System.out.println(actualalertmessage);
		assertEquals(actualalertmessage, expectedalertmessage);
	}

	@When("^user is trying to submit request without entering valid 'emailId'$")
	public void user_is_trying_to_submit_request_without_entering_valid_emailId() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		driver.switchTo().alert().dismiss();
		pageBean.setZip("418");
		pageBean.clickSignUp();
	}

	@Then("^You have entered an invalid email address! alert message should be displayed$")
	public void you_have_entered_an_invalid_email_address_alert_message_should_be_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		Thread.sleep(2000);
		String expectedalertmessage = "You have entered an invalid email address!";
		String actualalertmessage = driver.switchTo().alert().getText();
		System.out.println(actualalertmessage);
		assertEquals(actualalertmessage, expectedalertmessage);
	}

	@When("^user is trying to submit request without entering the 'sex'$")
	public void user_is_trying_to_submit_request_without_entering_the_sex() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		driver.switchTo().alert().dismiss();
		pageBean.setEmail("nav@gmail.com");
		pageBean.clickSignUp();
	}

	@Then("^Please Select gender alert message should be displayed$")
	public void please_Select_gender_alert_message_should_be_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		Thread.sleep(2000);
		String expectedalertmessage = "Please Select gender";
		String actualalertmessage = driver.switchTo().alert().getText();
		System.out.println(actualalertmessage);
		assertEquals(actualalertmessage, expectedalertmessage);
	}

	@Given("^User is accessing the same RegistrationPage on browser$")
	public void user_is_accessing_the_same_RegistrationPage_on_browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		driver.get("C:\\BDD_FinalDay\\BDD_Practice\\HtmlPages\\RegistrationForm.html"); // to get the registration form
		pageBean = PageFactory.initElements(driver, RegistrationPage.class);

	}

	@When("^User is trying to submit request after entering valid set of information$")
	public void user_is_trying_to_submit_request_after_entering_valid_set_of_information() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		pageBean.setUserId("12345");
		pageBean.setPassword("password");
		pageBean.setName("Navneet");
		pageBean.setAddress("Quebeccity377");
		pageBean.setCountry("Canada");
		pageBean.setZip("418");
		pageBean.setEmail("nav@gmail.com");
		pageBean.setSex("Female");
		pageBean.clickSignUp();
	}

	@Then("^Your Registration with JobsWorld\\.com has successfully done plz check your registred email addres to activate your profile alert message should be displayed$")
	public void your_Registration_with_JobsWorld_com_has_successfully_done_plz_check_your_registred_email_addres_to_activate_your_profile_alert_message_should_be_displayed()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		Thread.sleep(2000);
		String expectedalertmessage = "Your Registration with JobsWorld.com has successfully done plz check your registred email addres to activate your profile";
		String actualalertmessage = driver.switchTo().alert().getText();
		System.out.println(actualalertmessage);
		assertEquals(actualalertmessage, expectedalertmessage);
		driver.switchTo().alert().dismiss();
	}

	@After
	public void closing() {

		driver.quit();
	}

}
