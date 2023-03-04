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

//Automation Script to create a new Product Clusters

public class ProductClusters_02 extends BaseClassTest {

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
	public void enterClusterNameAndClickOnNextButton() {

		logger = extentReports.createTest("Enter Cluster name in the Textbox");

		ProductClusters productClusters = PageFactory.initElements(driver, ProductClusters.class);

		logger.info("Entering Cluster Name in Textbox");

		try {
			productClusters.enterClusterName(excelDataProvider.enterCluster("Product Clusters", 1, 0));
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		logger.pass("Cluster Name entered Successfully");
	}
	
	

	@Test(priority = 4)
	public void checkAttributesName() {

		logger = extentReports.createTest("Check Attributes name from the checkbox");

		ProductClusters productClusters = PageFactory.initElements(driver, ProductClusters.class);

		logger.info("Checking Attributes name from the checkbox");

		productClusters.checkAttributes();

		logger.pass("Attributes Name checked Successfully");
	}

}
