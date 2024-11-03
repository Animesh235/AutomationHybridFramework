package com.AutomationTestCases.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class homePage {
	WebDriver pagedriver;
	
	public homePage(WebDriver remotedriver) {
		PageFactory.initElements(remotedriver, this);
	}
	
	@FindBy(xpath="//a[text()=' Home']")
    WebElement homepage;

    public void HomePageValidation() {
        String expectedHomePageText = "Home"; // expected text without extra spaces
        String actualHomePageText = homepage.getText().trim(); // retrieves and trims the text
        Assert.assertEquals(actualHomePageText, expectedHomePageText);
    }

	
}
