package webdriver_programs;// program to demonstrate 

import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
	}

}
