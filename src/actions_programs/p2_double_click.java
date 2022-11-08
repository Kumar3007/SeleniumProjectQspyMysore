//program for double click
package actions_programs;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class p2_double_click 
{
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ab/Desktop/selenium%20html/double%20click.html");
		
		WebElement text=driver.findElement(By.id("demo"));
		
		Actions a =new Actions(driver);
		a.doubleClick(text).perform();

}
}