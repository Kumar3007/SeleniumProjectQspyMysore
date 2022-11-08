//program to locate X and Y co-ordinates
package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xandy {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.actitime.com/");
		
		WebElement ele = driver.findElement(By.xpath("(//a[text()='Start Free Trial'])[3]"));
		
					int x = ele.getLocation().getX();
					int y = ele.getLocation().getY();
					System.out.println(x+" ,"+y);
}
}