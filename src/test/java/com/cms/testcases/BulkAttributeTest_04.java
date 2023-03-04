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

//Automation Script for Bulk Attribute (Download Template) of CMS

public class BulkAttributeTest_04 extends BaseClassTest {

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
	
	@Test (priority = 3)
	public void attributeTemplateDownload() {
		
		logger = extentReports.createTest("Click on Download Attribute Template Tab");

		ProductAttributes productAttributes = PageFactory.initElements(driver, ProductAttributes.class);

		logger.info("Landed on Bulk Upload Attributes Page");
		
		productAttributes.downloadBulkAttributeTemplate();
		
		logger.pass("Bulk Attribute Template Downloaded");
	}
}
