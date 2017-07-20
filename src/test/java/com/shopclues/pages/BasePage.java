package com.shopclues.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import common_lib.SuperTestScript;

public class BasePage 
{

	@FindBy(xpath = "//a[text() = 'Sign In']")
	private WebElement signInDropDownMenu;
	
	@FindBy(xpath = "//a[@class = 'cart_ic']")
	private WebElement addToCartIcon;
	
	@FindBy(xpath = "//a[@class = 'whishlist_ic']")
	private WebElement wishlistIcon;
	
	@FindBy(xpath = "//a[text() = 'Re-New Gadgets']")
	private WebElement reNewGadgetsDropDownLink;
	
	@FindBy(xpath = "//a[text() = 'Login/Register']")
	private WebElement loginRegisterDropDownLink;
	
	@FindBy(xpath = "//li[@id = 'sign-in']//a[text() = 'My Orders']")
	private WebElement myOrdersDropDownLink;
	
	@FindBy(xpath = "//li[@id = 'sign-in']//a[text() = 'My Returns']")
	private WebElement myReturnsDropDownLink;
	
	@FindBy(xpath = "//li[@id = 'sign-in']//a[text() = 'Wishlist']")
	private WebElement wishlistDropDownLink;
	
	@FindBy(xpath = "//li[@id = 'sign-in']//a[text() = 'My Profile']")
	private WebElement myProfileDropDownLink;
	
	@FindBy(xpath =".//li[@id='sc_uname']/a")//xpath= "//a[contains(text() , 'Hi ')]"
	private WebElement userModuleDropDownMenu;
	
	@FindBy(xpath = "//a[text() = 'Sign Out']")
	private WebElement signOutDropDownLink;
	
	
	public BasePage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	
	public String moveToWindow()
	{
		String cAdd = null;
		Set <String> allAdd = SuperTestScript.driver.getWindowHandles();
		Iterator<String> i1 = allAdd.iterator();
		int setSize = allAdd.size();
		for(int i = 0; i < setSize; i++)
		{
			if(i1.hasNext())
			{
				cAdd = i1.next();
			}
		}
		
		return cAdd;
	}
	
	public Actions act = new Actions(SuperTestScript.driver);
	
	public void mouseHoverSignInDropDownMenu()
	{
		act.moveToElement(signInDropDownMenu).perform();
	}
	
	public void clickOnAddToCartIcon()
	{
		addToCartIcon.click();
	}
	
	public void clickOnWishListIcon()
	{
		wishlistIcon.click();
	}
	
	public void clickOnLoginRegisterDropDownLink()
	{
		loginRegisterDropDownLink.click();
	}
	
	public void clickOnMyOrdersDropDownLink()
	{
		myOrdersDropDownLink.click();
	}
	
	public void clickOnMyReturnsDropDownLink()
	{
		myReturnsDropDownLink.click();
	}
	
	public void clickOnWishlistDropDownLink()
	{
		wishlistDropDownLink.click();
	}
	
	public void clickOnMyProfileDropDownLink()
	{
		myProfileDropDownLink.click();
	}
	
	public void mouseHoverUserModuleDropDownMenu()
	{
		 act.moveToElement(userModuleDropDownMenu).perform();
	}
	
	public void clickOnSignOutDropDownLink()
	{
		signOutDropDownLink.click();
	}
	
	public void mouseHoverRenewGadgetsDropdowm()
	{
		act.moveToElement(reNewGadgetsDropDownLink).perform();
	}
}
