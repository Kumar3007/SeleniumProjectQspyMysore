package testng_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class p19
{
	@Test
	public void actiscript1()
	{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
			driver.manage().window().maximize();
			driver.get("https:/demo.actitime.com/login.do");
			WebElement cb = driver.findElement(By.id("keepLoggedInCheckBox"));
			
			
			//Assert.assertTrue(link.isDisplayed(), true);
			
			Assert.assertTrue(cb.isSelected());
			
						


	}


}
