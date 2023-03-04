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

//Automation Script to Check "Forgot Password?" link with an empty Email id.

public class ForgotPassword_02 extends BaseClassTest {
	
	@Test
	public void forgotPasswordAction()
	{
		logger = extentReports.createTest("Navigate to CMS");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		logger.info("Starting Application");
		
		try {
			loginPage.sendForgotPasswordLinkWithEmptyEmail();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Captured Error Message when Email Id is not provided ---- " + loginPage.getForgotPasswordMessageWithEmptyEmail());
		
		logger.pass("Navigated Forgot Password Page Successfully");
	}

}
