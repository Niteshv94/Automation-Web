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

//Automation Script to show the product in "View in 3D" mode

public class ProductCatalogTest_04 extends BaseClassTest {
	
	
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
	public void clickOnViewIn3DOption() {


		logger = extentReports.createTest("Click on View in 3D");

		ItemCatalog catalogBulkUploadAction = PageFactory.initElements(driver,
				ItemCatalog.class);
		
		logger.info("3D View Clicked Successfully");
		
		try {
			catalogBulkUploadAction.clickOn3D();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		logger.pass("3D View Opened");

		}

}
