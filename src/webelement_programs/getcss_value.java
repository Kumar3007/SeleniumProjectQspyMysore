//program to get CSSVALUE
package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcss_value
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https:/demo.actitime.com/login.do");
		
			WebElement text = driver.findElement(By.id("headerContainer"));
			System.out.println(text.getTagName());
			
							String css1 = text.getCssValue("font-family");
							String css2 = text.getCssValue("font-size");
							System.out.println(css1);
							System.out.println(css2);
}
}