package com.AutomationTestCases.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class cartPage {
 WebDriver pagedriver;
	
	public cartPage(WebDriver remotedriver) {
		PageFactory.initElements(remotedriver, this.pagedriver);
 }
}
