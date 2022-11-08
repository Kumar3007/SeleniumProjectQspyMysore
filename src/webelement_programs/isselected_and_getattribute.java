//program to demonstrate isselected and getAttribute method
package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected_and_getattribute {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https:/demo.actitime.com/login.do");
		
		WebElement cb = driver.findElement(By.id("keepLoggedInCheckBox"));
					System.out.println(cb.isSelected());
					cb.click();
					System.out.println(cb.isSelected());
					
							String att1 = cb.getAttribute("type");
							String att2 = cb.getAttribute("title");
							
							System.out.println(att1);
							System.out.println(att2);
	}
}