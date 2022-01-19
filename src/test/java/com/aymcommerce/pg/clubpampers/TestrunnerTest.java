package com.aymcommerce.pg.clubpampers;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "features" }, glue = {
		"com\\aymcommerce\\pg\\clubpampers\\bdd\\controller",
		"com\\aymcommerce\\pg\\clubpampers\\bdd\\stepdefinition" }, monochrome = true,tags= "@failed", dryRun = false, plugin = {

					"summary", "pretty", "html:target/cucumber-reports/cucumber-pretty",
				"json:target/cucumber-reports/CucumberTestReport.json" }, publish = true)
public class TestrunnerTest {

}
