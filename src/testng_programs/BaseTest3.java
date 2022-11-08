package testng_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest3
{
	WebDriver driver;
	@Parameters("BrowserName")
	@BeforeMethod
	public void preCondition(String bn)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
		if(bn.equals("chrome"))
		{
		driver=new ChromeDriver();// mistake zone.,,,non static webDriver is created
		}
		else if(bn.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
		driver.manage().window().maximize();

	}
	
	@AfterMethod
	public void postCOndition()
	{
		driver.quit();
	}
		
	
	@Parameters("BrowserName")
	@BeforeTest	
	public void beforetest(String bn)
	{
		System.out.println("Scripts are getting executed in"+bn);
	}
	
	
	@Parameters("BrowserName")
	@AfterTest
	public void aftertest(String bn)
	{
		System.out.println("Scripts completed exceution in"+bn);
	}
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("suite started the excecution");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("Suite completed the excecution");
	}
}
