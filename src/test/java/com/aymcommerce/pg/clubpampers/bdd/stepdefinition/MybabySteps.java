package com.aymcommerce.pg.clubpampers.bdd.stepdefinition;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.aymcommerce.pg.clubpampers.bdd.controller.EngineController;
import com.aymcommerce.pg.clubpampers.driverextension.DriverHelpers;
import com.aymcommerce.pg.clubpampers.driverextension.DriverHelpersiOS;
import com.aymcommerce.pg.clubpampers.driverextension.DriverInstanceCreator;
import com.aymcommerce.pg.clubpampers.log.listener.RuntimeLoggerListner;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MybabySteps extends DriverHelpers{

	private IOSDriver<IOSElement> mDriver;

	private DriverHelpersiOS mHelper;

	@Given("User open the application for mybaby")
	public void user_open_the_application_for_mybaby() throws ClassNotFoundException, IOException {
		EngineController.reportInstance.createStep("Given", "User open the application for mybaby");
		try{
		try {
			mHelper.cliclElement("home.okpopup");
			RuntimeLoggerListner.logDetail("Access Pop Appreared");
		} catch (Exception e) {
		}
		DriverInstanceCreator.iOSDriver = new DriverInstanceCreator().iOSDriverInstance();
		mHelper = new DriverHelpersiOS();
		try {
			mHelper.cliclElement("scanning.alert.ok");
		} catch (Exception e) {
			
				
			}
		}
		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}
			EngineController.reportInstance.reportCooldown();
			
			}


	@Given("User open the application for mybaby in loginstate")
	public void user_open_the_application_for_mybaby_in_loginstate()
			throws ClassNotFoundException, IOException {
		try{
			try{
		EngineController.reportInstance.createStep("", "User open the application for mybaby in loginstate");
		DriverInstanceCreator.iOSDriver = new DriverInstanceCreator().iOSDriverInstance();
		mHelper = new DriverHelpersiOS();
		System.out.println("--");
//		mHelper.cliclElement("registration.homepage.popup");
	}
catch (Exception e) {
			
	
			}
	}
	catch (Exception e) {
		System.out.println("I am out");
		String s=captureScreenshot();
		EngineController.reportInstance.reportStepFail("failure", s);
		closeCurrentDriver();
		Assert.fail("Failure");
		}
		EngineController.reportInstance.reportCooldown();
		
		}

	@Then("User login to the application email {string} and password {string}")
	public void user_login_to_the_application_email_and_password(String string, String string2)
			throws ClassNotFoundException, IOException {
		try{try
		{
		EngineController.reportInstance.createStep("", "User login to the application email");
		mHelper.cliclElement("registration.imember");
		mHelper.sendKeystoElementiOS("registration.email", string, 20000);
		mHelper.sendKeystoElementiOS("registration.password", string2, 10000);
		mHelper.hideKeyboard();
		mHelper.cliclElement("registration.signin");
		assertEquals(true, mHelper.buttonisenable("registration.homepage.popup"));
		mHelper.cliclElement("registration.homepage.popup");
	}catch (Exception e) {
		
			
		}
		}
		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}
			EngineController.reportInstance.reportCooldown();
			
			}

	@Then("User navigate to mybaby screen")
	public void user_navigate_to_mybaby_screen() throws ClassNotFoundException, IOException {
		try{
			try{
		
			EngineController.reportInstance.createStep("", "User navigate to mybaby screen");
		mHelper.cliclElement("home.profile");
		mHelper.cliclElement("home.mybaby");
		mHelper.sleep(3000);
	}
	catch (Exception e) {
		
			
		}
	}
	catch (Exception e) {
		System.out.println("I am out");
		String s=captureScreenshot();
		EngineController.reportInstance.reportStepFail("failure", s);
		closeCurrentDriver();
		Assert.fail("Failure");
		}
		EngineController.reportInstance.reportCooldown();
		
		}

	@Then("user view add baby name option")
	public void user_view_add_baby_name_option() throws ClassNotFoundException, IOException {
		try{try{
			EngineController.reportInstance.createStep("", "user view add baby name option");
		
		assertEquals(mHelper.buttonisenable("mybaby.add"), true);
	}
catch (Exception e) {
	
				
			}
		}
		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}
			EngineController.reportInstance.reportCooldown();
			
			}
	@Then("User taps add baby option")
	public void user_taps_add_baby_option() throws ClassNotFoundException, IOException {
		try{
			try{
		EngineController.reportInstance.createStep("", "User taps add baby option");
		ScrollToElement("mybaby.add", "Down");
		mHelper.cliclElement("mybaby.add");
	}
catch (Exception e) {
	
				
			}
	}
	catch (Exception e) {
		System.out.println("I am out");
		String s=captureScreenshot();
		EngineController.reportInstance.reportStepFail("failure", s);
		closeCurrentDriver();
		Assert.fail("Failure");
		}
		EngineController.reportInstance.reportCooldown();
		
		}
	@Then("User leaves DOB empty and try to add baby info")
	public void user_leaves_dob_empty_and_try_to_add_baby_info() throws ClassNotFoundException, IOException {
	try{try{	EngineController.reportInstance.createStep("", "User leaves DOB empty and try to add baby info");
		mHelper.cliclElement("mybaby.go");
	}
	catch (Exception e) {
		
			
		}
	}
	catch (Exception e) {
		System.out.println("I am out");
		String s=captureScreenshot();
		EngineController.reportInstance.reportStepFail("failure", s);
		closeCurrentDriver();
		Assert.fail("Failure");
		}
		EngineController.reportInstance.reportCooldown();
		
		}

	@Then("User views error message")
	public void user_views_error_message() throws ClassNotFoundException, IOException {
		try{
			try{
		
		EngineController.reportInstance.createStep("", "User views error message");
		assertEquals(mHelper.buttonisenable("mybaby.go"), true);
	}catch (Exception e) {
		
			
		}
	}
	catch (Exception e) {
		System.out.println("I am out");
		String s=captureScreenshot();
		EngineController.reportInstance.reportStepFail("failure", s);
		closeCurrentDriver();
		Assert.fail("Failure");
		}
		EngineController.reportInstance.reportCooldown();
		
		}

	@Then("User adds baby DOB and save info")
	public void user_adds_baby_dob_and_save_info() throws ClassNotFoundException, IOException {
		try{
			try{EngineController.reportInstance.createStep("", "User adds baby DOB and save info");
		
		mHelper.cliclElement("mybaby.dob");
		mHelper.cliclElement("registration.date.done");
		mHelper.cliclElement("mybaby.go");
	}catch (Exception e) {
		
			
		}
	}
	catch (Exception e) {
		System.out.println("I am out");
		String s=captureScreenshot();
		EngineController.reportInstance.reportStepFail("failure", s);
		closeCurrentDriver();
		Assert.fail("Failure");
		}
		EngineController.reportInstance.reportCooldown();
		
		}

	@Then("User view baby info")
	public void user_view_baby_info() throws ClassNotFoundException, IOException {
		try{try{
		EngineController.reportInstance.createStep("", "User view baby info");
		assertEquals(mHelper.buttonisenable("mybaby.newbaby"), true);
	}catch (Exception e) {
		
			
		}
		}
		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}
			EngineController.reportInstance.reportCooldown();
			
			}

	@Then("User adds baby DOB name save info")
	public void user_adds_baby_dob_name_save_info() throws ClassNotFoundException, IOException {
		try{ try{EngineController.reportInstance.createStep("", "User adds baby DOB name save info");
		mHelper.cliclElement("mybaby.dob");
		mHelper.cliclElement("registration.date.done");
		mHelper.sendKeystoElementiOS("mybaby.name", "Ana", 5000);
		mHelper.cliclElement("mybaby.go");
	}catch (Exception e) {
		
			
		}
		}
		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}
			EngineController.reportInstance.reportCooldown();
			
			}

	@Then("User view baby info and name")
	public void user_view_baby_info_and_name() throws ClassNotFoundException, IOException {
	try{	try{EngineController.reportInstance.createStep("", "User view baby info and name");
		assertEquals(mHelper.getElementText("mybaby.ana"), "Ana");
	}catch (Exception e) {
		
			
		}
	}
	catch (Exception e) {
		System.out.println("I am out");
		String s=captureScreenshot();
		EngineController.reportInstance.reportStepFail("failure", s);
		closeCurrentDriver();
		Assert.fail("Failure");
		}
		EngineController.reportInstance.reportCooldown();
		
		}

	@Then("User adds baby future DOB")
	public void user_adds_baby_future_dob() throws ClassNotFoundException {
		try{EngineController.reportInstance.createStep("", "User adds baby future DOB");
		mHelper.cliclElement("mybaby.dob");
		mHelper.swipedown(0.8, 0.6);
		mHelper.cliclElement("registration.date.done");
		mHelper.cliclElement("mybaby.go");
	}catch (Exception e) {
		
			
		}
		EngineController.reportInstance.reportCooldown();
		
		}

	@Then("User adds name gender DOB")
	public void user_adds_name_gender_dob() throws ClassNotFoundException, IOException {
	try{	try{EngineController.reportInstance.createStep("", "User adds name gender DOB");
		mHelper.cliclElement("mybaby.dob");
		mHelper.cliclElement("registration.date.done");
		mHelper.sendKeystoElementiOS("mybaby.name", "Ana", 5000);
		mHelper.cliclElement("mybaby.gender");
		mHelper.cliclElement("mybaby.gender.male");
		mHelper.cliclElement("mybaby.go");
	}catch (Exception e) {
		
			
		}
	}
	catch (Exception e) {
		System.out.println("I am out");
		String s=captureScreenshot();
		EngineController.reportInstance.reportStepFail("failure", s);
		closeCurrentDriver();
		Assert.fail("Failure");
		}
		EngineController.reportInstance.reportCooldown();
		
		}

	@Then("User taps a baby info")
	public void user_taps_a_baby_info() throws ClassNotFoundException, IOException {
		try{
			try{EngineController.reportInstance.createStep("", "User taps a baby info");
		
		mHelper.cliclElement("mybaby.newbaby");
	}catch (Exception e) {
		
	}	
		}
	
	catch (Exception e) {
		System.out.println("I am out");
		String s=captureScreenshot();
		EngineController.reportInstance.reportStepFail("failure", s);
		closeCurrentDriver();
		Assert.fail("Failure");
		}
		EngineController.reportInstance.reportCooldown();
		
		}

	@Then("User removes the baby info")
	public void user_removes_the_baby_info() throws ClassNotFoundException, IOException {
		try{try{EngineController.reportInstance.createStep("", "User removes the baby info");
		mHelper.cliclElement("mybaby.newbab.remove");
		mHelper.cliclElement("mybaby.newbab.remove.confirm");
	}
catch (Exception e) {
			
				
			}
		}
		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}
			EngineController.reportInstance.reportCooldown();
			
			}

	@Then("User views only default baby")
	public void user_views_only_default_baby() throws ClassNotFoundException, IOException {
		try{try{EngineController.reportInstance.createStep("", "User views only default baby");
		mHelper.cliclElement("mybaby.default");
	}catch (Exception e) {
		
			
		}
		}
		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}
			EngineController.reportInstance.reportCooldown();
			
			}

	@Then("User taps keep baby info")
	public void user_taps_keep_baby_info() throws ClassNotFoundException, IOException {
		try{try{EngineController.reportInstance.createStep("", "User taps keep baby info");
		mHelper.cliclElement("mybaby.newbab.remove");
		mHelper.cliclElement("mybaby.newbab.remove.nokeep");
	}catch (Exception e) {
		
			
		}
		}
		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}
			EngineController.reportInstance.reportCooldown();
			
			}

	@Then("User edits babys name")
	public void user_edits_babys_name() throws ClassNotFoundException, IOException {
		try{try{EngineController.reportInstance.createStep("", "User edits babys name");
		mHelper.cliclElement("mybaby.newbab.edit");
		mHelper.cliclElement("mybaby.newbaby.name.ana");
		mHelper.sendKeystoElementiOS("mybaby.newbaby.name.ana", "Eva", 4000);
		mHelper.cliclElement("mybaby.go");
	}catch (Exception e) {
		
			
		}
		}
		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}
			EngineController.reportInstance.reportCooldown();
			
			}

	@Then("User view updated name")
	public void user_view_updated_name() throws ClassNotFoundException, IOException {
		try{try{EngineController.reportInstance.createStep("", "User view updated name");
		assertEquals(mHelper.getElementText("mybaby.eva"), "Eva");
	}
catch (Exception e) {
			
				
			}
		}
		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}
			EngineController.reportInstance.reportCooldown();
			
			}
	@Then("user taps add due date baby")
	public void user_taps_add_due_date_baby() throws ClassNotFoundException, IOException {
		try{
			try{EngineController.reportInstance.createStep("", "user taps add due date baby");
		
		mHelper.swipedown();
		mHelper.swipedown();
		mHelper.swipedown();
		mHelper.cliclElement("mybaby.duedate");
	}catch (Exception e) {
		
			
		}
	}
	catch (Exception e) {
		System.out.println("I am out");
		String s=captureScreenshot();
		EngineController.reportInstance.reportStepFail("failure", s);
		closeCurrentDriver();
		Assert.fail("Failure");
		}
		
		
		EngineController.reportInstance.reportCooldown();
		
		}

	@Then("User add the past due date of a baby")
	public void user_add_the_past_due_date_of_a_baby() throws ClassNotFoundException, IOException {
	try{try{	EngineController.reportInstance.createStep("", "User add the past due date of a baby");
		mHelper.swipedown(0.8, 0.9);
	}catch (Exception e) {
		
			
		}
	}
	catch (Exception e) {
		System.out.println("I am out");
		String s=captureScreenshot();
		EngineController.reportInstance.reportStepFail("failure", s);
		closeCurrentDriver();
		Assert.fail("Failure");
		}
		EngineController.reportInstance.reportCooldown();
		
		}

	@Then("User view baby date as one day")
	public void user_view_baby_date_as_one_day() throws ClassNotFoundException, IOException {
	try{	try{EngineController.reportInstance.createStep("", "User view baby date as one day");
		mHelper.cliclElement("mybaby.gender.male");
	}catch (Exception e) {
		
			
		}
	}
	catch (Exception e) {
		System.out.println("I am out");
		String s=captureScreenshot();
		EngineController.reportInstance.reportStepFail("failure", s);
		closeCurrentDriver();
		Assert.fail("Failure");
		}
		EngineController.reportInstance.reportCooldown();
		
		}

	@Then("User add the future due date of a baby")
	public void user_add_the_future_due_date_of_a_baby() throws ClassNotFoundException, IOException {
		try{try{EngineController.reportInstance.createStep("", "User add the future due date of a baby");
		mHelper.swipedown(0.9, 0.7);
		mHelper.cliclElement("mybaby.gender.male");
	}catch (Exception e) {
		
			
		}
		}
		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}
			EngineController.reportInstance.reportCooldown();
			
			}

	@Then("User deletes all baby")
	public void user_deletes_all_baby() throws ClassNotFoundException, IOException {
	try{	try{EngineController.reportInstance.createStep("", "User deletes all baby");
		mHelper.sleep(2000);
		for (int i = 1; i <= 5; i++) {
			try {
				mHelper.driver.findElement(By.xpath("(//*[@class='UIAImage'])[2]")).click();
				mHelper.cliclElement("mybaby.newbab.remove");
				mHelper.cliclElement("mybaby.newbab.remove.confirm");
				RuntimeLoggerListner.logDetail("A Baby Info Deleted");
				mHelper.sleep(3000);
			} catch (Exception e) {
				RuntimeLoggerListner.logDetail("No Baby Found");
				break;
			}
		}
		EngineController.reportInstance.reportCooldown();
	}
catch (Exception e) {
			
				
			}
	}
	catch (Exception e) {
		System.out.println("I am out");
		String s=captureScreenshot();
		EngineController.reportInstance.reportStepFail("failure", s);
		closeCurrentDriver();
		Assert.fail("Failure");
		}
		EngineController.reportInstance.reportCooldown();
		
		}
	@Given("User navigate to parenting screen")
	public void user_navigate_to_parenting_screen() throws ClassNotFoundException, IOException {
		try{
			try{EngineController.reportInstance.createStep("", "User navigate to parenting screen");
		
		mHelper.cliclElement("home.parenting");
	}
catch (Exception e) {
			
				
			}
	}
	catch (Exception e) {
		System.out.println("I am out");
		String s=captureScreenshot();
		EngineController.reportInstance.reportStepFail("failure", s);
		closeCurrentDriver();
		Assert.fail("Failure");
		}
		EngineController.reportInstance.reportCooldown();
		
		}
	@Then("User add a baby")
	public void user_add_a_baby() throws ClassNotFoundException, IOException {
	try{	try{EngineController.reportInstance.createStep("", "User add a baby");
		mHelper.cliclElement("Parenting.dropdown");
		mHelper.cliclElement("Parenting.addbaby");
		mHelper.cliclElement("mybaby.go");
		assertEquals(mHelper.buttonisenable("mybaby.newbaby"), true);
	}catch (Exception e) {
		
			
		}
	}
	catch (Exception e) {
		System.out.println("I am out");
		String s=captureScreenshot();
		EngineController.reportInstance.reportStepFail("failure", s);
		closeCurrentDriver();
		Assert.fail("Failure");
		}
		EngineController.reportInstance.reportCooldown();
		
		}
}
