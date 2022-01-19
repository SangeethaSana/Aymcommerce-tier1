package com.aymcommerce.pg.clubpampers.driverextension;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.aspectj.apache.bcel.Repository;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.aymcommerce.pg.clubpampers.config.mapper.ConfigurationMapper;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverInstanceCreator {
	public static IOSDriver<IOSElement> iOSDriver;
	public static AndroidDriver<AndroidElement> androidDriver;
	static DesiredCapabilities dc = new DesiredCapabilities();
	
	public static Properties Repository = new Properties();
	public static Properties configuration = new Properties();
	public static File f;
	public static FileInputStream FI;

	public static IOSDriver iOSDriverInstance() throws MalformedURLException {
		dc.setCapability("testName", "Baby Care_Rewards Mobile_E2E Testing");
		dc.setCapability("accessKey", "eyJhbGciOiJIUzI1NiJ9.eyJ4cC51IjoxNjk0NzQsInhwLnAiOjk0NDg1LCJ4cC5tIjoxNTk4ODY3OTEzMDUxLCJleHAiOjE5MTQ4MTk2NjUsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.RrH8ZSgVdOBa3UbojAzE_2MsyaLs-ncMRIlr2cC8fLg");
		dc.setCapability("deviceQuery", "@os='ios' and @version='13.2.3' and @category='PHONE'");
		dc.setCapability(MobileCapabilityType.APP, ConfigurationMapper.mConfig.getProperty("APP"));
		dc.setCapability(MobileCapabilityType.FULL_RESET, false);
		dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, ConfigurationMapper.mConfig.getProperty("BUNDLE_ID"));
		
		//dc.setCapability(MobileCapabilityType. ,"Baby Care_Rewards Mobile_E2E Testing" );
		//  dc.setCapability(MobileCapabilityType.APP, "cloud:com.app.pampers-aym-llc");
		  //dc.setCapability(MobileCapabilityType.FULL_RESET, false);
		  //dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.app.pampers-aym-llc");
		
		iOSDriver = new IOSDriver<>(new URL("https://pg.experitest.com/wd/hub"), dc);
		iOSDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return iOSDriver;
	}
	
	public static IOSDriver iOSDriverInstancereset() throws MalformedURLException {
		dc.setCapability("testName", "Baby Care_Rewards Mobile_E2E Testing");
		dc.setCapability("accessKey", "eyJhbGciOiJIUzI1NiJ9.eyJ4cC51IjoxNjk0NzQsInhwLnAiOjk0NDg1LCJ4cC5tIjoxNTk4ODY3OTEzMDUxLCJleHAiOjE5MTQ4MTk2NjUsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.RrH8ZSgVdOBa3UbojAzE_2MsyaLs-ncMRIlr2cC8fLg");
		dc.setCapability("deviceQuery", "@os='ios' and @version='13.2.3' and @category='PHONE'");
		dc.setCapability(MobileCapabilityType.APP, ConfigurationMapper.mConfig.getProperty("APP"));
		
		dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, ConfigurationMapper.mConfig.getProperty("BUNDLE_ID"));
		
		//dc.setCapability(MobileCapabilityType. ,"Baby Care_Rewards Mobile_E2E Testing" );
		//  dc.setCapability(MobileCapabilityType.APP, "cloud:com.app.pampers-aym-llc");
		 
		  //dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.app.pampers-aym-llc");
		 dc.setCapability(MobileCapabilityType.FULL_RESET, true);
		 dc.setCapability(MobileCapabilityType.NO_RESET, false);
		
		iOSDriver = new IOSDriver<>(new URL("https://pg.experitest.com/wd/hub"), dc);
		iOSDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return iOSDriver;
	}

	public AndroidDriver androidDriverInstance() throws MalformedURLException {
		dc.setCapability("testName", "Quick Start Android Native Demo");
		dc.setCapability("accessKey", "");
		dc.setCapability("deviceQuery", "@os='android' and @category='PHONE'");
		dc.setCapability(MobileCapabilityType.APP, ConfigurationMapper.mConfig.getProperty("APP"));
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,
				ConfigurationMapper.mConfig.getProperty("APP_PACKAGE"));
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,
				ConfigurationMapper.mConfig.getProperty("APP_ACTIVITY"));
		androidDriver = new AndroidDriver<>(new URL("https://pg.experitest.com/wd/hub"), dc);
		return androidDriver;
	}
	
	

}
