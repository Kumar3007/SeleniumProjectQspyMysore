package testng_programs;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class p7_ extends p5_BaseTest1
{
	@Test
	public void fbLogin() 
	{
		

		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8867432411");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Kumar@07");
		driver.findElement(By.xpath("//button[@value='1']")).submit();

	}

}
