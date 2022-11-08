//program to demonstrate enable and clear method
package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class enble_method {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https:/demo.actitime.com/login.do");
			
		WebElement un = driver.findElement(By.name("username"));
		System.out.println(un.isEnabled());//checks present or not i.e., true or false
		
		un.sendKeys("admin");
		
		Thread.sleep(3000);
		
		un.clear();
}
}