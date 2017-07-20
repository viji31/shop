package com.shopclues.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import common_lib.SuperTestScript;

public class MyProfilePage extends BasePage
{
	@FindBy(xpath = "//div[@class = 'sub_action_links']//a[text() = 'My Profile']")
	private WebElement myProfileTab;
	@FindBy(xpath = "//a[text() = 'My Address Book']")
	private WebElement myAddressBookTab;
	@FindBy(xpath = "//a[text() = 'Bank Details']")
	private WebElement bankDetailsTab;
	@FindBy(xpath = "//a[text() = 'Change Password']")
	private WebElement changePasswordTab;
	@FindBy(xpath= "//input[@id = 'firstname']")
	private WebElement firstNameTextFieldInProfile;
	@FindBy(xpath = "//input[@id = 'lastname']")
	private WebElement lastNameTextFieldInProfile;
	@FindBy(xpath = "//input[@id = 'phone']")
	private WebElement mobileNumberTextFieldInProfile;
	@FindBy(xpath = "//input[@value = 'Update Profile']")
	private WebElement updateProfileButton;
	@FindBy(xpath = "//li[@class = 'slick-slide slick-current slick-active']")
	private WebElement slickAddress;
	@FindBy(xpath = "//div[@class = 'slick-list draggable']//a[text() = 'Edit Address']")
	private WebElement editAddressLink;
	@FindBy(xpath = "//a[text() = 'Add New Address']")
	private WebElement addNewAddressLink; 
	@FindBy(xpath = "//div[@class = 's_row']//input[@name = 'first_name']")
	private WebElement firstNameTextFieldInAddress;
	@FindBy(xpath = "//div[@class = 's_row']//input[@name = 'last_name']")
	private WebElement lastNameTextFieldInAddress;
	@FindBy(xpath = "//div[@class = 's_row']//input[@name = 'phone']")
	private WebElement mobileNumberTextFieldInAddress;
	@FindBy(xpath = "//div[@class = 's_row']//input[@name = 'zipcode']")
	private WebElement pincodeTextFieldInAddress;
	@FindBy(xpath = "//div[@class = 's_row']//input[@name = 'address']")
	private WebElement houseNoTextFieldInAddress;
	@FindBy(xpath = "//div[@class = 's_row']//input[@name = 'address_2']")
	private WebElement localityTextFieldInAddress;
	@FindBy(xpath = "//div[@class = 's_row']//input[@name = 'city']")
	private WebElement cityTextFieldInAdress;
	@FindBy(xpath = "//select[@id = 'chooseState']")
	private WebElement selectStateEle;
	
	@FindBy(xpath = "//input[@value = 'Save Address']")
	private WebElement saveAddressButton;
	@FindBy(xpath = "//input[@value = 'Cancel']")
	private WebElement cancelButton;
	@FindBy(xpath = "//input[@id = 'passwordc']")
	private WebElement currentPasswordTextField;
	@FindBy(xpath = "//input[@id = 'password1']")
	private WebElement newPasswordTextField;
	@FindBy(xpath = "//input[@id = 'password2']")
	private WebElement confirmNewPasswordTextField;
	@FindBy(xpath = "//input[@value = 'Change Password']")
	private WebElement changePasswordButton;
	public MyProfilePage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	public void clickOnMyProfileTab()
	{
		myProfileTab.click();
	}
	public void clickOnMyAddressBookTab()
	{
		myAddressBookTab.click();
	}
	public void clickOnBankDetailsTab()
	{
		bankDetailsTab.click();
	}
	public void clickOnChangePasswordTab()
	{
		changePasswordTab.click();
	}
	public void editFirstNameInProfile(String firstName)
	{
		firstNameTextFieldInProfile.clear();
		firstNameTextFieldInProfile.sendKeys(firstName);
	}
	public void editLastNameInProfile(String lastName)
	{
		lastNameTextFieldInProfile.clear();
		lastNameTextFieldInProfile.sendKeys(lastName);
	}
	public void editMobileNumberInProfile(String mobileNumber)
	{
		mobileNumberTextFieldInProfile.clear();
		mobileNumberTextFieldInProfile.sendKeys(mobileNumber);
	}
	public void selectGender(String gender)
	{
		WebElement genderRadioButton = SuperTestScript.driver.findElement(By.xpath("//label[text() = '"+gender+"']"));
		genderRadioButton.click();
	}
	public void clickOnUpdateProfileButton()
	{
		updateProfileButton.click();
	}
	public void mouseHoverSlickAddress()
	{
		act.moveToElement(slickAddress).perform();
	}
	public void clickOnEditAddressLink()
	{
		editAddressLink.click();
	}
	public void clickOnAddNewAddressLink()
	{
		addNewAddressLink.click();
	}
	public void editFirstNameInAddressBook(String firstName)
	{
		firstNameTextFieldInAddress.clear();
		firstNameTextFieldInAddress.sendKeys(firstName);
	}
	public void editLastNameInAddressBook(String lastName)
	{
		lastNameTextFieldInAddress.clear();
		lastNameTextFieldInAddress.sendKeys(lastName);
	}
	public void editMobileNumberInAddressBook(String mobileNumber)
	{
		mobileNumberTextFieldInAddress.clear();
		mobileNumberTextFieldInAddress.sendKeys(mobileNumber);
	}
	public void editPincodeInAddressBook(String pincode)
	{
		pincodeTextFieldInAddress.clear();
		pincodeTextFieldInAddress.sendKeys(pincode);
	}
	public void editHouseNumInAddress(String houseNo)
	{
		houseNoTextFieldInAddress.clear();
		houseNoTextFieldInAddress.sendKeys(houseNo);
	}
	public void editLocalityInAddress(String locality)
	{
		localityTextFieldInAddress.clear();
		localityTextFieldInAddress.sendKeys(locality);
	}
	public void editCityInAddress(String city)
	{
		cityTextFieldInAdress.clear();
		cityTextFieldInAdress.sendKeys(city);
	}
	public void selectState(String state)
	{
		Select stateDropDown = new Select(selectStateEle);
		stateDropDown.selectByVisibleText(state);
	}
	public void selectTypeOfAddress(String addressType)
	{
		SuperTestScript.driver.findElement(By.xpath("//label[text() = '"+addressType+"']")).click();
	}
	public void clickOnSaveAddressButton()
	{
		saveAddressButton.click();
	}
	public void clickOnCancelButton()
	{
		cancelButton.click();
	}
	public void enterCurrentPassword(String currentPassword)
	{
		currentPasswordTextField.click();
		currentPasswordTextField.sendKeys(currentPassword);
	}
	public void enterNewPassword(String newPassword)
	{
		newPasswordTextField.click();
		newPasswordTextField.sendKeys(newPassword);
	}
	public void enterConfirmNewPassword(String confirmNewPassword)
	{
		confirmNewPasswordTextField.click();
		confirmNewPasswordTextField.sendKeys(confirmNewPassword);
	}
	public void clickOnChangePasswordButton()
	{
		changePasswordButton.click();
	}
}
	