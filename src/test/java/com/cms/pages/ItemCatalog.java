package com.cms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ItemCatalog {

	WebDriver driver;

	// For Published product run this
	public static String cName = "Livia-123A Bell Push Switch";

	// For unPublished product run this
	//public static String cName = "Test Hang Don't Delete";

	public static String itemCatalogName = "Test Hanging update";

	public ItemCatalog(WebDriver localDriver) {

		this.driver = localDriver;
	}

	@FindBy(xpath = "//input[@type='text']")
	WebElement searchItemCatalog_textbox;

	@FindBy(xpath = "//div[@class='ant-select-selector']")
	WebElement viewByarrow_icon;

	@FindBy(xpath = "//span[1][@class='anticon anticon-eye']")
	WebElement eye_icon;

	@FindBy(xpath = "//div[@id='product-details']//div[3]//span[2]")
	WebElement eye_icon_count;

	@FindBy(xpath = "//span[3][@class='anticon anticon-download']")
	WebElement download_icon;

	@FindBy(xpath = "//div[@id='product-details']//div[3]//span[4]")
	WebElement download_icon_count;

	@FindBy(xpath = "//span[5][@class='anticon anticon-share-alt']")
	WebElement share_icon;

	@FindBy(xpath = "//div[@id='product-details']//div[3]//span[6]")
	WebElement share_icon_count;

	@FindBy(xpath = "//div[contains(text(),'View By: Grid')]")
	WebElement viewByGrid_arrow;

	@FindBy(xpath = "//div[contains(text(),'View By: List')]")
	WebElement viewByList_arrow;

	@FindBy(xpath = "//*[@id='root']/div[1]/div[2]/div/button")
	WebElement bulkUpload_button;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Search for Category / Sub-category']")
	WebElement searchCategoryBox;

	@FindBy(how = How.XPATH, using = "//span[@class='ant-tree-checkbox-inner']")
	WebElement clickRadioButton;

	@FindBy(how = How.XPATH, using = "//div[@class='download-template']")
	WebElement downloadTemplate;

	@FindBy(how = How.XPATH, using = "//button[contains(.,'Continue')]")
	WebElement clickContinueButton;

	@FindBy(how = How.XPATH, using = "//tbody/tr[1]/td[2]/div[1]")
	WebElement itemCatalog_list;

	@FindBy(how = How.XPATH, using = "//button[@class='ant-btn sc-fzqzEs eVQcHf view__3D']")
	WebElement clickOn3DView_option;

	@FindBy(how = How.XPATH, using = "//div[@class='sc-fzqLLg kCMTKY prod-title']//span[@tabindex='-1']")
	WebElement createIcon_option;

	@FindBy(how = How.XPATH, using = "//input[@id='title']")
	WebElement productTitle_textbox;

	@FindBy(how = How.XPATH, using = "//div[@class='ant-modal-body']//button[@type='submit']")
	WebElement save_button;

	@FindBy(how = How.XPATH, using = "//button[@class='ant-btn sc-fzplgP bHmBtJ ant-btn-sm']")
	WebElement share_button;

	@FindBy(how = How.XPATH, using = "//div[normalize-space()='Copy']")
	WebElement copy_button;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Share link copied successfully')]")
	WebElement success_message;

	@FindBy(how = How.XPATH, using = "//div[normalize-space()='Product Classifications']//span[@aria-label='caret-right']//*[name()='svg']")
	WebElement classifications_tab;

	@FindBy(how = How.XPATH, using = "//div[@class='product-classifier-form-content']//span[@class='anticon']")
	WebElement downloadTemplate_option;

	@FindBy(how = How.XPATH, using = "//div[@class='ant-select-selector']")
	WebElement dropdown_option;

	@FindBy(how = How.XPATH, using = "//div[@class='sc-fzpdbB gZFNLC'][normalize-space()='Published']")
	WebElement published_option;

	@FindBy(how = How.XPATH, using = "//div[@class='sc-fzpdbB gZFNLC'][normalize-space()='Unpublished']")
	WebElement unPublished_option;

	@FindBy(how = How.XPATH, using = "//button[@class='ant-btn sc-fzplgP bHmBtJ ant-btn-block']")
	WebElement downloadfiles_option;

	@FindBy(how = How.XPATH, using = "//div[@class='right__div__details']//div[4]//div[1]")
	WebElement created_date;

	@FindBy(how = How.XPATH, using = "//*[@id='product-details']/div/div[1]/div[2]/div[2]/div[4]/div[2]")
	WebElement updated_date;

	@FindBy(how = How.XPATH, using = "//span[@class='ant-tag sc-fznzqM kcMtBa details_tzn']")
	WebElement tzi_number;

	@FindBy(how = How.XPATH, using = "//span[@class='ant-tag sc-fznzqM kcMtBa']")
	WebElement category_name;
	
	@FindBy(how = How.XPATH, using = "//span[@class='ant-tag sc-fznzqM kcMtBa']")
	WebElement category_name_click;
	
	@FindBy(how = How.XPATH, using = "//div[@class='ant-spin-container']//li[2]//button[1]")
	WebElement download_button;
	
	@FindBy(how = How.XPATH, using = "//div[normalize-space()='Attributes']//span[@aria-label='caret-right']//*[name()='svg']")
	WebElement attribute_name_click;
	
	@FindBy(how = How.XPATH, using = "//li[normalize-space()='Mandatory Specifications']")
	WebElement mandatory_specifications__tab;
	
	@FindBy(xpath = "//textarea[@name='attributes[0].value']")
	WebElement Attr2_textbox;
	
	@FindBy(xpath = "//input[@name='attributes[1].value']")
	WebElement Brand_textbox;
	
	@FindBy(xpath = "//input[@name='attributes[2].value']")
	WebElement Int1_textbox;
	
	@FindBy(xpath = "//input[@name='attributes[3].value']")
	WebElement ModelName_textbox;
	
	@FindBy(xpath = "//input[@name='attributes[4].value']")
	WebElement ModelNumber_textbox;
	
	@FindBy(xpath = "//input[@name='attributes[5].value']")
	WebElement SKU_textbox;
	
	@FindBy(xpath = "//input[@name='attributes[6].value']")
	WebElement Title_textbox;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement save_changes_button;

	public void clickBulkUploadButton(String category) throws Exception {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

		}

		bulkUpload_button.click();
		Thread.sleep(4000);

		searchCategoryBox.sendKeys(category);

		clickRadioButton.click();

		downloadTemplate.click();
		Thread.sleep(15000);

		clickContinueButton.click();

	}

	// Method to Click on View By : Grid option
	public void clickOnViewBy() throws InterruptedException {

		Thread.sleep(4000);
		viewByarrow_icon.click();
		Thread.sleep(1000);

		viewByGrid_arrow.click();
		Thread.sleep(3000);

	}

	public void searchItemCatalogTextbox(String item) throws InterruptedException {

		Thread.sleep(8000);
		searchItemCatalog_textbox.sendKeys(item);

	}

	// Method to click on particular Product Catalog Item

	public void clickOnProduct() {

		try {

			for (int r = 1; r < 11; r++) {
				String xpath = "//tbody/tr[" + r + "]/td[2]/div[1]";
				String a = driver.findElement(By.xpath(xpath)).getText();
				// System.out.println(a);

				if (a.contains(cName)) {
					Thread.sleep(5000);
					String xpath1 = "//tbody/tr[" + r + "]/td[2]/div[1]";
					driver.findElement(By.xpath(xpath1)).click();

				}

			}

		} catch (Exception e) {
			// System.out.println("__________________________");
		}
	}

	// Method to Click on View in 3D Option
	public void clickOn3D() throws InterruptedException {

		clickOn3DView_option.click();
		Thread.sleep(7000);
	}

	// Method to click on particular Product Catalog Item and update the item
	// details name

	public void clickOnProductAndUpdateName() {

		try {

			for (int r = 1; r < 11; r++) {
				String xpath = "//tbody/tr[" + r + "]/td[2]/div[1]";
				String a = driver.findElement(By.xpath(xpath)).getText();
				// System.out.println(a);

				if (a.contains(itemCatalogName)) {
					Thread.sleep(5000);
					String xpath1 = "//tbody/tr[" + r + "]/td[2]/div[1]";
					driver.findElement(By.xpath(xpath1)).click();

				}

			}

		} catch (Exception e) {
			// System.out.println("__________________________");
		}
	}

	// Method to Update any Product Catalog Item Details Name in the Pop-up window
	public void updateName(String catalogName) throws InterruptedException {

		createIcon_option.click();

		Thread.sleep(1000);

		productTitle_textbox.sendKeys(catalogName);

		save_button.click();
	}

	// Method to click on Share button and copy the URL of product
	public void clickOnShareButton() throws InterruptedException {

		share_button.click();

		Thread.sleep(2000);

		copy_button.click();
	}

	// Method to capture the success message of Forgot Password
	public String getShareProductMessage() {
		String message = success_message.getText();
		return message;
	}

	// Method to click on Classification tab
	public void clickOnClassification() {

		classifications_tab.click();
	}
	
	// Method to click on Attributes tab
		public void clickOnAttributes() throws InterruptedException {

			attribute_name_click.click();
			
			Thread.sleep(2000);
			
			mandatory_specifications__tab.click();
		}
		
		//Method to Update Mandatory Specifications

		public void enterValueInTextbox(String item) throws InterruptedException {

			Thread.sleep(2000);
			
			Attr2_textbox.sendKeys(item);
			
			//Brand_textbox.sendKeys(item);
			
			//Int1_textbox.sendKeys(item);
			
			//ModelName_textbox.sendKeys(item);
			
			//ModelNumber_textbox.sendKeys(item);
			
			//SKU_textbox.sendKeys(item);
			
			//Title_textbox.sendKeys(item);
			
			Thread.sleep(2000);
			
			save_changes_button.click();

		}

	// Method to click on Download template of Classifications tab.
	public void downloadTemplate() {

		downloadTemplate_option.click();
	}

	// Method to verify eye icon
	public boolean eyeIcon() throws InterruptedException {

		return eye_icon.isDisplayed();
	}

	// Method to capture the eye icon count
	public String eyeIconCount() {
		String message = eye_icon_count.getText();
		return message;
	}

	// Method to verify download icon
	public boolean downloadIcon() throws InterruptedException {

		return download_icon.isDisplayed();
	}

	// Method to capture the download icon count
	public String downloadIconCount() {
		String message = download_icon_count.getText();
		return message;
	}

	// Method to verify download icon
	public boolean shareIcon() throws InterruptedException {

		return share_icon.isDisplayed();
	}

	// Method to verify downloadfiles button
	public boolean downloadFiles() throws InterruptedException {

		return downloadfiles_option.isDisplayed();
	}

	// Method to capture the download icon count
	public String shareIconCount() {
		String message = share_icon_count.getText();
		return message;
	}

	// Method to capture the created date
	public String createdDate() {
		String message = created_date.getText();
		return message;
	}

	// Method to capture the updated date
	public String updatedDate() {
		String message = updated_date.getText();
		return message;
	}
	
	// Method to capture the tziNumber
		public String tziNumber() {
			String message = tzi_number.getText();
			return message;
		}
		
		// Method to capture the categoryName
		public String categoryName() {
			String message = category_name.getText();
			return message;
		}
		
		// Method to capture the categoryName
				public void categoryNameclick() {
					 category_name_click.click();
					
				}

	// Method to select Dropdown Published option
	public void selectDropdownWithPublished() throws InterruptedException {

		dropdown_option.click();
		Thread.sleep(2000);
		published_option.click();
	}

	// Method to select Dropdown UnPublished option
	public void selectDropdownWithUnPublished() throws InterruptedException {

		dropdown_option.click();
		// Thread.sleep(2000);
		unPublished_option.click();
	}
	
	// Method to select Download Files Button option
		public void selectDownloadFilesButton() throws InterruptedException {

			downloadfiles_option.click();
			
			Thread.sleep(2000);
			
			download_button.click();
			
			
			
		}
		
		

}