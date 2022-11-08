package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonlogin {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://amzazon.in");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Kumar3007ram@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']"));



	}

}
