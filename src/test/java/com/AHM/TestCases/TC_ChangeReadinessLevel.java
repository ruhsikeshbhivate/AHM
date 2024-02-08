package com.AHM.TestCases;

import org.testng.annotations.Test;

import com.AHM.Utilities.BaseClass;

import pageObject.AthleteHealthPage;
import pageObject.LoginPage;

public class TC_ChangeReadinessLevel extends BaseClass{

	@Test
	public void changeReadinessLevel() throws InterruptedException
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.username("pratik_physio");
		loginPage.password("Rushikesh@123");
		loginPage.login();

		AthleteHealthPage athletePage = new AthleteHealthPage(driver);
		athletePage.athleteHealth();
		athletePage.view();
		athletePage.readinessLevel();
		athletePage.readinessValue();

		String HEALTHSTATUS = athletePage.HealthStatus.getAttribute("innerText");

		if (HEALTHSTATUS.contentEquals("LIMITEDCONTACT")) {

			System.out.println("Health status for 60 readiness value : "+HEALTHSTATUS);

		} else {
			
			System.out.println("Health status appears to be incorrect based on the readiness value.");
		}

		athletePage.readinessLevel();
		athletePage.readinessValue1();

		String HEALTHSTATUS1 = athletePage.HealthStatus1.getAttribute("innerText");

		if (HEALTHSTATUS1.contentEquals("FULLTIME")) {

			System.out.println("Health status for 100 readiness value : "+HEALTHSTATUS1);

		} else {
			
			System.out.println("Health status appears to be incorrect based on the readiness value.");
		}
		
	}
}
