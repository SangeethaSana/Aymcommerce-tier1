package com.aymcommerce.pg.clubpampers;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "features" }, glue = { "com\\aymcommerce\\pg\\clubpampers\\bdd\\stepdefinition",
		"com\\aymcommerce\\pg\\clubpampers\\bdd\\controller" },tags= "@failed", dryRun=true)

public class EngineRunner {

}





