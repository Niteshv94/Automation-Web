/**
 * 
 */
package com.cms.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Nitesh
 *
 */
public class FileTypes {

	WebDriver driver;

	public FileTypes(WebDriver localDriver) {
		this.driver = localDriver;
	}

	@FindBy(how = How.XPATH, using = "//*[name()='path' and contains(@d,'M3 18h18v-')]")
	WebElement hamburger_icon;

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Settings']")
	WebElement settings_icon;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'File Types')]")
	WebElement fileTypes_button;

	@FindBy(how = How.XPATH, using = "//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active leftNavmenu']//p[@class='fileName'][normalize-space()='Trezi']")
	WebElement trezi_icon;

	@FindBy(how = How.XPATH, using = "//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active leftNavmenu']//p[@class='fileName'][normalize-space()='Sketchup']")
	WebElement sketchup_icon;

	@FindBy(how = How.XPATH, using = "//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active leftNavmenu']//p[@class='fileName'][normalize-space()='Revit']")
	WebElement revit_icon;

	@FindBy(how = How.XPATH, using = "//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active leftNavmenu']//p[@class='fileName'][normalize-space()='FBX']")
	WebElement fbx_icon;

	public void fetchFileTypes() throws InterruptedException {

		hamburger_icon.click();
		Thread.sleep(2000);

		settings_icon.click();
		Thread.sleep(4000);

		fileTypes_button.click();
		Thread.sleep(2000);

	}

	// Verify Trezi Image in File Types
	public boolean verifyTreziImage() {

		// String treziImage = trezi_icon.getText();
		// return treziImage;

		return trezi_icon.isDisplayed();
	}

	// Verify Sketchup Image in File Types
	public boolean verifySketchupImage() {

		// String sketchupImage = sketchup_icon.getText();
		// return sketchupImage;

		return trezi_icon.isDisplayed();
	}

	// Verify Revit Image in File Types
	public boolean verifyRevitImage() {

		// String revitImage = revit_icon.getText();
		// return revitImage;

		return trezi_icon.isDisplayed();
	}

	// Verify FBX Image in File Types 
	public boolean verifyFbxImage() {

		// String fbxImage = fbx_icon.getText();
		// return fbxImage;

		return trezi_icon.isDisplayed();
	}

}
