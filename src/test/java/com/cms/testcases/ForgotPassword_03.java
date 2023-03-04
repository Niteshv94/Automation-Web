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

//Automation Script to Check "Forgot Password?" link with an unregistered Email id.


public class ForgotPassword_03 extends BaseClassTest {
	
	@Test
	public void forgotpassword()
	{
		logger = extentReports.createTest("Navigate to CMS");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		logger.info("Starting Application");
		
		try {
			loginPage.sendForgotPasswordLinkWithEmail(excelDataProvider.enterEmailForForgotPassword("Forgot Password", 1, 1));
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Captured Error Message when an Unregistered Email Id is provided ---- " + loginPage.getUnregisteredEmailPasswordMessage());
		
		
		logger.pass("Navigated Forgot Password Page Successfully");
		}

}
