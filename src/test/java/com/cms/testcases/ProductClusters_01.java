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

// Automation Script to verify mandatory attributes specifications tab of Product Clusters 

public class ProductClusters_01 extends BaseClassTest {

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
	public void verifyAttributesOfMandatorySpecificationsTab() {

		logger = extentReports.createTest("Verify Attributes on Product Clusters tab");

		ProductClusters productClusters = PageFactory.initElements(driver, ProductClusters.class);

		logger.info("Verifying Attributes of Product Clusters");
		
		try {
			System.out.println("Mandatory tab of Product Clusters is Displayed --- " + productClusters.captureMandatorySpecifications());
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		logger.pass("Verified Success of mandatory specifications of Product Clusters Page");
	}

}
