package com.naveenautomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.Base.TestBase;

public class MyAccountPage extends TestBase {
	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Edit your account information']")
	WebElement editInfo;

	@FindBy(id = "input-telephone")
	WebElement telephone;

	@FindBy(css = "input[value='Continue']")
	WebElement continueBtn;

	@FindBy(css = "div.alert")
	WebElement accountUpadteSuccessfulText;

	@FindBy(xpath = "//a[text()='Subscribe / unsubscribe to newsletter']")
	WebElement subscribeNewsletter;
	
	@FindBy(css = "div.list-group a:last-of-type")
	WebElement logoutBtn;

	public void clickEditInfo() {
		editInfo.click();
	}

	public void updateTelephone(String phone) {
		telephone.clear();
		telephone.sendKeys(phone);
	}

	public MyAccountPage clickConitnueBtn() {
		continueBtn.click();
		return new MyAccountPage();
	}

	public String getAccountUpadteSuccessfulText() {
		return accountUpadteSuccessfulText.getText();
	}

	public NewsletterSubscriptionPage clickSubscribeNewsletter() {
		subscribeNewsletter.click();
		return new NewsletterSubscriptionPage();
	}
	public AccountLogoutPage clicklogoutBtn() {
		logoutBtn.click();
		return new AccountLogoutPage();
	}
}
