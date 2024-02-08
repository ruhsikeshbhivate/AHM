package com.AHM.TestCases;

import org.testng.annotations.Test;

import com.AHM.Utilities.BaseClass;

import pageObject.InjuryReports;
import pageObject.LoginPage;

public class TC_InjuryReportCreatedByPhysio extends BaseClass{

	@Test
	public void createInjuryReportByPhysio() throws InterruptedException
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.username("pratik_physio");
		loginPage.password("Rushikesh@123");
		loginPage.login();
		loginPage.Dashboard();
		Thread.sleep(3000);
		
		InjuryReports reports = new InjuryReports(driver);
		reports.injuryReports();
		reports.createNewReport();
		reports.selectAthlete();
		reports.injuryDescription("There's significant tenderness and bruising in one localized area.");
		reports.injuryName();
		reports.addSymptoms();
		reports.saveInjuryReport();
				
	}
}
