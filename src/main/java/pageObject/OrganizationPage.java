package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {

	WebDriver driver;
	
	public OrganizationPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@id=\"next\"]")
	WebElement Next;
	
	public void next()
	{
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", Next);
	}
	
	@FindBy(xpath = "//button[text()=\"Join\"]")
	WebElement JoinTeam;
	
	public void joinTeam()
	{
		JoinTeam.click();
	}
	
}
