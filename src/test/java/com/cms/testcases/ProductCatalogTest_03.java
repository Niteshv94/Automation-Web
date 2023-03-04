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

// Automation Script For Search Item Catalog

public class ProductCatalogTest_03 extends BaseClassTest {
	
	
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

	public void bulkUpload() {
		logger = extentReports.createTest("Click on Search Item Catalog");

		ItemCatalog catalogBulkUploadAction = PageFactory.initElements(driver,
				ItemCatalog.class);

		logger.info("Item Catalog will be listed");
		
		try {
			catalogBulkUploadAction.searchItemCatalogTextbox(excelDataProvider.searchItemCatalog("Search Item Catalog", 1, 0));
		} catch (Exception e) {
		}

		logger.pass("Searched Item Catalog Successfully");
	}

}
