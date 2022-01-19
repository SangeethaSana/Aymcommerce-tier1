package com.aymcommerce.pg.clubpampers.config.mapper;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationMapper {

	public static Properties element, mConfig;
	public static ConfigurationMapper configmapper;

	public ConfigurationMapper getConfigInstance() {
		if (configmapper == null) {
			String[] map = { "App.properties" };
			String[] elementsMap = { "Profile.properties", "Login.properties", "refer.properties", "Reward.properties",
					"Scanning.properties", "Mybaby.properties" };
			loadCoreConfig(map);
			loadElements(elementsMap);
			configmapper = new ConfigurationMapper();
			return configmapper;
		}
		return configmapper;
	}

	public static synchronized Properties getElement() {
		return element;
	}

	public static void loadElements(String[] PageToLoad) {
		element = new Properties();
		for (String string : PageToLoad) {
			FileReader pageMapper = null;
			try {
				pageMapper = new FileReader(System.getProperty("user.dir")
						+ "//src//test//java//com//aymcommerce//pg//clubpampers//log//locators//" + string);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			try {
				element.load(pageMapper);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void loadCoreConfig(String[] AppProperties) {
		mConfig = new Properties();
		for (String string : AppProperties) {
			FileReader pageMapper = null;
			try {
				pageMapper = new FileReader(System.getProperty("user.dir") + "/" + string);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			try {
				mConfig.load(pageMapper);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
