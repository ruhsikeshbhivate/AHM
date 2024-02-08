package com.AHM.TestCases;

import org.testng.annotations.Test;

import com.AHM.Utilities.BaseClass;

import pageObject.RegistrationPage;

public class TC_RegisterAthlete extends BaseClass{

	@Test
	public void registerAthlete()
	{
		RegistrationPage registerPage = new RegistrationPage(driver);
		
		registerPage.register();
		registerPage.firstName();
		registerPage.lastName();
		String FIRSTNAME = registerPage.FirstName.getAttribute("value");
		String LASTNAME = registerPage.LastName.getAttribute("value");
		registerPage.userName(FIRSTNAME+"_"+LASTNAME);
		
		registerPage.email("rushikesh.bhivate"+"+"+FIRSTNAME+"@anveshak.com");
		registerPage.password("Rushikesh@123");
		registerPage.confirmPassword("Rushikesh@123");
		
		registerPage.phoneNumber("8393983933");
		registerPage.register();
	}
}
