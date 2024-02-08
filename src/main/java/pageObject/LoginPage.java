package pageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name=\"userName\"]")
	WebElement Username;

	public void username(String name)
	{
		Username.sendKeys(name);
	}

	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement Password;

	public void password(String pass)
	{
		Password.sendKeys(pass);
	}

	@FindBy(xpath = "//button[text()=\"Sign in\"]")
	WebElement Login;

	public void login() throws InterruptedException
	{
		Login.click();
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//button[@type=\"button\"]")
	WebElement DrawerIcon;
	
	@FindBy(xpath = "//span[text()=\"Dashboard\"]")
	WebElement dashboard;

	public void Dashboard()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		if(dashboard.isDisplayed())
		{
			System.out.println("Login Succesfully....");
		}
		else {
			System.out.println("login Failed.....");
		}
		
		DrawerIcon.click();
	}
	
	@FindBy(xpath = "//input[@name=\"New Password\"]")
	WebElement NewPassword;
	
	public void newPassword(String newPass)
	{
		NewPassword.sendKeys(newPass);
	}
	
	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement ConfirmPassword;
	
	public void confirmPassword(String CPass)
	{
		ConfirmPassword.sendKeys(CPass);
	}
	
	@FindBy(xpath = "//button[text()=\"SUBMIT\"]")
	WebElement Submit;
	
	public void submit()
	{
		Submit.click();
	}
	
}
