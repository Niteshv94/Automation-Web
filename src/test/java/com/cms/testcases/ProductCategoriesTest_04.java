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

//Automation Script to Add Sub-categories of a Product Category.

public class ProductCategoriesTest_04 extends BaseClassTest {

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

		logger.info("Land to Product Categories page");

		try {
			productCategories.landToProductCategoriesPage();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		logger.pass("Landed to Product Categories page successfully");
	}

	@Test(priority = 3)

	public void searchProductCategoryInTextbox() {

		logger = extentReports.createTest("Search Product Category Name");

		ProductCategories productCategories = PageFactory.initElements(driver, ProductCategories.class);

		logger.info("Product Category Name Searched & Click Subcategory icon");

		try {
			productCategories.searchProductCategory(excelDataProvider.getProductCategory("Product Categories", 1, 3));
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		logger.pass("Clicked on Subcategory icon successfully");
	}
	
	@Test(priority = 4)

	public void addProductSubCategory() {

		logger = extentReports.createTest("Enter Product Sub Category Name");

		ProductCategories productCategories = PageFactory.initElements(driver, ProductCategories.class);

		logger.info("Product Sub Category Name entered & Click on Next button");
		
		
		try {
			productCategories.enterProductSubCategory(excelDataProvider.getProductCategory("Product Categories", 3, 0));
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		logger.pass("Clicked on Next button successfully");
	}
	
	@Test(priority = 5)

	public void searchproductSubcategoryProductClustersInSearchbox() {

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
