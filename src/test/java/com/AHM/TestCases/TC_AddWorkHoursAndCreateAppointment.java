package com.AHM.TestCases;


import org.testng.annotations.Test;

import com.AHM.Utilities.BaseClass;

import pageObject.AppointmentsPage;
import pageObject.LoginPage;
import pageObject.Work_HoursPage;

public class TC_AddWorkHoursAndCreateAppointment extends BaseClass{

	@Test
	public void addWorkHours() throws InterruptedException
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.username("pratik_physio");
		loginPage.password("Rushikesh@123");
		loginPage.login();
		loginPage.Dashboard();
		
		Thread.sleep(3000);
		Work_HoursPage workHour = new Work_HoursPage(driver);
		workHour.workHours();
		workHour.startTime();
	}
	
	@Test(dependsOnMethods = {"addWorkHours"})
	public void createAppointment()
	{
		AppointmentsPage appointmentsPage = new AppointmentsPage(driver);
		appointmentsPage.appointments();
		appointmentsPage.createNewAppointmnents();
		appointmentsPage.selectAthlete();
		appointmentsPage.description("Appointment for lower back pain.");
		appointmentsPage.appointmentTime();
		appointmentsPage.duration();
		appointmentsPage.save();
	}
	
}
