//program to demonstrate scroll down using javascript
package javascript_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1_scroll {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.actitime.com/");
		
		WebElement ele = driver.findElement(By.xpath("(//a[text()='Start Free Trial'])[3]"));
		
					int x = ele.getLocation().getX();
					int y = ele.getLocation().getY();
					System.out.println(x+" ,"+y);
					
					JavascriptExecutor j=(JavascriptExecutor) driver;
						//j.executeScript("window.scrollBy(0,6000 )");
						j.executeScript("window.scrollBy("+x+","+y+")");
}				
	
}