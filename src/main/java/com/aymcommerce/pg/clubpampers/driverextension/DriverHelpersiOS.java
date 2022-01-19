package com.aymcommerce.pg.clubpampers.driverextension;

import static io.appium.java_client.touch.offset.PointOption.point;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aymcommerce.pg.clubpampers.config.mapper.ConfigurationMapper;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.touch.WaitOptions;

public class DriverHelpersiOS {

	public static AppiumDriver<IOSElement> driver = DriverInstanceCreator.iOSDriver;
	public Properties element = ConfigurationMapper.element;

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

	public List<IOSElement> getElements(String ID) {
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

	public void cliclElement(String ID) {
		Wait wait2 = new FluentWait(driver).withTimeout(60, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class).ignoring(TimeoutException.class);
		wait2.until(ExpectedConditions.elementToBeClickable(getElementBy(ID)));
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

	public void hideKeyboard() {
		driver.hideKeyboard();
	}

	public void sendKeystoElement(String ID, String Value) {
		Wait wait2 = new FluentWait(driver).withTimeout(60, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class).ignoring(TimeoutException.class);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(getElementBy(ID)));
		getElement(ID).clear();
		getElement(ID).sendKeys(Value);
	}

	public void sendKeystoElementiOS(String ID, String Value, int Timeout) {
		Wait wait2 = new FluentWait(driver).withTimeout(60, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class).ignoring(TimeoutException.class);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(getElementBy(ID)));
		try {
			getElement(ID).clear();
		} catch (Exception e) {
			driver.getKeyboard().sendKeys("");
		}
		try {
			driver.getKeyboard().sendKeys(Value);
			sleep(Timeout);
		} catch (Exception e) {
		}
		hideKeyboard();
	}

	public void swipedown() {
		try {
			Dimension size = driver.manage().window().getSize();
			int x1 = (int) (size.getWidth() * 0.5);
			int y1 = (int) (size.getHeight() * 0.6);
			int x0 = (int) (size.getWidth() * 0.5);
			int y0 = (int) (size.getHeight() * 0.2);
			MultiTouchAction touch = new MultiTouchAction(driver);
			touch.add(new TouchAction<>(driver).press(point(x1, y1))
					.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(point(x0, y0)).release())
					.perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
		sleep(3000);
	}

	public String getElementText(String ID) {
		Wait wait2 = new FluentWait(driver).withTimeout(60, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class).ignoring(TimeoutException.class);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(getElementBy(ID)));
		return getElement(ID).getText();
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

	public void swipedown(double a, double b) {
		try {
			System.out.println("--- Scrolling Down ----");
			Dimension size = driver.manage().window().getSize();
			int x1 = (int) (size.getWidth() * 0.5);
			int y1 = (int) (size.getHeight() * a);
			int x0 = (int) (size.getWidth() * 0.5);
			int y0 = (int) (size.getHeight() * b);
			MultiTouchAction touch = new MultiTouchAction(driver);
			touch.add(new TouchAction<>(driver).press(point(x1, y1))
					.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(point(x0, y0)).release())
					.perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
		sleep(3000);
	}

	public String getElementsText(String ID) {
		String out = null;
		List<IOSElement> elements = getElements(ID);
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
}
