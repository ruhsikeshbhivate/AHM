package com.AHM.TestCases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.AHM.Utilities.BaseClass;

import pageObject.AdminPage;
import pageObject.LoginPage;
import pageObject.OrganizationPage;
import pageObject.PhysioTherapist_TourPage;
import pageObject.ProfilePage;
import pageObject.Users;

public class TC_CreatePhyioTherapist extends BaseClass {

	@Test
	public void createPhysioTherapist() throws InterruptedException
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.username("rushi-admin");
		loginPage.password("Rushikesh@123");
		loginPage.login();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		Users users = new Users(driver);
		users.inviteUser();
		
		users.firstName();
		users.lastName();
		String FIRSTNAME = users.FirstName.getAttribute("value");
		String LASTNAME = users.LastName.getAttribute("value");
		System.out.println("Physiotehrapist Name : " + FIRSTNAME +" " + LASTNAME);
		
		users.email("rushikesh.bhivate"+"+" +FIRSTNAME+"@anveshak.com");
		users.phoneNumber("7262957778");
		users.userName(FIRSTNAME+"_"+LASTNAME);
		String USERNAME = users.Username.getAttribute("value");
		
		users.userType();
		users.password("Rushikesh@123");
		users.confrimPassword("Rushikesh@123");
		users.inviteUser1();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		AdminPage adminPage = new AdminPage(driver);
		adminPage.profileIcon();
		adminPage.logout();
		
		loginPage.username(USERNAME);
		loginPage.password("Rushikesh@123");
		loginPage.login();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		loginPage.newPassword("Rushikesh@123");
		loginPage.confirmPassword("Rushikesh@123");
		loginPage.submit();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		ProfilePage profilePage = new ProfilePage(driver);
		profilePage.letsStart();
		
		profilePage.gender();
		profilePage.birthday();
		profilePage.zipcode("411011");
		profilePage.saveChanges();
		
		profilePage.next();
		profilePage.inviteCode("VCA");
		profilePage.joinNow();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		OrganizationPage orgPage = new OrganizationPage(driver);
		orgPage.next();
		orgPage.joinTeam();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		orgPage.next();
		PhysioTherapist_TourPage tourPage = new PhysioTherapist_TourPage(driver);
		tourPage.menuIcon();
		
		for(int i=1; i<=9; i++)
		{
			tourPage.next();
		}

	}
}