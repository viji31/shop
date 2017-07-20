package com.shopclues.scripts;

import org.testng.annotations.Test;

import com.shopclues.pages.LoginRegisterPage;
import com.shopclues.pages.MyProfilePage;

import common_lib.ExcelLibrary;
import common_lib.SuperTestScript;

public class EditProfile_TS_02 extends SuperTestScript
{
	@Test
	public void testEditProfile_TS_02()
	{
		String path = "./testdata/userdata.xls";
		ExcelLibrary el = new ExcelLibrary(path, "EditProfile_TS_02", 1);
		String userName = el.readData(0);
		String password = el.readData(1);
		String firstNameP = el.readData(2);
		String lastNameP = el.readData(3);
		String mobileNumberP = el.readData(4);
		String gender = el.readData(5);
		String firstNameA = el.readData(6);
		String lastNameA = el.readData(7);
		String mobileNumberA = el.readData(8);
		String pincode = el.readData(9);
		String houseNum = el.readData(10);
		String locality = el.readData(11);
		String city = el.readData(12);
		String state = el.readData(13);
		String addressType = el.readData(14);
//		String firstNameNA = el.readData(15);
//		String lastNameNA = el.readData(16);
//		String mobileNumberNA = el.readData(17);
//		String pincodeNA = el.readData(18);
//		String houseNumNA = el.readData(19);
//		String localityNA = el.readData(20);
//		String cityNA = el.readData(21);
//		String stateNA = el.readData(22);
//		String addressTypeNA = el.readData(23);
		String currentPassword = el.readData(24);
		String newPassword = el.readData(25);
		String confirmNewPassword = el.readData(26);
		
		
		LoginRegisterPage lp = new LoginRegisterPage();
		
		MyProfilePage mpp = new MyProfilePage();
		
		lp.login(userName, password);
		lp.mouseHoverUserModuleDropDownMenu();
		lp.clickOnMyProfileDropDownLink();
		
		mpp.clickOnMyProfileTab();
		mpp.editFirstNameInProfile(firstNameP);
		mpp.editLastNameInProfile(lastNameP);
		mpp.editMobileNumberInProfile(mobileNumberP);
		mpp.selectGender(gender);
		mpp.clickOnUpdateProfileButton();
		
		
		mpp.clickOnMyAddressBookTab();
		mpp.mouseHoverSlickAddress();
		mpp.clickOnEditAddressLink();
		mpp.editFirstNameInAddressBook(firstNameA);
		mpp.editLastNameInAddressBook(lastNameA);
		mpp.editMobileNumberInAddressBook(mobileNumberA);
		mpp.editPincodeInAddressBook(pincode);
		mpp.editHouseNumInAddress(houseNum);
		mpp.editLocalityInAddress(locality);
		mpp.editCityInAddress(city);
		mpp.selectState(state);
		mpp.selectTypeOfAddress(addressType);
		mpp.clickOnSaveAddressButton();
		
//		mpp.clickOnAddNewAddressLink();
//		mpp.editFirstNameInAddressBook(firstNameNA);
//		mpp.editLastNameInAddressBook(lastNameNA);
//		mpp.editMobileNumberInAddressBook(mobileNumberNA);
//		mpp.editPincodeInAddressBook(pincodeNA);
//		mpp.editHouseNumInAddress(houseNumNA);
//		mpp.editLocalityInAddress(localityNA);
//		mpp.editCityInAddress(cityNA);
//		mpp.selectState(stateNA);
//		mpp.selectTypeOfAddress(addressTypeNA);
//		mpp.clickOnSaveAddressButton();
		
		mpp.clickOnChangePasswordTab();
		mpp.enterCurrentPassword(currentPassword);
		mpp.enterNewPassword(newPassword);
		mpp.enterConfirmNewPassword(confirmNewPassword);
		mpp.clickOnChangePasswordTab();
		
		mpp.mouseHoverUserModuleDropDownMenu();
		mpp.clickOnSignOutDropDownLink();
	}

}
