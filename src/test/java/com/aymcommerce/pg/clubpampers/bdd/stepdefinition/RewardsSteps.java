package com.aymcommerce.pg.clubpampers.bdd.stepdefinition;

import com.aymcommerce.pg.clubpampers.bdd.controller.EngineController;
import com.aymcommerce.pg.clubpampers.driverextension.DriverHelpers;
import com.aymcommerce.pg.clubpampers.driverextension.DriverInstanceCreator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RewardsSteps extends DriverHelpers{
	public static String RewardsXpath =  System.getProperty("user.dir") +"\\src\\test\\java\\com\\aymcommerce\\pg\\clubpampers\\log\\locators\\Rewards.properties";


	@Given("User is in Home page")
	public void user_is_in_home_page() throws Throwable {
		System.out.println("---------- Step 1 -----------------");
		EngineController.reportInstance.createStep("Given", "User is in Home page");
		//EngineController.reportInstance.reportScenarioPass("User is in Home page");
		//EngineController.reportInstance.reportCreateFeature("Rewards");
		sleep(5000);
		DriverHelpers.driver= DriverInstanceCreator.iOSDriverInstance();
		 try {
			    sleep(3000);
	    	  //  System.out.println(getElementvalue("home", RewardsXpath));
				String s=	captureScreenshot();
				if (getElement("home", RewardsXpath).isDisplayed()) {
					EngineController.reportInstance.reportStepPass("user lands on Home Screen successfully",s);
					
				} else {
					EngineController.reportInstance.reportStepFail("user failed to land on Home Screen",s);
					
				}
			} catch (Exception e) {
				System.out.println(e);
				
				EngineController.reportInstance.reportStepFail("failure"); 

			}
	}
	   
	
	@Given("User checks Reward link in homepage")
	public void user_checks_reward_link_in_homepage() throws Throwable {
		System.out.println("---------- Step 2 -----------------");
	     try {
	    	    //System.out.println(getElementvalue("home", RewardsXpath));
				String s=	captureScreenshot();
				if (getElement("home", RewardsXpath).isDisplayed()) {
					
					EngineController.reportInstance.reportStepPass("user lands on Home Screen successfully",s);
					
				} else {
					EngineController.reportInstance.reportStepFail("user failed to land on Home Screen",s);
					
				}
				sleep(2000);
				if (getElement("homereward", RewardsXpath).isDisplayed()) {
					
					EngineController.reportInstance.reportStepPass("user checks reward link on Home Screen successfully",s);
					
				} else {
					EngineController.reportInstance.reportStepFail("reward link is not on Home Screen ",s);
					
				}

			} catch (Exception e) {
				System.out.println(e);
				
				EngineController.reportInstance.reportStepFail("failure"); 

			}
	    
	}
	@When("User clicks profile menu")
	public void user_clicks_profile_menu() throws Throwable {
		System.out.println("---------- Step 3 -----------------");
		//clickElement("parenting", RewardsXpath);
		     sleep(5000);
	     try {
	    	    clickElement("profile", RewardsXpath);
	    	    sleep(3000);
				String s=	captureScreenshot();
				if (getElement("myprofile", RewardsXpath).isDisplayed()) {
					
					EngineController.reportInstance.reportStepPass("user click Profile menu successfully",s);
					
				} else {
					EngineController.reportInstance.reportStepFail("user failed to click Profile menu ",s);
					
				}

			} catch (Exception e) {
				System.out.println(e);
				
				EngineController.reportInstance.reportStepFail("failure"); 

			}
	    
	   
	}
	@Then("User checks Reward link in profile menu")
	public void user_checks_reward_link_in_profile_menu() throws Throwable {
		System.out.println("---------- Step 4 -----------------");
	     try {
				String s=	captureScreenshot();
				if (getElement("profilereward", RewardsXpath).isDisplayed()) {
					
					EngineController.reportInstance.reportStepPass("user checks reward link on Profile menu successfully",s);
					
				} else {
					EngineController.reportInstance.reportStepFail("reward link is not on Profile menu ",s);
					
				}
				sleep();
                clickElement("closeprofile", RewardsXpath);
			} catch (Exception e) {				
				EngineController.reportInstance.reportStepFail("failure"); 

			}
	    closeDriver();
	    
	}
    @Then("User checks My WishList in profile menu")
    public void user_checks_my_wishlist_in_profile_menu() throws Throwable {
    	
    	System.out.println("---------- Step 5 -----------------");
	     try {
				String s=	captureScreenshot();
				if (getElement("mywishlist", RewardsXpath).isDisplayed()) {
					EngineController.reportInstance.reportStepPass("user checks My Wishlist on Profile menu successfully",s);
					
				} else {
					EngineController.reportInstance.reportStepFail("My Wishlist link is not on Profile menu ",s);
					
				}
				sleep();
				clickElement("closeprofile", RewardsXpath);
			} catch (Exception e) {
				System.out.println(e);
				
				EngineController.reportInstance.reportStepFail("failure"); 

			}
	     closeDriver();
    	
	    
	}
    
    @Then("User checks My Sweepstakes in profile menu")
    public void user_checks_my_sweepstakes_in_profile_menu() throws Throwable {
    	
    	System.out.println("---------- Step 6 -----------------");
	     try {
				String s=	captureScreenshot();
				if (getElement("mysweepskates", RewardsXpath).isDisplayed()) {
					
					EngineController.reportInstance.reportStepPass("user checks My Sweepstakes on Profile menu successfully",s);
					
				} else {
					EngineController.reportInstance.reportStepFail("My Sweepstakes linkis not on Profile menu ",s);
					
				}
				sleep();
				clickElement("closeprofile", RewardsXpath);

			} catch (Exception e) {
				System.out.println(e);
				
				EngineController.reportInstance.reportStepFail("failure"); 

			}
	     closeDriver();
	    
	}

}
