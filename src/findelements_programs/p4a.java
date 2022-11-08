//program to print the values in increasing order(USE MAP CONCEPT).....in a tabular format

package findelements_programs;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p4a {

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

			TreeMap<Integer, String> map=new TreeMap<>();
		
		for (int i = 0; i < titles.size(); i++)
		{
		
					String p = prices.get(i).getText();
					int p1 = Integer.parseInt(p.substring(1).replace(",", ""));
					String t = titles.get(i).getText();
					map.put(p1, t);
				
		}	
				
						for ( Entry<Integer, String> ent : map.entrySet()) //foreach loop 
						{
						System.out.println(ent.getValue()+"="+ent.getKey());	
						}
}
}



