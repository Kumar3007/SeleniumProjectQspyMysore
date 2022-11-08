package TestYourSkillTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class StudentModuleTests2_BeforeMethod2
{
	@BeforeMethod
	public void openBrowserandApplication()
	{
		System.out.println("Launching the Browser and accessing the the application URL");
		
	/*	if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("INCORRECT BROWSER");
		}
		driver.manage().window().maximize();
		
		driver.get(URL);*/
		
	}
	
	@Test(priority=2)
	public void StudentHomePage()
	{
		System.out.println("Student HomePage click on StartButton");
		
	}
	

	@Test(priority=3)
	public void StudentTakingQuiz()
	{
		System.out.println("Student taking AGILE METHODOLOGY QUIZ");
	}
	
	
	@Test(priority=1)
	public void StudentSignup()
	{
		System.out.println("Enter all the Mandatory Details for student for Signup");
		
		//selenium code
	/*	driver.findElement(By.id("name")).sendKeys(EnterYourName);
		WebElement ele = driver.findElement(By.id("gender"));
		weblib.select(ele, 1);
		driver.findElement(By.id("college")).sendKeys(EnterYourCollegeName);
		driver.findElement(By.xpath("(//input[@id='email'])[2]")).sendKeys(intRanNum+EnterYourEmail);
		driver.findElement(By.id("mob")).sendKeys(EnterYourMobileno);
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(EnterYourPassword);
		driver.findElement(By.id("cpassword")).sendKeys(ConfirmPassword);
		driver.findElement(By.xpath("//input[@class='sub']")).click();
		driver.findElement(By.xpath("//li[@class='pull-right']")).click();*/
	}
	
}
