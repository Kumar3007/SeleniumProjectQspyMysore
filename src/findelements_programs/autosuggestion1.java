//program to click on a particular auto suggestion i.e., on selenium rich foods or selenium interview questions 
package findelements_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestion1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		Thread.sleep(3000);
				
		List<WebElement> autosugg = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		
		for (WebElement lv : autosugg)
		{
				String text = lv.getText();
				if(text.equals("selenium rich foods"))
				{
					lv.click();
					break;
				}
		}
		
	
}
}