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

//Automation Script for Sorting Product Attribute of CMS

public class ProductAttributeSingleTest_08 extends BaseClassTest {

	// String attributesName = "Open Text";
	// String attributesName = "Short Text";
	// String attributesName = "Boolean";
	// String attributesName = "Decimal Values";
	// String attributesName = "Integer";
	 String attributesName = "Date";

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
		logger = extentReports.createTest("Click on Settings icon");

		ProductAttributes productAttributes = PageFactory.initElements(driver, ProductAttributes.class);

		logger.info("Landed on Product Attributes Page");

		try {
			productAttributes.sortProductAttribute();
		} catch (InterruptedException e) {

		}

		logger.pass("Clicked on Arrow icon");

	}

	@Test(priority = 3)
	public void sortingProductAttributes() {

		logger = extentReports.createTest("Display Dropdown List");

		ProductAttributes productAttributes = PageFactory.initElements(driver, ProductAttributes.class);

		logger.info("Landed on Sorting Product Attributes Page");

		if (attributesName.equalsIgnoreCase("Open Text")) {

			productAttributes.sortOpenText();

		}

		else if (attributesName.equalsIgnoreCase("Short Text")) {

			productAttributes.sortShortText();

		}

		else if (attributesName.equalsIgnoreCase("Boolean")) {

			productAttributes.sortBooleantext();

		}

		else if (attributesName.equalsIgnoreCase("Decimal Values")) {

			productAttributes.sortDecimalValueText();

		}

		else if (attributesName.equalsIgnoreCase("Integer")) {

			productAttributes.sortIntegerText();

		}

		else if (attributesName.equalsIgnoreCase("Date")) {

			productAttributes.sortDateText();

		}

		else {
			System.out.println("<<<<Sorry Product Attributes Types doesn't match>>>>");
		}

	}

}
