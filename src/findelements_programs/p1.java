//program to demonstrate the number of links present in web page
package findelements_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https:/demo.actitime.com/login.do");
				List<WebElement> links = driver.findElements(By.xpath("//a"));
				System.out.println(links.size());
				System.out.println(links.getClass().getName());
			
	}

}
