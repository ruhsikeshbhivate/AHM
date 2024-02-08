package com.AHM.TestCases;

import org.bouncycastle.asn1.cmp.Challenge;
import org.testng.annotations.Test;

import com.AHM.Utilities.BaseClass;

import pageObject.BrainHealthChallenge;
import pageObject.LoginPage;

public class TC_BrainHealthChallenge extends BaseClass{

	@Test
	public void brainHealthChallenge() throws InterruptedException
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.username("pratik_physio");
		loginPage.password("Rushikesh@123");
		loginPage.login();
		loginPage.Dashboard();

		BrainHealthChallenge challenge = new BrainHealthChallenge(driver);
		challenge.brainHealthChallenge();
		challenge.createNewTest();
		challenge.selectAthlete();
		challenge.challengeName();
		challenge.startYourTest();
		
		challenge.getTestScore();
		challenge.okay();
				
	}

}
