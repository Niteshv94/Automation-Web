/**
 * 
 */
package com.cms.base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.cms.utility.BrowserFactory;
import com.cms.utility.ConfigDataProvider;
import com.cms.utility.ExcelDataProvider;
import com.cms.utility.Helper;

/**
 * @author Nitesh
 *
 */
public class BaseClassTest {

	public static WebDriver driver;
	public ExcelDataProvider excelDataProvider;
	public ConfigDataProvider configDataProvider;
	public ExtentReports extentReports;
	public ExtentTest logger;
	
	
	@BeforeSuite
	public void setUpSuite() {
		
		Reporter.log("<<<<<Setting up Reports & Test is getting ready>>>>>", true);
		
		excelDataProvider = new ExcelDataProvider();
		configDataProvider = new ConfigDataProvider();
		
		ExtentHtmlReporter extentHtmlReporter = new ExtentHtmlReporter(new File(System.getProperty("user.dir") + "/Reports/CMS_"+Helper.getCurrentDateTime()+".html"));
		
		extentReports = new ExtentReports();
		extentReports.attachReporter(extentHtmlReporter);
		
		Reporter.log("<<<<<Setting Done - Test can be started>>>>>", true);
	}
	
	@BeforeClass
	public void setUp()
	{
		Reporter.log("<<<<<Trying to start browser and getting Application ready>>>>>", true);
		
		driver=BrowserFactory.startApplication(driver, configDataProvider.getBrowser(), configDataProvider.getTestUrl());
		
		System.out.println("The Title of the Application is ---- " + driver.getTitle());
		
		Reporter.log("<<<<<Browser and Application is up and running>>>>>", true);
	}
	
	@AfterClass
	public void tearDown()
	{
		//BrowserFactory.quitbrowser(driver);
		
	}
	
	@AfterMethod
	public void tearDownMethod(ITestResult result) {
		
		//Reporter.log("<<<<<Test is about to End>>>>>", true);
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			//Helper.captureScreenshot(driver);
			try {
				logger.fail("Test Failed" , MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());
			} catch (IOException e) {
			}
		}
		
		else if (result.getStatus()==ITestResult.SUCCESS) {
			
			try {
				logger.pass("Test Passed" , MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());
			} catch (IOException e) {
			}
		}
		extentReports.flush();
		
		//Reporter.log("<<<<<Test Completed - Reports Generated>>>>>", true);
	}

}
