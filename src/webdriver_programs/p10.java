//Date 08/06/22
//program to demonstrate to open BOTH the tabs and close ONLY MAIN TAB
package webdriver_programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p10 
{
	public static void main(String[] args)
{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https:/demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();// open the new link
		handleTabs(driver);// method call statement
		
}
		public static void handleTabs(WebDriver driver)
		{
					String maintab = driver.getWindowHandle();
					Set<String> alltabs = driver.getWindowHandles();
					for (String lv : alltabs) 
					{
					driver.close();	
					}
		}
}
