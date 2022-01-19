package com.aymcommerce.pg.clubpampers.driverextension;

import static io.appium.java_client.touch.offset.PointOption.point;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aymcommerce.pg.clubpampers.config.mapper.ConfigurationMapper;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;

public class DriverHelpers {

	public static AppiumDriver driver;
public Properties element = ConfigurationMapper.element;
	
public static String LoginXpath = System.getProperty("user.dir") + "//src//test//java//com//aymcommerce//pg//clubpampers//log//locators//Login.properties";

	public static WebElement getElement(String LoadXpath, String locatorfile) throws Throwable {

		Properties Prop = new Properties();
		File Location = new File(locatorfile);
		FileReader File = new FileReader(Location);
		Prop.load(File);
		String Xpath = Prop.getProperty(LoadXpath);
		Wait wait2 = new FluentWait(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(250, TimeUnit.MILLISECONDS)
				.ignoring(NoSuchElementException.class).ignoring(TimeoutException.class);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath)));
		WebElement elem = driver.findElement(By.xpath(Xpath));
		return elem;

	}
	
	public static WebElement clickElement(String LoadXpath, String locatorfile) throws Throwable {
		Thread.sleep(4000);
		Properties Prop = new Properties();
		File Location = new File(locatorfile);
		FileReader File = new FileReader(Location);
		Prop.load(File);
		String Xpath = Prop.getProperty(LoadXpath);
		Wait wait2 = new FluentWait(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(250, TimeUnit.MILLISECONDS)
				.ignoring(NoSuchElementException.class).ignoring(TimeoutException.class);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath)));
		WebElement elem = driver.findElement(By.xpath(Xpath));
		elem.click();
		return elem;

	}
	
	public static String captureScreenshot() throws IOException {

		File srcFiler = driver.getScreenshotAs(OutputType.FILE);
		byte[] encoded;
		try {
			encoded = Base64.encodeBase64(FileUtils.readFileToByteArray(srcFiler));
			String s = new String(encoded, StandardCharsets.US_ASCII);
			return s;

		} catch (IOException e) {
			e.printStackTrace();

		}
		return null;

	}
	
	public static void sendKeystoElement(String LoadXpath, String Data, String locatorfile) throws Throwable {
		Properties Prop = new Properties();
		File Location = new File(locatorfile);
		FileReader File = new FileReader(Location);
		Prop.load(File);
		String Xpath = Prop.getProperty(LoadXpath);
		Wait wait2 = new FluentWait(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(250, TimeUnit.MILLISECONDS)
				.ignoring(NoSuchElementException.class).ignoring(TimeoutException.class);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath)));
		//WebElement Element = driver.findElement(By.xpath(Xpath));
	//	Element.sendKeys(Data);
	//	getElement(LoadXpath, locatorfile).clear();
		//clickElement(LoadXpath, locatorfile);
		driver.getKeyboard().sendKeys(Data);
	}
	
	public void scrollAndClick(String visibleText) {
		driver.findElementByCssSelector(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ visibleText + "\").instance(0))")
		.click();  
	}

	public void scroll(String visibleText) {
		driver.findElementByCssSelector(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ visibleText + "\").instance(0))");
	}
	
	

	public void explictwait(String text) {
		Wait wait = new FluentWait(driver).withTimeout(60, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class).ignoring(TimeoutException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(text)));

	}

	

	public void waitForElement(WebElement e) {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOf(e));
	}

	

	public static String getElementvalue(String LoadXpath, String locatorfile) throws Throwable {

		Properties Prop = new Properties();
		File Location = new File(locatorfile);
		FileReader File = new FileReader(Location);
		Prop.load(File);
		String Xpath = Prop.getProperty(LoadXpath);
		WebElement elem = driver.findElement(By.xpath(Xpath));
		Thread.sleep(2000);
		String attribute = elem.getText();

		System.out.println("Entered value:" + attribute);
		return attribute;

	}

	public String getOTPFrom() throws Exception {
		driver.rotate(ScreenOrientation.PORTRAIT);
		driver.get("https://www.receivesms.co/us-phone-number/3464/");
		driver.navigate().refresh();
		Thread.sleep(40000);
		driver.navigate().refresh();
		List<WebElement> webElements = driver.findElements(By.xpath("//*[contains(text(),'US verification code is:')]"));
	
		WebElement firstElement = webElements.get(0);
		driver.executeScript("arguments[0].scrollIntoView(true);", firstElement);
		Thread.sleep(500);
		String tableText = driver.findElement(By.xpath("//*[contains(text(),'US verification code is:')]"))
				.getText();
		System.out.println(tableText);
		// extract digits only from strings
		String numberOnly = tableText.replaceAll("[^0-9]", "");
		// print the digitts
		System.out.println("Pampers OTP is:>>" + numberOnly);
		String myString = numberOnly;
		System.out.println(myString);
		// OTPValue = myString;
		// System.out.println("OTP value is:>"+ OTPValue);
		StringSelection stringSelection = new StringSelection(myString);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		driver.quit();
		
		return myString;
		
	}

	
	public static void clearkeys(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.clear();
	}

	public void wait(String LoadXpath, String locatorfile) throws IOException {
		Properties Prop = new Properties();
		File Location = new File(locatorfile);
		FileReader File = new FileReader(Location);
		Prop.load(File);
		String Xpath = Prop.getProperty(LoadXpath);
		WebElement elem = driver.findElement(By.xpath(Xpath));
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOf(elem));
	}



	
	
	public WebElement getElement(String ID) {
	
		
		String EleType, Value;
		EleType = element.getProperty(ID).split(" ")[0];
		Value = element.getProperty(ID).split(" ", 2)[1];

		switch (EleType) {
		case "id":
			return driver.findElement(By.id(Value));
		case "xpath":
			return driver.findElement(By.xpath(Value));
		case "acid":
			return (WebElement) driver.findElementByAccessibilityId(Value.replace("_", " "));
		default:
			return driver.findElement(By.xpath(Value));
		}
	} 
	public void ScrollToElement(String ID, String direction) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", direction);
		scrollObject.put("xpath", ID);
		js.executeScript("mobile: scroll", scrollObject);
	}
	
	public By getElementBy(String ID) {
		String EleType, Value;
		EleType = element.getProperty(ID).split(" ")[0];
		Value = element.getProperty(ID).split(" ", 2)[1];

		switch (EleType) {
		case "id":
			return By.id(Value);
		case "xpath":
			return By.xpath(Value);
		default:
			return By.xpath(Value);
		}
	}

	public List<WebElement> getElements(String ID) {
		String EleType, Value;
		EleType = element.getProperty(ID).split(" ")[0];
		Value = element.getProperty(ID).split(" ", 2)[1];

		return driver.findElements(By.xpath(Value));
	}

	public void waitForElement(String ID) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOf(getElement(ID)));
	}

	public void sleep() {
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void sleep(int Time) {
		try {
			Thread.sleep(Time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickElement(String ID) {
		Wait wait2 = new FluentWait(driver).withTimeout(60, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class).ignoring(TimeoutException.class);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(getElementBy(ID)));
		getElement(ID).click();
	}

	public void tapElement(String ID) {
		Wait wait2 = new FluentWait(driver).withTimeout(10, TimeUnit.SECONDS).pollingEvery(250, TimeUnit.MILLISECONDS)
				.ignoring(NoSuchElementException.class).ignoring(TimeoutException.class);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(getElementBy(ID)));

		getElement(ID).submit();
	}

	public void movetoelementoffset(int x, int y) {
		new TouchAction(driver).tap(point(x, y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(0))).perform();

	}

	public void tapByCoordinates(int x, int y) {
		new TouchAction(driver).tap(point(x, y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(250))).perform();
	}

	public boolean buttonisenable(String ID) {
		return getElement(ID).isEnabled();
	}

	public void clearkeys(String ID) {
		Wait wait2 = new FluentWait(driver).withTimeout(60, TimeUnit.SECONDS).pollingEvery(250, TimeUnit.MILLISECONDS)
				.ignoring(NoSuchElementException.class).ignoring(TimeoutException.class);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(getElementBy(ID)));
		getElement(ID).clear();
	}

	public void sendKeystoElement(String ID, String Value) {
		Wait wait2 = new FluentWait(driver).withTimeout(60, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class).ignoring(TimeoutException.class);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(getElementBy(ID)));
		getElement(ID).clear();
		getElement(ID).sendKeys(Value);
	}

	public void sendKeystoElementiOS(String ID, String Value) {
		Wait wait2 = new FluentWait(driver).withTimeout(60, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class).ignoring(TimeoutException.class);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(getElementBy(ID)));
		getElement(ID).clear();
		driver.getKeyboard().sendKeys(Value);
	}

	public String getElementText(String ID) {
		Wait wait2 = new FluentWait(driver).withTimeout(60, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class).ignoring(TimeoutException.class);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(getElementBy(ID)));
		return getElement(ID).getText();
	}

	public String getElementsText(String ID) {
		String out = null;
		List<WebElement> elements = getElements(ID);
		for (WebElement ele : elements) {
			out = out + " " + ele.getText();
		}
		return out;
	}

	public void quitCurrentDriver() {
		driver.quit();
		sleep(10000);
	}

	public void closeCurrentDriver() {
		driver.close();
		sleep(10000);
	}

	public void printContext() {
		try {
			Set<String> contexts = driver.getContextHandles();
			for (String string : contexts) {
				System.out.println(string);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void allowPermissions() {
		getElement("permissions.allow").click();
	}

	public void hideCloudDeviceKeyboard() {
		driver.navigate().back();
	}

	public void closeDatePicker() {
		driver.findElement(By.id("button2")).click();
	}

	public void closeDriver() {
		driver.quit();
	} 
	
	
	public String mail(String pass) throws Throwable
	{
		driver.rotate(ScreenOrientation.PORTRAIT);
		//https://mail.google.com/mail/mu/mp/109/#tl/Inbox
        driver.get("https://mail.google.com/mail/mu/mp/109/#tl/Inbox");
        driver.navigate().refresh();
        Thread.sleep(6000);
        List resetmail = driver.findElements(By.xpath("//*[contains(text(),'pampers-reply@pg.us.pamp.')]"));
        //String tableText = driver.findElement(By.xpath("//*[@text='noreply@janrain.com']")).getText();
       // System.out.println(tableText);
        WebElement firstElement = (WebElement) resetmail.get(0);
        firstElement.click();
        Thread.sleep(5000);
        WebElement passwordlink = driver.findElementByXPath("(//*[contains(text(),'Password')])[2]");
        passwordlink.click();
        Thread.sleep(5000);
        clickElement("passwordfield", LoginXpath);
        sendKeystoElement("passwordfield", pass, LoginXpath);
        Thread.sleep(5000);
        driver.hideKeyboard();
        System.out.println(pass);
        Thread.sleep(4000);
        clickElement("changepassword", LoginXpath);
        Thread.sleep(7000);
		return pass; 
         
	}
	
} 

