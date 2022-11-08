//Date 08/06/22
//program to demonstrate to close ALL the child windows
package webdriver_programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p8 {
	public static void main(String[] args)
{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		
		//clicks on new window for 3times
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("windowButton")).click();
		handleWindows(driver);//method call statement

}
	public static void handleWindows(WebDriver driver)
	{
				String mainWindow = driver.getWindowHandle();
				Set<String> allWindows = driver.getWindowHandles();
				
				for (String lv : allWindows)
				{
					driver.switchTo().window(lv);
					if(!lv.equals(mainWindow))
					{
					driver.close();	// control terminates off after child3 window terminates.. to get back to main window again next statement written is used
					}
				}
				driver.switchTo().window(mainWindow);//control moves to main window so that we can continue further automation on main window
	}
}
