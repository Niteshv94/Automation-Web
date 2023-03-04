/**
 * 
 */
package com.cms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.graphbuilder.curve.Point;

/**
 * @author Nitesh
 *
 */
public class InventoryLog {

	WebDriver driver;

	public InventoryLog(WebDriver localDriver) {
		this.driver = localDriver;
	}

	@FindBy(how = How.XPATH, using = "//*[name()='path' and contains(@d,'M3 18h18v-')]")
	WebElement hamburger_icon;

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Asset Inventory Log']")
	WebElement Asset_inventory_log_icon;

	@FindBy(how = How.XPATH, using = "//tbody/tr[2]/td[9]/button[1]")
	WebElement View_Details_button;

	@FindBy(how = How.XPATH, using = "//*[@id='root']/div[2]/div[3]/div/div/div/div/div[2]/table/tbody/tr[3]/td/div/div[1]/div/div/div/div/div/div/table/tbody/tr[1]/td[3]")
	WebElement lincDetails_tab;

	@FindBy(how = How.XPATH, using = "//tbody/tr[1]/td[3]/div[1]/div[2]/span[1]//*[name()='svg']//*[name()='path' and contains(@d,'M832 64H29')]")
	WebElement Copy_button;

	@FindBy(how = How.XPATH, using = "//tbody/tr[2]/td[10]/div[1]//*[name()='svg']")
	WebElement three_dots_icon;

	@FindBy(how = How.XPATH, using = "//li[normalize-space()='Delete']")
	WebElement delete_button;

	@FindBy(how = How.XPATH, using = "//button[@class='ant-btn ant-btn-primary']")
	WebElement Yes_Delete_Asset_Inventory_Log_button;
	
	@FindBy(how = How.XPATH, using = "//span[@aria-label='right']//*[name()='svg']")
	WebElement right_arrow_key;
	
	@FindBy(how = How.XPATH, using = "//span[@aria-label='left']//*[name()='svg']")
	WebElement left_arrow_key;

	public void landToAssetInventoryLogpage() throws InterruptedException {

		hamburger_icon.click();
		Thread.sleep(2000);

		Asset_inventory_log_icon.click();
		Thread.sleep(4000);

	}

	public void clickDetailsButton() throws InterruptedException {

		Actions actions = new Actions(driver);

		View_Details_button.click();
		Thread.sleep(2000);

		// actions.moveToElement(lincDetails_tab).build().perform();
		// actions.moveByOffset(200, 200).contextClick().build().perform();

//		WebDriverWait wait = new WebDriverWait(driver, 50);
//		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[1]/td[3]/div[1]/div[2]/span[1]//*[name()='svg']//*[name()='path' and contains(@d,'M832 64H29')]"))); 
//		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);

		// Copy_button.click();
		Thread.sleep(4000);

	}

	public void clickThreeDotsAndDelete() {
		
		three_dots_icon.click();

		delete_button.click();

		Yes_Delete_Asset_Inventory_Log_button.click();

	}
	
	// Method to select Download Files Button option
			public void selectLeftArrow() throws InterruptedException {

				right_arrow_key.click();
				
				Thread.sleep(3000);
				
                right_arrow_key.click();
				
				Thread.sleep(3000);
				
				left_arrow_key.click();
				
				Thread.sleep(3000);
				
				left_arrow_key.click();
				
				
			}
}