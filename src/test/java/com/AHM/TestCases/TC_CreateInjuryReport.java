package com.AHM.TestCases;

import org.testng.annotations.Test;

import com.AHM.Utilities.BaseClass;

import pageObject.InjuryReports;

public class TC_CreateInjuryReport extends BaseClass {

	@Test
	public void createInjuryReport() throws InterruptedException
	{
		TC_LoginTest loginTest = new TC_LoginTest();
		loginTest.verifyLogin();
		
		InjuryReports reports = new InjuryReports(driver);
		reports.injuryReports();
		reports.createNewReport();
		reports.injuryDescription("Ankle sprain Injury");
		reports.saveInjuryReport();
	}
		
}
