package com.cms.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {

	Properties properties;

	public ConfigDataProvider() {

		File file_source = new File("./Configuration/Config.properties");

		try {
			FileInputStream fileInputStream = new FileInputStream(file_source);

			properties = new Properties();
			properties.load(fileInputStream);
		} catch (Exception e) {

			System.out.println("Unable to load Configuration File>>> " + e.getMessage());
		}
	}

	public String getDataFromConfig(String keyToSearch) {

		return properties.getProperty(keyToSearch);

	}

	public String getBrowser() {

		return properties.getProperty("Browser");

	}

	public String getTestUrl() {

		return properties.getProperty("DevURL");

	}

}
