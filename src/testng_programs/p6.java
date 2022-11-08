package testng_programs;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class p6 extends p5_BaseTest1
{
	@Test
	public void actiLogin() 
	{
		driver.get("https:/demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

	}
	
}
