package testng_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class p5_BaseTest1 
{
	WebDriver driver;
	@BeforeMethod
	public void preCondition()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();// mistake zone.,,,non static webDriver is created 
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
		driver.manage().window().maximize();

	}
	
	@AfterMethod
	public void postCOndition()
	{
		driver.quit();
	}

	
}
