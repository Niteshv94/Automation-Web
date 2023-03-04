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

//Automation script when Product Attribute Type is not selected


public class ProductAttributeSingleTest_03 extends BaseClassTest {

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
		} catch (InterruptedException e) {
			System.out.println("=====Unable to land on Product Attribute Page=====");
		}

		logger.pass("Don't select any Attribute types.");

	}

	@Test (priority = 3)
	public void clickOnSaveButton() {
		logger = extentReports.createTest("Click on Save Button");

		ProductAttributes productAttributes = PageFactory.initElements(driver, ProductAttributes.class);

		logger.info("Clicked on Next Button");
		
		try {
			productAttributes.clickNextButton();
		} catch (InterruptedException e) {
			System.out.println("<<<<<Unable to catch Error Meessage>>>>>");
		}
		
		productAttributes.getErrorMeesageInUnselectedProductAttribute();

		System.out.println("<<<<Captured message when user don't select any attribute>>>> "
				+ productAttributes.getErrorMeesageInUnselectedProductAttribute());

		logger.pass("Error Message Reflected");

	}

}
