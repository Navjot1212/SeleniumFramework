package com.naveenautomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.Base.TestBase;

public class NewsletterSubscriptionPage extends TestBase {
	
	public NewsletterSubscriptionPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = "input[value='0']")
	WebElement noRadioBtn;
	
	@FindBy(css = "input[value='1']")
	WebElement yesRadioBtn;


	@FindBy(css = "input[value='Continue']")
	WebElement continueBtn;

	public void clickSubscribe() {
		yesRadioBtn.click();
	}
	
	public void clickUnsubscribe() {
		noRadioBtn.click();
	}

	public MyAccountPage clickContinueBtn() {
		continueBtn.click();
		return new MyAccountPage();
	}
}
