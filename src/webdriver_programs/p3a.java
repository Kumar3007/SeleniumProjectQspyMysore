package webdriver_programs;// program to demonstrate getpagesource method i.e., front end source(cannot stores history)

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p3a {
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
			String ps=driver.getPageSource();// returns the source code of the webpage
			System.out.println(ps);
			
			
}
}