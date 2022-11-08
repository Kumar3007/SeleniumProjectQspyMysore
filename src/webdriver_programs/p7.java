//date:07/06/22
// program to close ALL the windows one after the other
package webdriver_programs;//program to demonstrate foreach loop and switchto() method

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p7 {
	public static void main(String[] args) throws InterruptedException {// checked exception of thread.sleep
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
			    // switches the control to specified window
				driver.switchTo().window(lv);//stores the reference of each local variable
				driver.close();// closes the window
				Thread.sleep(1000);// stops for 1sec
			}


}
}
