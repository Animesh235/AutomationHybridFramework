package com.AutomationTestCases.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties properties; 
	
	String path = System.getProperty("user.dir") + "\\configurations\\config.properties";
	
	public ReadConfig() {
		
		try {
			properties = new Properties();
			FileInputStream fis = new FileInputStream(path);
			properties.load(fis);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getBaseURlData() {
		
		String value = properties.getProperty("baseUrl");
		
		if (value!=null) {
			return value;
		}
		else 
			throw new RuntimeException("url is not there in propertie file");
	}
	
	 public String getBrowserData() {
			
			String value = properties.getProperty("browser");
			
			if (value!=null) {
				return value;
			}
			else 
				throw new RuntimeException("browser is not define in propertie file");
		}
}
