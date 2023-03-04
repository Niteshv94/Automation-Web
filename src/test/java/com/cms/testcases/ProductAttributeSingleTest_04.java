/**
 * 
 */
package com.cms.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.cms.base.BaseClassTest;
import com.cms.pages.LoginPage;
import com.cms.pages.ProductAttributes;

/**
 * @author Nitesh
 *
 */

//Automation Script to search a Product Attributes.

public class ProductAttributeSingleTest_04 extends BaseClassTest {
	
	@Test(priority = 1)
	public void loginAction() {
		logger = extentReports.createTest("Login to CMS");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		logger.info("Starting Application");

		loginPage.loginToCMS(excelDataProvider.getStringData("Login", 1, 0),
				excelDataProvider.getStringData("Login", 1, 1));

		logger.pass("Login Success");
	}
	
	
	@Test (priority = 2)
	public void productAttribute()
	{
		logger = extentReports.createTest("Landed to Product Attribute Page");

		ProductAttributes productAttributes = PageFactory.initElements(driver, ProductAttributes.class);
		
		logger.info("Search Product Attributes");
		
		try {
			productAttributes.searchAttribute(excelDataProvider.getProductAttributes("Product Attributes", 1, 2));
			System.out.println("<<<<<Searched Product Attribute>>>>>");
		} catch (InterruptedException e) {
			System.out.println("<<<<<Unable to Search Product Attribute>>>>>");
		}
		
		logger.pass("Searched Product Attribute");
	}

}
