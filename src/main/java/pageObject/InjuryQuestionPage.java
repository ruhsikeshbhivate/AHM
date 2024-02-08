package pageObject;

import java.time.Duration;

import org.apache.hc.client5.http.nio.ManagedAsyncClientConnection;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InjuryQuestionPage {

	WebDriver driver;

	public InjuryQuestionPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()=\"Injury Questions\"]")
	WebElement InjuryQuestions;

	public void injuryQuestions()
	{
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", InjuryQuestions);
	}

	@FindBy(xpath = "//button[text()=\"Question Set\"]")
	WebElement QuestionSet;

	public void questionSet()
	{
		QuestionSet.click();
	}

	@FindBy(xpath = "//button[text()=\"Add Question Set\"]")
	WebElement AddQuestionSet;

	public void addQuestionSet()
	{
		AddQuestionSet.click();
	}

	@FindBy(xpath = "//input[@name=\"title\"]")
	WebElement QuestionSetTitle;

	public void questionSetTitle(String Text)
	{
		QuestionSetTitle.sendKeys(Text);
	}

	@FindBy(xpath = "//input[@id=\"question-set-org-dropdown\"]")
	WebElement SelectOrganization;

	public void selectOrganization(String org) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		SelectOrganization.sendKeys(org);
		Thread.sleep(2000);
		Actions actions= new Actions(driver);
		actions.sendKeys(SelectOrganization, Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
	}

	@FindBy(xpath = "//div[@id=\"category-select-select\"]")
	WebElement QuestionSetCategory;

	@FindBy(xpath = "(//li[@role=\"option\"])[3]")
	WebElement CategoryName;

	public void questionSetCategory() throws InterruptedException
	{	
		QuestionSetCategory.click();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		CategoryName.click();
	}

	@FindBy(xpath = "//p[text()=\"Q. \"]")
	WebElement question1;

	public void question1()
	{
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", question1);
	}

	@FindBy(xpath = "//button[text()=\"Save\"]")
	WebElement Save;

	public void save() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Save.click();
		Thread.sleep(1000);
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		QuestionSet.click();
	}

	@FindBy(xpath = "(//button[text()=\"delete\"])[1]")
	WebElement Delete;

	@FindBy(xpath = "(//button[text()=\"Delete\"])[1]")
	WebElement Delete1;
	
	public void delete()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Delete.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", Delete1);	
	}
}
