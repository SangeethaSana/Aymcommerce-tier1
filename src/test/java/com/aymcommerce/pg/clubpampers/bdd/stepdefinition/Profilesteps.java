package com.aymcommerce.pg.clubpampers.bdd.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.aymcommerce.pg.clubpampers.bdd.controller.EngineController;
import com.aymcommerce.pg.clubpampers.driverextension.DriverHelpers;
import com.aymcommerce.pg.clubpampers.driverextension.DriverInstanceCreator;
import com.aymcommerce.pg.clubpampers.driverextension.DriverInstanceCreatoriOS;

import io.appium.java_client.MobileBy;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Profilesteps extends DriverHelpers {
	public static String ProfileXpath = System.getProperty("user.dir") + "//src//test//java//com//aymcommerce//pg//clubpampers//log//locators//Profile.properties";

	@Given("Profile setting option is available in Menu")
	public void profile_optio() throws Throwable {

		EngineController.reportInstance.createStep("Given", "Profile setting option is available in Menu");
		try {

			DriverHelpers.driver = DriverInstanceCreatoriOS.iOSDriverInstance();

			clickElement("menu", ProfileXpath);

			if (getElement("profileoption", ProfileXpath).isDisplayed()) {

				String s = captureScreenshot();

				EngineController.reportInstance.reportStepPass("Profile setting option is available", s);
			} else {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepFail("Profile setting option is not available", s);
			}
		} catch (Exception e) {
			System.out.println(e);

			EngineController.reportInstance.reportStepFail("failure");

		}
		EngineController.reportInstance.reportCooldown();
	}

	@Then("Redirects to Rewards Screen")
	public void redirects_to_Rewards_Screen() throws ClassNotFoundException {
		EngineController.reportInstance.createStep("Then", "Redirects to Rewards Screen");

	}

	@When("Redirects to Profile screen")
	public void Redirects_profile_screen() throws Throwable {
		EngineController.reportInstance.createStep("When", "Redirects to Profile screen");
		try {

			clickElement("profileoption", ProfileXpath);

			String s = captureScreenshot();
			if (getElement("profileedit", ProfileXpath).isDisplayed()) {

				EngineController.reportInstance.reportStepPass("Redirects to profile screen", s);

			} else {
				EngineController.reportInstance.reportStepFail("Not redirected to profile screen", s);

			}

		} catch (Exception e) {
			System.out.println(e);

			EngineController.reportInstance.reportStepFail("failure");

		}
		EngineController.reportInstance.reportCooldown();
	}

	@Then("Edit profile option is available")
	public void Type_in_the_scancode() throws Throwable {
		EngineController.reportInstance.createStep("When", "Edit profile option is available");
		try {

			if (getElement("profileedit", ProfileXpath).isDisplayed()) {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepPass("Edit profile option is available", s);
			} else {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepFail("Edit profile option is available", s);
			}

		} catch (Exception e) {
			System.out.println(e);
			String s = captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
		}
		EngineController.reportInstance.reportCooldown();
	}

	@Given("User can redirect to Edit profile screen")
	public void Use_redirect_Editprofile_screen() throws Throwable {

		EngineController.reportInstance.createStep("Given", "User can redirect to Edit profile screen");
		try {

			clickElement("profileedit", ProfileXpath);

			if (getElement("myaccount", ProfileXpath).isDisplayed()) {

				String s = captureScreenshot();

				EngineController.reportInstance.reportStepPass("User redirects to Edit profile screen", s);
			} else {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepFail("User not redirects to Edit profile screen", s);
			}
		} catch (Exception e) {
			System.out.println(e);

			EngineController.reportInstance.reportStepFail("failure");

		}
		EngineController.reportInstance.reportCooldown();
	}

	@When("User can change details")
	public void User_change_details() throws Throwable {
		EngineController.reportInstance.createStep("When", "User can change details");
		try {

			clickElement("firstname", ProfileXpath);
			
            clearkeys("firstnameID");
            
			sendKeystoElement("firstname", "AYM", ProfileXpath);

			clickElement("lastname", ProfileXpath);

			clearkeys("lastnameID");
			
			sendKeystoElement("lastname", "Test", ProfileXpath);

			clickElement("gender", ProfileXpath);

			By done = MobileBy.AccessibilityId("Done");
			try {
				driver.findElement(done).click();
			} catch (Exception e) {
			}

			clickElement("birthday", ProfileXpath);

			try {
				driver.findElement(done).click();
			} catch (Exception e) {
			}

			String s = captureScreenshot();

			EngineController.reportInstance.reportStepPass("User changed the details", s);

			clickElement("update", ProfileXpath);

		} catch (Exception e) {
			System.out.println(e);

			EngineController.reportInstance.reportStepFail("failure");

		}
		EngineController.reportInstance.reportCooldown();
	}

	@Then("Updated details are available in Profile screen")
	public void Updated_details_profilescreen() throws Throwable {
		EngineController.reportInstance.createStep("When", "Updated details are available in Profile screen");
		try {

			if (getElement("updated", ProfileXpath).isDisplayed()) {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepPass("Updated details are available in Profile screen", s);
			} else {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepFail("Updated details are notavailable in Profile screen", s);
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

	@Given("Contact Us option is available in Menu")
	public void contactus_option() throws Throwable {

		EngineController.reportInstance.createStep("Given", "Contact Us option is available in Menu");
		try {

			DriverHelpers.driver = DriverInstanceCreator.iOSDriverInstance();

			clickElement("menu", ProfileXpath);

			driver.executeScript("seetest:client.swipe(\"Down\", 1000, 10)");

			if (getElement("contactus", ProfileXpath).isDisplayed()) {

				String s = captureScreenshot();

				EngineController.reportInstance.reportStepPass("Contact Us option is available", s);
			} else {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepFail("Contact Us option is available", s);
			}
		} catch (Exception e) {
			System.out.println(e);

			EngineController.reportInstance.reportStepFail("failure");

		}
		EngineController.reportInstance.reportCooldown();
	}

	@Then("Redirects to Contact Us Screen")
	public void Redirects_ContactUs_Screen() throws Throwable {
		EngineController.reportInstance.createStep("When", "Redirects to Contact Us Screen");
		try {
			clickElement("contactus", ProfileXpath);
			sleep(5000);
			if (driver.getPageSource().contains("Welcome")) {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepPass("Redirects to Contact Us Screen", s);
			} else {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepFail("Not Redirects to Contact Us Screen", s);
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

	@Given("Procter and Gamble option is available in Menu")
	public void Procter_and_Gamble() throws Throwable {

		EngineController.reportInstance.createStep("Given", "Procter and Gamble option is available in Menu");
		try {

			DriverHelpers.driver = DriverInstanceCreator.iOSDriverInstance();

			clickElement("menu", ProfileXpath);

			// swipe(201, 862, 194, 766, 916);
			driver.executeScript("seetest:client.swipe(\"Down\", 1000, 10)");

			if (getElement("PG", ProfileXpath).isDisplayed()) {

				String s = captureScreenshot();

				EngineController.reportInstance.reportStepPass("Procter and Gamble option is available in Menu", s);
			} else {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepFail("Procter and Gamble option is available in Menu", s);
			}
		} catch (Exception e) {
			System.out.println(e);

			EngineController.reportInstance.reportStepFail("failure");

		}
		EngineController.reportInstance.reportCooldown();
	}

	@Then("Redirects to Procter and Gamble Screen")
	public void Redirects_Procterandgamble_Screen() throws Throwable {
		EngineController.reportInstance.createStep("When", "Redirects to Procter and Gamble Screen");
		try {
			clickElement("PG", ProfileXpath);
			sleep(5000);
			if (driver.getPageSource().contains("Personal Use of Sites")) {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepPass("Redirects to Procter and Gamble Screen", s);
			} else {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepFail("Not Redirects to Procter and Gamble Screen", s);
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
	@Given("Club and Cashback T&C option is available in Menu")
	public void Club_CashbackTC() throws Throwable {

		EngineController.reportInstance.createStep("Given", "Club and Cashback T&C is available in Menu");
		try {

			DriverHelpers.driver = DriverInstanceCreator.iOSDriverInstance();

			clickElement("menu", ProfileXpath);

			driver.executeScript("seetest:client.swipe(\"Down\", 1000, 10)");
			driver.executeScript("seetest:client.swipe(\"Down\", 1000, 10)");

			if (getElement("pampersclub", ProfileXpath).isDisplayed()) {

				String s = captureScreenshot();

				EngineController.reportInstance.reportStepPass("Club and Cashback T&C is available in Menu", s);
			} else {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepFail("Club and Cashback T&C is available in Menu", s);
			}
		} catch (Exception e) {
			System.out.println(e);

			EngineController.reportInstance.reportStepFail("failure");

		}
		EngineController.reportInstance.reportCooldown();
	}

	@Then("Redirects to Club and Cashback T&C Screen")
	public void Redirects_clubandcashbackTC_Screen() throws Throwable {
		EngineController.reportInstance.createStep("When", "Redirects to Club and Cashback T&C Screen");
		try {
			clickElement("pampersclub", ProfileXpath);
			sleep(5000);
			if (driver.getPageSource().contains("Pampers Club")) {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepPass("Redirects to Club and Cashback T&C Screen", s);
			} else {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepFail("Redirects to Club and Cashback T&C Screen", s);
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

	@Given("Rewards T&C option is available in Menu")
	public void RewardsTC() throws Throwable {

		EngineController.reportInstance.createStep("Given", "Rewards T&C is available in Menu");
		try {

			DriverHelpers.driver = DriverInstanceCreator.iOSDriverInstance();
			clickElement("menu", ProfileXpath);

			driver.executeScript("seetest:client.swipe(\"Down\", 1000, 10)");
			driver.executeScript("seetest:client.swipe(\"Down\", 1000, 10)");

			if (getElement("Rewardstc", ProfileXpath).isDisplayed()) {

				String s = captureScreenshot();

				EngineController.reportInstance.reportStepPass("Rewards T&C is available in Menu", s);
			} else {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepFail("Rewards T&C is available in Menu", s);
			}
		} catch (Exception e) {
			System.out.println(e);

			EngineController.reportInstance.reportStepFail("failure");

		}
		EngineController.reportInstance.reportCooldown();
	}

	@Then("Redirects to Rewards T&C Screen")
	public void Redirects_RewardsTC_Screen() throws Throwable {
		EngineController.reportInstance.createStep("When", "Redirects to Rewards T&C Screen");
		try {
			clickElement("Rewardstc", ProfileXpath);

			String s = captureScreenshot();
			EngineController.reportInstance.reportStepPass("Redirects to Rewards T&C Screen", s);

		} catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}
			EngineController.reportInstance.reportCooldown();
			
			}

	@Given("Rewards FAQ option is available in Menu")
	public void RewardsFAQ() throws Throwable {

		EngineController.reportInstance.createStep("Given", "Rewards FAQ is available in Menu");
		try {

			DriverHelpers.driver = DriverInstanceCreator.iOSDriverInstance();

			clickElement("menu", ProfileXpath);

			driver.executeScript("seetest:client.swipe(\"Down\", 1000, 10)");
			driver.executeScript("seetest:client.swipe(\"Down\", 1000, 10)");

			if (getElement("Rewardsfaq", ProfileXpath).isDisplayed()) {

				String s = captureScreenshot();

				EngineController.reportInstance.reportStepPass("Rewards FAQ is available in Menu", s);
			} else {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepFail("Rewards FAQ is available in Menu", s);
			}
		} catch (Exception e) {
			System.out.println(e);

			EngineController.reportInstance.reportStepFail("failure");

		}
		EngineController.reportInstance.reportCooldown();
	}

	@Then("Redirects to Rewards FAQ")
	public void Redirects_RewardsFAQ_Screen() throws Throwable {
		EngineController.reportInstance.createStep("When", "Redirects to Rewards FAQ Screen");
		try {
			clickElement("Rewardsfaq", ProfileXpath);

			String s = captureScreenshot();
			EngineController.reportInstance.reportStepPass("Redirects to Rewards FAQ Screen", s);

		} catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}
			EngineController.reportInstance.reportCooldown();
			
			}

	@Given("Privacy & Cookie Policy option is available in Menu")
	public void Privacy_Cookie_Policy() throws Throwable {

		EngineController.reportInstance.createStep("Given", "Privacy & Cookie Policy option is available in Menu");
		try {

			DriverHelpers.driver = DriverInstanceCreator.iOSDriverInstance();

			clickElement("menu", ProfileXpath);

			driver.executeScript("seetest:client.swipe(\"Down\", 1000, 10)");
			driver.executeScript("seetest:client.swipe(\"Down\", 1000, 10)");

			if (getElement("privacy", ProfileXpath).isDisplayed()) {

				String s = captureScreenshot();

				EngineController.reportInstance.reportStepPass("Privacy & Cookie Policy option is available in Menu",
						s);
			} else {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepFail("Privacy & Cookie Policy option is available in Menu",
						s);
			}
		} catch (Exception e) {
			System.out.println(e);

			EngineController.reportInstance.reportStepFail("failure");

		}
		EngineController.reportInstance.reportCooldown();
	}

	@Then("Redirects to Privacy & Cookie Policy")
	public void Redirect_Privacy_Cookie_Policy() throws Throwable {
		EngineController.reportInstance.createStep("When", "Redirects to Privacy & Cookie Policy Screen");
		try {
			clickElement("privacy", ProfileXpath);
			sleep(5000);
			if (driver.getPageSource().contains("ALL BRANDS,")) {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepPass("Redirects to Privacy & Cookie Policy Screen", s);
			} else {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepFail("Redirects to Privacy & Cookie Policy Screen", s);
			}
			
		//	DriverHelpers.driver = DriverInstanceCreator.iOSDriverInstance();

		//	clickElement("menu", ProfileXpath);
		//	clickElement("Signout", ProfileXpath);
			
			
		} catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}
			EngineController.reportInstance.reportCooldown();
			
			}
	
	
	
	
	@Given("Do not sell information option is available in Menu")
	public void do_not_sell_information_option_is_available_in_menu() throws Throwable {
		
		EngineController.reportInstance.createStep("Given", "Do not sell information option is available in Menu");
		try {

			DriverHelpers.driver = DriverInstanceCreator.iOSDriverInstance();

			clickElement("menu", ProfileXpath);

			driver.executeScript("seetest:client.swipe(\"Down\", 1000, 10)");
			driver.executeScript("seetest:client.swipe(\"Down\", 1000, 10)");

			if (getElement("donotsell", ProfileXpath).isDisplayed()) {

				String s = captureScreenshot();

				EngineController.reportInstance.reportStepPass("Do not sell information option is available in Menu",
						s);
			} else {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepFail("Do not sell information option is not available in Menu",
						s);
			}
		} catch (Exception e) {
			System.out.println(e);

			EngineController.reportInstance.reportStepFail("failure");

		}
		EngineController.reportInstance.reportCooldown();
		
	}
	@Then("Redirects to Do not sell information option")
	public void redirects_to_do_not_sell_information_option() throws Throwable {
		
		EngineController.reportInstance.createStep("Then", "Redirects to Do not sell information option");
		try {
			clickElement("donotsell", ProfileXpath);
			sleep(5000);
			if (getElement("opt-out", ProfileXpath).isDisplayed()) {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepPass("Redirects to Do not sell information option", s);
			} else {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepFail("Redirects to Do not sell information option", s);
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

	

	@Given("Build no is available in Menu")
	public void build_no_is_available_in_menu() throws Throwable {
		
		EngineController.reportInstance.createStep("Given", "Build no is available in Menu");
		try {

			DriverHelpers.driver = DriverInstanceCreator.iOSDriverInstance();

			clickElement("menu", ProfileXpath);

			driver.executeScript("seetest:client.swipe(\"Down\", 1000, 10)");
			driver.executeScript("seetest:client.swipe(\"Down\", 1000, 10)");

			if (getElement("buildno", ProfileXpath).isDisplayed()) {

				String s = captureScreenshot();

				EngineController.reportInstance.reportStepPass("buildno is available in Menu",
						s);
			} else {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepFail("buildno is not available in Menu",
						s);
			}
		} catch (Exception e) {
			System.out.println(e);

			EngineController.reportInstance.reportStepFail("failure");

		}
		EngineController.reportInstance.reportCooldown();
		
	}
	
	
	@Then("user verify Build no")
	public void user_verify_build_no() throws Throwable {
		
		EngineController.reportInstance.createStep("Then", "Redirects to  Build no");
		try {
			if (getElementvalue("buildno", ProfileXpath).contains("3.44.0")) {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepPass("user verify build number", s);
			} else {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to verify build number", s);
			}
			
			DriverHelpers.driver = DriverInstanceCreator.iOSDriverInstance();

			clickElement("menu", ProfileXpath);
			clickElement("Signout", ProfileXpath);
			
			
		} catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}
			EngineController.reportInstance.reportCooldown();
			
		
		
	}








}
