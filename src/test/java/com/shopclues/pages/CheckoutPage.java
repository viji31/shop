package com.shopclues.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common_lib.SuperTestScript;

public class CheckoutPage extends BasePage
{

	@FindBy(xpath = "//label[contains(text(), 'Debit Card')]")
	private WebElement cashOnDeliveryRadioButton;
	
	public CheckoutPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	
	public void clickOnCashOnDelivery()
	{
		cashOnDeliveryRadioButton.click();
	}
	
}
