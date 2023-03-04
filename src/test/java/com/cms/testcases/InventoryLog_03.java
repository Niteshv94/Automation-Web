/**
 * 
 */
package com.cms.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.cms.base.BaseClassTest;
import com.cms.pages.InventoryLog;
import com.cms.pages.LoginPage;

/**
 * @author Nitesh
 *
 */

// Automation Script Forward/Backward of Inventory Log Page

public class InventoryLog_03 extends BaseClassTest {
	
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

	public void MoveForward() {

		logger = extentReports.createTest("Click on arrow button");

		InventoryLog inventoryLog = PageFactory.initElements(driver, InventoryLog.class);

		logger.info("Click on arrow forward & backward button");

		try {
			inventoryLog.selectLeftArrow();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		logger.pass("Forward & Backward arrow working successfully");
	}

}
