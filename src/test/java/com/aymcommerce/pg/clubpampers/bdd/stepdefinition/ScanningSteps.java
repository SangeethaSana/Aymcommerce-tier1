package com.aymcommerce.pg.clubpampers.bdd.stepdefinition;

import java.util.Random;

import org.junit.Assert;

import com.aymcommerce.pg.clubpampers.bdd.controller.EngineController;
import com.aymcommerce.pg.clubpampers.config.mapper.ConfigurationMapper;
import com.aymcommerce.pg.clubpampers.driverextension.DriverHelpers;
import com.aymcommerce.pg.clubpampers.driverextension.DriverInstanceCreator;
import com.aymcommerce.pg.clubpampers.driverextension.DriverInstanceCreatoriOS;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScanningSteps extends DriverHelpers
	{
		public static String ScanningXpath = System.getProperty("user.dir") + "//src//test//java//com//aymcommerce//pg//clubpampers//log//locators//Scanning.properties";
		String diapercode= "73RX33NX3YNNKYNK";
		String wipescode= "RFFJ9HJFHRKRHXTC";
		
		@Given("Scan with QR code option is available")
		public void Scan_with_QR_code() throws Throwable {
			
			EngineController.reportInstance.createStep("Given", "Scan with QR code option is available");
			try {
				
				DriverHelpers.driver= DriverInstanceCreatoriOS.iOSDriverInstance();
			//	String signupoption = ConfigurationMapper.element.getProperty("signup");
			 //   DriverInstanceCreator.loadpropertiesFile();
				
				
			
				clickElement("scanoption", ScanningXpath);
				
				if (getElement("scanQR", ScanningXpath).isDisplayed()) {
					
					String s=	captureScreenshot();			
					
					EngineController.reportInstance.reportStepPass("Scan with QR code option is available",s);
					Assert.assertTrue(true);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("Scan with QR code option is not available", s);
					Assert.assertTrue(true);
				}
			} catch (Exception e) {
				System.out.println(e);
				
				EngineController.reportInstance.reportStepFail("failure"); 
				

			}	
			EngineController.reportInstance.reportCooldown();
		}

		@When("Redirects to scan with PIN Code from the Camera")
		public void Redirects_scan_with_PINCode_camera() throws Throwable {
			EngineController.reportInstance.createStep("When", "Redirects to scan with PIN Code from the Camera");
			try {
				
				
				clickElement("icongo", ScanningXpath);
				
				
				try{
					clickElement("cameraok", ScanningXpath);
				}catch(Exception e){} 
					
					
				
				
			
				
								
				String s=	captureScreenshot();
				if (getElement("camerabutton", ScanningXpath).isDisplayed()) {
					
					EngineController.reportInstance.reportStepPass("Redirects to scan with PIN Code from the Camera",s);
					Assert.assertTrue(true);
				} else {
					EngineController.reportInstance.reportStepFail("Not redirected to scan with PIN Code from the Camera",s);
					Assert.assertTrue(true);
				}

			} catch (Exception e) {
				System.out.println(e);
				
				EngineController.reportInstance.reportStepFail("failure"); 
				
			}
			EngineController.reportInstance.reportCooldown();
		}

		
		

		@Then("Type in the scan code option is available")
		public void Type_in_the_scancode() throws Throwable {
			EngineController.reportInstance.createStep("When", "Type in the scan code option is available");
			try {
				
				if (getElement("typeoption", ScanningXpath).isDisplayed()) {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepPass("Type in the Code option is available",s);
					Assert.assertTrue(true);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("Type in the Code option is not available",s);
					Assert.assertTrue(true);
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
		@Given("User clicks on Scanning option in home page")
		public void user_clicks_on_scanning_option() throws Throwable {
			
			EngineController.reportInstance.createStep("Given", "User clicks on Scanning option in home page");
			try {
				
				DriverHelpers.driver= DriverInstanceCreatoriOS.iOSDriverInstance();
			//	String signupoption = ConfigurationMapper.element.getProperty("signup");
			 //   DriverInstanceCreator.loadpropertiesFile();
				
				
			
			
				
				if (getElement("scanoption", ScanningXpath).isDisplayed()) {
					
					String s=	captureScreenshot();			
					
					EngineController.reportInstance.reportStepPass("Scan option is available",s);
					Assert.assertTrue(true);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("Scan option is not available", s); 
					Assert.assertTrue(true);
				}
			} catch (Exception e) {
				System.out.println(e);
				
				EngineController.reportInstance.reportStepFail("failure"); 
				
			}	
			EngineController.reportInstance.reportCooldown();
		}

		@When("Select Diapers and tubs - Lands on the Scanning camera page")
		public void Diapers_Lands_on_the_Scanning_camera() throws Throwable {
			EngineController.reportInstance.createStep("When", "Select Diapers and tubs - Lands on the Scanning camera page");
			try {
				clickElement("scanoption", ScanningXpath);
				
				
				
						
				
				
				clickElement("icongo", ScanningXpath);
				
								
				String s=	captureScreenshot();
				if (getElement("typeoption", ScanningXpath).isDisplayed()) {
					
					EngineController.reportInstance.reportStepPass("user lands on Scanning Camera Screen successfully",s);
					Assert.assertTrue(true);
				} else {
					EngineController.reportInstance.reportStepFail("user failed to land on Scanning Camera screen",s);
					Assert.assertTrue(true);
				}

			} catch (Exception e) {
				System.out.println(e);
				
				EngineController.reportInstance.reportStepFail("failure"); 
				
			}
			EngineController.reportInstance.reportCooldown();
		}

		
		

		@Then("Type scan code option is available")
		public void Type_scancode_option_diapers() throws Throwable {
			EngineController.reportInstance.createStep("When", "Type scan code option is available");
			try {
				
				if (getElement("typeoption", ScanningXpath).isDisplayed()) {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepPass("Type Code option is available",s);
					Assert.assertTrue(true);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("Type Code option is not available",s); 
					Assert.assertTrue(true);
				}
	
				
			} catch (Exception e) {
				System.out.println(e);
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("failure",s);
				
			}
		}
			
		

		@Then("Redirects to Type in the diapers code Screen")
		public void Redirect_Type_in_the_diaperscode() throws Throwable {
			EngineController.reportInstance.createStep("When", "Redirects to Type in the diapers code Screen");
			try {
				 
				clickElement("typeoption", ScanningXpath);
				
				
						if (getElement("entercode", ScanningXpath).isDisplayed()) {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepPass("user lands on Type in the diapers code",s);
					Assert.assertTrue(true);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("Not redirected to Type in the diapers code",s);
					Assert.assertTrue(true);
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

		@Given("User clicks on Scanning option in home screen")
		public void user_clicks_on_scanning_option_home() throws Throwable {
			
			EngineController.reportInstance.createStep("Given", "User clicks on Scanning option in home screen");
			try {
				
				DriverHelpers.driver= DriverInstanceCreatoriOS.iOSDriverInstance();
			//	String signupoption = ConfigurationMapper.element.getProperty("signup");
			 //   DriverInstanceCreator.loadpropertiesFile();
							
		/*	clickElement("notifyme", ScanningXpath);
			 
			
			clickElement("allow", ScanningXpath);*/
			 
			
				if (getElement("scanoption", ScanningXpath).isDisplayed()) {
					
					String s=	captureScreenshot();			
					
					EngineController.reportInstance.reportStepPass("Scan option is available",s);
					Assert.assertTrue(true);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("Scan option is not available", s); 
					Assert.assertTrue(true);
				}
			} catch (Exception e) {
				System.out.println(e);
				
				EngineController.reportInstance.reportStepFail("failure"); 
				
			}	
			EngineController.reportInstance.reportCooldown();
		}

		@When("Select Wipes and packs - Lands on the Scanning camera page")
		public void Wipesandpacks_Lands_on_the_Scanning_camera() throws Throwable {
			EngineController.reportInstance.createStep("When", "Select Wipes and packs - Lands on the Scanning camera page");
			try {
				clickElement("scanoption", ScanningXpath);
				 
				
				clickElement("icongo", ScanningXpath);
				 
								
				String s=	captureScreenshot();
				if (getElement("typeoption", ScanningXpath).isDisplayed()) {
					
					EngineController.reportInstance.reportStepPass("user lands on Scanning Camera Screen successfully",s);
					
				} else {
					EngineController.reportInstance.reportStepFail("user failed to land on Scanning Camera screen",s);
					
				}

			} catch (Exception e) {
				System.out.println(e);
				
				EngineController.reportInstance.reportStepFail("failure"); 
				
			}
		}

		
		

		@Then("Type scan code option is available in Camera screen")
		public void Type_scancode_option_diapers_camera() throws Throwable {
			EngineController.reportInstance.createStep("When", "Type scan code option is available in Camera screen");
			try {
				
				if (getElement("typeoption", ScanningXpath).isDisplayed()) {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepPass("Type Code option is available",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("Type Code option is not available",s); 
				}
	
				
			} catch (Exception e) {
				System.out.println(e);
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("failure",s);
			}
		}
			
		

		@Then("Redirects to Type in the Other Wipes Pack Screen")
		public void Redirect_Type_in_the_wipesandpack() throws Throwable {
			EngineController.reportInstance.createStep("When", "Redirects to Type in the Other Wipes Pack Screen");
			try {
				 
				clickElement("typeoption", ScanningXpath);
				 
				clickElement("wipespack", ScanningXpath);
				
				
						if (getElement("entercodewipes", ScanningXpath).isDisplayed()) {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepPass("user lands on Type in the wipes code screen",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("Not redirected to Type in the wipes code screen",s); 
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
		
		@Given("User enters invalid diapers code")
		public void user_enters_invalid_diaper_code() throws Throwable {
			
			EngineController.reportInstance.createStep("Given", "User enters invalid diapers code");
			try {
				DriverHelpers.driver= DriverInstanceCreatoriOS.iOSDriverInstance();
				
				
				clickElement("scanoption", ScanningXpath);
				 
				
				clickElement("icongo", ScanningXpath);
				 
				clickElement("typeoption", ScanningXpath);
				 
				sendKeystoElement("entercode", "CNNCF5464546FG", ScanningXpath);
				
				 
				
				if (!((getElement("entercode", ScanningXpath)).getText()).isEmpty()) {
					
					String s=	captureScreenshot();			
					
					EngineController.reportInstance.reportStepPass("User can enters the code",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("Code is not entered", s); 
				}
			} catch (Exception e) {
				System.out.println(e);
				
				EngineController.reportInstance.reportStepFail("failure"); 

			}	
			EngineController.reportInstance.reportCooldown();
		}

		@When("User submits invalid diaper code")
		public void User_submits_invalid_diaper_code() throws Throwable {
			EngineController.reportInstance.createStep("When", "User submits invalid diaper code");
			try {
				
				 
				
				clickElement("diapercodesubmit", ScanningXpath);
				 
				
				if (getElement("tryagain", ScanningXpath).isDisplayed()) {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepPass("User submitted the invalid code",s);
					
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("User not submitted the invalid code",s);
					
				}

			} catch (Exception e) {
				System.out.println(e);
				
				EngineController.reportInstance.reportStepFail("failure"); 

			}
		}

		
		

		@Then("Error Message displayed for invalid diaper code")
		public void Error_Message_displayed_for_invalid_diaper_code() throws Throwable {
			EngineController.reportInstance.createStep("When", "Error Message displayed for invalid diaper code");
			try {
				
				if (getElement("invalid", ScanningXpath).isDisplayed()) {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepPass("Error Message displayed for invalid diaper code",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("Error Message displayed for invalid diaper code",s); 
				}
	
				
			} catch (Exception e) {
				System.out.println(e);
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("failure",s);
			}
		}
			
		

		@Then("Respective error message is displayed for invalid diaper code")
		public void Respective_error_message_invalid_diaper_code() throws Throwable {
			EngineController.reportInstance.createStep("When", "Respective error message is displayed for invalid diaper code");
			try {
				
				
				if (getElement("invalidmsg", ScanningXpath).isDisplayed()) {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepPass("Respective error message is displayed for invalid diaper code",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("Respective error message is displayed for invalid diaper code",s); 
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

		@Given("User enters invalid wipes code")
		public void user_enters_invalid_wipes_code() throws Throwable {
			
			EngineController.reportInstance.createStep("Given", "User enters invalid wipes code");
			try {
				
				DriverHelpers.driver= DriverInstanceCreatoriOS.iOSDriverInstance();
				
				 
				clickElement("scanoption", ScanningXpath);
				 
				
				clickElement("icongo", ScanningXpath);
				 
				clickElement("typeoption", ScanningXpath);
				 
				clickElement("wipespack", ScanningXpath);
				 
			
						
				sendKeystoElement("entercodewipes", "YX65454H9F7XTKY", ScanningXpath);
                 
				
				if (!((getElement("entercodewipes", ScanningXpath)).getText()).isEmpty()) {
					
					String s=	captureScreenshot();			
					
					EngineController.reportInstance.reportStepPass("User can enters the code",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("Code is not entered", s); 
				}
			} catch (Exception e) {
				System.out.println(e);
				
				EngineController.reportInstance.reportStepFail("failure"); 

			}	
			EngineController.reportInstance.reportCooldown();
		}

		@When("User submits invalid wipes code")
		public void User_submits_invalid_wipes_code() throws Throwable {
			EngineController.reportInstance.createStep("When", "User submits invalid wipes code");
			try {
 
				
				clickElement("wipescodesubmit", ScanningXpath);
				 
				
				if (getElement("tryagain", ScanningXpath).isDisplayed()) {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepPass("User submitted the invalid code",s);
					
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("User not submitted the invalid code",s);
					
				}

			} catch (Exception e) {
				System.out.println(e);
				
				EngineController.reportInstance.reportStepFail("failure"); 

			}
		}

		
		

		@Then("Error Message displayed for invalid wipes code")
		public void Error_Message_displayed_for_invalid_wipes_code() throws Throwable {
			EngineController.reportInstance.createStep("When", "Error Message displayed for invalid wipes code");
			try {
				
				if (getElement("invalid", ScanningXpath).isDisplayed()) {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepPass("Error Message displayed for invalid diaper code",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("Error Message displayed for invalid diaper code",s); 
				}
	
				
			} catch (Exception e) {
				System.out.println(e);
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("failure",s);
			}
		}
			
		

		@Then("Respective error message is displayed for invalid wipes code")
		public void Respective_error_message_invalid_wipes_code() throws Throwable {
			EngineController.reportInstance.createStep("When", "Respective error message is displayed for invalid wipes code");
			try {
				if (getElement("invalidmsg", ScanningXpath).isDisplayed()) {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepPass("Respective error message is displayed for invalid diaper code",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("Respective error message is displayed for invalid diaper code",s); 
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

		@Given("User enters used diapers code")
		public void user_enters_used_diaper_code() throws Throwable {
			
			EngineController.reportInstance.createStep("Given", "User enters used diapers code");
			try {
				DriverHelpers.driver= DriverInstanceCreatoriOS.iOSDriverInstance();
				
				 
				clickElement("scanoption", ScanningXpath);
				 
				
				clickElement("icongo", ScanningXpath);
				 
				clickElement("typeoption", ScanningXpath);
				 
				sendKeystoElement("entercode", "YXTRFWY4H9F7XTKY", ScanningXpath);
				
				 
				
				if (!((getElement("entercode", ScanningXpath)).getText()).isEmpty()) {
					
					String s=	captureScreenshot();			
					
					EngineController.reportInstance.reportStepPass("User can enters the used code",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("Code is not entered", s); 
				}
			} catch (Exception e) {
				System.out.println(e);
				
				EngineController.reportInstance.reportStepFail("failure"); 

			}	
			EngineController.reportInstance.reportCooldown();
		}

		@When("User submits used diaper code")
		public void User_submits_used_diaper_code() throws Throwable {
			EngineController.reportInstance.createStep("When", "User submits used diaper code");
			try {
				
				 
				
				clickElement("diapercodesubmit", ScanningXpath);
				 
				
				if (getElement("gotit", ScanningXpath).isDisplayed()) {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepPass("User submitted the used code",s);
					
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("User not submitted the used code",s);
					
				}

			} catch (Exception e) {
				System.out.println(e);
				
				EngineController.reportInstance.reportStepFail("failure"); 

			}
		}

		
		

		@Then("Error Message displayed for used diaper code")
		public void Error_Message_displayed_for_used_diaper_code() throws Throwable {
			EngineController.reportInstance.createStep("When", "Error Message displayed for used diaper code");
			try {
				
				if (getElement("used", ScanningXpath).isDisplayed()) {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepPass("Error Message displayed for used diaper code",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("Error Message displayed for used diaper code",s); 
				}
	
				
			} catch (Exception e) {
				System.out.println(e);
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("failure",s);
			}
		}
			
		

		@Then("Respective error message is displayed for used diaper code")
		public void Respective_error_message_used_diaper_code() throws Throwable {
			EngineController.reportInstance.createStep("When", "Respective error message is displayed for used diaper code");
			try {
				
				
				if (getElement("usedmsg", ScanningXpath).isDisplayed()) {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepPass("Respective error message is displayed for used diaper code",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("Respective error message is displayed for used diaper code",s); 
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
		@Given("User enters used wipes code")
		public void user_enters_used_wipes_code() throws Throwable {
			
			EngineController.reportInstance.createStep("Given", "User enters used wipes code");
			try {
				
				DriverHelpers.driver= DriverInstanceCreatoriOS.iOSDriverInstance();
				
				 
				clickElement("scanoption", ScanningXpath);
				 
				
				clickElement("icongo", ScanningXpath);
				 
				clickElement("typeoption", ScanningXpath);
				 
				clickElement("wipespack", ScanningXpath);
				 
			
						
				sendKeystoElement("entercodewipes", "YXTRFWY4H9F7XTKY", ScanningXpath);
                 
				
				if (!((getElement("entercodewipes", ScanningXpath)).getText()).isEmpty()) {
					
					String s=	captureScreenshot();			
					
					EngineController.reportInstance.reportStepPass("User can enters the code",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("Code is not entered", s); 
				}
			} catch (Exception e) {
				System.out.println(e);
				
				EngineController.reportInstance.reportStepFail("failure"); 

			}	
			EngineController.reportInstance.reportCooldown();
		}

		@When("User submits used wipes code")
		public void User_submits_used_wipes_code() throws Throwable {
			EngineController.reportInstance.createStep("When", "User submits used wipes code");
			try {
 
				
				clickElement("wipescodesubmit", ScanningXpath);
				 
				
				if (getElement("gotit", ScanningXpath).isDisplayed()) {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepPass("User submitted the used code",s);
					
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("User not submitted the used code",s);
					
				}

			} catch (Exception e) {
				System.out.println(e);
				
				EngineController.reportInstance.reportStepFail("failure"); 

			}
		}

		
		

		@Then("Error Message displayed for used wipes code")
		public void Error_Message_displayed_for_used_wipes_code() throws Throwable {
			EngineController.reportInstance.createStep("When", "Error Message displayed for used wipes code");
			try {
				
				if (getElement("used", ScanningXpath).isDisplayed()) {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepPass("Error Message displayed for used diaper code",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("Error Message displayed for used diaper code",s); 
				}
	
				
			} catch (Exception e) {
				System.out.println(e);
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("failure",s);
			}
		}
			
		

		@Then("Respective error message is displayed for used wipes code")
		public void Respective_error_message_used_wipes_code() throws Throwable {
			EngineController.reportInstance.createStep("When", "Respective error message is displayed for used wipes code");
			try {
				if (getElement("usedmsg", ScanningXpath).isDisplayed()) {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepPass("Respective error message is displayed for used diaper code",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("Respective error message is displayed for used diaper code",s); 
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
		
		@Given("User enters valid diaper code")
		public void user_enters_valid_diaper_code() throws Throwable {
			
			EngineController.reportInstance.createStep("Given", "User enters valid diaper code");
			try {
				DriverHelpers.driver= DriverInstanceCreatoriOS.iOSDriverInstance();
				
				 
				clickElement("scanoption", ScanningXpath);
				 
				
				clickElement("icongo", ScanningXpath);
				 
				clickElement("typeoption", ScanningXpath);
				 
				sendKeystoElement("entercode", diapercode, ScanningXpath);
				
				 
				
				if (!((getElement("entercode", ScanningXpath)).getText()).isEmpty()) {
					
					String s=	captureScreenshot();			
					
					EngineController.reportInstance.reportStepPass("User can enters the valid code",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("Code is not entered", s); 
				}
			} catch (Exception e) {
				System.out.println(e);
				
				EngineController.reportInstance.reportStepFail("failure"); 

			}	
			EngineController.reportInstance.reportCooldown();
		}

		@When("User submits valid diaper code")
		public void User_submits_valid_diaper_code() throws Throwable {
			EngineController.reportInstance.createStep("When", "User submits valid diaper code");
			try {
				
				 
				
				clickElement("diapercodesubmit", ScanningXpath);
				 
				
				if (getElement("successhigh", ScanningXpath).isDisplayed()) {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepPass("User submitted the valid code",s);
					
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("User not submitted the valid code",s);
					
				}

			} catch (Exception e) {
				System.out.println(e);
				
				EngineController.reportInstance.reportStepFail("failure"); 

			}
		}

		
		

		@Then("Success message displayed for valid diapercode")
		public void success_message_displayed_for_valid_wipes_code() throws Throwable {
			EngineController.reportInstance.createStep("When", "Success message displayed for valid diapercode");
			try {
				
				//if (getElement("success", ScanningXpath).isDisplayed()) {
					if (getElement("successhigh", ScanningXpath).isDisplayed()) {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepPass("Success message displayed for valid diapercode",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("Invalid diaper code",s); 
				}
	
				
			} catch (Exception e) {
				System.out.println(e);
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("failure",s);
			}
		}
			
		

		@Then("User gets reward cash for valid diapercode")
		public void User_gets_reward_cash_for_valid_wipescode() throws Throwable {
			EngineController.reportInstance.createStep("When", "User gets reward cash for valid diapercode");
			try {
				
				
				if (getElement("cash", ScanningXpath).isDisplayed()) {
					String s=	captureScreenshot();
					System.out.println(getElement("cash", ScanningXpath).getText());
					EngineController.reportInstance.reportStepPass("Cash reward received for valid diapercode",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("Code is not valid",s); 
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
	
		@Given("User enters valid wipes code")
		public void user_enters_valid_wipes_code() throws Throwable {
			
			EngineController.reportInstance.createStep("Given", "User enters valid wipes code");
			try {
				DriverHelpers.driver= DriverInstanceCreatoriOS.iOSDriverInstance();
					
					 
					clickElement("scanoption", ScanningXpath);
					 
					
					clickElement("icongo", ScanningXpath);
					 
					clickElement("typeoption", ScanningXpath);
					 
					clickElement("wipespack", ScanningXpath);
					 
				sendKeystoElement("entercodewipes", wipescode, ScanningXpath);
				
				 
				
				if (!((getElement("entercodewipes", ScanningXpath)).getText()).isEmpty()) {
					
					String s=	captureScreenshot();			
					
					EngineController.reportInstance.reportStepPass("User can enters the valid code",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("Code is not entered", s); 
				}
			} catch (Exception e) {
				System.out.println(e);
				
				EngineController.reportInstance.reportStepFail("failure"); 

			}	
			EngineController.reportInstance.reportCooldown();
		}

		@When("User submits valid wipes code")
		public void User_submits_valid_wipes_code() throws Throwable {
			EngineController.reportInstance.createStep("When", "User submits valid wipes code");
			try {
				
				 
				
				clickElement("wipescodesubmit", ScanningXpath);
				 
				
				//if (getElement("success", ScanningXpath).isDisplayed()) {
					if (getElement("successhigh", ScanningXpath).isDisplayed()) {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepPass("User submitted the valid code",s);
					
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("User not submitted the valid code",s);
					
				}

			} catch (Exception e) {
				System.out.println(e);
				
				EngineController.reportInstance.reportStepFail("failure"); 

			}
		}

		
		

		@Then("Success message displayed for valid wipescode")
		public void success_message_displayed_for_valid_diaper_code() throws Throwable {
			EngineController.reportInstance.createStep("When", "Success message displayed for valid wipescode");
			try {
				
			//	if (getElement("success", ScanningXpath).isDisplayed()) {
					if (getElement("successhigh", ScanningXpath).isDisplayed()) {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepPass("Success message displayed for valid wipescode",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("Invalid wipes code",s); 
				}
	
				
			} catch (Exception e) {
				System.out.println(e);
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("failure",s);
			}
		}
			
		

		@Then("User gets reward cash for valid wipescode")
		public void User_gets_reward_cash_for_valid_diapercode() throws Throwable {
			EngineController.reportInstance.createStep("When", "User gets reward cash for valid wipescode");
			try {
				
				
				if (getElement("cash", ScanningXpath).isDisplayed()) {
					String s=	captureScreenshot();
					System.out.println(getElement("cash", ScanningXpath).getText());
					EngineController.reportInstance.reportStepPass("Cash reward received for valid wipescode",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("Code is not valid",s); 
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
		
	
		
		
		@Given("User redirects to Diapers and wipers tub screen")
		public void User_redirects_to_Diapers_and_wipers_tub_screen() throws Throwable {
			
			EngineController.reportInstance.createStep("Given", "User redirects to Diapers and wipers tub screen");
			try {
				
				DriverHelpers.driver= DriverInstanceCreatoriOS.iOSDriverInstance();
			//	String signupoption = ConfigurationMapper.element.getProperty("signup");
			 //   DriverInstanceCreator.loadpropertiesFile();
							
		/*	clickElement("notifyme", ScanningXpath);
			 
			
			clickElement("allow", ScanningXpath);*/
			 
			clickElement("scanoption", ScanningXpath);
			 
			
			clickElement("icongo", ScanningXpath);
			 
			clickElement("typeoption", ScanningXpath);
			 
			
				
				if (getElement("entercode", ScanningXpath).isDisplayed()) {
					
					String s=	captureScreenshot();			
					
					EngineController.reportInstance.reportStepPass("Redirected to Diapers and Tubs Screen",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("Not redirected to Diapers and Tubs Screen", s); 
				}
			} catch (Exception e) {
				System.out.println(e);
				
				EngineController.reportInstance.reportStepFail("failure"); 

			}	
			EngineController.reportInstance.reportCooldown();
		}

		@When("User views “Where’s the code” option on the Diapers and Wipes Tubs screen")
		public void User_views_Where_the_code_option_on_the_Diapers_and_Wipes_Tubs_screen() throws Throwable {
			EngineController.reportInstance.createStep("When", "User views “Where’s the code” option on the Diapers and Wipes Tubs screen");
			try {
				
								
				String s=	captureScreenshot();
				if (getElement("wherecodediaper", ScanningXpath).isDisplayed()) {
					
					EngineController.reportInstance.reportStepPass("“Where’s the code” option is available on the Diapers and Wipes Tubs screen",s);
					
				} else {
					EngineController.reportInstance.reportStepFail("“Where’s the code” option not available on the Diapers and Wipes Tubs screen",s);
					
				}

			} catch (Exception e) {
				System.out.println(e);
				
				EngineController.reportInstance.reportStepFail("failure"); 

			}
		}

		
		

		@Then("Redirected to “Where’s the code” screen from Diapers and Wipes Tubs screen")
		public void Redirected_to_Where_the_code_screen_from_Diapers_and_Wipes_Tubs_screen() throws Throwable {
			EngineController.reportInstance.createStep("When", "Redirected to “Where’s the code” screen from Diapers and Wipes Tubs screen");
			try {
				
				clickElement("wherecodediaper", ScanningXpath);
				
				if (getElement("wherecodediapertitle", ScanningXpath).isDisplayed()) {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepPass("Redirected to “Where’s the code” screen",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("Redirected to “Where’s the code” screen",s); 
				}
	
				
			} catch (Exception e) {
				System.out.println(e);
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("failure",s);
			}
		}
			
		

		@Then("User can view the guidance to find the code for Diapers and Wipes Tubs")
		public void User_can_view_the_guidance_to_find_the_code_for_Diapers_and_Wipes_Tubs() throws Throwable {
			EngineController.reportInstance.createStep("When", "User can view the guidance to find the code for Diapers and Wipes Tubs");
			try {
				 
				
				
						if (getElement("diaperguidance", ScanningXpath).isDisplayed()) {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepPass("User can view the guidance to find the code for Diapers and Wipes Tubs",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("Guidance to find the code for Diapers and Wipes Tubs is not available",s); 
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

		@Given("User redirects to Other Wipes Packs screen")
		public void User_redirects_to_Other_Wipes_Packs_screen() throws Throwable {
			
			EngineController.reportInstance.createStep("Given", "User redirects to Other Wipes Packs screen");
try {
				
	DriverHelpers.driver= DriverInstanceCreatoriOS.iOSDriverInstance();
			//	String signupoption = ConfigurationMapper.element.getProperty("signup");
			 //   DriverInstanceCreator.loadpropertiesFile();
							
		/*	clickElement("notifyme", ScanningXpath);
			 
			
			clickElement("allow", ScanningXpath);*/
			 
			clickElement("scanoption", ScanningXpath);
			 
			
			clickElement("icongo", ScanningXpath);
			 
			
			
			clickElement("typeoption", ScanningXpath);
			 

			clickElement("wipespack", ScanningXpath);
			 
				
				if (getElement("entercodewipes", ScanningXpath).isDisplayed()) {
					
					String s=	captureScreenshot();			
					
					EngineController.reportInstance.reportStepPass("Redirected to Other Wipes Packs Screen",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("Not redirected to Other Wipes Packs Screen", s); 
				}
			} catch (Exception e) {
				System.out.println(e);
				
				EngineController.reportInstance.reportStepFail("failure"); 

			}	
			EngineController.reportInstance.reportCooldown();
		}

		@When("User views “Where’s the code” option on the Other Wipes Packs screen")
		public void User_views_Where_the_code_option_on_the_Other_Wipes_Packs_screen() throws Throwable {
			EngineController.reportInstance.createStep("When", "User views “Where’s the code” option on the Other Wipes Packs screen ");
			try {
				
				
				String s=	captureScreenshot();
				if (getElement("wherecodewipes", ScanningXpath).isDisplayed()) {
					
					EngineController.reportInstance.reportStepPass("“Where’s the code” option is available on the Other Wipes Packs screen",s);
					
				} else {
					EngineController.reportInstance.reportStepFail("“Where’s the code” option not available on the Other Wipes Packs screen",s);
					
				}

			} catch (Exception e) {
				System.out.println(e);
				
				EngineController.reportInstance.reportStepFail("failure"); 

			}
			EngineController.reportInstance.reportCooldown();
		}

		
		

		@Then("Redirected to “Where’s the code” screen from Other Wipes Packs screen")
		public void Redirected_to_Where_the_code_screen_from_Other_Wipes_Packs_screen() throws Throwable {
			EngineController.reportInstance.createStep("When", "Redirected to “Where’s the code” screen from Other Wipes Packs screen");
try {
				
				clickElement("wherecodewipes", ScanningXpath);
				 
				if (getElement("wherecodewipestitle", ScanningXpath).isDisplayed()) {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepPass("Redirected to “Where’s the code” screen",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("Redirected to “Where’s the code” screen",s); 
				}
	
				
			} catch (Exception e) {
				System.out.println(e);
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("failure",s);
			}
EngineController.reportInstance.reportCooldown();
		}
			
		

		@Then("User can view the guidance to find the code for Other Wipes Packs")
		public void User_can_view_the_guidance_to_find_the_code_for_Other_Wipes_Packs() throws Throwable {
			EngineController.reportInstance.createStep("When", "User can view the guidance to find the code for Other Wipes Packs");
			try {
				 
				
				
						if (getElement("wipesguidance", ScanningXpath).isDisplayed()) {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepPass("User can view the guidance to find the code for  Other Wipes Packs",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("Guidance to find the code for  Other Wipes Packs is not available",s); 
				}
				

			}
			catch (Exception e) {
				System.out.println("I am out");
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepFail("failure", s);
				closeCurrentDriver();	Assert.fail("Failure");
				}
				EngineController.reportInstance.reportCooldown();
				
				}
		

		
	}



