package testng_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class p4_before_and_after_method
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
		public void postCondition()
		{
			driver.quit();
		}
		
		@Test
		public void actiLogin()
		{
			driver.get("https:/demo.actitime.com/login.do");
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
			

		}
		
		@Test
		public void fbLogin() 
		{
			

			driver.get("https://www.facebook.com");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8867432411");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Kumar@07");
			driver.findElement(By.xpath("//button[@value='1']")).submit();

		}
}
