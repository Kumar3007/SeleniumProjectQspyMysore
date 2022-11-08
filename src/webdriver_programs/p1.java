package webdriver_programs;// program to demonstrate to fetch webpages

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {
	public static void main(String[] args) 
	{
		//sets the path to the chromedriver.exe
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
		// launches the chrome browser
		 WebDriver driver=new ChromeDriver();
		 
		 //fetches the webpages and waits untill the page is loaded
		driver.get("https://www.myntra.com");
		
		//prints the value and goes to nextline
		System.out.println(123);
		
		// closes the window
		driver.close();
	}

}


