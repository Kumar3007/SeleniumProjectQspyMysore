//program to demonstrate Xpath(relative)
package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actilogin3
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https:/demo.actitime.com/login.do");
		
		driver.findElement(By.xpath("input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("a[@id='loginButton']")).click();
		
	}
	}


