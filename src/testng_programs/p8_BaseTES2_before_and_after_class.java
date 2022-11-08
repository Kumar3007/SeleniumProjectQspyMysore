package testng_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class p8_BaseTES2_before_and_after_class
{
	WebDriver driver;
	@BeforeClass
	public void preCondition()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();// mistake zone.,,,non static webDriver is created 
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
		driver.manage().window().maximize();

	}
	
	@AfterClass
	public void postCOndition()
	{
		driver.quit();
	}

}
