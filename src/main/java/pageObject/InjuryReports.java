package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InjuryReports {

	WebDriver driver;
	
	public InjuryReports(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()=\"Injury Reports\"]")
	WebElement InjuryReports;
	
	public void injuryReports()
	{
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", InjuryReports);
	}
	
	@FindBy(xpath = "//button[text()=\"Create New Report\"]")
	WebElement CreateNewReport;
	
	public void createNewReport()
	{
		CreateNewReport.click();
	}
	
	@FindBy(xpath = "//textarea[@name=\"description\"]")
	WebElement InjuryDescription;
	
	public void injuryDescription(String desc)
	{
		InjuryDescription.sendKeys(desc);
		
	}
	
	@FindBy(xpath = "//button[text()=\"Save\"]")
	WebElement Save;
	
	public void saveInjuryReport() throws InterruptedException
	{
		Save.click();
		Thread.sleep(3000);
		driver.navigate().refresh();
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
	WebElement Diagnosis;
	
	@FindBy(xpath = "//li[text()=\"Finger Fracture\"]")
	WebElement InjuryName;
	
	public void injuryName()
	{
		Diagnosis.click();
		InjuryName.click();
	}
	
	@FindBy(xpath = "(//input[@type=\"checkbox\"])[1]")
	WebElement AddSymptoms;
	
	public void addSymptoms()
	{
		AddSymptoms.click();
	}
	
}
