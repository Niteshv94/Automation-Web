package com.cms.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.cms.base.BaseClassTest;
import com.cms.pages.LoginPage;



/**
 * @author Nitesh
 *
 */

//Automation Script to login in the CMS application and then logout. 

public class LoginTest_01 extends BaseClassTest {
	
	@Test
	public void loginAction()
	{
		logger = extentReports.createTest("Login to CMS");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		logger.info("Starting Application");

		loginPage.loginToCMS(excelDataProvider.getStringData("Login", 1, 0),
				excelDataProvider.getStringData("Login", 1, 1));
		
		//Capture the page heading and print on console
		System.out.println("The Page heading is --- " + loginPage.getHeading());
		
		try {
			loginPage.clickLogout();
		} catch (InterruptedException e) {
		}

		logger.pass("Login Success");
	}
	

}
