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

//Automation Script to fetch the fields of "My Profile" section


public class MyProfile_01 extends BaseClassTest {
	
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
			loginPage.clickMyProfile();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		logger.pass("Successfully Navigated from My Profile Section");

		}
	

	@Test(priority = 3)
	public void captureMyprofile() {

		logger = extentReports.createTest("Fetch My Profile Textfield");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		logger.info("Fetching Profile Textfield Details");
		
		System.out.println("The Basic Details Field have text as --- " + loginPage.fetchFirstNameText());
		
		System.out.println("The Basic Details Field have text as --- " + loginPage.fetchLastNameText());
		
		System.out.println("The Basic Details Field have text as --- " + loginPage.fetchEmailIdText());
		
		System.out.println("The Professional Details Field have text as --- " + loginPage.fetchorganizationText());
		
		System.out.println("The Professional Details Field have text as --- " + loginPage.fetchpositionText());
		
		System.out.println("The Communication Address Details Field have text as --- " + loginPage.fetchadddressLine1Text());
		
		System.out.println("The Communication Address Details Field have text as --- " + loginPage.fetchadddressLine2Text());
		
		System.out.println("The Communication Address Details Field have text as --- " + loginPage.fetchcountryText());
		
		System.out.println("The Communication Address Details Field have text as --- " + loginPage.fetchstateText());
		
		System.out.println("The Communication Address Details Field have text as --- " + loginPage.fetchzipCodeText());
		
		logger.pass("Profile textfield fetched Successfully");

	}

}
