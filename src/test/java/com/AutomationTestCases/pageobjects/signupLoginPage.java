package com.AutomationTestCases.pageobjects;

import java.util.Random;
import java.util.UUID;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signupLoginPage {
	 WebDriver pagedriver;
		
		public signupLoginPage(WebDriver remotedriver) {
			this.pagedriver = remotedriver;
			PageFactory.initElements(remotedriver, this);
	 }
		
		@FindBy(xpath = "//a[text()=' Signup / Login']")
		WebElement signupLoginButton;
		
		public void clickSignupLoginButton() {
			signupLoginButton.click();
		}
		
		@FindBy(xpath = "//h2[text()=\"New User Signup!\"]")
		WebElement signupText;
		
		public void checkSignupVisiblity() {
			signupText.isDisplayed();
		}
		
		@FindBy(xpath = "//input[@data-qa=\"signup-name\"]")
		WebElement signupName;
		
		@FindBy(xpath  = "//input[@data-qa=\"signup-email\"]")
		WebElement signupEmail;
		
		@FindBy(xpath = "//button[text()='Signup']")
		WebElement signupButton;
		
		public void fillSignupDetails() {
		    // Generate a base name and append a random number for uniqueness
		    String baseName = "User";
		    int randomNum = new Random().nextInt(1000);  // Generates a random number between 0 and 999
		    String randomName = baseName + randomNum;

		    // Generate a unique email with a random UUID suffix
		    String randomEmail = "user" + UUID.randomUUID().toString().substring(0, 5) + "@example.com";

		    // Fill in the signup details
		    signupName.sendKeys(randomName);
		    signupEmail.sendKeys(randomEmail);
		    signupButton.click();
		}
}
