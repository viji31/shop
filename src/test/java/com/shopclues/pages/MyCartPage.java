package com.shopclues.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common_lib.SuperTestScript;

public class MyCartPage extends BasePage
{
	@FindBy(xpath = "//a[@class = 'remove'][1]")
	private WebElement removeLink;
	
	@FindBy (xpath = "//div[@class = 'btn-sec button_container']//a[text() = 'Remove']")
	private WebElement removeLinkPopup;
	
	public MyCartPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	
	public void clickOnRemoveLink()
	{
		removeLink.click();
	}
	
	public void clickOnRemoveLinkPopup()
	{
		removeLinkPopup.click();
	}
}
