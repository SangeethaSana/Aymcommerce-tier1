package com.aymcommerce.pg.clubpampers.bdd.stepdefinition;

import java.util.Random;

import org.junit.Assert;

import com.aymcommerce.pg.clubpampers.bdd.controller.EngineController;
import com.aymcommerce.pg.clubpampers.config.mapper.ConfigurationMapper;
import com.aymcommerce.pg.clubpampers.data.Excelread;
import com.aymcommerce.pg.clubpampers.driverextension.DriverHelpers;
import com.aymcommerce.pg.clubpampers.driverextension.DriverInstanceCreator;
import com.aymcommerce.pg.clubpampers.driverextension.DriverInstanceCreatoriOS;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends DriverHelpers{
	public static String LoginXpath = System.getProperty("user.dir") + "//src//test//java//com//aymcommerce//pg//clubpampers//log//locators//Login.properties";
	
	@Given("User clicks on Login option")
	public void user_clicks_on_Login_option() throws Throwable {
		System.out.println("---------- Step 1 -----------------");
		EngineController.reportInstance.createStep("Given", "User clicks the Login option");
		
		try {
			//DriverHelpers.driver.removeApp(ConfigurationMapper.mConfig.getProperty("BUNDLE_ID"));
			
			//	DriverInstanceCreator.loadpropertiesFile();
			
			DriverHelpers.driver= DriverInstanceCreator.iOSDriverInstancereset();
			String s=	captureScreenshot();
			if (getElement("loginoption", LoginXpath).isEnabled()) {
				System.out.println("enabled");
						
				EngineController.reportInstance.reportStepPass("Login option is available and enabled",s);
			} else {
				
				EngineController.reportInstance.reportStepFail("Login option is not available",s); 
			}
		} catch (Exception e) {
			System.out.println(e);
			
			EngineController.reportInstance.reportStepFail("failure"); 

		}	
	}
	@When("Lands on the Login page")
	public void Lands_on_the_Login_page() throws Throwable {
		EngineController.reportInstance.createStep("When", "Lands on the Login page");
		try {
			
			clickElement("loginoption", LoginXpath);
			
			String s=	captureScreenshot();
			if (getElement("loginemail", LoginXpath).isDisplayed()) {
				
				EngineController.reportInstance.reportStepPass("user lands on Login Screen successfully",s);
				
			} else {
				EngineController.reportInstance.reportStepFail("user failed to land on Login Screen",s);
				
			}

		} catch (Exception e) {
			System.out.println(e);
			
			EngineController.reportInstance.reportStepFail("failure"); 

		}
	}

	
	

	@Then("User enter login email {string} and valid password {string}")
	public void user_enter_email_and_password(String string, String string2) throws Throwable {
		EngineController.reportInstance.createStep("When", "User enter email {string} and password {string}");
		try {
			
			
			clickElement("loginemail", LoginXpath);
			try{
			sendKeystoElement("loginemail", "m.anandhi16@gmail.com", LoginXpath);
			}catch(Exception e){}
			
			clickElement("done", LoginXpath);
			if (getElementvalue("loginemail", LoginXpath).contains("@gmail.com")) {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid Email",s);
			} else {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid email",s); 
			}

		//	clickElement("eyeicon", LoginXpath);
			clickElement("loginpassword", LoginXpath);
		try{
			sendKeystoElement("loginpassword", "Pampers123", LoginXpath);
		}catch(Exception e){}
		
		clickElement("done", LoginXpath);
		

			if (getElement("loginsubmit", LoginXpath).isEnabled()) {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid password",s);

			} else

			{
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid password",s);
			}

			
		} catch (Exception e) {
			
			String s=	captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure",s);
		}
	}
		
	

	@Then("User clicks Login button")
	public void user_clicks_Login_button() throws Throwable {
		EngineController.reportInstance.createStep("When", "User clicks Login button");
		try {
			
			clickElement("loginsubmit", LoginXpath);
			
			try{
				clickElement("notify", LoginXpath);
			}catch(Exception e){}
			
			try{
				clickElement("allow", LoginXpath);
			}catch(Exception e){}
			
			
			if (getElement("home", LoginXpath).isDisplayed()) {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user lands on Home screen - Login Successful",s);
			} else {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("user is unable to login",s); 
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

	
	//change Password
	
		@Then("User clicks forgot password link")
		public void then_user_clicks_forgot_password_link() throws Throwable {
			EngineController.reportInstance.createStep("Then", "User clicks forgot password link");
			try {
				
				clickElement("forgotpassword", LoginXpath);
				
				String s=	captureScreenshot();
				if (getElement("loginemail", LoginXpath).isDisplayed()) {
					
					EngineController.reportInstance.reportStepPass("User clicks forgot password link",s);
					
				} else {
					EngineController.reportInstance.reportStepFail("User not able to click forgot password link",s);
					
				}

			} catch (Exception e) {
				System.out.println(e);
				
				EngineController.reportInstance.reportStepFail("failure"); 

			}
			EngineController.reportInstance.reportCooldown();
		}
		@Then("User enters mail {string} and click send")
		public void user_enters_mail_and_click_send(String string) throws Throwable {
			EngineController.reportInstance.createStep("Then", "User enters mail {string} and click send");
			try {
				
				
				clickElement("loginemail", LoginXpath);
				try{
				sendKeystoElement("loginemail", string, LoginXpath);
				}catch(Exception e){}
				
				clickElement("done", LoginXpath);
				if (getElementvalue("loginemail", LoginXpath).contains("@gmail.com")) {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepPass("user enters valid Email",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("user enters invalid email",s); 
				}
				try {
				clickElement("sendmail", LoginXpath);
				}catch(Exception e) {}
				try {
				clickElement("okgotit", LoginXpath);
			}catch(Exception e){}
			
			}catch (Exception e) {
					System.out.println(e);
					
					EngineController.reportInstance.reportStepFail("failure"); 

				}
			EngineController.reportInstance.reportCooldown();
		}
		@Then("User click forgot password link in mail and change password")
		public void user_click_forgot_password_link_in_mail_and_change_password() throws Throwable {
			EngineController.reportInstance.createStep("Then", "User enters mail {string} and click send");
			try {
				mail("Letmeinbuddy1234");
			String s = captureScreenshot();
			EngineController.reportInstance.reportStepPass("User checks reset password link in mail", s);
			
		} catch (Exception e) {
			System.out.println(e);
			String s = captureScreenshot();
			EngineController.reportInstance.reportStepFail("User not able to check reset password link in mail", s);
			Assert.fail("Failure");
		}
			EngineController.reportInstance.reportCooldown();
		}
		
		
		@Then("User login with email {string} and new password {string}")
		public void user_login_with_email_and_new_password(String string, String string2) throws Throwable {
			EngineController.reportInstance.createStep("Then", "User login with email {string} and new password {string}");
			try
			{
				DriverHelpers.driver= DriverInstanceCreator.iOSDriverInstance();
				try {
				clickElement("loginoption", LoginXpath);
				}catch(Exception e) {}
				try {
					clickElement("loginemail", LoginXpath);
				try{
				sendKeystoElement("loginemail", string, LoginXpath);
				}catch(Exception e){}
				
				clickElement("done", LoginXpath);
				if (getElementvalue("loginemail", LoginXpath).contains("@gmail.com")) {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepPass("user enters valid Email",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("user enters invalid email",s); 
				}

			//	clickElement("eyeicon", LoginXpath);
				clickElement("loginpassword", LoginXpath);
			try{
				sendKeystoElement("loginpassword", string2, LoginXpath);
			}catch(Exception e){}
			
			clickElement("done", LoginXpath);
			
				if (getElement("loginsubmit", LoginXpath).isEnabled()) {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepPass("user enters valid password",s);

				} else
				{
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("user enters invalid password",s);
				}
			} catch (Exception e) {}
			}catch (Exception e) {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepFail("User not able to enter email and password", s);
				Assert.fail("Failure");
			}
			EngineController.reportInstance.reportCooldown();
		}


		@Then("User click Signout")
		public void user_click_signout() throws Throwable {
			EngineController.reportInstance.createStep("Then", "User click Signout");
			try {
				clickElement("profile", LoginXpath);
				wait("signout", LoginXpath);
				clickElement("signout", LoginXpath);
				wait("loginemail", LoginXpath);
	             if (getElement("loginemail", LoginXpath).isDisplayed()) {
	            	 String s = captureScreenshot();
					EngineController.reportInstance.reportStepPass("user signout successfully",s);
				} else {
					String s = captureScreenshot();
					EngineController.reportInstance.reportStepFail("user failed to sign out",s);
				}
		   }catch (Exception e) {
			String s = captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			Assert.fail("Failure");
		}
		EngineController.reportInstance.reportCooldown();
	}

		

		@Given("User lands on Home Screen")
		public void user_lands_on_home_screen() throws Throwable {
			EngineController.reportInstance.createStep("Given", "User lands on Home Screen");
			DriverHelpers.driver = DriverInstanceCreator.iOSDriverInstance();
			try {
				wait("home", LoginXpath);
				if (getElement("home", LoginXpath).isDisplayed()) {
					String s = captureScreenshot();
					EngineController.reportInstance.reportStepPass("user lands on home screen", s);

				} else {
					String s = captureScreenshot();
					EngineController.reportInstance.reportStepFail("user failed to land on home screen", s);
				}

			} catch (Exception e) {
				System.out.println("I am out");
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepFail("failure", s);
			}
		}



		@Then("User lands on profile screen and click change password")
		public void user_lands_on_profile_screen_and_click_change_password() throws Throwable {
			EngineController.reportInstance.createStep("Then", "User lands on profile screen and click change password");
			try {
				clickElement("profile", LoginXpath);
				wait("profilesettings", LoginXpath);
				clickElement("profilesettings", LoginXpath);
				wait("changepasswordprofile", LoginXpath);
				
				try {
					clickElement("changepasswordprofile", LoginXpath);
					wait("okgotitprofile", LoginXpath);
					clickElement("okgotitprofile", LoginXpath);
					wait("profile.account", LoginXpath);
				    String s=	captureScreenshot();
				    EngineController.reportInstance.reportStepPass("User lands on profile screen and click change password",s);
				}catch (Exception e) {}
		   }catch (Exception e) {
			String s = captureScreenshot();
			EngineController.reportInstance.reportStepFail("User failed to lands on profile screen and click change password", s);
			Assert.fail("Failure");
		}
		EngineController.reportInstance.reportCooldown();
		}
		

		@Then("User clicks signout button profile")
		public void user_clicks_signout_button_profile() throws Throwable {
			EngineController.reportInstance.createStep("Then", "User clicks signout button profile");
			try {
				try {
					wait("home", LoginXpath);
					clickElement("home", LoginXpath);
				}catch(Exception e) {}
				clickElement("profile", LoginXpath);
				wait("signout", LoginXpath);
				clickElement("signout", LoginXpath);
				wait("loginemail", LoginXpath);
	             if (getElement("loginemail", LoginXpath).isDisplayed()) {
	            	 String s = captureScreenshot();
					EngineController.reportInstance.reportStepPass("user signout successfully",s);
				} else {
					String s = captureScreenshot();
					EngineController.reportInstance.reportStepFail("user failed to sign out",s);
				}
		   }catch (Exception e) {
			String s = captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			Assert.fail("Failure");
		}
		EngineController.reportInstance.reportCooldown();
		}



		
		
		@Then("User click forgot password link in mail and change password for profile")
		public void user_click_forgot_password_link_in_mail_and_change_password_for_profile() throws Throwable {
			EngineController.reportInstance.createStep("Then", "User click forgot password link in mail and change password for profile");
			try
			{
				mail("Testingbuddy123");
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepPass("User change password through mail", s);
				
			} catch (Exception e) {
				String s = captureScreenshot();
				EngineController.reportInstance.reportStepFail("User not able to change password", s);
				Assert.fail("Failure");
			}
				EngineController.reportInstance.reportCooldown();
			
		}
		
		
	
}
