package com.aymcommerce.pg.clubpampers.bdd.stepdefinition;

import java.util.Random;

import org.openqa.selenium.By;

import com.aymcommerce.pg.clubpampers.bdd.controller.EngineController;
import com.aymcommerce.pg.clubpampers.driverextension.DriverHelpers;
import com.aymcommerce.pg.clubpampers.driverextension.DriverInstanceCreator;

import io.appium.java_client.MobileBy;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps extends DriverHelpers {
	public static String RegistrationXpath = "D:\\AYM\\Pampers_T1_US\\pampers-tier1-iOS-test-automation\\src\\test\\java\\com\\aymcommerce\\pg\\clubpampers\\log\\locators\\refer.properties";

	@Given("User open the application")
	public void user_open_the_application() throws Throwable {

		EngineController.reportInstance.createStep("Given", "User open the application");
		try {

			DriverHelpers.driver = DriverInstanceCreator.iOSDriverInstance();
			// String signupoption = ConfigurationMapper.element.getProperty("signup");
			// DriverInstanceCreator.loadpropertiesFile();

			if (getElement("signup", RegistrationXpath).isDisplayed()) {

				String s = captureScreenshot();

				EngineController.reportInstance.reportStepPass("Signup option is available", s);
			} else {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepFail("Signup option is not enabled", s);
			}
		} catch (Exception e) {
			System.out.println(e);

			EngineController.reportInstance.reportStepFail("failure");

		}
		EngineController.reportInstance.reportCooldown();
	}

	@When("Lands on the registration page")
	public void Lands_on_the_registration_page() throws Throwable {
		EngineController.reportInstance.createStep("When", "Lands on the registration page");
		try {
			clickElement("signup", RegistrationXpath);

			String s = captureScreenshot();
			if (getElement("signupemail", RegistrationXpath).isDisplayed()) {

				EngineController.reportInstance.reportStepPass("user lands on Signup Screen successfully", s);

			} else {
				EngineController.reportInstance.reportStepFail("user failed to land on Signup screen", s);

			}

		} catch (Exception e) {
			System.out.println(e);

			EngineController.reportInstance.reportStepFail("failure");

		}
	}

	@Then("User enter email {string} and password {string}")
	public void user_enter_email_and_password(String string, String string2) throws Throwable {
		EngineController.reportInstance.createStep("When", "User enter email {string} and password {string}");
		try {
			clickElement("signupemail", RegistrationXpath);
			Random rand = new Random();
			try {
				sendKeystoElement("signupemail", "test_aym" + rand.nextInt(1000) + "@gmail.com", RegistrationXpath);
			} catch (Exception e) {
			}
			clickElement("done", RegistrationXpath);

			if (!getElementvalue("signupemail", RegistrationXpath).isEmpty()) {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters Email", s);
			} else {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid Email", s);
			}

		} catch (Exception e) {
			// System.out.println(e);
			String s = captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
		}

		try {

			clickElement("signuppassword", RegistrationXpath);
			try {
				sendKeystoElement("signuppassword", "Test1234", RegistrationXpath);
			} catch (Exception e) {
			}
			clickElement("done", RegistrationXpath);

			if (getElement("go", RegistrationXpath).isEnabled()) {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters password", s);

			} else

			{
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid password", s);
			}

		} catch (Exception e) {
			// System.out.println(e);
			String s = captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
		}

		try {
			clickElement("go", RegistrationXpath);
		} catch (Exception e) {
			// System.out.println(e);
			String s = captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
		}
	}

	@Then("User expects Baby")
	public void user_clicks_singup_button() throws Throwable {
		EngineController.reportInstance.createStep("When", "User redirects to 'Are you expecting baby'  screen");
		try {

			if (getElement("expectbaby", RegistrationXpath).isDisplayed()) {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepPass("Redirected to 'Are you expecting baby'  screen", s);
			} else {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepFail("Not Redirected to 'Are you expecting baby'  screen", s);
			}

			clickElement("noihavebaby", RegistrationXpath);

			clickElement("roundtick", RegistrationXpath);

			if (getElement("bday", RegistrationXpath).isDisplayed()) {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepPass("Redirected to 'My Baby Due Date'  screen", s);
			} else {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepFail("Not Redirected to 'My Baby Due Date'  screen", s);
			}

		} catch (Exception e) {
			System.out.println("I am out");
			String s = captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);

		}
		EngineController.reportInstance.reportCooldown();
	}

	@Then("User selects MyBaby Birthday, Enter Mobile number and redirects to Safety code screen")
	public void user_clicks_accept_button() throws Throwable {
		EngineController.reportInstance.createStep("When",
				"User selects MyBaby Birthday, Enter Mobile number and redirects to Safety code screen");
		try {

			// By pickers = MobileBy.className("UIAView");

			By done = MobileBy.AccessibilityId("Done");
			// WebDriverWait wait;
			// String currentTSstr = String.valueOf(System.currentTimeMillis());
			// long currentTS =
			// Long.valueOf(currentTSstr.substring(currentTSstr.length()-3));

			try {
				driver.findElement(done).click();
			} catch (Exception e) {
			}

			/*
			 * try{ clickElement("bday", RegistrationXpath);}catch(Exception e){} wait = new
			 * WebDriverWait(driver, 10);
			 * 
			 * List<WebElement> pickerEls =
			 * wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(pickers));
			 * 
			 * pickerEls.get(0).sendKeys("July"); pickerEls.get(1).sendKeys("16");
			 * pickerEls.get(2).sendKeys("2019"); driver.findElement(done).click();
			 */

			if (getElement("roundtickdone", RegistrationXpath).isEnabled()) {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepPass("User Selected Babys Birthday", s);

			} else {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepFail("User not selected Babys Birthday", s);
			}

			clickElement("roundtickdone", RegistrationXpath);

			clickElement("mobilenumber", RegistrationXpath);
			sendKeystoElement("mobilenumber", "2243359185", RegistrationXpath);

			clickElement("send", RegistrationXpath);

			String safetycode = getOTPFrom();

			sendKeystoElement("safety", safetycode, RegistrationXpath);

			if (getElement("safety", RegistrationXpath).isDisplayed()) {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepPass("Redirected to Safety code screen", s);

			} else {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepFail("Not redirected to Safety code screen", s);
			}

		} catch (Exception e) {
			System.out.println("I am out");
			String s = captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
		}

		EngineController.reportInstance.reportCooldown();

	}

}