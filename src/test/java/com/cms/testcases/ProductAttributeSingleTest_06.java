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

//Automation Script to Delete Product Attributes.

public class ProductAttributeSingleTest_06 extends BaseClassTest {
	
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
			productAttributes.searchAttribute(excelDataProvider.getProductAttributes("Product Attributes", 1, 6));
			System.out.println("<<<<<Searched Product Attribute>>>>>");
		} catch (InterruptedException e) {
			System.out.println("<<<<<Unable to Search Product Attribute>>>>>");
		}
		
		logger.pass("Searched Product Attribute");
	}
	
//	@Test (priority = 2)
//	public void productAttribute()
//	{
//		logger = extentReports.createTest("Landed to Product Attribute Page");
//
//		ProductAttributes productAttributes = PageFactory.initElements(driver, ProductAttributes.class);
//		
//		logger.info("Search Product Attributes");
//		
//		try {
//			if(productAttributes.searchAndDeleteAttribute(excelDataProvider.getProductAttributes("Product Attributes", 1, 6))) {
//				
//				//productAttributes.deleteAttribute();
//				
//				System.out.println("Product attribute searched and ready for delete");
//			}
//			else {
//				System.out.println("Product attribute is not present or already deleted");
//			}
//			//System.out.println("<<<<<Searched Product Attribute>>>>>");
//	} catch (InterruptedException e) {
//			System.out.println("<<<<<Unable to Search Product Attribute>>>>>");
//		}
//		
//		logger.pass("Searched Product Attribute");
//	}
	
	
	@Test (priority = 3)
	public void deleteAttributeName()
	{
		
		logger = extentReports.createTest("Land to Delete Attribute Page");
		
        ProductAttributes productAttributes = PageFactory.initElements(driver, ProductAttributes.class);
		
		logger.info("Delete Product Attributes");
		
		try {
			productAttributes.deleteAttribute();
			System.out.println("<<<<<Product Attribute Deleted Successfully>>>>>");
		} catch (InterruptedException e) {
			System.out.println("Unable to Delete Attribute Name");
		}
		
		logger.pass("Product Attribute Deleted");
	}

}
