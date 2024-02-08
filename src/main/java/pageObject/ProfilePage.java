package pageObject;

import javax.xml.xpath.XPath;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

	WebDriver driver;

	public ProfilePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()=\"Let's Start\"]")
	WebElement LetsStart;
	
	public void letsStart()
	{
		LetsStart.click();
	}

	@FindBy(xpath = "//div[@id=\"gender\"]")
	WebElement Gender;
	
	@FindBy(xpath = "(//li[@role=\"option\"])[2]")
	WebElement Male;
	
	public void gender()
	{
		Gender.click();
		Male.click();
	}
	
	@FindBy(xpath = "(//button[@type=\"button\"])[5]")
	WebElement Calendar;
	
	@FindBy(xpath = "//button[text()=\"15\"]")
	WebElement DOB;
	
	public void birthday() throws InterruptedException
	{
		Calendar.click();
		Thread.sleep(1000);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", DOB);
	}
	
	@FindBy(xpath = "//input[@id=\"zipcode\"]")
	WebElement Zipcode;
	
	public void zipcode(String code)
	{
		Zipcode.sendKeys(code);
	}
	
	@FindBy(xpath = "//button[text()=\"Save Changes\"]")
	WebElement SaveChanges;
	
	public void saveChanges()
	{
		SaveChanges.click();
	}
	
	@FindBy(xpath = "//button[@title=\"Next\"]")
	WebElement Next;
	
	public void next()
	{
		Next.click();
	}
	
	@FindBy(xpath = "(//input[@type=\"text\"])[2]")
	WebElement InviteCode;
	
	public void inviteCode(String code)
	{
		InviteCode.sendKeys(code);
	}
	
	@FindBy(xpath = "//button[text()=\"Join Now\"]")
	WebElement JoinNow;
	
	public void joinNow()
	{
		JoinNow.click();
	}
}
