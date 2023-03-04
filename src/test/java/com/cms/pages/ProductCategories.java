/**
 * 
 */
package com.cms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Nitesh
 *
 */
public class ProductCategories {

	WebDriver driver;
	public static String categoriesName = "Test_1234";

	public ProductCategories(WebDriver localDriver) {

		this.driver = localDriver;
	}

	@FindBy(how = How.XPATH, using = "//*[name()='path' and contains(@d,'M3 18h18v-')]")
	WebElement hamburger_icon;

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Settings']")
	WebElement settings_icon;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Product Categories')]")
	WebElement productCategories_option;

	@FindBy(how = How.XPATH, using = "//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active leftNavmenu']//input[@placeholder='Search Categories']")
	WebElement searchCategories_textbox;

	@FindBy(how = How.XPATH, using = "//*[@id='root']/div[2]/div[3]/div/div[3]/div[3]/div[2]/div[1]/span/button")
	WebElement createNew_button;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Add New Category')]")
	WebElement addNewCategory_title;

	@FindBy(how = How.XPATH, using = "//input[@id='name']")
	WebElement categoryName_textfield;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Close')]")
	WebElement close_link;

	@FindBy(how = How.XPATH, using = "//div[@class='sc-fzonZV fjLydT custom-footer']//button[@type='button']")
	WebElement next_button;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Search clusters']")
	WebElement searchClusters_textbox;

	@FindBy(how = How.XPATH, using = "//input[@value='122']")
	WebElement clustersName_checkbox;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	WebElement save_button;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Name already exists')]")
	WebElement enterExistingProductCategories;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Category successfully added')]")
	WebElement ProductCategories_message;

	@FindBy(how = How.XPATH, using = "//*[@id='root']/div[2]/div[3]/div/div[3]/div[3]/div[2]/div[2]/div[1]/div[13]/div[2]/div/div/div/span[2]/span[2]/div/span/span")
	WebElement productSubCategories_icon;

	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[@class='sc-fznKkj fQkkzS']/div[@class='sc-fzoCUK kBjMiw']/div[@class='ant-tabs ant-tabs-left sc-fzpdyU bpAxtW ant-tabs-vertical ant-tabs-line']/div[@class='ant-tabs-content ant-tabs-content-animated ant-tabs-left-content']/div[@role='tabpanel']/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[2]/span[2]/div[1]/span[1]//*[name()='svg']//*[name()='path' and contains(@d,'M12 8c1.1 ')]")
	WebElement threeDots_icon;

	@FindBy(how = How.XPATH, using = "//li[normalize-space()='Edit']")
	WebElement edit_icon;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Delete')]")
	WebElement delete_icon;

	@FindBy(how = How.XPATH, using = "//div[@class='ant-modal-footer']//button[@type='button']")
	WebElement yesDeleteCategory_button;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/div[3]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[2]/span[2]/div[1]/span[1]/span[1]")
	WebElement productSubCategory_button;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div[2]/div[3]/div/div[3]/div[3]/div[2]/div[2]/div[1]/div/div[2]/div/div/div/span[1]")
	WebElement switcher_icon;
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[@class='sc-fznKkj fQkkzS']/div[@class='sc-fzoCUK kBjMiw']/div[@class='ant-tabs ant-tabs-left sc-fzpdyU bpAxtW ant-tabs-vertical ant-tabs-line']/div[@class='ant-tabs-content ant-tabs-content-animated ant-tabs-left-content']/div[@role='tabpanel']/div[@class='scroll-container-wrapper']/div[@class='sc-fzoOEf eXkYNB scroll-container-box fvsdfsdf']/div[@class='sc-pjSSY dAvxTh']/div[@class='ant-tree sc-qQmou jqDvEh ant-tree-block-node']/div[@class='ant-tree-list']/div/div[@class='ant-tree-list-holder-inner']/div[2]/span[3]/span[2]/div[1]/span[1]//*[name()='svg']//*[name()='path' and contains(@d,'M12 8c1.1 ')]")
	WebElement subCategoryThreeDots_icon;

	// Method to go on Product Category Page
	public void clickOnProductCategory() throws InterruptedException {

		hamburger_icon.click();
		Thread.sleep(2000);

		settings_icon.click();
		Thread.sleep(2000);

		productCategories_option.click();
		Thread.sleep(2000);

		createNew_button.click();
	}

	// Method to Add,Edit,Update,Delete of Product Category & Product Sub-category
	public void landToProductCategoriesPage() throws InterruptedException {

		hamburger_icon.click();
		Thread.sleep(2000);

		settings_icon.click();
		Thread.sleep(2000);

		productCategories_option.click();
		Thread.sleep(2000);

	}
	
	//Method to click on Particular Product Category
	  public void clickonParticularProductCategory() {
		  
		  try {
			for(int r=1; r<100; r++) {
				  String xpath = "//div[@class='sc-fznKkj fQkkzS']//div[2]//div[2]//div[" + r + "]//div[1]//div[2]";
				 String a = driver.findElement(By.xpath(xpath)).getText();
				 System.out.println(a);
				 
				 if(a.contains(categoriesName)) {
					 Thread.sleep(4000);
					 threeDots_icon.click();
					 
					 Thread.sleep(5000);
					 
					edit_icon.click();
//					 for(int i=1 ; i<100; i++)
//					 {
						// String xpath1 = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[3]/div[3]/div[2]/div[2]/div[13]/div[1]/div[2]/div[1]/div[1]/div[1]/span[2]/span[2]/div[1]/span[1]/*[name()='svg'][1]";
						// driver.findElement(By.xpath(xpath1)).click(); 
//					 }
					 
				 }
			  }
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	  }

	// Method to Search Product Categories
	public void searchProductCategoryInSearchbox(String categoryName) throws InterruptedException {

		searchCategories_textbox.sendKeys(categoryName);

	}

	// Method to Search Product Categories
	public void searchProductCategoryAndClickOnThreeDots(String categoryName) throws InterruptedException {

		searchCategories_textbox.sendKeys(categoryName);

		threeDots_icon.click();

		Thread.sleep(3000);

		edit_icon.click();

	}
	
	// Method to Search & add Product Sub-Categories
		public void searchAndAddProductSubCategory(String categoryName) throws InterruptedException {

			searchCategories_textbox.sendKeys(categoryName);

			productSubCategory_button.click();

			Thread.sleep(3000);

			//edit_icon.click();

		}
		
		// Method to add a Product sub-category Name
		public void addProductSubCategory(String categoryName) throws InterruptedException {
			categoryName_textfield.sendKeys(categoryName);

			Thread.sleep(2000);

			next_button.click();
		}

	// Method to Update an Existing Product category Name
	public void updateExistingProductCategory(String categoryName) throws InterruptedException {
		categoryName_textfield.sendKeys(categoryName);

		Thread.sleep(2000);

		next_button.click();
	}

	// Method to Search Product Categories
	public void searchProductCategoryAndClickOnThreeDotsAndDeleteProductCategory(String categoryName)
			throws InterruptedException {

		searchCategories_textbox.sendKeys(categoryName);

		threeDots_icon.click();

		Thread.sleep(2000);

		delete_icon.click();

		Thread.sleep(1000);

		yesDeleteCategory_button.click();

	}

	// Method to Search Product Categories & add Product Sub-category
	public void searchProductCategory(String categoryName) throws InterruptedException {

		searchCategories_textbox.sendKeys(categoryName);

		Thread.sleep(2000);

		productSubCategories_icon.click();
	}
	
	// Method to expand switcher icon of Product Sub-category
		public void ExpandswitcherIconOfProductCategory() throws InterruptedException {
			
			Thread.sleep(5000);
			switcher_icon.click();
			
			Thread.sleep(1000);
			
			subCategoryThreeDots_icon.click();
			
			Thread.sleep(1000);

		}
		
		// Method to expand switcher icon & Delete Product Sub-category
				public void DeleteProductSubCategory() throws InterruptedException {
					
					delete_icon.click();

					Thread.sleep(1000);

					yesDeleteCategory_button.click();
					
					Thread.sleep(3000);

				}
	
	

	// Method to Validate Product category Title on window pop-up
	public boolean verifyProductCategoryTitle() {

		// String productCategoryTitle_text = addNewCategory_title.getText();
		// return productCategoryTitle_text;

		return addNewCategory_title.isDisplayed();
	}

	// Method to Validate Product category Name text-field in window pop-up
	public boolean verifyNameTextBox() {

		return categoryName_textfield.isDisplayed();

	}

	// Method to Validate close link on Window Pop-up
	public boolean verifyCloseLink() {

		return close_link.isDisplayed();
	}

	// Method to Validate Next Button in Window Pop-up
	public boolean verifyNextButton() {

		return next_button.isEnabled();
	}

	// Method to enter Category Name in Name Text-field
	public void enterProductCategory(String categoryName) throws InterruptedException {
		categoryName_textfield.sendKeys(categoryName);

		Thread.sleep(3000);

		next_button.click();
	}

	// Method to enter Category Name in Name Text-field
	public void enterProductSubCategory(String categoryName) throws InterruptedException {
		categoryName_textfield.sendKeys(categoryName);

		Thread.sleep(2000);

		next_button.click();
	}

	// Method to end clusters in Search box and click the Check-box
	public void enterProductClusters(String clustersName) throws InterruptedException {
		Thread.sleep(3000);

		searchClusters_textbox.sendKeys(clustersName);

		clustersName_checkbox.click();

		save_button.click();
	}

	// Method to Capture Error Message when user enter an Existing Product
	// Categories
	public String captureErrorMessage() {
		String message = enterExistingProductCategories.getText();
		return message;
	}
	
	// Method to Capture Product sub-category Name Message when user enter a Product sub
		// Categories
		public String captureProductCategoriesMessage() {
			String message = ProductCategories_message.getText();
			return message;
		}
		
		

}
