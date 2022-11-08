package testng_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class p15 
{
		@DataProvider
		public Object[][] logincr()
		{
			Object[][] data=new Object[3][2];
			data[0][0]="admin";
			data[0][1]="manager";
			data[1][0]="trainee";
			data[1][1]="trainee";
			data[2][0]="java";
			data[2][1]="selenium";
			return data;
			
		}
		@Test(dataProvider="logincr")
		public void actiLogin(String un,String pw)
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

		
}
