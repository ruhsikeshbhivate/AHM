package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AthleteHealthPage {

	WebDriver driver;
	
	public AthleteHealthPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()=\"Athlete Health\"]")
	WebElement AthleteHealth;
	
	public void athleteHealth()
	{
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", AthleteHealth);
	}
	
	@FindBy(xpath = "//button[text()=\"View\"]")
	WebElement View;
	
	public void view()
	{
		View.click();
	}
	
	@FindBy(xpath = "(//div[@role=\"button\"])[12]")
	WebElement ReadLevel;
	
	public void readinessLevel()
	{
		ReadLevel.click();
	}
	
	@FindBy(xpath = "//span[text()=\"60\"]")
	WebElement ReadinessValue;
	
	public void readinessValue() throws InterruptedException
	{
		ReadinessValue.click();
		Thread.sleep(2000);
	}
	
	@FindBy(xpath = "//span[text()=\"100\"]")
	WebElement ReadinessValue1;
	
	public void readinessValue1() throws InterruptedException
	{
		ReadinessValue1.click();
		Thread.sleep(2000);
	}
	
	@FindBy(xpath = "//span[text()=\"FULLTIME\"]")
	public WebElement HealthStatus1;
	
	@FindBy(xpath = "//span[text()=\"LIMITEDCONTACT\"]")
	public WebElement HealthStatus;
}
