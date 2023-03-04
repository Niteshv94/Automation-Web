/**
 * 
 */
package com.cms.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.cms.base.BaseClassTest;
import com.cms.pages.LoginPage;
import com.cms.pages.ProductClusters;

/**
 * @author Nitesh
 *
 */

//Automation Script to Update the name of Product Clusters

public class ProductClusters_06 extends BaseClassTest {
	
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

		logger = extentReports.createTest("Click on Edit Option");

		ProductClusters productClusters = PageFactory.initElements(driver, ProductClusters.class);

		logger.info("Edit Option Clicked");
		
		try {
			productClusters.clikOnThreeDotsThenClickOnEdit();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		logger.pass("Edit option clicked successfully");
		
		}
	
	@Test(priority = 4)
	public void updateProductClusters() {

		logger = extentReports.createTest("Enter Updated Cluster Name");

		ProductClusters productClusters = PageFactory.initElements(driver, ProductClusters.class);

		logger.info("Update Cluster Name will reflect");
		
		try {
			productClusters.enterAndUpdateClusterName(excelDataProvider.updateCluster("Product Clusters", 1, 3));
			
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		logger.pass("Cluster Name Updated successfully");
		
	}

}
