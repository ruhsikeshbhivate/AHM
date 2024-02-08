package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Work_HoursPage {

	WebDriver driver;

	public Work_HoursPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()=\"Work Hours\"]")
	WebElement WorkHours;

	public void workHours()
	{
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", WorkHours);
	}

	@FindBy(xpath = "//table//tbody//tr[1]//td[2]")
	WebElement StartTime;

	@FindBy(xpath = "//table//tbody//tr[1]//td[3]")
	WebElement EndTime;

	@FindBy(xpath = "//button[text()=\"Save Changes\"]")
	WebElement SaveChanges;

	@FindBy(xpath = "//div[text()=\"Add Hours\"]")
	WebElement AddHours;

	@FindBy(xpath = "//li[@tabindex=\"0\"]")
	WebElement Time;

	@FindBy(xpath = "(//li[@tabindex=\"-1\"])[2]")
	WebElement Time1;

	public void startTime()
	{
		try {
			if (StartTime.isDisplayed())
			{

			}
		} catch (NoSuchElementException e) {
			AddHours.click();
			StartTime.click();
			Time.click();
			EndTime.click();
			Time1.click();
			SaveChanges.click();
		}
		/*if (StartTime.isDisplayed()) 
		{

		} else {
				 AddHours.click();
				 StartTime.click();
				 Time.click();
				 EndTime.click();
				 Time1.click();
				 SaveChanges.click();
			}*/
	}

}
