package com.AHM.TestCases;

import org.testng.annotations.Test;

import com.AHM.Utilities.BaseClass;

import pageObject.InjuryQuestionPage;
import pageObject.LoginPage;

public class TC_AddQuestionSet extends BaseClass {

	@Test
	public void addQuestionSet() throws InterruptedException
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.username("rushi-admin");
		loginPage.password("Rushikesh@123");
		loginPage.login();
		
		InjuryQuestionPage injuryPage = new InjuryQuestionPage(driver);
		injuryPage.injuryQuestions();
		injuryPage.questionSet();
		injuryPage.addQuestionSet();
		injuryPage.questionSetTitle("Pyschological356");
		injuryPage.selectOrganization("Mumbai Cricket Association");
		injuryPage.questionSetCategory();
		injuryPage.question1();
		injuryPage.save();
		injuryPage.delete();
		
	}
}
