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

//Automation Script to update the Product Title name in details page.

public class ProductCatalogTest_05 extends BaseClassTest {

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

		catalogBulkUploadAction.clickOnProductAndUpdateName();

		logger.pass("Landed on Item Details Page");

	}

	// BEFORE RUN THIS SCRIPT EITHER CHECK THE ITEM NAME IN "ITEMCATALOG.JAVA" CLASS AND KEEP IT AS PROVIDED IN CMS ALSO THEN RUN THIS SCRIPT OR IGNORE THIS ONE

	@Test(priority = 3)
	public void updateItemDetailsName() {

		logger = extentReports.createTest("Click on Create Icon & Update Title");

		ItemCatalog catalogBulkUploadAction = PageFactory.initElements(driver, ItemCatalog.class);

		logger.info("Updating Product Title");

		try {
			catalogBulkUploadAction.updateName(excelDataProvider.enterProductCatalogName("Item Catalog", 1, 0));
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		logger.pass("Product Title Updated Successfully");

	}

}
