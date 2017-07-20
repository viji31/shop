package com.shopclues.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common_lib.SuperTestScript;

public class ProductDisplayPage extends BasePage
{

	@FindBy(xpath = "//span[@value = 'Grey']")
	private WebElement color;
	
	@FindBy(xpath = "//button[text() = 'Buy Now']")
	private WebElement buyNowButton;
	
	@FindBy(xpath = "//button[text() = 'Add To Cart']")
	private WebElement addToCartButton;
	
	public ProductDisplayPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	
	public void selectColorOfMobile()
	{
		color.click();
	}
	
	public void clickOnBuyNowButton()
	{
		buyNowButton.click();
	}
	
	public void clickOnAddToCartButton()
	{
		addToCartButton.click();
	}
	
}
