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

//Automation Script to update the details in My Profile Section

public class MyProfile_02 extends BaseClassTest {

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
	public void navigateToMyProfileSection() {

		logger = extentReports.createTest("Navigate To My Profile Section");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		logger.info("My Profile button Clicked");

		try {
			loginPage.clickMyProfile();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		logger.pass("Successfully Navigated from My Profile Section");

	}

	@Test(priority = 3)
	public void editUserDetails() {

		logger = extentReports.createTest("Edit My Profile Section");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		logger.info("My Profile section is Updating");

		try {
			loginPage.userDetails(excelDataProvider.enterUserDetails("User Details", 1, 0),
					excelDataProvider.enterUserDetails("User Details", 1, 1),
					excelDataProvider.enterUserDetails("User Details", 1, 2),
					excelDataProvider.enterUserDetails("User Details", 1, 3),
					excelDataProvider.enterUserDetails("User Details", 1, 4),
					excelDataProvider.enterUserDetails("User Details", 1, 5),
					excelDataProvider.enterUserDetails("User Details", 1, 6));
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		logger.pass("My Profile Section successfully updated");

	}

}
