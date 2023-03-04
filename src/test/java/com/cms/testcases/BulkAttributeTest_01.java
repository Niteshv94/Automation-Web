/**
 * 
 */
package com.cms.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cms.base.BaseClassTest;
import com.cms.pages.LoginPage;
import com.cms.pages.ProductAttributes;

/**
 * @author Nitesh
 *
 */

  //Automation Script to verify the elements present on window pop-up for Bulk Attribute flow of CMS

public class BulkAttributeTest_01 extends BaseClassTest {
	
	
	@Test (priority = 1)
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
		logger = extentReports.createTest("Click on Double Attribute");

		ProductAttributes productAttributes = PageFactory.initElements(driver, ProductAttributes.class);
		
		logger.info("Landed on Bulk Upload Attributes Page");
		
		try {
			productAttributes.bulkAttribute();
		} catch (InterruptedException e) {
			
		}
		
		logger.pass("Clicked on Double Attribute");	
		
	}
	
	@Test(priority = 3)
	
	public void verifyWebElementsOnWidowPopup() {
		
		logger = extentReports.createTest("Pop-up window will appear");

		ProductAttributes productAttributes = PageFactory.initElements(driver, ProductAttributes.class);
		
		logger.info("Landed on Bulk Attributes Upload Pop-up");
		
		//Verify Bulk Attribute Upload Title
		
		System.out.println("Header Message of Bulk Product Attribute is displayed --- " + productAttributes.verifybulkAttributeUploadTitle());		
		Assert.assertTrue(productAttributes.verifybulkAttributeUploadTitle());
		
		//Verify attributeTemplateTitle in the window pop-up
		
		System.out.println("Attribute Template name is displayed --- " + productAttributes.verifyattributeTemplateTitle());
		Assert.assertTrue(productAttributes.verifyattributeTemplateTitle());
		
		//Verify uploadXslFileTitle in the window pop-up
		
		System.out.println("Upload XSL File Template is displayed --- " + productAttributes.verifyuploadXslFileTitle());
		Assert.assertTrue(productAttributes.verifyuploadXslFileTitle());
		
		//Verify closeButton in the window pop-up
		
		System.out.println("Close button is displayed --- " + productAttributes.verifycloseButton());
		Assert.assertTrue(productAttributes.verifycloseButton());
		
		//Verify uploadFileButton in the window pop-up
		
		System.out.println("Check Upload File Button is Disabled --- " + productAttributes.verifyuploadFileButton());
		Assert.assertFalse(productAttributes.verifyuploadFileButton());
		
		logger.pass("Verified all the WebElements on Bulk Attribute pop-up");	
		
	}

}
