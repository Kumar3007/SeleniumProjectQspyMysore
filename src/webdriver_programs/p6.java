//date:07/06/22
package webdriver_programs;//program to demonstrate foreach loop

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		
		//clicks on new window for 3times
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("windowButton")).click();
		
			String mainWindow = driver.getWindowHandle();
			Set<String> allWindows = driver.getWindowHandles();
			
			for (String lv : allWindows)//foreach loop and lv=loopvariable
			{
				System.out.println(lv);
			}


}
}