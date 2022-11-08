//program to demonstrate EXPLICIT WAIT
package synchronisation_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2_explicit_wait {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		

		driver.get("https:/demo.actitime.com/login.do");
			String LoginPageTitle = driver.getTitle();
			System.out.println(LoginPageTitle);
		
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(3000);//don't use this
		
		String LandingPageTitile = driver.getTitle();
		
		System.out.println(LandingPageTitile);
		
		
	}

}
