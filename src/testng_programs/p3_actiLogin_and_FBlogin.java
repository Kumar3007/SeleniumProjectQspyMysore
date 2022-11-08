package testng_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class p3_actiLogin_and_FBlogin 
{
	@Test
	public void actiLogin()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https:/demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.quit();

	}
	
	@Test
	public void Fblogin()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("88632411");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Kumar@07");
		driver.findElement(By.xpath("//button[@value='1']")).submit();
		driver.quit();

	}

}
