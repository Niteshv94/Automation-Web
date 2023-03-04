/**
 * 
 */
package com.cms.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.cms.base.BaseClassTest;
import com.cms.pages.LoginPage;
import com.cms.pages.ProductCategories;

/**
 * @author Nitesh
 *
 */

//Automation Script to Add an already Existing Product Categories.


public class ProductCategoriesTest_03 extends BaseClassTest {
	
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

	public void enterExistingProductCategory() {

		logger = extentReports.createTest("Enter an Existing Product Category Name");

		ProductCategories productCategories = PageFactory.initElements(driver, ProductCategories.class);

		logger.info("Existing Product Category Name Entered & Click on Next button");

		try {
			productCategories.enterProductCategory(excelDataProvider.getProductCategory("Product Categories", 1, 2));
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		//System.out.println("Error Message is --- " + productCategories.captureErrorMessage());

		logger.pass("Existing Product Category entered & thrown an Error Message");
	}

}
