package com.AutomationTestCases.testscripts;

import org.testng.annotations.Test;

import com.AutomationTestCases.pageobjects.homePage;
import com.AutomationTestCases.pageobjects.signupLoginPage;

public class E2eTestScript extends BaseClass {
	
	@Test
	public static void RegisterUser() {
		homePage hp = new homePage(driver);
		hp.HomePageValidation();
		signupLoginPage slp = new signupLoginPage(driver);
		slp.clickSignupLoginButton();
		slp.checkSignupVisiblity();
		slp.fillSignupDetails();
	}

}
