/**
 * 
 */
package com.cms.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.cms.base.BaseClassTest;
import com.cms.pages.InventoryLog;
import com.cms.pages.LoginPage;
import com.cms.pages.ProductCategories;

/**
 * @author Nitesh
 *
 */

//Automation Script Click on "View Details" & copy link

public class InventoryLog_01 extends BaseClassTest {
	
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

	public void AssetInventoryLogpage() {

		logger = extentReports.createTest("Land to Asset Inventory Log page");

		InventoryLog inventoryLog = PageFactory.initElements(driver, InventoryLog.class);

		logger.info("Land to Asset Inventory Log page");

		try {
			inventoryLog.landToAssetInventoryLogpage();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		logger.pass("Asset Inventory Log page landed successfully");
	}
	
	@Test(priority = 3)

	public void ViewDetails() {

		logger = extentReports.createTest("Click on View Details button");

		InventoryLog inventoryLog = PageFactory.initElements(driver, InventoryLog.class);

		logger.info("Click on View Details button");

		try {
			inventoryLog.clickDetailsButton();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		logger.pass("View Details button clicked successfully");
	}

}
