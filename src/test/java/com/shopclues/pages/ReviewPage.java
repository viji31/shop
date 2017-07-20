package com.shopclues.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common_lib.SuperTestScript;

public class ReviewPage extends BasePage
{

	@FindBy(xpath = "//input[@value = 'Proceed to Payments']")
	private WebElement proceedToPaymentsButton;
	
	public ReviewPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	
	public void clickOnProceedToPayments()
	{
		proceedToPaymentsButton.click();
	}
}
