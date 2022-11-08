//program to demonstrate EXPLICIT WAIT using titleContains method

package synchronisation_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P4_explicit_wait 
{
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
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));//just created oblject., it doesn't wait
		wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));//it waits here i.e., actual stmt

		String LandingPageTitile = driver.getTitle();
		
		System.out.println(LandingPageTitile);

}
}