package webdriver_programs;//program to demonstrate navigate method(can stores History)

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p3b {
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.navigate().to("https://www.gmail.com");
		driver.navigate().back();		//navigates back
		driver.navigate().forward();	// navigates forward
		driver.navigate().refresh();	// refreshes the webpages
	
	
}
}