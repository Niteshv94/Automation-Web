/**
 * 
 */
package com.cms.testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.cms.base.BaseClassTest;
import com.cms.pages.LoginPage;
import com.cms.pages.ProductAttributes;

/**
 * @author Nitesh
 *
 */

//Automation Script for Bulk Attribute (Empty XSL File) of CMS


public class BulkAttributeTest_03 extends BaseClassTest {
	
	Robot robot;
	String excelFileWithoutValue = "D:\\Trezi\\Bulk Attribute File\\BulkAttributeCodeWithoutValue.xlsx";
	
	
	@Test(priority = 1)
	public void loginAction() {
		logger = extentReports.createTest("Login to CMS");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		logger.info("Starting Application");

		loginPage.loginToCMS(excelDataProvider.getStringData("Login", 1, 0),
				excelDataProvider.getStringData("Login", 1, 1));

		logger.pass("Login Success");
	}

	@Test(priority = 2)

	public void productAttribute() {
		logger = extentReports.createTest("Click on Bulk Attribute");

		ProductAttributes productAttributes = PageFactory.initElements(driver, ProductAttributes.class);

		logger.info("Landed on Bulk Upload Attributes Page");

		try {
			productAttributes.bulkAttribute();
		} catch (InterruptedException e) {

		}

		logger.pass("Bulk Attribute po-up window appeared");

	}
	
	@Test(priority = 3)
	public void uploadEmptyExcelFile() {
		
		logger = extentReports.createTest("Click on Select Excel File tab");

		ProductAttributes productAttributes = PageFactory.initElements(driver, ProductAttributes.class);

		logger.info("Ready to Upload Empty Excel File");
		
		productAttributes.clickOnSelectExcelFile();
		
		// Upload Excel File using Robot Class
		
		try {
			robot = new Robot();
		} catch (AWTException e) {
			
		}
		
		robot.setAutoDelay(2000);
		
		StringSelection stringSelection = new StringSelection(excelFileWithoutValue);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		
		robot.setAutoDelay(1000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		//Now click on Upload File button
		productAttributes.clickOnUploadFileButton();
		
		logger.pass("Empty Excel File Uploaded");
	}


}
