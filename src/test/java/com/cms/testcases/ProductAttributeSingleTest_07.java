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

//Automation Script to duplicate a Product Attribute.


public class ProductAttributeSingleTest_07 extends BaseClassTest {

	   String attributesName = "Open Text";
	// String attributesName = "Short Text";
	// String attributesName = "Boolean";
	// String attributesName = "Decimal Values";
	// String attributesName = "Integer";
	// String attributesName = "Date";

	@Test(priority = 1)
	public void loginAction() {
		logger = extentReports.createTest("Login to CMS");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		logger.info("Starting Application");

		loginPage.loginToCMS(excelDataProvider.getStringData("Login", 1, 0),
				excelDataProvider.getStringData("Login", 1, 1));

		logger.pass("Login Success");
	}

	@Test(priority = 2)
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

	@Test(priority = 3)
	public void enterAttributeName() throws InterruptedException {

		logger = extentReports.createTest("Entered Attribute Page");

		ProductAttributes productAttributes = PageFactory.initElements(driver, ProductAttributes.class);

		logger.info("Landed on Enter Attributes Page");

		if (attributesName.equals("Open Text")) {
			productAttributes.enterAttribute(excelDataProvider.getProductAttributes("Product Attributes", 1, 8));
		}

		else if (attributesName.equalsIgnoreCase("Short Text")) {

			productAttributes.enterAttribute(excelDataProvider.getProductAttributes("Product Attributes", 2, 8));

		}

		else if (attributesName.equalsIgnoreCase("Boolean")) {
			productAttributes.enterAttribute(excelDataProvider.getProductAttributes("Product Attributes", 3, 8));
		}

		else if (attributesName.equalsIgnoreCase("Decimal Values")) {
			productAttributes.enterAttribute(excelDataProvider.getProductAttributes("Product Attributes", 4, 8));
		}

		else if (attributesName.equalsIgnoreCase("Integer")) {
			productAttributes.enterAttribute(excelDataProvider.getProductAttributes("Product Attributes", 5, 8));
		}

		else if (attributesName.equalsIgnoreCase("Date")) {
			productAttributes.enterAttribute(excelDataProvider.getProductAttributes("Product Attributes", 6, 8));
		}

		else {
			System.out.println("<<<<Unable to enter Attributes Name>>>>");
		}

		productAttributes.clickOnSaveButtonForDuplicateattribute();

		System.out.println("Error Message of Duplicate Product Attribute Captured Successfully --- " + productAttributes.captureErrorMessageOfDuplicateAttribute());
		
		 //Assert (Verify) the message while adding Duplicate Product Attributes.
		//Assert.assertTrue(productAttributes.captureErrorMessageOfDuplicateAttribute());

		logger.pass("Entered Duplicate Product Attributes");
	}

}
