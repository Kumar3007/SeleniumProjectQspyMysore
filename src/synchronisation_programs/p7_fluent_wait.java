//program to demonstrate FLUENT WAIT
package synchronisation_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class p7_fluent_wait {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		

		driver.get("https:/demo.actitime.com/login.do");
			String LoginPageTitle = driver.getTitle();
			System.out.println(LoginPageTitle);
		
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		FluentWait wait=new FluentWait(driver);
		wait.pollingEvery(Duration.ofMillis(250));
		wait.withTimeout(Duration.ofSeconds(30));
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='content users']")));
		
		driver.findElement(By.xpath("//a[@class='content users']")).click();

	
	}

}
