//program to demonstrate to all the titles of woodland shoes in flipkart website
package findelements_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://WWW.flipkart.com");//opens flipkart website
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();//clicks on close button
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("woodland shoes");//enters the woodland shoes into test box
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();//clicks on search button
		Thread.sleep(8000);
		List<WebElement> titles = driver.findElements(By.xpath("//a[@class='IRpwTa']"));//identifies all the tiles
		for (WebElement lv : titles) 
		{
		System.out.println(lv.getText());	
		}
		
		
		
		


	}

}
