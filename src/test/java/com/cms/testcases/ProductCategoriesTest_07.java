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

//Automation Script to Search any Product Category.

public class ProductCategoriesTest_07 extends BaseClassTest {

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

		logger.info("Product Category Name Searched");

		try {
			productCategories
					.searchProductCategoryInSearchbox(excelDataProvider.getProductCategory("Product Categories", 5, 3));
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		logger.pass("Product Category searched successfully");
	}

}
