package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklogin2 {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com");
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("8867432411");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("Kumar@07");
		driver.findElement(By.cssSelector("button[name='login']")).submit();
		
		
	}
}
