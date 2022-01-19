package com.aymcommerce.pg.clubpampers.bdd.report.listener;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aymcommerce.pg.clubpampers.config.mapper.ConfigurationMapper;
import com.aymcommerce.pg.clubpampers.log.listener.RuntimeLoggerListner;

public class ReportRuntimeListener implements ReportListener {
	public static ExtentHtmlReporter reporter;
	public static ExtentReports extent;
	public static ExtentTest feature;
	public static ExtentTest scenario, step;
	public static String testDetail;
	private static ReportRuntimeListener reportRuntimeListener;

	public ReportRuntimeListener getReportInstance() {
		if (reportRuntimeListener == null) {
			reportEngine();
			reportRuntimeListener = new ReportRuntimeListener();
			return reportRuntimeListener;
		}
		return reportRuntimeListener;
	}

	public ExtentReports reportEngine() {
		RuntimeLoggerListner.logDetail("Creating Report File");
		extent = new ExtentReports();
		reporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "//test-output//AYMReport.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Build Version", ConfigurationMapper.mConfig.getProperty("Build_Version"));
		extent.setSystemInfo("appPackage", ConfigurationMapper.mConfig.getProperty("APP_PACKAGE"));
		extent.setSystemInfo("appActivity", ConfigurationMapper.mConfig.getProperty("APP_ACTIVITY"));
		return extent;
	}

	public void reportCooldown() {
		extent.flush();
	}

	public void reportCreateFeature(String title) {
		feature = extent.createTest(Feature.class, title);
	}

	public void reportFeatureLog(String info) {
		feature.log(Status.INFO, info);
	}

	public void reportFeatureLogPass(String info) {
		feature.log(Status.PASS, info);
	}

	public void reportFeatureLogFatal(String Info) {
		feature.log(Status.WARNING, Info);
	}

	public void reportCreateScenario(String Scenario) {
		scenario = feature.createNode(Scenario.class, Scenario);
	}

	public void reportScenarioPass(String Details, String s) {
		try {
			scenario.pass(Details, MediaEntityBuilder.createScreenCaptureFromBase64String(s).build());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void reportScenarioPass(String Details) {
		scenario.pass(Details);
	}

	public void reportScenarioFail(String Details) {
		scenario.fail(Details);
	}

	public void reportScenarioFail(String Details, String s) {
		try {
			scenario.fail(Details, MediaEntityBuilder.createScreenCaptureFromBase64String(s).build());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void reportScenarioExpection(Exception e) {
		scenario.fail(e);
	}

	public void createStep(String keyword, String stepName) throws ClassNotFoundException {
		switch (keyword) {
		case "Given":
			step = scenario.createNode(new GherkinKeyword("Given"), stepName);
			break;
		case "And":
			step = scenario.createNode(new GherkinKeyword("And"), stepName);
			break;
		case "When":
			step = scenario.createNode(new GherkinKeyword("When"), stepName);
			break;
		case "Then":
			step = scenario.createNode(new GherkinKeyword("Then"), stepName);
			break;
		default:
			step = scenario.createNode(new GherkinKeyword("And"), stepName);
		}
	}

	public void reportStepPass(String Details, String s) {
		try {
			step.pass(Details, MediaEntityBuilder.createScreenCaptureFromBase64String(s).build());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void reportStepPass(String Details) {
		step.pass(Details);
	}

	public void reportStepFail(String Details) {
		step.fail(Details);
	}

	public void reportStepFail(String Details, String s) {
		try {
			step.fail(Details, MediaEntityBuilder.createScreenCaptureFromBase64String(s).build());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void reportStepExpection(Exception e) {
		step.fail(e);
	}

}
