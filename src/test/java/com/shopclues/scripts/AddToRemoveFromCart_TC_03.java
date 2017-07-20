package com.shopclues.scripts;

import org.testng.annotations.Test;

import com.shopclues.pages.LoginRegisterPage;
import com.shopclues.pages.MyCartPage;
import com.shopclues.pages.ProductDisplayPage;
import com.shopclues.pages.ProductSelectionPage;

import common_lib.ExcelLibrary;
import common_lib.SuperTestScript;

public class AddToRemoveFromCart_TC_03 extends SuperTestScript
{
	@Test
	public void testAddToRemoveFromCart_TC_03()
	{
		
	
		String path = "./testdata/userdata.xls";
		ExcelLibrary el = new ExcelLibrary(path, "BuyAProduct_TS_01", 1);
		String userName = el.readData(0);
		String password = el.readData(1);
		
		
		LoginRegisterPage lp = new LoginRegisterPage();
		
		ProductSelectionPage psp = new ProductSelectionPage();
		
		ProductDisplayPage pdp = new ProductDisplayPage();
		
		MyCartPage mcp = new MyCartPage();
		
		lp.login(userName, password);
		lp.mouseHoverRenewGadgetsDropdowm();
		String pAdd = SuperTestScript.driver.getWindowHandle();
		psp.clickOnUnboxedLaptops();
		
		String cAdd = psp.moveToWindow();
		SuperTestScript.driver.switchTo().window(cAdd);
		psp.clickOnLenovoThinkpad();
		
		String cAdd1 = psp.moveToWindow();
		SuperTestScript.driver.switchTo().window(cAdd1);
		pdp.clickOnAddToCartButton();
		pdp.clickOnAddToCartIcon();
		
		String cAdd2 = psp.moveToWindow();
		SuperTestScript.driver.switchTo().window(cAdd2);
		mcp.clickOnRemoveLinkPopup();
		
		SuperTestScript.driver.switchTo().window(pAdd);
		lp.mouseHoverUserModuleDropDownMenu();
		lp.clickOnSignOutDropDownLink();
		
	}

}
