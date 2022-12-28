package com.naveenautomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.naveenautomation.Base.TestBase;

public class RegisterAccountPage extends TestBase {

	public RegisterAccountPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "input-firstname")
	WebElement firstName;
	@FindBy(id = "input-lastname")
	WebElement lastName;
	@FindBy(id = "input-email")
	WebElement email;
	@FindBy(id = "input-telephone")
	WebElement telephone;
	@FindBy(id = "input-password")
	WebElement password;
	@FindBy(id = "input-confirm")
	WebElement confirmPassword;
	@FindBy(css = "input[name='agree']")
	WebElement privacyPolicyCheckBox;
	@FindBy(css = "input[value='Continue']")
	WebElement continueBtn;

	private void enterFirstName(String fname) {
		firstName.sendKeys(fname);
	}

	private void enterLastName(String lname) {
		lastName.sendKeys(lname);
	}

	private void enterEmail(String emailAddress) {
		email.sendKeys(emailAddress);
	}

	private void enterTelephone(String phone) {
		telephone.sendKeys(phone);
	}

	private void enterPassword(String pass) {
		password.sendKeys(pass);
	}

	private void enterConfirmPassword(String confirmPwd) {
		confirmPassword.sendKeys(confirmPwd);
	}

	private void clickPrivacyPolicy() {
		privacyPolicyCheckBox.click();
	}

	public AccountCreatedPage signUp(String fname, String lname, String emailaddress, String phone, String pass, String confirmPwd) {
		enterFirstName(fname);
		enterLastName(lname);
		enterEmail(emailaddress);
		enterTelephone(phone);
		enterPassword(pass);
		enterConfirmPassword(confirmPwd);
		clickPrivacyPolicy();
		continueBtn.submit();
		return new AccountCreatedPage();

	}

}
