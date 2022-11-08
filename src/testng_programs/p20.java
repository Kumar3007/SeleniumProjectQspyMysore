package testng_programs;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class p20
{
	@Test
	public void actiLogin() throws Throwable
	{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			SoftAssert a=new SoftAssert();

			Set<String> allwindows = driver.getWindowHandles();
			//validates whether browser is launched
			a.assertEquals(allwindows.size(),0);
			
			driver.get("https:/demo.actitime.com/login.do");
			driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
			driver.manage().window().maximize();
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
			
			Thread.sleep(3000);
			
			String actualLandingPageTitle=driver.getTitle();
			String expectedLandingPageTitle="actiTIME - Enter Time-Track";
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));//just created oblject., it doesn't wait
			wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));
				
		/*	if(actualLandingPageTitle.equals(expectedLandingPageTitle))
				System.out.println("pass:successfully logged in");
			
			else
				
				System.out.println("fail:failed to login");*/
			
			a.assertEquals(actualLandingPageTitle, expectedLandingPageTitle);
			
			driver.quit();

	}


}


