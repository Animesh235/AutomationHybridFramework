package com.AutomationTestCases.testscripts;

import org.testng.annotations.BeforeClass;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

//import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.LogManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import com.AutomationTestCases.utilities.ReadConfig;

public class BaseClass {
	
	public static WebDriver driver;
	public static Logger logger;
	
	//private static final Logger logger = LogManager.getLogger(BaseClass.class);
	
	ReadConfig datafile = new ReadConfig();
	
	String url = datafile.getBaseURlData();
	String browsername = datafile.getBrowserData();
	
	@BeforeClass
	public void setup() {
	        
	        // Browser selection based on configuration
	        if (browsername.equalsIgnoreCase("chrome")) {
	            driver = new ChromeDriver();
	            //logger.info("Chrome browser initialized.");
	        } else if (browsername.equalsIgnoreCase("firefox")) {
	            driver = new FirefoxDriver();
	           // logger.info("Firefox browser initialized.");
	        } else {
	           // logger.error("Browser not supported: " + browsername);
	            throw new RuntimeException("Browser not supported: " + browsername);
	        }
	        
	       //for logging
			logger = LogManager.getLogger("Test Script");
	        
	        // Navigating to the specified URL and maximizing the window
	        driver.get(url);
	        
	        logger.info("Navigated to URL: " + url);
	        
	        driver.manage().window().maximize();
	        
	        logger.info("Browser window maximized.");
	        
	        // Set timeouts for better synchronization
	        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	        logger.info("Page load timeout set to 5 seconds, implicit wait set to 10 seconds.");
	    }

	
	@AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            logger.info("Browser closed and resources released.");
        }
    }
	
	   //user method to capture screen shot
		public void captureScreenShot(WebDriver driver,String testName) throws IOException
		{
			//step1: convert webdriver object to TakesScreenshot interface
			TakesScreenshot screenshot = ((TakesScreenshot)driver);
			
			//step2: call getScreenshotAs method to create image file
			
			File src = screenshot.getScreenshotAs(OutputType.FILE);
			
			File dest = new File(System.getProperty("user.dir") + "//Screenshots//" + testName + ".png");
		
			//step3: copy image file to destination
			FileUtils.copyFile(src, dest);
		}
}
