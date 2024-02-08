package com.AHM.TestCases;

import org.testng.annotations.Test;

import com.AHM.Utilities.BaseClass;

import pageObject.LoginPage;
import pageObject.MessagesPage;

public class TC_Messages extends BaseClass{

	@Test
	public void sendMessages() throws InterruptedException
	{
	   LoginPage loginPage = new LoginPage(driver);
	   loginPage.username("pratik_physio");
	   loginPage.password("Rushikesh@123");
	   loginPage.login();
	   
	   MessagesPage messagesPage = new MessagesPage(driver);
	   messagesPage.messages();
	   messagesPage.selectUser();
	   messagesPage.name1();
	   messagesPage.composeMessages("Hello Vimal");
	   messagesPage.send();
	   messagesPage.profileIcon();
	   messagesPage.logout();
	   
	   TC_LoginTest loginTest = new TC_LoginTest();
	   loginTest.verifyLogin();
	   	   
	   messagesPage.messages();
	   messagesPage.name();
	   messagesPage.composeMessages("Hello Pratik");
	   messagesPage.send();
	}
}

