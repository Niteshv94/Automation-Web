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

//Automation Script to Delete any Product Sub-category

public class ProductCategoriesTest_10 extends BaseClassTest {
	
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
					.searchProductCategoryInSearchbox(excelDataProvider.getProductCategory("Product Categories", 9, 3));
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		logger.pass("Product Category searched successfully");
	}
	
	@Test(priority = 4)

	public void clickOnswitcherIcon() {

		logger = extentReports.createTest("click On switcher Icon Of Product Category");

		ProductCategories productCategories = PageFactory.initElements(driver, ProductCategories.class);

		logger.info("Switcher Icon clicked");

		try {
			productCategories.ExpandswitcherIconOfProductCategory();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		logger.pass("Switcher Icon clicked of Product Category successfully");
	}
	
	@Test(priority = 5)

	public void clickOnDeleteButton() {

		logger = extentReports.createTest("Click on Delete button");

		ProductCategories productCategories = PageFactory.initElements(driver, ProductCategories.class);

		logger.info("Delete button Clicked of Product SubCategory");

		try {
			productCategories.DeleteProductSubCategory();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		logger.pass("Product SubCategory Deleted successfully");
	}


}
