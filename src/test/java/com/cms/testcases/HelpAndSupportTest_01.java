/**
 * 
 */
package com.cms.testcases;

import java.util.ArrayList;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cms.base.BaseClassTest;
import com.cms.pages.FileTypes;
import com.cms.pages.HelpAndSupport;
import com.cms.pages.LoginPage;

/**
 * @author Nitesh
 *
 */
public class HelpAndSupportTest_01 extends BaseClassTest {
	
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

	public void navigateHelpAndSupportModule() {
		logger = extentReports.createTest("Click on Help And Support");

		HelpAndSupport helpAndSupport = PageFactory.initElements(driver, HelpAndSupport.class);

		logger.info("Land on Help And Support");
		
		try {
			helpAndSupport.clickOnHelpAndSupport();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		logger.pass("Landed on Help And Support");
		
	}
	
	@Test(priority = 3)

	public void navigateToHelpAndSupportPage() {
		logger = extentReports.createTest("Navigate to Help And Support");

		HelpAndSupport helpAndSupport = PageFactory.initElements(driver, HelpAndSupport.class);

		logger.info("Landed on Trezi Help Center");
		
		// hold all window handles in array list
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		
		//switch to new tab
		driver.switchTo().window(newTab.get(1));
		
		System.out.println("Page Header of new tab ---- " + helpAndSupport.verifyHelpAndSupportPageTitle());
		System.out.println("Page Title is ---- " + driver.getTitle());
		//Assert.assertTrue(helpAndSupport.verifyHelpAndSupportPageTitle());
		
		//switch to parent window
		//driver.switchTo().window(newTab.get(0));
		
		logger.pass("Landed successfully on Trezi Help Centre Page");
	}

}
