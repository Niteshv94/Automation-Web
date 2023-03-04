/**
 * 
 */
package com.cms.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Nitesh
 *
 */
public class ProductAttributes {

	WebDriver driver;

	public ProductAttributes(WebDriver localDriver) {
		this.driver = localDriver;
	}

	@FindBy(how = How.XPATH, using = "//*[name()='path' and contains(@d,'M3 18h18v-')]")
	WebElement hamburger_icon;

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Settings']")
	WebElement settings_icon;

	@FindBy(how = How.XPATH, using = "//div[@class='ant-dropdown-trigger createAttributeDropdown']")
	WebElement createNew_button;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Search Attributes']")
	WebElement searchAttribute_textbox;

	@FindBy(how = How.XPATH, using = "//li[normalize-space()='Single Attribute']")
	WebElement singleAttribute_button;

	@FindBy(how = How.XPATH, using = "//div[@class='ant-card-body']//h1[contains(text(),'Open Text')]")
	WebElement openText_tab;

	@FindBy(how = How.XPATH, using = "//div[@class='ant-card-body']//h1[contains(text(),'Short Text')]")
	WebElement shortText_tab;

	@FindBy(how = How.XPATH, using = "//div[@class='ant-card-body']//h1[contains(text(),'Boolean')]")
	WebElement boolean_tab;

	@FindBy(how = How.XPATH, using = "//div[@class='ant-card-body']//h1[contains(text(),'Decimal Values')]")
	WebElement decimalValues_tab;

	@FindBy(how = How.XPATH, using = "//div[@class='ant-card-body']//h1[contains(text(),'Integer')]")
	WebElement integer_tab;

	@FindBy(how = How.XPATH, using = "//div[@class='ant-card-body']//h1[contains(text(),'Date')]")
	WebElement date_tab;

	@FindBy(how = How.XPATH, using = "//button[@class='ant-btn ant-btn-primary']")
	WebElement next_button;

	@FindBy(how = How.XPATH, using = "//input[@id='name']")
	WebElement attributeName_textbox;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	WebElement save_button;

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Go Back']")
	WebElement goBack_link;

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Close']")
	WebElement close_link;

	@FindBy(how = How.XPATH, using = "//tbody[@class='ant-table-tbody']//tr[6]")
	WebElement capture_AddedAttribute;

	@FindBy(how = How.XPATH, using = "//p[@class='sc-AxheI eXzlnr']")
	WebElement capture_errorMessage;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Please Select an Attribute Type')]")
	WebElement capture_UnselectedAttributeMessage;

	@FindBy(how = How.XPATH, using = "//td[5]//div//*[local-name()='svg']")
	WebElement threeDots_icon;

	@FindBy(how = How.XPATH, using = "//li[normalize-space()='Edit']")
	WebElement editAttribute_icon;

	@FindBy(how = How.XPATH, using = "//input[@id='name']")
	WebElement editAttribute_textbox;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	WebElement updateAttribute_button;

	@FindBy(how = How.XPATH, using = "//li[normalize-space()='Delete']")
	WebElement deleteAttribute_icon;

	@FindBy(how = How.XPATH, using = "//button[@class='ant-btn ant-btn-primary']")
	WebElement yesDeleteAttribute_button;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Attribute already exists.')]")
	WebElement errorMessageInDuplicateAttribute;

	// Bulk Attribute WebElements Locators

	@FindBy(how = How.XPATH, using = "//li[normalize-space()='Bulk Attribute']")
	WebElement bulkAttribute_button;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Bulk Attribute Upload')]")
	WebElement bulkAttributeUploadTitle;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Attribute template')]")
	WebElement attributeTemplateTitle;

	@FindBy(how = How.XPATH, using = "//a[@class='download-template-bulk-attribute']")
	WebElement downloadAttributeTemplate;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Upload XSL file')]")
	WebElement uploadXslFileTitle;

	@FindBy(how = How.XPATH, using = "//div[@class='sc-prOVx knbMDq']")
	WebElement selectExcelFile;

	@FindBy(how = How.XPATH, using = "//p[@class='sc-AxmLO evuvdr']")
	WebElement closeButton;

	@FindBy(how = How.XPATH, using = "//button[@class='ant-btn upload-attribute-btn ant-btn-primary']")
	WebElement uploadFileButton;
	
	
	//WebElement Locators of Product Attribute Sorting with their types
	
	@FindBy(how = How.XPATH, using = "//div[@class='sc-fznKkj fQkkzS']//div[2]//div[1]//span[1]//div[1]//div[1]")
	WebElement allTypesArrowKey;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Open Text')]")
	WebElement openTextProductAttribute;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Short Text')]")
	WebElement shortTextProductAttribute;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Boolean')]")
	WebElement booleanProductAttribute;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Decimal Values')]")
	WebElement decimalValuesProductAttribute;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Integer')]")
	WebElement integerProductAttribute;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Date')]")
	WebElement dateProductAttribute;
	
	

	public void singleAttribute() throws InterruptedException {

		hamburger_icon.click();
		Thread.sleep(2000);

		settings_icon.click();
		Thread.sleep(4000);

		createNew_button.click();
		Thread.sleep(1000);

		singleAttribute_button.click();
		Thread.sleep(2000);

	}

	public void openText() {
		openText_tab.click();
		next_button.click();

	}

	public void shortText() {
		shortText_tab.click();
		next_button.click();
	}

	public void booleantext() {
		boolean_tab.click();
		next_button.click();
	}

	public void decimalValueText() {
		decimalValues_tab.click();
		next_button.click();
	}

	public void integerText() {
		integer_tab.click();
		next_button.click();
	}

	public void dateText() {
		date_tab.click();
		next_button.click();
	}

	public void clickNextButton() throws InterruptedException {
		next_button.click();
		Thread.sleep(1000);
	}

	public void enterAttribute(String attributeName) throws InterruptedException {
		attributeName_textbox.sendKeys(attributeName);

		Thread.sleep(1000);

	}

	public void clickOnSaveButton() {

		save_button.click();
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
		}
	}

	// Method to capture the attribute name newly added
	public String getAttributeName() {
		String message = capture_AddedAttribute.getText();
		return message;
	}

	// Method to capture the error message when textbox is empty
	public String getErrorMeesageInEmptyAttribute() {
		String error_message = capture_errorMessage.getText();
		return error_message;
	}

	// Method to capture the when user don't select any attribute name from the
	// window pop-up
	public String getErrorMeesageInUnselectedProductAttribute() {
		String error_unselectedAttributemessage = capture_UnselectedAttributeMessage.getText();
		return error_unselectedAttributemessage;
	}

	// Method to search an attribute
	public void searchAttribute(String searchAttributeName) throws InterruptedException {
		hamburger_icon.click();
		Thread.sleep(1000);

		settings_icon.click();
		Thread.sleep(4000);

		searchAttribute_textbox.sendKeys(searchAttributeName);
		Thread.sleep(8000);

	}

	// Method to Update an attribute
	public void updateAttribute(String updateAttributeName) throws InterruptedException {

		threeDots_icon.click();
		Thread.sleep(1000);

		editAttribute_icon.click();
		Thread.sleep(2000);

		editAttribute_textbox.clear();
		Thread.sleep(2000);

		editAttribute_textbox.sendKeys(updateAttributeName);
		Thread.sleep(1000);

		updateAttribute_button.click();

	}

	// Method to search an attribute and then delete
//		public boolean searchAndDeleteAttribute(String searchAttributeName) throws InterruptedException {
//			hamburger_icon.click();
//			Thread.sleep(1000);
//
//			settings_icon.click();
//			Thread.sleep(4000);
//
//			searchAttribute_textbox.sendKeys(searchAttributeName);
//			Thread.sleep(8000);
//			return true;
//			
//			
//		}

	// Method to Delete an attribute
	public void deleteAttribute() throws InterruptedException {

		threeDots_icon.click();
		Thread.sleep(1000);

		deleteAttribute_icon.click();
		Thread.sleep(2000);

		yesDeleteAttribute_button.click();

	}

	public void clickOnSaveButtonForDuplicateattribute() throws InterruptedException {

		save_button.click();
		Thread.sleep(4000);
	}

	// Method to Capture Message to Adding a Duplicate Product attribute
	public String captureErrorMessageOfDuplicateAttribute() throws InterruptedException {

		String error_duplicateAttributemessage = errorMessageInDuplicateAttribute.getText();
		return error_duplicateAttributemessage;

	}

	// Method to Capture or Assert(Verify) Message to adding a Duplicate Product
	// attribute
//	public boolean captureErrorMessageOfDuplicateAttribute() {
//		return errorMessageInDuplicateAttribute.isDisplayed();
//	}

	// Method to click on Bulk Attribute

	public void bulkAttribute() throws InterruptedException {

		hamburger_icon.click();
		Thread.sleep(2000);

		settings_icon.click();
		Thread.sleep(3000);

		createNew_button.click();
		Thread.sleep(1000);

		bulkAttribute_button.click();
		Thread.sleep(2000);

	}

	// Verify bulkAttributeUploadTitle in the window pop-up
	public boolean verifybulkAttributeUploadTitle() {

		// String bulkAttributeUploadTitle_text = bulkAttributeUploadTitle.getText();
		// return bulkAttributeUploadTitle_text;

		return bulkAttributeUploadTitle.isDisplayed();
	}

	// Verify attributeTemplateTitle in the window pop-up
	public boolean verifyattributeTemplateTitle() {
		// String attributeTemplateTitle_text = attributeTemplateTitle.getText();
		// return attributeTemplateTitle_text;

		return attributeTemplateTitle.isDisplayed();
	}

	// Verify uploadXslFileTitle in the window pop-up
	public boolean verifyuploadXslFileTitle() {
		// String uploadXslFileTitle_text = uploadXslFileTitle.getText();
		// return uploadXslFileTitle_text;

		return uploadXslFileTitle.isDisplayed();
	}

	// Verify closeButton in the window pop-up
	public boolean verifycloseButton() {

		return closeButton.isDisplayed();
	}

	// Verify uploadFileButton in the window pop-up
	public boolean verifyuploadFileButton() {

		return uploadFileButton.isEnabled();
	}

	// Method to click on Upload XSL File
	public void clickOnSelectExcelFile() {

		selectExcelFile.click();
	}

	// Method to click on Upload File button
	public void clickOnUploadFileButton() {
		uploadFileButton.click();
	}

	// Method to Download Attribute Template
	public void downloadBulkAttributeTemplate() {

		downloadAttributeTemplate.click();
	}

	// Method to Close window pop-up
	public void clickOnCloseButton() {

		closeButton.click();
	}
	
	// Method to Sort Product Attribute

	public void sortProductAttribute() throws InterruptedException {

		hamburger_icon.click();
		Thread.sleep(2000);

		settings_icon.click();
		Thread.sleep(5000);
		
		allTypesArrowKey.click();
	}
	
	//Method to sort the Product Attributes on their names
	
	public void sortOpenText() {
		openTextProductAttribute.click();
	}

	public void sortShortText() {
		shortTextProductAttribute.click();
	}

	public void sortBooleantext() {
		booleanProductAttribute.click();
	}

	public void sortDecimalValueText() {
		decimalValuesProductAttribute.click();
	}

	public void sortIntegerText() {
		integerProductAttribute.click();
	}

	public void sortDateText() {
		dateProductAttribute.click();
	}


}
