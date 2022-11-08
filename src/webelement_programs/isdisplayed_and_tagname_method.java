//program to demonstrate isdisplayed and getTagname method

package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplayed_and_tagname_method {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https:/demo.actitime.com/login.do");

			WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
			
			System.out.println(link.isDisplayed());
			System.out.println(link.getTagName());
}
}