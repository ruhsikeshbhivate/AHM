package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

	WebDriver driver;
	
	public AdminPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class=\"MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-fe3u4m\"]")
	WebElement ProfileIcon;
	
	public void profileIcon() throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ProfileIcon);
	}
	
	@FindBy(xpath = "//li[text()=\"Logout\"]")
	WebElement Logout;
	
	public void logout() throws InterruptedException
	{
		Logout.click();
		Thread.sleep(3000);
	}
}
