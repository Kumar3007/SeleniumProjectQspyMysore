//program to print tiles and price together
package findelements_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p3b {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://WWW.flipkart.com");//opens flipkart website
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();//clicks on close button
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("woodland shoes");//enters the woodland shoes into test box
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();//clicks on search button
		Thread.sleep(9000);
		
		//identifies all the tiles
		List<WebElement> titles = driver.findElements(By.xpath("//a[@class='IRpwTa']"));
		
		
		//identifies all the prices
		List<WebElement> prices = driver.findElements(By.xpath("//a[@class='IRpwTa']/..//div[@class='_30jeq3']"));
		
		for (int i = 0; i < titles.size(); i++)
		{
			System.out.println(titles.get(i).getText()+"="+prices.get(i).getText());
		}
		
}
}


