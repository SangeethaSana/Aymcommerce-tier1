
package com.aymcommerce.pg.clubpampers.bdd.stepdefinition;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.Assert;

import com.aymcommerce.pg.clubpampers.bdd.controller.EngineController;
import com.aymcommerce.pg.clubpampers.driverextension.DriverHelpers;
import com.aymcommerce.pg.clubpampers.driverextension.DriverHelpersiOS;
import com.aymcommerce.pg.clubpampers.driverextension.DriverInstanceCreator;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ProfileFeatureSteps extends DriverHelpers{

	private IOSDriver<IOSElement> mDriver;

	private DriverHelpersiOS mHelper;

	@Given("User open the application for profile")
	public void user_open_the_application_for_profile() throws ClassNotFoundException, IOException {
		try{EngineController.reportInstance.createStep("Given", "User open the application for mybaby");
		DriverInstanceCreator.iOSDriver = new DriverInstanceCreator().iOSDriverInstance();
		mHelper = new DriverHelpersiOS();
		try {
			//mHelper.cliclElement("scanning.alert.ok");
			mHelper.waitForElement("scanning.scan");
		} 	 catch (Exception e) {
			System.out.println("I am out");
			
			
			
			
			}
		} catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}
			EngineController.reportInstance.reportCooldown();
			
			}
			

	@Then("User login to the application email {string} and password {string} for profile")
	public void user_login_to_the_application_email_and_password_for_profile(String string, String string2)
			throws ClassNotFoundException, IOException {
	try{try{	EngineController.reportInstance.createStep("Given",
				"User login to the application email and password for profile");

		EngineController.reportInstance.createStep("", "User login to the application email");
		mHelper.sendKeystoElementiOS("registration.email", string, 20000);
		mHelper.sendKeystoElementiOS("registration.password", string2, 10000);
		mHelper.hideKeyboard();
		mHelper.cliclElement("registration.signin");
		assertEquals(true, mHelper.buttonisenable("registration.homepage.popup"));
		mHelper.cliclElement("registration.homepage.popup");
	
	}	 catch (Exception e) {
		System.out.println("I am out");
		
		
		
		
		}
	} catch (Exception e) {
		System.out.println("I am out");
		String s=captureScreenshot();
		EngineController.reportInstance.reportStepFail("failure", s);
		closeCurrentDriver();
		Assert.fail("Failure");
		}
		EngineController.reportInstance.reportCooldown();
		
		}

	@Then("User navigate to profile screen")
	public void user_navigate_to_profile_screen() throws ClassNotFoundException, IOException {
	try{ try{	EngineController.reportInstance.createStep("Given", "User navigate to profile screen");

		mHelper.cliclElement("home.Mprofile");
		mHelper.sleep(3000);
//		mHelper.cliclElement("profile.back");
//		mHelper.cliclElement("profile.back");
		} catch (Exception e) {
		System.out.println("I am out");
		
		
		}
		
		
	} catch (Exception e) {
		System.out.println("I am out");
		String s=captureScreenshot();
		EngineController.reportInstance.reportStepFail("failure", s);
		closeCurrentDriver();
		Assert.fail("Failure");
		}
		EngineController.reportInstance.reportCooldown();
		
		}

	@Given("User view first name and last name")
	public void user_view_first_name_and_last_name() throws ClassNotFoundException, IOException {
	try{try{	EngineController.reportInstance.createStep("Given", "User view first name and last name");
		assertEquals(true, mHelper.buttonisenable("profile.myprofile2"));
	} catch (Exception e) {
		System.out.println("I am out");
		
		
		
		
		}
	} catch (Exception e) {
		System.out.println("I am out");
		String s=captureScreenshot();
		EngineController.reportInstance.reportStepFail("failure", s);
		closeCurrentDriver();
		Assert.fail("Failure");
		}
		EngineController.reportInstance.reportCooldown();
		
		}
	@Then("User view item points history")
	public void user_view_item_points_history() throws ClassNotFoundException, IOException {
		try{try{ EngineController.reportInstance.createStep("Given", "User view item points history");
		assertEquals("20", mHelper.getElementText("profile.points"));
		} catch (Exception e) {
			System.out.println("I am out");
			
			
			
			
			}
		} catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}
			EngineController.reportInstance.reportCooldown();
			
			}

	@Then("user view settings CTA")
	public void user_view_settings_cta() throws ClassNotFoundException, IOException {
	try{try{	EngineController.reportInstance.createStep("Given", "user view settings CTA");
		mHelper.cliclElement("home.Mprofile");
		mHelper.cliclElement("profile.settings");
	} catch (Exception e) {
		System.out.println("I am out");
		
		
		
		
		}
	} catch (Exception e) {
		System.out.println("I am out");
		String s=captureScreenshot();
		EngineController.reportInstance.reportStepFail("failure", s);
		closeCurrentDriver();
		Assert.fail("Failure");
		}
		EngineController.reportInstance.reportCooldown();
		
		}

	@Given("User view history screen")
	public void user_view_history_screen() throws ClassNotFoundException, IOException {
	try{try{	EngineController.reportInstance.createStep("Given", "User view history screen");
		mHelper.cliclElement("profile.points");
		assertEquals(true, mHelper.buttonisenable("profile.history"));
	} catch (Exception e) {
		System.out.println("I am out");
		
		
		
		
		}
	} catch (Exception e) {
		System.out.println("I am out");
		String s=captureScreenshot();
		EngineController.reportInstance.reportStepFail("failure", s);
		closeCurrentDriver();
		Assert.fail("Failure");
		}
		EngineController.reportInstance.reportCooldown();
		
		}

	@Then("User view About Pampers cash")
	public void user_view_about_pampers_cash() throws ClassNotFoundException, IOException {
	try{	try{EngineController.reportInstance.createStep("Given", "User view About Pampers cash");
		mHelper.cliclElement("home.Mprofile");
		mHelper.cliclElement("profile.pointsp");
		} catch (Exception e) {
			System.out.println("I am out");
			
			
			
			
			}
	} catch (Exception e) {
		System.out.println("I am out");
		String s=captureScreenshot();
		EngineController.reportInstance.reportStepFail("failure", s);
		closeCurrentDriver();
		Assert.fail("Failure");
		}
		EngineController.reportInstance.reportCooldown();
		
		}

	@Given("User navigate to scanning screen")
	public void user_navigate_to_scanning_screen() throws ClassNotFoundException, IOException {
		try{try{EngineController.reportInstance.createStep("Given", "User navigate to scanning screen");
		mHelper.cliclElement("scanning.scan");
		mHelper.cliclElement("scanning.choose");
		try {
			mHelper.cliclElement("scanning.ok");
		} catch (Exception e) {
		}
		mHelper.cliclElement("scanning.key");
		mHelper.sendKeystoElement("scanning.enter", "HKFXXKRHKCCWFR9W");
		mHelper.cliclElement("scanning.send");
		mHelper.sleep(5000);
		mHelper.cliclElement("scanning.close");
		mHelper.cliclElement("home.Mprofile");
		} catch (Exception e) {
			System.out.println("I am out");
			
			
			
			
			}
		} catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}
			EngineController.reportInstance.reportCooldown();
			
			}

	@Then("User view updated profile points")
	public void user_view_updated_profile_points() {
		
	}

}