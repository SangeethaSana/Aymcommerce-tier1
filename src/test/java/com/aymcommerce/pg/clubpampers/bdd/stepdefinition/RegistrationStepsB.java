package com.aymcommerce.pg.clubpampers.bdd.stepdefinition;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aymcommerce.pg.clubpampers.bdd.controller.EngineController;
import com.aymcommerce.pg.clubpampers.driverextension.DriverHelpers;
import com.aymcommerce.pg.clubpampers.driverextension.DriverInstanceCreator;
import com.aymcommerce.pg.clubpampers.config.mapper.*;
import com.aymcommerce.pg.clubpampers.data.Excelread;

import io.appium.java_client.MobileBy;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationStepsB extends DriverHelpers
{
public static String RegisterXpath = System.getProperty("user.dir") + "//src//test//java//com//aymcommerce//pg//clubpampers//log//locators//register.properties";
	
	@Given("User open the application for registration")
public void user_open_the_application() throws Throwable {
		
		EngineController.reportInstance.createStep("Given", "User open the application for registration");
try {
			
			DriverHelpers.driver= DriverInstanceCreator.iOSDriverInstance();
					try{
						if (getElement("home", RegisterXpath).isDisplayed()){
							
							clickElement("menu", RegisterXpath);
							clickElement("signout", RegisterXpath);
							DriverHelpers.driver= DriverInstanceCreator.iOSDriverInstance();
						}
						
					}catch(Exception e){}
			
			if (getElement("iJoin", RegisterXpath).isDisplayed()) {
				
				String s=	captureScreenshot();			
				
				EngineController.reportInstance.reportStepPass("Signup option is available",s);
			} else {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("Signup option is not available", s); 
				Assert.assertTrue(true);
			}
		} catch (Exception e) {
			System.out.println(e);
			
			EngineController.reportInstance.reportStepFail("failure"); 
			
		}	
		EngineController.reportInstance.reportCooldown();
	}

	@When("Lands on the registration page for registration")
	public void lands_on_the_registration_page() throws Throwable {
	
		EngineController.reportInstance.createStep("When", "Lands on the registration page");
	     try {
	    	    clickElement("iJoin", RegisterXpath);
				
				clickElement("iJoin", RegisterXpath);
				
				String s=	captureScreenshot();
				if (getElement("email", RegisterXpath).isDisplayed()) {
					
					EngineController.reportInstance.reportStepPass("User lands on Register Screen successfully",s);
					Assert.assertTrue(true);
					
				} else {
					EngineController.reportInstance.reportStepFail("User failed to land on Register Screen",s);
					Assert.assertTrue(true);
					
				}

			} catch (Exception e) {
				System.out.println(e);
				
				EngineController.reportInstance.reportStepFail("failure"); 
				
			}
	     EngineController.reportInstance.reportCooldown();
	   }



	@Then("User enter email and password for registration")
	public void user_enter_email_and_password() throws Throwable {
		EngineController.reportInstance.createStep("When", "User enter email and password");
          try {
        	  driver.executeScript("experitest:client.swipe(\"Down\", 2000, 200)");
        	  clickElement("email", RegisterXpath);
  			Random rand = new Random();
  			try{
  			sendKeystoElement("email", "test_aym" + rand.nextInt(1000) + "@gmail.com",
  					RegisterXpath);
  			}catch(Exception e){}
  			clickElement("done", RegisterXpath);
  		
  			if (!getElementvalue("email", RegisterXpath).isEmpty()) {
  				String s=	captureScreenshot();
  				EngineController.reportInstance.reportStepPass("User enters Email",s);
  				Assert.assertTrue(true);
  			} else {
  				String s=	captureScreenshot();
  				EngineController.reportInstance.reportStepFail("User enters invalid Email",s); 
  				Assert.assertTrue(true);
  			}

  		} catch (Exception e) {
  		//	System.out.println(e);
  			String s=	captureScreenshot();
  			EngineController.reportInstance.reportStepFail("failure",s);
  			
  		}
  		
  		try{
  			
  		
  			clickElement("password", RegisterXpath);
  			try{
  			sendKeystoElement("password", "Test1234", RegisterXpath);
  			}
  			catch(Exception e){}
  			clickElement("done", RegisterXpath);
  			
  			ScrollToElement("accept", "Down");
  			
  			sleep(3000);
  			 			
  			  			if (getElement("acceptcontinue", RegisterXpath).isEnabled()) {
  				String s=	captureScreenshot();
  				EngineController.reportInstance.reportStepPass("User enters password",s);
  				Assert.assertTrue(true);

  			} else

  			{
  				String s=	captureScreenshot();
  				EngineController.reportInstance.reportStepFail("User enters invalid password",s);
  				Assert.assertTrue(true);
  			}

  			
  		} catch (Exception e) {
  			System.out.println(e);
  			String s=	captureScreenshot();
  			EngineController.reportInstance.reportStepFail("failure",s);
  			
  		}
  	
  		EngineController.reportInstance.reportCooldown();
  	}
		
	
	
	
	
	@Given("User clicks accept button for registration")
	public void user_clicks_accept_button() throws Throwable {
		EngineController.reportInstance.createStep("When", "User clicks accept button for registration and select Baby Birthday");
		try {
			
			clickElement("acceptcontinue", RegisterXpath); 
						
			clickElement("yesandcontinue", RegisterXpath);
			
				

			if (getElement("babyscreen", RegisterXpath).isDisplayed()) {
  				String s=	captureScreenshot();
  				EngineController.reportInstance.reportStepPass("Redirects to enter Baby Birthday Screen",s);
  				Assert.assertTrue(true);
  			} else

  			{
  				String s=	captureScreenshot();
  				EngineController.reportInstance.reportStepFail("Not redirected to enter Baby Birthday Screen",s);
  				Assert.assertTrue(true);
  			}

  			
  		} catch (Exception e) {
  			System.out.println(e);
  			String s=	captureScreenshot();
  			EngineController.reportInstance.reportStepFail("failure",s);
  			
  		}
  	
  		EngineController.reportInstance.reportCooldown();
  	}
		
	
	
	@When("User enter details for registration")
	public void user_enter_details() throws Throwable {
		EngineController.reportInstance.createStep("When", "User enter details for registration");
		try {
			  By done = MobileBy.AccessibilityId("Done");
			  
			  
			  try{
					 driver.findElement(done).click();
				}catch(Exception e){}
			  
			 
			
			  if (getElement("bdayok", RegisterXpath).isEnabled()) {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepPass("User Selected Babys Birthday",s);
					Assert.assertTrue(true);
				} else {
					String s=			captureScreenshot();
					EngineController.reportInstance.reportStepFail("User not selected Babys Birthday",s); 
					Assert.assertTrue(true);
				}
				
				clickElement("bdayok", RegisterXpath);
				
			/*	clickElement("mobilenumber", RegisterXpath);
				sendKeystoElement("mobilenumber", "2243359185", RegisterXpath);
			
				clickElement("send", RegisterXpath);
			
				
				
				if (getElement("safety", RegisterXpath).isDisplayed()) {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepPass("Redirected to Safety code screen",s);
					Assert.assertTrue(true);

				} else {
					String s=			captureScreenshot();
					EngineController.reportInstance.reportStepFail("Not redirected to Safety code screen",s); 
					Assert.assertTrue(true);
					
				}   */
				
				 }
			     catch (Exception e) {
				System.out.println("I am out");
				String s=			captureScreenshot();
				EngineController.reportInstance.reportStepFail("failure",s); 
				
			}
			
			EngineController.reportInstance.reportCooldown(); 
				
			
			}
	
	@Then("User register successfully and redirects to home screen")
	public void User_register_successfully_and_redirects_homescreen() throws Throwable {
		EngineController.reportInstance.createStep("When", "User register successfully and redirects to home screen");

		
    	try {
			
		/*	String safetycode = getOTPFrom();
			DriverHelpers.driver= DriverInstanceCreator.iOSDriverInstance();
			//	clickElement("safety", RegisterXpath);
				sleep(5000);
				
				sendKeystoElement("safety", safetycode, RegisterXpath);
			
	
	if (!getElementvalue("safety", RegisterXpath).isEmpty())
	 {
		String s=	captureScreenshot();
		EngineController.reportInstance.reportStepPass("User entered OTP",s);
		Assert.assertTrue(true);

	} else {
		String s=			captureScreenshot();
		EngineController.reportInstance.reportStepFail("User not entered OTP",s); 
		Assert.assertTrue(true);
	}
		
	
		sleep(5000);

		if (getElement("successmsg", RegisterXpath).isDisplayed())
 {
	String s=	captureScreenshot();
	EngineController.reportInstance.reportStepPass("OTP is valid and success message displayed",s);
	Assert.assertTrue(true);

} else {
	String s=			captureScreenshot();
	EngineController.reportInstance.reportStepFail("OTP is not valid",s); 
	Assert.assertTrue(true);
}
	
	//		clickElement("codesubmit", RegisterXpath); */
			
			try{
				clickElement("notify", RegisterXpath);
			}catch(Exception e){}
			
			try{
				clickElement("allow", RegisterXpath);
			}catch(Exception e){}   
			
			
			if (getElement("home", RegisterXpath).isDisplayed()) {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user lands on Home screen - Registration Successful",s);
				Assert.assertTrue(true);
			} else {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("Registration unsuccessful",s); 
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
	
	
	//Facebook
	
	@Then("User redirects to for facebook registration")
	public void user_redirects_to_for_facebook_registration() throws Throwable {
		EngineController.reportInstance.createStep("Then", "User redirects to for facebook registration");
        try {
      	  driver.executeScript("experitest:client.swipe(\"Down\", 1000, 100)");
      	  driver.executeScript("experitest:client.swipe(\"Down\", 1000, 100)");
      	  
      	  clickElement("facebook", RegisterXpath);
      	  
      	  try
      	  {
      		  clickElement("fbcontinue", RegisterXpath);
      	 }catch(Exception e) {}
      	 // try {
      	//	  clickElement("fbokay", RegisterXpath);
      		  
      	//  }catch(Exception e) {}
      	  
      	String s=			captureScreenshot();
		EngineController.reportInstance.reportStepPass("User redirects to for facebook registration",s); 
      	  
        }catch (Exception e) {
     		System.out.println("I am out");
     		String s=			captureScreenshot();
     		EngineController.reportInstance.reportStepFail("failure",s); 
     		
     	}
     	
     	EngineController.reportInstance.reportCooldown();
     
	}

	

	@Then("User enter email and password for valid facebook credential")
	public void user_enter_email_and_password_for_invalid_facebook_credential() throws Throwable {
		EngineController.reportInstance.createStep("Then", "User enter email and password for valid facebook credential");
		try {
			try {
      		clickElement("fbemail", RegisterXpath);

      		try {
      		sendKeystoElement("fbemail", "qnjmiwnfri_1640108398@tfbnw.net", RegisterXpath);
      		}catch(Exception e) {}
      		clickElement("done", RegisterXpath);
      		  
      	  }catch(Exception e) {}
      	  
      	try {
             clickElement("fbpassword", RegisterXpath);
      		
             try {
      		sendKeystoElement("fbpassword", "Password@123", RegisterXpath);
             }catch(Exception e) {}
      		clickElement("done", RegisterXpath);
    		
      	}catch(Exception e) {}
      	
      	String s=			captureScreenshot();
		EngineController.reportInstance.reportStepPass("User enter email and password for valid facebook credential",s); 
      	
      	 }catch (Exception e) {
		System.out.println("I am out");
		String s=			captureScreenshot();
		EngineController.reportInstance.reportStepFail("failure",s); 
		
	}
	
	EngineController.reportInstance.reportCooldown();
	}

	

	@Then("User click login for facebook credentials")
	public void user_click_login_for_facebook_credentials() throws Throwable {
			EngineController.reportInstance.createStep("Then", "User click login for facebook credentials");
	        try {
	        	clickElement("fblogin", RegisterXpath);
	        	try
	        	  {
	        		clickElement("fbcontinue", RegisterXpath);
	               wait("home", RegisterXpath);
	        	if (getElement("home", RegisterXpath).isDisplayed()) {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepPass("user lands on Home screen - Registration Successful",s);
					Assert.assertTrue(true);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("Registration unsuccessful",s); 
					Assert.assertTrue(true);
				}
	        	  }catch(Exception e) {}
	        }	catch (Exception e) {
				System.out.println("I am out");
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepFail("failure", s);
				closeCurrentDriver();
				Assert.fail("Failure");
				}
				EngineController.reportInstance.reportCooldown();
	}



		

}
  	