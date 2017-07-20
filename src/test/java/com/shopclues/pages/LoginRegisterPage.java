package com.shopclues.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common_lib.SuperTestScript;

public class LoginRegisterPage extends BasePage
{

	@FindBy(xpath = "//a[@id = 'login_tab']")
	private WebElement logInTab;
	
	@FindBy(xpath = "//input[@id = 'main_user_login']")
	private WebElement logInUserNameMobileNumberTextField;
	
	@FindBy(xpath = "//div[@id = 'login']//input[@name = 'password']")
	private WebElement loginPasswordTextField;
	
	@FindBy(xpath = "//a[text() = 'Forgot Password?']")
	private WebElement forgotPasswordLink;
	
	@FindBy(xpath = "//a[@id = 'login_button']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//a[@id = 'login_via_otp']")
	private WebElement loginViaOTPButton;
	
	@FindBy(xpath = "//a[@id = 'reg_tab']")
	private WebElement registerTab;
	
	@FindBy(xpath = "//input[@name = 'email']")
	private WebElement registerEmailIdTextField;
	
	@FindBy(xpath = "//input[@name = 'phone']")
	private WebElement registerMobileNumberTextField;
	
	@FindBy(xpath = "//input[@id = 'register_with_password']")
	private WebElement registerWithPasswordCheckBox;
	
	@FindBy(xpath = "//div[@id = 'register']//input[@name = 'password']")
	private WebElement registerPasswordTextField;
	
	@FindBy(xpath = "//a[@name = 'register']")
	private WebElement registerButton;
	
	@FindBy(xpath = "//div[@class = 'update_phone_cont']//a[text() = 'Skip']")
	private WebElement skipButton;

	public LoginRegisterPage() 
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	
	public void login(String userName, String password)
	{
		mouseHoverSignInDropDownMenu();
		clickOnLoginRegisterDropDownLink();
		clickOnLogInTab();
		enterLogInUserName(userName);
		enterLogInPassword(password);
		clickOnLogInButton();
		clickOnSkipButton();
	}
	
	public void clickOnLogInTab()
	{
		logInTab.click();
	}
	
	public void enterLogInUserName(String userName)
	{
		logInUserNameMobileNumberTextField.click();
		logInUserNameMobileNumberTextField.sendKeys(userName);
	}
	
	public void enterLogInPassword(String password)
	{
		loginPasswordTextField.click();
		loginPasswordTextField.sendKeys(password);
	}
	
	public void clickOnForgotPasswordLink()
	{
		forgotPasswordLink.click();
	}
	
	public void clickOnLogInButton()
	{
		loginButton.click();
	}
	
	public void clickOnLogInViaOTPButton()
	{
		loginViaOTPButton.click();
	}
	
	public void clickOnRegisterTab()
	{
		registerTab.click();
	}
	
	public void enterRegisteringEmailId(String email)
	{
		registerEmailIdTextField.click();
		registerEmailIdTextField.sendKeys(email);
	}
	
	public void enterRegisteringmobileNumber(String mobileNum)
	{
		registerMobileNumberTextField.click();
		registerMobileNumberTextField.sendKeys(mobileNum);
	}
	
	public void checkRegisterWithPassword()
	{
		registerWithPasswordCheckBox.click();
	}
	
	public void enterRegisteringPassword(String password)
	{
		registerPasswordTextField.click();
		registerPasswordTextField.sendKeys(password);
	}
	
	public void clickOnRegisterButton()
	{
		registerButton.click();
	}
	
	public void clickOnSkipButton()
	{
		skipButton.click();
	}
	
}
