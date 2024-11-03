package com.AutomationTestCases.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class contactUsPage {
	WebDriver pagedriver;
	
	public contactUsPage(WebDriver remotedriver) {
		PageFactory.initElements(remotedriver, this);
 }

}
