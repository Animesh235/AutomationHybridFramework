package com.AutomationTestCases.testscripts;

import org.testng.annotations.Test;

import com.AutomationTestCases.pageobjects.homePage;

public class E2eTestScript extends BaseClass {
	
	@Test
	public static void RegisterUser() {
		homePage hp = new homePage(driver);
		hp.HomePageValidation();
		
	}

}
