package com.shopclues.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common_lib.SuperTestScript;

public class ProductSelectionPage extends BasePage

{

	@FindBy(xpath = "//a[contains(@alt , 'All Re-New Gadgets')]")
	private WebElement allRenewGadgets;
	
	@FindBy(xpath = "//a[contains(@href , 'computers-unboxed-laptops')]")
	private WebElement unboxedLaptops;
	
	@FindBy(xpath = "//a[contains(@href , 'lenovo-zuk-z1')]")
	private WebElement lenovoZukZ1;
	
	@FindBy(xpath = "//a[contains(@href , 'lenovo-thinkpad-r400')]")
	private WebElement lenovoThinkpad;
	
	public ProductSelectionPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	
	public void clickOnAllRenewGadgets()
	{
		allRenewGadgets.click();
	}
	
	public void clickOnUnboxedLaptops()
	{
		unboxedLaptops.click();
	}
	
	public void clickOnLenovoukZ1() 
	{
		lenovoZukZ1.click();
		
	}
	public void clickOnLenovoThinkpad()
	{
		lenovoThinkpad.click();
	}
	
}
