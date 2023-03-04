/**
 * 
 */
package com.cms.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.cms.base.BaseClassTest;
import com.cms.pages.LoginPage;
import com.cms.pages.ProductClusters;

/**
 * @author Nitesh
 *
 */

//Automation Script to Delete the Product Clusters


public class ProductClusters_08 extends BaseClassTest {
	
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
	public void productClusters() {

		logger = extentReports.createTest("Land to Product Clusters Page");

		ProductClusters productClusters = PageFactory.initElements(driver, ProductClusters.class);

		logger.info("Landing to Product Clusters Page");

		try {
			productClusters.landToProductClustersPage();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		logger.pass("Landed Success to Product Clusters Page");
	}
	
	@Test(priority = 3)
	public void editProductClusters() {

		logger = extentReports.createTest("Click on Three Dots Option");

		ProductClusters productClusters = PageFactory.initElements(driver, ProductClusters.class);

		logger.info("Three Dots Option Clicked");
		
		try {
			productClusters.clikOnThreeDotsThenClickOnDelete();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		logger.pass("Three Dots option clicked successfully");
		
	}
	
	@Test(priority = 4)
	public void deleteProductClusters() {

		logger = extentReports.createTest("Click on Delete Button");

		ProductClusters productClusters = PageFactory.initElements(driver, ProductClusters.class);

		logger.info("Click on Yes Delete Clusters");
		
		try {
			productClusters.clickOnDeleteButton();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		logger.pass("Product Clusters deleted successfully");
		
		}

}
