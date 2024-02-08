package pageObject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhysioTherapist_TourPage {

	WebDriver driver;
	
	public PhysioTherapist_TourPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//button[@type=\"button\"])[1]")
	 WebElement MenuIcon;
	
	public void menuIcon()
	{
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", MenuIcon);
	}
	
	@FindBy(xpath = "//span[@id=\"next\"]")
	WebElement Next;
	
	public void next()
	{
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		executor.executeScript("arguments[0].click();", Next);
	}
	
}
