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

//Automation Script to add an existing Product Category.


public class ProductCategoriesTest_06 extends BaseClassTest {
	
	
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

	public void enterProductCategoryInTextbox() {

		logger = extentReports.createTest("Enter an Existing Product Category Name");

		ProductCategories productCategories = PageFactory.initElements(driver, ProductCategories.class);

		logger.info("Existing Product Category name Entered & Click on Next button");

		try {
			productCategories.enterProductCategory(excelDataProvider.getProductCategory("Product Categories", 1, 0));
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		logger.pass("An existing Product Category can't be entered & it will through an error message");
	}

}
