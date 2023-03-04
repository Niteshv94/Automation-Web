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

//Automation Script to Check "Forgot Password?" link with a registered Email id.


public class ForgotPassword_01 extends BaseClassTest {
	
	
	@Test
	public void loginAction()
	{
		logger = extentReports.createTest("Navigate to CMS");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		logger.info("Starting Application");
		
		try {
			loginPage.sendForgotPasswordLinkWithEmail(excelDataProvider.enterEmailForForgotPassword("Forgot Password", 1, 0));
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Success message is displayed after link is sent --- " + loginPage.getForgotPasswordMessage());
		
		logger.pass("Navigated CMS website Successfully");
		}

}
