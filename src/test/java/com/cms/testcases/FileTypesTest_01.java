/**
 * 
 */
package com.cms.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cms.base.BaseClassTest;
import com.cms.pages.FileTypes;
import com.cms.pages.LoginPage;


/**
 * @author Nitesh
 *
 */

//Automation Script for fetching File Types in CMS

public class FileTypesTest_01 extends BaseClassTest {

	@Test(priority = 1)
	public void loginAction() {
		logger = extentReports.createTest("Login to CMS");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		logger.info("Starting Application");

		loginPage.loginToCMS(excelDataProvider.getStringData("Login", 1, 0),
				excelDataProvider.getStringData("Login", 1, 1));

		logger.pass("Login Success");
	}

	@Test(priority = 2)

	public void navigateFileTypeModule() {
		logger = extentReports.createTest("Click on Settings icon");

		FileTypes fileTypes = PageFactory.initElements(driver, FileTypes.class);

		logger.info("Landed on File Types Page");

		try {
			fileTypes.fetchFileTypes();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		logger.pass("Landed on File Types Page");
	}

	@Test(priority = 3)

	public void fetchFileTypes() {
		logger = extentReports.createTest("Fetch File Types");

		FileTypes fileTypes = PageFactory.initElements(driver, FileTypes.class);

		logger.info("Fething File Types Page");

		System.out.println("Image displayed in File Types is --- " + fileTypes.verifyTreziImage());
		Assert.assertTrue(fileTypes.verifyTreziImage());

		System.out.println("Image displayed in File Types is --- " + fileTypes.verifySketchupImage());
		Assert.assertTrue(fileTypes.verifySketchupImage());

		System.out.println("Image displayed in File Types is --- " + fileTypes.verifyRevitImage());
		Assert.assertTrue(fileTypes.verifyRevitImage());

		System.out.println("Image displayed in File Types is --- " + fileTypes.verifyFbxImage());
		Assert.assertTrue(fileTypes.verifyRevitImage());

		logger.pass("File Types captured and verified");

	}

}
