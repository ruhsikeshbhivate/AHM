package com.AHM.TestCases;


import org.testng.annotations.Test;

import com.AHM.Utilities.BaseClass;

import pageObject.LoginPage;

public class TC_LoginTest extends BaseClass  {

	@Test
	public void verifyLogin() throws InterruptedException
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.username("vimal_chaturvedi");
		loginPage.password("Rushikesh@123");
		loginPage.login();
		loginPage.Dashboard();
		
	}
}
