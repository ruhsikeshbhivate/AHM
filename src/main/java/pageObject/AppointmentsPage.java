package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AppointmentsPage {

	WebDriver driver;

	public AppointmentsPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()=\"Appointments\"]")
	WebElement Appointments;
	
	public void appointments()
	{
		Appointments.click();
	}
	
	@FindBy(xpath = "//button[text()=\"Create New Appointment\"]")
	WebElement CreatNewAppointment;
	
	public void createNewAppointmnents()
	{
		CreatNewAppointment.click();
	}
	
	@FindBy(xpath = "//div[@id=\"Select-Athlete\"]")
	WebElement SelectAthlete;
	
	@FindBy(xpath = "//li[@role=\"option\"]")
	WebElement AthleteName;
	
	public void selectAthlete()
	{
		SelectAthlete.click();
		AthleteName.click();
	}
	
	@FindBy(xpath = "(//input[@type=\"text\"])[2]")
	WebElement Description;
	
	public void description(String desc)
	{
		Description.sendKeys(desc);
	}
	
	@FindBy(xpath = "//table//tbody//tr//td[1]")
	WebElement Time;
	
	@FindBy(xpath = "(//li[@role=\"option\"])[1]")
	WebElement Time1;
	
	public void appointmentTime()
	{
		Time.click();
		Time1.click();
	}
	
	@FindBy(xpath = "(//div[@role=\"combobox\"])[3]")
	WebElement Duration;
	
	@FindBy(xpath = "(//li[@role=\"option\"])[1]")
	WebElement duration1;
	
	public void duration()
	{
		Duration.click();
		duration1.click();
	}
	
	@FindBy(xpath = "//button[text()=\"Save\"]")
	WebElement Save;
	
	public void save()
	{
		Save.click();
	}
	
	
}
