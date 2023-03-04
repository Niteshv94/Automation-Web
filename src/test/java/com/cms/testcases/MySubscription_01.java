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

//Automation Script to fetch the "My Subscription" Page.


public class MySubscription_01 extends BaseClassTest {
	
	@Test(priority = 1)
	public void login() {

		logger = extentReports.createTest("Login to CMS");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		logger.info("Starting Application");

		loginPage.loginToCMS(excelDataProvider.getStringData("Login", 1, 0),
				excelDataProvider.getStringData("Login", 1, 1));

		logger.pass("Login Success");

	}
	
	@Test(priority = 2)
	public void navigateToMySubscription() {

		logger = extentReports.createTest("Navigate To My Profile Section");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		logger.info("My Profile button Clicked");
		
		try {
			loginPage.clickMySubscription();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		logger.pass("Successfully Navigated from My Profile Section");

		}
	
	@Test(priority = 3)
	public void captureMySubscription() {

		logger = extentReports.createTest("Navigate To My Subscription Page");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		logger.info("Fetch Subscription Type");
		
		System.out.println("The Subscription type of the user is --- " + loginPage.getSubscriptionType());
		
		logger.pass("Subscription Type fetched Successfully");

	}

}
