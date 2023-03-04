/**
 * 
 */
package com.cms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Nitesh
 *
 */
public class ProductClusters {

	WebDriver driver;
	public static String clusterName = "DoNotDelete";
	public static String clusterName1 = "DuplicateClusterDontTouch";
	public static String clusterName2 = "DeleteClusterTest";
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public ProductClusters(WebDriver localDriver) {
		this.driver = localDriver;
	}

	@FindBy(how = How.XPATH, using = "//*[name()='path' and contains(@d,'M3 18h18v-')]")
	WebElement hamburger_icon;

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Settings']")
	WebElement settings_icon;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Product Clusters')]")
	WebElement productClusters_option;

	@FindBy(how = How.XPATH, using = "//*[@id='root']/div[2]/div[3]/div/div[3]/div[2]/div[2]/div[2]/div/div[1]/div/div")
	WebElement mandatorySpecification_tab;

	@FindBy(how = How.XPATH, using = "//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active leftNavmenu']//button[@type='button']")
	WebElement createNew_button;

	@FindBy(how = How.XPATH, using = "//input[@id='title']")
	WebElement clusterName_textbox;

	@FindBy(how = How.XPATH, using = "//div[@class='ant-modal-content']//button[@class='ant-btn ant-btn-primary']")
	WebElement next_button;

	@FindBy(how = How.XPATH, using = "//input[@value='239']")
	WebElement attributesName_checkbox1;

	@FindBy(how = How.XPATH, using = "//input[@value='15998']")
	WebElement attributesName_checkbox2;

	@FindBy(how = How.XPATH, using = "//input[@value='15999']")
	WebElement attributesName_checkbox3;

	@FindBy(how = How.XPATH, using = "//input[@value='16003']")
	WebElement attributesName_checkbox4;

	@FindBy(how = How.XPATH, using = "//input[@value='16010']")
    WebElement attributesName_checkbox5;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	WebElement submit_button;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Name already exists')]")
	WebElement existingProductClusters_message;

	@FindBy(how = How.XPATH, using = "//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active leftNavmenu']//input[@placeholder='Search Cluster']")
	WebElement searchClusters_searchbox;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Title is Required')]")
	WebElement emptyProductClustersTextbox_message;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Edit')]")
	WebElement edit_button;
	
	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Duplicate')]")
	WebElement duplicate_button;
	
	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Delete')]")
	WebElement delete_button;
	
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	WebElement update_button;
	
	@FindBy(how = How.XPATH, using = "//div[@class='ant-modal-footer']//button[@type='button']")
	WebElement yesDeleteCluster_button;

	// Method to land on Product Clusters Page
	public void landToProductClustersPage() throws InterruptedException {

		hamburger_icon.click();
		Thread.sleep(2000);

		settings_icon.click();
		Thread.sleep(2000);

		productClusters_option.click();
		Thread.sleep(5000);

	}

	// Method to verify Product Clusters in Mandatory specifications
	public String captureMandatorySpecifications() throws InterruptedException {

		// mandatorySpecification_tab.click();
		// Thread.sleep(2000);

		String Clusters = mandatorySpecification_tab.getText();
		return Clusters;
	}

	// Method to enter and create a cluster name
	public void enterClusterName(String clusterName) throws InterruptedException {

		createNew_button.click();

		clusterName_textbox.sendKeys(clusterName);
		Thread.sleep(1000);

		next_button.click();
		Thread.sleep(1000);
	}

	// Method to create an empty cluster name

	public void emptyClusterName() throws InterruptedException {

		createNew_button.click();
		Thread.sleep(1000);

		next_button.click();
		Thread.sleep(1000);

		String message = emptyProductClustersTextbox_message.getText();

	}

	// Method to search an existing cluster name
	public void searchCluster(String clusterName) {
		searchClusters_searchbox.sendKeys(clusterName);
	}

	// Method to check attributes name from the list.
	public void checkAttributes() {

		attributesName_checkbox1.click();

		//attributesName_checkbox2.click();

		//attributesName_checkbox3.click();

		//attributesName_checkbox4.click();

		//attributesName_checkbox5.click();

		submit_button.click();
	}

	// Method to Capture Error Message when user enter an Existing Product Clusters
	public String captureErrorMessage() {
		String message = existingProductClusters_message.getText();
		return message;
	}

	// Method to Update Product Clusters from three point dots.

	public void clikOnThreeDotsThenClickOnEdit() throws InterruptedException {

		for (int r = 2; r < 71; r++) {
			String xpath = "//*[@id='root']/div[2]/div[3]/div/div[3]/div[2]/div[2]/div[2]/div/div[" + r + "]";
			String a = driver.findElement(By.xpath(xpath)).getText();

			if (a.contains(clusterName)) {
				Thread.sleep(3000);
				String xpath1 = "//div[@class='sc-fznKkj fQkkzS']//div[2]//div[2]//div[1]//div[" + r
						+ "]//div[1]//div[1]//div[1]//span[1]//*[name()='svg']";
				driver.findElement(By.xpath(xpath1)).click();
			}
		}

		edit_button.click();
	}
	
	//Method to Enter & Update Existing Product Clusters
	public void enterAndUpdateClusterName(String clusterName) throws InterruptedException {
		

		Thread.sleep(1000);
		clusterName_textbox.sendKeys(clusterName);
		
		next_button.click();
		Thread.sleep(1000);
		
//		  js.executeScript("window.scrollTo(0 , document.body.scrollHeight)");
		
//		  js.executeScript("window.scrollBy(0,1000)");
//		
//		  WebElement element = driver.findElement(By.xpath("//input[@value='16010']"));
//        js.executeScript("arguments[0].scrollIntoView(true);", element);
		
		update_button.click();
	}
	
	
	// Method to Duplicate Product Clusters from three point dots.

		public void clikOnThreeDotsThenClickOnDuplicate() throws InterruptedException {

			for (int r = 2; r < 71; r++) {
				String xpath = "//*[@id='root']/div[2]/div[3]/div/div[3]/div[2]/div[2]/div[2]/div/div[" + r + "]";
				String a = driver.findElement(By.xpath(xpath)).getText();

				if (a.contains(clusterName1)) {
					Thread.sleep(3000);
					String xpath1 = "//div[@class='sc-fznKkj fQkkzS']//div[2]//div[2]//div[1]//div[" + r
							+ "]//div[1]//div[1]//div[1]//span[1]//*[name()='svg']";
					driver.findElement(By.xpath(xpath1)).click();
				}
			}
			
		}
		
		//Method to Duplicate the Product Clusters
		public void clickOnDuplicate() throws InterruptedException {
			
			
			duplicate_button.click();
			Thread.sleep(1000);
			
			next_button.click();
			Thread.sleep(500);
			
			submit_button.click();
			
		}
		
		// Method to Delete Product Clusters from three point dots.

				public void clikOnThreeDotsThenClickOnDelete() throws InterruptedException {

					for (int r = 2; r < 71; r++) {
						String xpath = "//*[@id='root']/div[2]/div[3]/div/div[3]/div[2]/div[2]/div[2]/div/div[" + r + "]";
						String a = driver.findElement(By.xpath(xpath)).getText();

						if (a.contains(clusterName2)) {
							Thread.sleep(3000);
							String xpath1 = "//div[@class='sc-fznKkj fQkkzS']//div[2]//div[2]//div[1]//div[" + r
									+ "]//div[1]//div[1]//div[1]//span[1]//*[name()='svg']";
							driver.findElement(By.xpath(xpath1)).click();
						}
					}
					
				}
				
				//Method to Delete the Product Clusters
				public void clickOnDeleteButton() throws InterruptedException {
					
					delete_button.click();
					Thread.sleep(2000);
					
					yesDeleteCluster_button.click();
				}

}
