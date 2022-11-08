package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p3 {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("file:///C:/Users/ab/Desktop/selenium3.html");
		
		driver.findElement(By.cssSelector("input[tabindex='1']")).sendKeys("java");
		driver.findElement(By.cssSelector("input[tabindex='2']")).sendKeys("selenium");
		driver.findElement(By.cssSelector("input[tabindex='3']")).sendKeys("easy");
		
		
		
		


}
}