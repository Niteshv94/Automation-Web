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

//Automation Script to Add New Categories with "Create New" button.

public class ProductCategoriesTest_02 extends BaseClassTest {

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

		logger = extentReports.createTest("Enter Product Category Name");

		ProductCategories productCategories = PageFactory.initElements(driver, ProductCategories.class);

		logger.info("Product Category Name Entered & Click on Next button");

		try {
			productCategories.enterProductCategory(excelDataProvider.getProductCategory("Product Categories", 1, 0));
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		logger.pass("Product Category Entered successfully");
	}

	@Test(priority = 4)

	public void searchProductClustersInSearchbox() {

		logger = extentReports.createTest("Search Product Cluster");

		ProductCategories productCategories = PageFactory.initElements(driver, ProductCategories.class);

		logger.info("Product Category Searched & Click on Checkbox");

		try {
			productCategories.enterProductClusters(excelDataProvider.searchClusters("Product Categories", 1, 1));
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		logger.pass("Product Clusters searched & checked successfully");
	}

}
