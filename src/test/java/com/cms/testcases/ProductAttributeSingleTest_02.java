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

//Automation script when Product Attribute Text-box is empty


public class ProductAttributeSingleTest_02 extends BaseClassTest {
	
	String attributesName = "Open Text";
	//String attributesName = "Short Text";
	//String attributesName = "Boolean";
	//String attributesName = "Decimal Values";
	//String attributesName = "Integer";
	//String attributesName = "Date";
	
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
	public void productAttribute() {

		logger = extentReports.createTest("Click on Single Attribute");

		ProductAttributes productAttributes = PageFactory.initElements(driver, ProductAttributes.class);
		
		logger.info("Landed on Select Attributes Page");
		
		try {
			productAttributes.singleAttribute();
		} catch (Exception e) {
			System.out.println("=====Unable to land on Product Attribute Page=====");
		}

		if (attributesName.equalsIgnoreCase("Open Text")) {

			productAttributes.openText();

		}

		else if (attributesName.equalsIgnoreCase("Short Text")) {

			productAttributes.shortText();

		}

		else if (attributesName.equalsIgnoreCase("Boolean")) {

			productAttributes.booleantext();

		}

		else if (attributesName.equalsIgnoreCase("Decimal Values")) {

			productAttributes.decimalValueText();

		}

		else if (attributesName.equalsIgnoreCase("Integer")) {

			productAttributes.integerText();

		}

		else if (attributesName.equalsIgnoreCase("Date")) {

			productAttributes.dateText();

		}
		
		else {
			System.out.println("<<<<Sorry Product Attributes Types doesn't match>>>>");
		}
		
		logger.pass("Selected Attributes Successfully");
	}
	
	@Test (priority = 3)
	public void emptyAttributeName() {
		
       logger = extentReports.createTest("Entered Attribute Page");
		
		ProductAttributes productAttributes = PageFactory.initElements(driver, ProductAttributes.class);
		
		logger.info("Landed on Enter Attributes Page");
		
		productAttributes.clickOnSaveButton();
		
		System.out.println("<<<<<Captured Error Message when textbox is empty>>>>  " + productAttributes.getErrorMeesageInEmptyAttribute());
		
		
		logger.pass("Error Message Reflected");
		
	}

}
