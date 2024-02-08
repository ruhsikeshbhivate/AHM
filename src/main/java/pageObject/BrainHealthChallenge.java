package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrainHealthChallenge {

	WebDriver driver;
		
	public BrainHealthChallenge(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()=\"Brain Health Challenge\"]")
	WebElement BrainHealthChallenge;
	
	public void brainHealthChallenge()
	{
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", BrainHealthChallenge);
	}
	
	@FindBy(xpath = "//button[text()=\"Create New Test\"]")
	WebElement CreateNewTest;
	
	public void createNewTest()
	{
		CreateNewTest.click();
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
	
	@FindBy(xpath = "(//div[@role=\"combobox\"])[2]")
	WebElement challenge;
	
	@FindBy(xpath = "//li[text()=\"Balance - Single Leg Stance\"]")
	WebElement ChallengeName;
	
	public void challengeName() throws InterruptedException
	{
		challenge.click();
		ChallengeName.click();
		Thread.sleep(2000);
	}
	
	@FindBy(xpath = "//button[text()=\"Start Your Test\"]")
	WebElement StartYourTest;
	
	public void startYourTest() throws InterruptedException
	{
		StartYourTest.click();
	}
	
	@FindBy(xpath = "//button[text()=\"Get Test Score\"]")
	WebElement GetTestScore;
	
	public void getTestScore() throws InterruptedException
	{
		Thread.sleep(19000);
		GetTestScore.click();
	}
	
	@FindBy(xpath = "//button[text()=\"Okay\"]")
	WebElement Okay;
	
	public void okay()
	{
		Okay.click();
	}
}    
