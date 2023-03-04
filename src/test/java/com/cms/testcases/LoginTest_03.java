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

//Automation Script when user leave blank the email and password field and just click on Login button.

public class LoginTest_03 extends BaseClassTest {
	
	@Test
	public void loginEmptyCredential()
	{
		logger = extentReports.createTest("Login with Empty Credential");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		logger.info("Starting Application");
		
		loginPage.loginToCMS("", "");
		
		System.out.println("Error Message in Empty Email Field ---- " + loginPage.getEmptyEmailErrorMessage());
		
		System.out.println("Error Message in Empty Password Field ---- " + loginPage.getEmptyPasswordErrorMessage());
		
		logger.pass("Empty field & Login Failed");
	}

}
