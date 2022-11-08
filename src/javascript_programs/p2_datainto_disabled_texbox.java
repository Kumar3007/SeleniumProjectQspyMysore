//data into disabled text box
package javascript_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2_datainto_disabled_texbox
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("file:///C:/Users/ab/Desktop/selenium7.html");
		
		JavascriptExecutor j=(JavascriptExecutor) driver;
		
		j.executeScript("document.getElementById('i1').value='KUMAR'");//enters the data
		
		Thread.sleep(3000);
		j.executeScript("document.getElementById('i1').value=''");//clears data
						
}
}