//program to demonstrate HIDDEN DIVISION POPUP
package popup_program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_hidden_division_popup {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//works only for findelement and findelements

		driver.get("https://flipkart.com");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();//clicks on close button
		
		

	}
}
