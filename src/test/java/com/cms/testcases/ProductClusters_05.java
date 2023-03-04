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

//Automation Script to create a Product Clusters with empty value

public class ProductClusters_05 extends BaseClassTest {

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
	public void leaveEmptyClusterNameAndClickOnNextButton() {

		logger = extentReports.createTest("Do not enter Cluster name in the Textbox");

		ProductClusters productClusters = PageFactory.initElements(driver, ProductClusters.class);

		logger.info("Leaved Cluster Name Textbox Empty");

		try {
			
			productClusters.emptyClusterName();

		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		logger.pass("Error message with no cluster captured Successfully");
	}

}
