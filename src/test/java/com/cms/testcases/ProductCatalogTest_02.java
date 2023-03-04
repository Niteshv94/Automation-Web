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

//Automation Script of Product Catalog with View By : Grid

public class ProductCatalogTest_02 extends BaseClassTest {
	
	
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

	public void gridView() {
		logger = extentReports.createTest("Click on View By");

		ItemCatalog catalogBulkUploadAction = PageFactory.initElements(driver,
				ItemCatalog.class);
		
		logger.info("Clicked on View By Arrow");
		
		try {
			catalogBulkUploadAction.clickOnViewBy();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		logger.pass("Grid View Listed");
		
	}

}
