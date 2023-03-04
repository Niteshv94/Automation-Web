package com.cms.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadExcelFileAndAssetFolder {
	
	public WebDriver driver;
	//public String uploadSuccessMessage = "Your data has been uploaded & is now being processed. Check the Asset Inventory Log for Status";
	
	public UploadExcelFileAndAssetFolder(WebDriver localDriver)
	{
		this.driver=localDriver;
	}
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Select excel file')]")
	WebElement selectExcelFileButton;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Select asset folder')]")
	WebElement selectAssetFolderButton;
	
	@FindBy(how = How.XPATH, using = "//button[@type='button'][@class='ant-btn sc-qYSYK PVVMP ant-btn-primary']")
	WebElement uploadFilesButton;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Your data has been uploaded & is now being processed. Check the Asset Inventory Log for Status')]")
	WebElement verifySuccessNotification;
	
	
	public void uploadFilesAndFolder() throws InterruptedException
	{
		selectExcelFileButton.click();
		
		selectAssetFolderButton.click();
		
	}
	
	public void clickonuploadfilesbutton() throws InterruptedException
	{
		Thread.sleep(1000);
		uploadFilesButton.click();
	}
	
	public boolean verifySuccessMessage()
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver, 40);
			wait.until(ExpectedConditions.visibilityOf(verifySuccessNotification));
			return true;
			
		} catch (Exception e) {
			return false;
		}
		
		
//		if(verifySuccessNotification.isDisplayed())
//			return true;
//		else
//			return false;
		
	}

}
