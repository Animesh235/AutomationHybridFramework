package com.AutomationTestCases.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class productsPage {
	WebDriver pagedriver;
	
	public productsPage(WebDriver remotedriver) {
		PageFactory.initElements(remotedriver, this);
	}

}
