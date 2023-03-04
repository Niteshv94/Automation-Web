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

//Automation Script when user provide wrong credentials on the login page.

public class LoginTest_02 extends BaseClassTest {
	
	@Test
	public void loginInvalid() {
		
		logger = extentReports.createTest("Login with Invalid Credential");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		logger.info("Starting Application");

		loginPage.loginToCMS(excelDataProvider.getStringData("Login", 2, 0),
				excelDataProvider.getStringData("Login", 2, 1));
		
		//Capture the error message and print on console
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		System.out.println("User is unable to login as --- " + loginPage.getPasswordErrorMessage());
		
		logger.pass("Login Failed");
	}

}
