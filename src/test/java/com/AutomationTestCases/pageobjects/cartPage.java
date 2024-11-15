package com.AutomationTestCases.pageobjects;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.AutomationTestCases.testscripts.BaseClass;

//version1

//public class cartPage {
// WebDriver pagedriver;
//	
//	public cartPage(WebDriver remotedriver) {
//		PageFactory.initElements(remotedriver, this.pagedriver);
// }
//}

//also we can wright on this way

//version2

public class cartPage extends BaseClass {
	 
		public cartPage() {
			PageFactory.initElements(driver, this);
	 }
}

//Explanation
//Class Declaration: public class cartPage extends BaseClass
//
//cartPage is a class that represents the shopping cart page in the application.
//It extends a base class (BaseClass), which likely contains common functionality, including the driver instance, that is shared across different page classes.
//Constructor: public cartPage()
//
//This is a constructor for the cartPage class, which is called when you create an instance of cartPage.
//Inside the constructor, there’s a call to PageFactory.initElements(driver, this);, which initializes the WebElements on this page.
//PageFactory.initElements(driver, this);
//
//PageFactory is a Selenium class used to initialize WebElements with the @FindBy annotation, allowing for a more readable and organized approach to locating elements.
//PageFactory.initElements(driver, this); does the following:
//It takes the driver instance (probably from BaseClass) and associates it with the WebElements declared in this cartPage class.
//this refers to the current instance of cartPage, so all @FindBy-annotated fields in this class will be initialized with the given driver.

//For small projects or single-browser testing: Version 1 with a base class might be sufficient and easier to maintain.
//For larger projects or parallel testing with multiple configurations: Version 2 would be preferable for greater control and flexibility.