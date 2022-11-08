package webelement_programs;

import javax.swing.event.TreeWillExpandListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class addUserScript 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https:/demo.actitime.com/login.do");
		
		driver.findElement(By.xpath("input[@name='username']")).sendKeys("admin");
		
		driver.findElement(By.xpath("input[@name='pwd']")).sendKeys("manager");
		
		driver.findElement(By.xpath("a[@id='loginButton']")).click();
		
		Thread.sleep(2000);//momentary solution to stop the execution of program for 2secs
		
		driver.findElement(By.xpath("//a[@class='content users']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("............"));
		
		
	}
	}

