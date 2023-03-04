/**
 * 
 */
package com.cms.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.cms.base.BaseClassTest;
import com.cms.pages.LoginPage;
import com.cms.pages.ProductAttributes;

/**
 * @author Nitesh
 *
 */

//Automation Script to Close Bulk Attribute Upload pop-up


public class BulkAttributeTest_05 extends BaseClassTest {
	
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

		logger.pass("Clicked on Bulk Attribute");

	}
	
	@Test(priority = 3)

	public void closeWindowPopup() {
		logger = extentReports.createTest("Click on close button of window pop-up");

		ProductAttributes productAttributes = PageFactory.initElements(driver, ProductAttributes.class);

		logger.info("Landed on Bulk Upload Attributes Page");
		
		productAttributes.clickOnCloseButton();
		
		logger.pass("Clicked on close button & pop-up disappeared");
		
	}

}
