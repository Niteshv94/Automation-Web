package com.cms.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HelpAndSupport {
	
	 WebDriver driver;
		
		public HelpAndSupport(WebDriver localDriver) {
			
			this.driver= localDriver;
		}
		
		@FindBy(how = How.XPATH, using = "//*[name()='path' and contains(@d,'M3 18h18v-')]")
		WebElement hamburger_icon;
		
		@FindBy(how = How.XPATH, using = "//a[@href='https://help.trezi.com/portal/home']")
		WebElement helpAndSupport_icon;
		
		@FindBy(how = How.XPATH, using = "//div[@class='Header__brandName commonStyles__verticalMiddle commonStyles__textOverHandle commonStyles__headerTxt commonStyles__fontWeight1']")
		WebElement helpAndSupportPageTitle;
		
		
		public void clickOnHelpAndSupport() throws InterruptedException {
			
			hamburger_icon.click();
			Thread.sleep(2000);
			
			helpAndSupport_icon.click();
		}
		
		// Verify Trezi Image in File Types
		public String verifyHelpAndSupportPageTitle() {

			 String helpAndSupportPage = helpAndSupportPageTitle.getText();
			 return helpAndSupportPage;

			//return helpAndSupportPageTitle.isDisplayed();
		}

}
