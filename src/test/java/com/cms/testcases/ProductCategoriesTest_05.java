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

// Automation Script to Edit/Update of Product Category. 



public class ProductCategoriesTest_05 extends BaseClassTest {
	
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
	
//	@Test(priority = 3)
//	public void searchProductCategoryInTextbox() {
//
//		logger = extentReports.createTest("Search Product Category Name");
//
//		ProductCategories productCategories = PageFactory.initElements(driver, ProductCategories.class);
//
//		logger.info("Product Category Name Searched");
//		
//		productCategories.clickonParticularProductCategory();
//		
//		logger.pass("Product Category searched successfully");
//		}
	
	
	
	@Test(priority = 3)

	public void searchProductCategoryInTextbox() {

		logger = extentReports.createTest("Search Product Category Name");

		ProductCategories productCategories = PageFactory.initElements(driver, ProductCategories.class);

		logger.info("Product Category Name Searched");
		
		try {
			productCategories.searchProductCategoryAndClickOnThreeDots(excelDataProvider.getProductCategory("Product Categories", 3, 3));
		} catch (InterruptedException e) { 
			System.out.println(e.getMessage());
		}
		
		
		logger.pass("Product Category searched successfully");
		}
	
	@Test(priority = 4)

	public void updateProductCategoryInTextbox() {

		logger = extentReports.createTest("Update Product Category Name");

		ProductCategories productCategories = PageFactory.initElements(driver, ProductCategories.class);

		logger.info("Enter Updatable Product Category Name");
		
		try {
			productCategories.updateExistingProductCategory(excelDataProvider.updateProductCategory("Product Categories", 3, 4));
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		logger.pass("New Product Category name entered successfully");

	}
	
	
	
	@Test(priority = 5)

	public void searchProductClustersInSearchbox() {

		logger = extentReports.createTest("Search Product Cluster");

		ProductCategories productCategories = PageFactory.initElements(driver, ProductCategories.class);

		logger.info("Product Category Searched & Click on Checkbox");

		try {
			productCategories.enterProductClusters(excelDataProvider.searchClusters("Product Categories", 2, 1));
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		logger.pass("Product Clusters searched & checked successfully");
	}

}
