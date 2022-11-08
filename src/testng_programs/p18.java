package testng_programs;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class p18 
{
	@Test
	public void actiscript1()
	{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
			driver.manage().window().maximize();
			driver.get("https:/demo.actitime.com/login.do");
			WebElement link = driver.findElement(By.linkText("actiTIME In"));
			
			
			//Assert.assertTrue(link.isDisplayed(), true);
			
			Assert.assertTrue(link.isDisplayed());
			
						


	}


	

}
