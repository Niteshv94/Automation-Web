package com.cms.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver localDriver) {
		this.driver = localDriver;
	}

	@FindBy(xpath = "//input[@id='email']")
	WebElement registered_email;

	// @FindBy(xpath="//input[@id='password']")
	// WebElement registered_password;

	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement registered_password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement login_button;

	@FindBy(xpath = "//span[contains(text(),'Trezi')]")
	WebElement app_heading;

	@FindBy(xpath = "//span[@class='ant-dropdown-trigger']//span[@class='anticon anticon-down']")
	WebElement arrow_icon;

	@FindBy(xpath = "//li[contains(text(),'My Profile')]")
	WebElement myProfile_button;

	@FindBy(xpath = "//span[contains(text(),'My Subscription')]")
	WebElement mySubscription_button;

	@FindBy(xpath = "//li[contains(text(),'Logout')]")
	WebElement logout_button;

	@FindBy(xpath = "//p[@class='sc-AxheI eXzlnr']")
	WebElement password_error_message;

	@FindBy(xpath = "//p[contains(text(),'Email is Required.')]")
	WebElement empty_email_error_message;

	@FindBy(xpath = "//p[contains(text(),'Password is Required.')]")
	WebElement empty_password_error_message;

	@FindBy(xpath = "//p[@class='sc-AxmLO bYBfEl']")
	WebElement forgotPassword_link;

	@FindBy(xpath = "//span[contains(text(),'A password reset mail has been sent to ')]")
	WebElement forgotPassword_message;

	@FindBy(xpath = "//input[@id='email']")
	WebElement emailId_textbox;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement send_link;

	@FindBy(xpath = "//p[contains(text(),'Email is Required.')]")
	WebElement withEmptyEmailidForgotPassword_message;

	@FindBy(xpath = "//span[contains(text(),'Your email is not registered. Please contact your account manager.')]")
	WebElement withUnregisteredEmailidForgotPassword_message;

	@FindBy(xpath = "//p[contains(text(),'email must be a valid email')]")
	WebElement withInvalidEmailidForgotPassword_message;

	@FindBy(xpath = "//div[@class='sc-fznKkj fQkkzS']//div[2]//form[1]//div[2]")
	WebElement subscription_type;

	@FindBy(xpath = "//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active']//button[@type='button']")
	WebElement editDetails_tab;

	@FindBy(xpath = "//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active']//label[@for='fName']")
	WebElement userFirstName_textbox;

	@FindBy(xpath = "//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active']//label[@for='lName']")
	WebElement userLastName_textbox;

	@FindBy(xpath = "//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active']//label[@for='email']")
	WebElement userEmailId_textbox;

	@FindBy(xpath = "//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active']//label[@for='org']")
	WebElement userOrganization_textbox;

	@FindBy(xpath = "//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active']//label[@for='usrRole']")
	WebElement userPosition_textbox;

	@FindBy(xpath = "//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active']//label[@for='addressLine1']")
	WebElement userAdddressLine1_textbox;

	@FindBy(xpath = "//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active']//label[@for='addressLine2']")
	WebElement userAddressLine2_textbox;

	@FindBy(xpath = "//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active']//label[@for='country']")
	WebElement userCountry_textbox;

	@FindBy(xpath = "//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active']//label[@for='usrState']")
	WebElement userState_textbox;

	@FindBy(xpath = "//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active']//label[@for='zip']")
	WebElement userZipCode_textbox;

	@FindBy(xpath = "//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active']//input[@id='fName']")
	WebElement userFirstName_field;

	@FindBy(xpath = "//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active']//input[@id='lName']")
	WebElement userLastName_field;

	@FindBy(xpath = "//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active']//input[@id='email']")
	WebElement userEmailId_field;

	@FindBy(xpath = "//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active']//input[@id='org']")
	WebElement userOrganization_field;

	@FindBy(xpath = "//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active']//input[@id='usrRole']")
	WebElement userPosition_field;

	@FindBy(xpath = "//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active']//input[@id='addressLine1']")
	WebElement userAdddressLine1_field;

	@FindBy(xpath = "//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active']//input[@id='addressLine2']")
	WebElement userAddressLine2_field;

	@FindBy(xpath = "//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active']//label[@for='country']")
	WebElement userCountry_field;

	@FindBy(xpath = "//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active']//div[@id='mui-component-select-usrState']")
	WebElement userState_field;

	@FindBy(xpath = "//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active']//input[@id='zip']")
	WebElement userZipCode_field;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement save_button;

	public void loginToCMS(String email, String password) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}

		registered_email.sendKeys(email);
		registered_password.sendKeys(password);
		login_button.click();

	}

	// Method to navigate to CMS login page then navigate to Forgot Password Page
	// with Valid Email
	public void sendForgotPasswordLinkWithEmail(String emailId) throws InterruptedException {

		forgotPassword_link.click();

		emailId_textbox.sendKeys(emailId);

		send_link.click();
		Thread.sleep(3000);

	}

	// Method to capture the success message of Forgot Password
	public String getForgotPasswordMessage() {
		String message = forgotPassword_message.getText();
		return message;
	}

	// Method to capture the message of Forgot Password when unregistered email id
	// is provided
	public String getUnregisteredEmailPasswordMessage() {
		String message = withUnregisteredEmailidForgotPassword_message.getText();
		return message;
	}

	// Method to capture the message of Forgot Password when an invalid email id is
	// provided
	public String getInvalidFormatEmailPasswordMessage() {
		String message = withInvalidEmailidForgotPassword_message.getText();
		return message;

	}

	// Method to navigate to CMS login page then navigate to Forgot Password Page
	// with an empty Email
	public void sendForgotPasswordLinkWithEmptyEmail() throws InterruptedException {

		forgotPassword_link.click();

		send_link.click();
		Thread.sleep(2000);

	}

	// Method to capture the success message of Forgot Password
	public String getForgotPasswordMessageWithEmptyEmail() {
		String message = withEmptyEmailidForgotPassword_message.getText();
		return message;
	}

	// Method to capture the page heading
	public String getHeading() {
		String head = app_heading.getText();
		return head;
	}

	// Method to click on Logout button
	public void clickLogout() throws InterruptedException {

		Thread.sleep(2000);

		arrow_icon.click();

		Thread.sleep(500);

		logout_button.click();

	}

	// Method to click on MySubscription button
	public void clickMySubscription() throws InterruptedException {

		Thread.sleep(2000);

		arrow_icon.click();

		Thread.sleep(3000);

		myProfile_button.click();

		mySubscription_button.click();
	}

	// Method to click on MySubscription button
	public void clickMyProfile() throws InterruptedException {

		Thread.sleep(2000);

		arrow_icon.click();

		Thread.sleep(3000);

		myProfile_button.click();
	}

	// Method to edit and Update the User Details Profile
	public void userDetails(String fName, String lName, String email, String org, String usrRole, String addressLine1,
			String addressLine2) throws InterruptedException {

		Thread.sleep(3000);

		editDetails_tab.click();
		Thread.sleep(2000);

		// userFirstName_field.clear();
		Thread.sleep(2000);

		userFirstName_field.sendKeys(fName);
		Thread.sleep(1000);

		userLastName_field.sendKeys(lName);
		Thread.sleep(1000);

		userEmailId_field.sendKeys(email);
		Thread.sleep(1000);

		userOrganization_field.sendKeys(org);
		Thread.sleep(1000);

		userPosition_field.sendKeys(usrRole);
		Thread.sleep(1000);

		userAdddressLine1_field.sendKeys(addressLine1);
		Thread.sleep(1000);

		userAddressLine2_field.sendKeys(addressLine2);
		Thread.sleep(1000);

		// This is drop-down field and always it is disabled
		// userCountry_field.click();

		// This is drop-down field
		// userState_field.click();

//		userZipCode_field.sendKeys(zip);
//		Thread.sleep(2000);

		save_button.click();

	}

	// Method to capture the error message in Invalid credentials
	public String getPasswordErrorMessage() {
		String message = password_error_message.getText();
		return message;
	}

	// Method to capture the error message in Empty Email field
	public String getEmptyEmailErrorMessage() {
		String email_message = empty_email_error_message.getText();
		return email_message;
	}

	// Method to capture the error message in Empty Password field
	public String getEmptyPasswordErrorMessage() {
		String password_message = empty_password_error_message.getText();
		return password_message;
	}

	// Method to capture the subscription type from My Subscription Page
	public String getSubscriptionType() {
		String password_message = subscription_type.getText();
		return password_message;
	}

	// Method to fetch the first name text
	public String fetchFirstNameText() {
		String firstName_text = userFirstName_textbox.getText();
		return firstName_text;
	}

	// Method to fetch the last name text
	public String fetchLastNameText() {
		String lastName_text = userLastName_textbox.getText();
		return lastName_text;
	}

	// Method to fetch the emailId name text
	public String fetchEmailIdText() {
		String emailId_text = userEmailId_textbox.getText();
		return emailId_text;
	}

	// Method to fetch the organization name text
	public String fetchorganizationText() {
		String organization_text = userOrganization_textbox.getText();
		return organization_text;
	}

	// Method to fetch the position name text
	public String fetchpositionText() {
		String position_text = userPosition_textbox.getText();
		return position_text;
	}

	// Method to fetch the adddressLine1 name text
	public String fetchadddressLine1Text() {
		String adddressLine1_text = userAdddressLine1_textbox.getText();
		return adddressLine1_text;
	}

	// Method to fetch the adddressLine2 name text
	public String fetchadddressLine2Text() {
		String adddressLine2_text = userAddressLine2_textbox.getText();
		return adddressLine2_text;
	}

	// Method to fetch the country name text
	public String fetchcountryText() {
		String country_text = userCountry_textbox.getText();
		return country_text;
	}

	// Method to fetch the state name text
	public String fetchstateText() {
		String state_text = userState_textbox.getText();
		return state_text;
	}

	// Method to fetch the zipCode name text
	public String fetchzipCodeText() {
		String zipCode_text = userZipCode_textbox.getText();
		return zipCode_text;
	}

}
