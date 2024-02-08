package pageObject;

import java.util.Locale;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.javafaker.Faker;

public class Users{

	Faker faker = new Faker(new Locale("en-IND"));

	WebDriver driver;

	public Users(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()=\"Invite User\"]")
	WebElement InviteUser;
	
	public void inviteUser()
	{
		InviteUser.click();
	}
	
	@FindBy(xpath = "//input[@name=\"FirstName\"]")
	public WebElement FirstName;
	
	public void firstName()
	{
		FirstName.sendKeys(faker.name().firstName());
	}
	
	@FindBy(xpath = "//input[@name=\"LastName\"]")
	public WebElement LastName;
	
	public void lastName()
	{
		LastName.sendKeys(faker.name().lastName());
	}
	
	@FindBy(xpath = "//input[@name=\"emailAddress\"]")
	WebElement Email;
	
	public void email(String mail)
	{
		Email.sendKeys(mail);
	}
	
	@FindBy(xpath = "//input[@name=\"phoneNumber\"]")
	WebElement PhoneNumber;
	
	public void phoneNumber(String phone)
	{
		PhoneNumber.sendKeys(phone);
	}
	
	@FindBy(xpath = "//input[@name=\"userName\"]")
	public WebElement Username;
	
	public void userName(String username)
	{
		Username.sendKeys(username);
	}
	
	@FindBy(xpath = "(//div[@id=\"user-select-select\"])[1]")
	WebElement UserType;
	
	@FindBy(xpath = "(//li[@role=\"option\"])[2]")
	WebElement UserRole;
	
	public void userType()
	{
		UserType.click();
		UserRole.click();
	}
	
	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement Password;
	
	public void password(String pass)
	{
	   Password.sendKeys(pass);
	}
	
	@FindBy(xpath = "//input[@name=\"ConfirmPassword\"]")
	WebElement ConfirmPassword;
	
	public void confrimPassword(String CPass)
	{
		ConfirmPassword.sendKeys(CPass);
	}
	
	@FindBy(xpath = "(//button[text()=\"Invite User\"])[2]")
	WebElement InviteUser1;
	
	public void inviteUser1()
	{
		InviteUser1.click();
	}
	
	

}
