package com.AutomationTestCases.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class signupLoginPage {
	 WebDriver pagedriver;
		
		public signupLoginPage(WebDriver remotedriver) {
			PageFactory.initElements(remotedriver, this);
	 }

}
