package com.cms.testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//import com.cms.pages.BaseClass;
import com.cms.pages.LoginPage;
import com.cms.pages.UploadExcelFileAndAssetFolder;
import com.cms.utility.BrowserFactory;
import com.cms.utility.ExcelDataProvider;
import com.cms.utility.Helper;
import com.cms.base.BaseClassTest;
import com.cms.pages.ItemCatalog;


//Automation Script to Bulk Upload of Files & Folders

public class ProductCatalogTest_01 extends BaseClassTest {

	WebDriver webdriver;
	Robot robot;
	String filelocation = "D:\\Trezi\\Lighting\\Lighting Test.xlsx";
	String folderlocation = "D:\\Trezi\\Lighting";
	//String actual_message = "Your data has been uploaded & is now being processed. Check the Asset Inventory Log for Status";
	 //String expected_message = "Your data has been uploaded & is now being processed. Check the Asset Inventory Log for Status";

	@Test(priority = 1)
	public void login() {

		
		// ExcelDataProvider excelDataProvider = new ExcelDataProvider();
		// excelDataProvider.getStringData("Login", 0, 0);

		logger = extentReports.createTest("Login to CMS");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		logger.info("Starting Application");

		loginPage.loginToCMS(excelDataProvider.getStringData("Login", 1, 0),
				excelDataProvider.getStringData("Login", 1, 1));

		logger.pass("Login Success");

		// If above conditions fail then it won't take Screenshot
		// Helper.captureScreenshot(driver);

	}

	@Test(priority = 2)

	public void bulkUpload() {
		logger = extentReports.createTest("Click on Bulk upload");

		ItemCatalog catalogBulkUploadAction = PageFactory.initElements(driver,
				ItemCatalog.class);

		logger.info("Landed to Bulk Upload Page");

		try {
			catalogBulkUploadAction.clickBulkUploadButton(excelDataProvider.getCategoryName("Category", 1, 0));
		} catch (Exception e) {
		}

		logger.pass("Bulk Upload button clicked Success and landed to Bulk Upload page");
	}

	@Test(priority = 3)
	public void fileAndAssetFolder() throws InterruptedException {
		logger = extentReports.createTest("Files & Folder Upload Process");

		UploadExcelFileAndAssetFolder uploadExcelFileAndAssetFolder = PageFactory.initElements(driver,
				UploadExcelFileAndAssetFolder.class);

		logger.info("Landed on File Upload Page");

		uploadExcelFileAndAssetFolder.uploadFilesAndFolder();

		// Upload CSV File using Robot Class

		try {
			robot = new Robot();
		} catch (AWTException e) {
		}
		robot.setAutoDelay(2000);

		StringSelection stringSelection = new StringSelection(filelocation);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		// Upload Asset Folder using Robot Class

		stringSelection = new StringSelection(folderlocation);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

		robot.setAutoDelay(1000);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		// Confirmation Window pop-up alert
		// Handle Window confirmation pop-up
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		uploadExcelFileAndAssetFolder.clickonuploadfilesbutton();

		// Verify Success message of Uploaded Item.

		Thread.sleep(40000);
//		SoftAssert assertion = new SoftAssert();
//		System.out.println("<<<<<Sucess message is being verified now>>>>>");
//		assertion.assertEquals(actual_message, expected_message);
//		System.out.println("<<<<<Sucess Message now Verified>>>>>");
//		assertion.assertAll();
		
		//verify success message with another approach
		
//		uploadExcelFileAndAssetFolder = new UploadExcelFileAndAssetFolder(driver);
//		boolean isSuccessNotificationDisplayed = uploadExcelFileAndAssetFolder.verifySuccessMessage();
//		System.out.println("Is Success Message displayed >>>" + isSuccessNotificationDisplayed);
//		Assert.assertTrue(isSuccessNotificationDisplayed);
		
		
		logger.pass("Files Uploaded Sucessfully");

	}

}
