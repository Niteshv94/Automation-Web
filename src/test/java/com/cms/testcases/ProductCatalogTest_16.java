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

//Automation Script to TZI Number in Product Details Page

public class ProductCatalogTest_16 extends BaseClassTest {
	
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

		ItemCatalog catalogBulkUploadAction = PageFactory.initElements(driver, ItemCatalog.class);

		logger.info("Product Clicked Successfully");

		catalogBulkUploadAction.clickOnProduct();

		logger.pass("Landed on Item Details Page");

	}
	
	
	
	@Test(priority = 3)
	public void captureTziNumber() {

		logger = extentReports.createTest("Capture TZI Number");

		ItemCatalog catalogBulkUploadAction = PageFactory.initElements(driver, ItemCatalog.class);

		logger.info("Product TZI Number");

		System.out.println("The TZI Number is display ----- " + catalogBulkUploadAction.tziNumber());

		logger.pass("Product TZI Number Captured Successfully");

	}

}
