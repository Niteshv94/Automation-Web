/**
 * 
 */
package com.cms.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.cms.base.BaseClassTest;
import com.cms.pages.LoginPage;

/**
 * @author Nitesh
 *
 */

//Automation Script to Check "Forgot Password?" link with an invalid Email id format.


public class ForgotPassword_04 extends BaseClassTest {
	
	@Test
	public void forgotpassword()
	{
		logger = extentReports.createTest("Navigate to CMS");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		logger.info("Starting Application");
		
		try {
			loginPage.sendForgotPasswordLinkWithEmail(excelDataProvider.enterEmailForForgotPassword("Forgot Password", 2, 2));
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Captured Error Message when an Invalid Email Id Format is provided ---- " + loginPage.getInvalidFormatEmailPasswordMessage());
		
		logger.pass("Navigated Forgot Password Page Successfully");
	}


}
