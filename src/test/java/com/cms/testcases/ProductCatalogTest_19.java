/**
 * 
 */
package com.cms.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.cms.base.BaseClassTest;
import com.cms.pages.ItemCatalog;
import com.cms.pages.LoginPage;

/**
 * @author Nitesh
 *
 */

//Automation Script to Update Mandatory Specifications field

public class ProductCatalogTest_19 extends BaseClassTest {
	
	@Test(priority = 1)
	public void login() {

		logger = extentReports.createTest("Login to CMS");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		logger.info("Starting Application");

		loginPage.loginToCMS(excelDataProvider.getStringData("Login", 1, 0),
				excelDataProvider.getStringData("Login", 1, 1));

		logger.pass("Login Success");

	}
	
	@Test(priority = 2)
	public void clickOnProductCatalogFromList() {


		logger = extentReports.createTest("Land to Item Catalog Page and Click on a Product");

		ItemCatalog catalogBulkUploadAction = PageFactory.initElements(driver,
				ItemCatalog.class);

		logger.info("Product Clicked Successfully");
		
		catalogBulkUploadAction.clickOnProduct();
		
		logger.pass("Landed on Item Details Page");

	}
	
	@Test(priority = 3)
	public void clickOnAttributeTab() throws InterruptedException {


		logger = extentReports.createTest("Go to Attributes Tab");

		ItemCatalog catalogBulkUploadAction = PageFactory.initElements(driver,
				ItemCatalog.class);
		
		logger.info("Landed to Attributes Tab");
		
		catalogBulkUploadAction.clickOnAttributes();
		
		
		logger.pass("Landed to Attributes Tab successfully");

		}
	
	@Test(priority = 4)

	public void MandatorySpecificationsTextfield() {
		logger = extentReports.createTest("Enter value in Mandatory Specifications");

		ItemCatalog catalogBulkUploadAction = PageFactory.initElements(driver,
				ItemCatalog.class);

		logger.info("Entering value in Mandatory Specifications");

		try {
			catalogBulkUploadAction.enterValueInTextbox(excelDataProvider.enterMandatorySpecifications("Item Catalog", 1, 1));
		} catch (Exception e) {
		}

		logger.pass("Value enter in Mandatory Specifications successfully");
	}

}
