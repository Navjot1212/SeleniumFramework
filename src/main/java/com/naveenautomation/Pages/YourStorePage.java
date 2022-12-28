package com.naveenautomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.naveenautomation.Base.TestBase;

public class YourStorePage extends TestBase {
	public YourStorePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "a[title='My Account']")
	WebElement myAccountDropDownMenu;

	@FindBy(xpath = "//a[text()='Register']")
	WebElement registerBtn;

	@FindBy(xpath = "//a[text()='Login']")
	WebElement loginBtn;

	public void clickMyAccount() {
		myAccountDropDownMenu.click();
	}

	public RegisterAccountPage clickRegisterBtn() {
		registerBtn.click();
		return new RegisterAccountPage();
	}

	public AccountLoginPage clickLoginBtn() {
		loginBtn.click();
		return new AccountLoginPage();
	}
}
