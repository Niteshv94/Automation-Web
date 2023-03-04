/**
 * 
 */
package com.cms.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cms.base.BaseClassTest;
import com.cms.pages.LoginPage;
import com.cms.pages.ProductCategories;

/**
 * @author Nitesh
 *
 */

//Automation Script to validate Web Element present in Product Categories Module

public class ProductCategoriesTest_01 extends BaseClassTest {

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

	public void productCategories() {

		logger = extentReports.createTest("Click on Product Categories");

		ProductCategories productCategories = PageFactory.initElements(driver, ProductCategories.class);

		logger.info("Click on Create New Button");

		try {
			productCategories.clickOnProductCategory();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		logger.pass("Create New button clicked successfully");
	}

	@Test(priority = 3)
	public void verifyWebElementOfAddCategoryWindowPopup() {

		logger = extentReports.createTest("Verify WebElement on Product Categories Window Pop-up");

		ProductCategories productCategories = PageFactory.initElements(driver, ProductCategories.class);

		logger.info("Verifying WebElement on Product Categories Window Pop-up");
		
		//Verify Product Category Title
		System.out.println("Header Message of Product Categories is Displayed --- " + productCategories.verifyProductCategoryTitle());
		Assert.assertTrue(productCategories.verifyProductCategoryTitle());
		
		//Verify Name Text Box
		System.out.println("Name Text Box is Displayed --- " + productCategories.verifyNameTextBox());
		Assert.assertTrue(productCategories.verifyNameTextBox());
		
		//Verify Close Link
		System.out.println("Close link is Displayed --- " + productCategories.verifyCloseLink());
		Assert.assertTrue(productCategories.verifyCloseLink());
		
		//Verify Next Button
		System.out.println("Next button is Enabled --- " + productCategories.verifyNextButton());
		Assert.assertTrue(productCategories.verifyNextButton());
		
		logger.pass("Verified WebElement on Product Categories Window Pop-up");

	}

}
