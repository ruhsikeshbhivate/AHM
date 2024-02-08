package pageObject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessagesPage {

	WebDriver driver;
	
	public MessagesPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()=\"Messages\"]")
	WebElement Messages;
	
	public void messages()
	{
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", Messages);
	}
	
	@FindBy(xpath = "//input[@id=\"combo-box-demo\"]")
	WebElement SelectUser;
	
	public void selectUser() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//SelectUser.clear();
		SelectUser.click();
		
		Actions action = new Actions(driver);
		action.keyDown(SelectUser,Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
	}
	
	@FindBy(xpath = "//textarea[@placeholder=\"Compose New Message Here\"]")
	WebElement ComposeMessages;
	
	public void composeMessages(String text)
	{
		ComposeMessages.sendKeys(text);
	}
	
	@FindBy(xpath = "(//button[@type=\"button\"])[6]")
	WebElement Send;
	
	public void send()
	{
		Send.click();
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
	
	@FindBy(xpath = "//div[text()=\"Pratik Physio\"]")
	WebElement Name;
	
	public void name()
	{
		Name.click();
	}
	
	@FindBy(xpath = "//div[text()=\"Vimal Chaturvedi\"]")
	WebElement Name1;
	
	public void name1()
	{
		Name1.click();
	}
}
