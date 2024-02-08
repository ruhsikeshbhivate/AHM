package pageObject;

import java.util.Locale;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.javafaker.Faker;

public class RegistrationPage {

	Faker faker = new Faker(new Locale("en-IND"));
	WebDriver driver;
	
	public RegistrationPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()=\"Register\"]")
	WebElement Register;
	
	public void register()
	{
		Register.click();
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
	
	@FindBy(xpath = "//input[@name=\"userName\"]")
	WebElement Username;
	
	public void userName(String name)
	{
		Username.sendKeys(name);
	}
	
	@FindBy(xpath = "//input[@name=\"emailAddress\"]")
	WebElement Email;
	
	public void email(String email)
	{
		Email.sendKeys(email);
	}
	
	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement Password;
	
	public void password(String pass)
	{
		Password.sendKeys(pass);
	}
	
	@FindBy(xpath = "//input[@name=\"ConfirmPassword\"]")
	WebElement ConfirmPassword;
	
	public void confirmPassword(String pass)
	{
		ConfirmPassword.sendKeys(pass);
	}
	
	@FindBy(xpath = "//input[@name=\"phoneNumber\"]")
	WebElement PhoneNumber;
	
	public void phoneNumber(String number)
	{
		PhoneNumber.sendKeys(number);
	}
	
	@FindBy(xpath = "//input[@name=\"conformCode\"]")
	WebElement ConfirmCode;
	
	public void confirmationCode(String code)
	{
		ConfirmCode.sendKeys();
	}
}
